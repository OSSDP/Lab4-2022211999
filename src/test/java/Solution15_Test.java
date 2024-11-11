import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 将输入(v1,v2)划分为:
 *  v1 > v2:
 *      len(v2) < len(v1)
 *      len(v2) >=len(v1)
 *  v1 < v2:
 *      len(v1) < len(v2)
 *      len(v1) >=len(v2)
 *  others:
 *      v1=v2
 *  以上各划分均又分为有无前导零
 */
public class Solution15_Test {
    Solution s = new Solution();

    /**
     * 测试版本号相同
     * 测试用例:
     *      (1.001.011, 1.1.11),
     *      (1.2.3,1.2.3)
     * 期望输出：
     *      0,0
     */
    @Test
    public void test_equal() {
        assertEquals(0,s.compareVersion("1.001.011", "1.1.11"));
        assertEquals(0,s.compareVersion("1.2.3", "1.2.3"));
    }

    /**
     * 测试v1>v2
     * 测试用例
     *      (1.2.3, 1.2.2),
     *      (1.2.3, 1.2),
     *      (1.3, 1.2.3),
     *      (1.02.003.4 1.2.3),
     * 期望输出
     *      1,1,1,1
     */
    @Test
    public void test_v1_larger() {
        assertEquals(1,s.compareVersion("1.2.3", "1.2.2"));
        assertEquals(1,s.compareVersion("1.2.3", "1.2"));
        assertEquals(1,s.compareVersion("1.3", "1.2.3"));
        assertEquals(1,s.compareVersion("1.02.003.4", "1.2.3"));
    }
    /**
     * 测试v1< v2
     * 测试用例
     *      (1.2.2, 1.2.3),
     *      (1.2, 1.2.3),
     *      (1.2.3, 1.3),
     *      (1.2.3, 1.02.003.4),
     * 期望输出
     *      -1,-1,-1,-1
     */
    @Test
    public void test_v1_smaller() {
        assertEquals(-1, s.compareVersion("1.2.2", "1.2.3"));
        assertEquals(-1, s.compareVersion("1.2", "1.2.3"));
        assertEquals(-1, s.compareVersion("1.2.3", "1.3"));
        assertEquals(-1, s.compareVersion("1.2.3", "1.02.003.4"));
    }
}
