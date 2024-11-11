
// 定义一个矩形类
public class demo {
    // 成员变量
    double length;
    double width;

    // 构造方法
    public demo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 方法：计算面积
    public double calculateArea() {
        return length * width;
    }

    // 主方法：程序入口
    public static void main(String[] args) {
        // 创建一个矩形对象，长为5，宽为3
        demo rectangle = new demo(5, 3);

        // 计算并输出面积
        double area = rectangle.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
