public class Rectangle {
    double length;
    double width;

    public Rectangle() {

        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {

        Rectangle defaultRectangle = new Rectangle();
        Rectangle customRectangle = new Rectangle(5.0, 10.0);


        System.out.println("Default Rectangle - Length: " + defaultRectangle.length + ", Width: " + defaultRectangle.width);
        System.out.println("Custom Rectangle - Length: " + customRectangle.length + ", Width: " + customRectangle.width);
    }
}
