public class Newrectangle extends Rectangle {




    public Newrectangle(double width, double length) {
        super(length,width);

    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Chiều rộng phải lớn hơn 0.");
        }
    }


    public double getlength() {
        return length;
    }


    public void setHeight(double height) {
        if (height > 0) {
            this.length = height;
        } else {
            System.out.println("Chiều cao phải lớn hơn 0.");
        }
    }


    public double calculateArea() {
        return width * length;
    }

    public static void main(String[] args) {

        Newrectangle myRectangle = new Newrectangle(5.0, 3.0);


        System.out.println("Chiều rộng ban đầu: " + myRectangle.getWidth());
        System.out.println("Chiều cao ban đầu: " + myRectangle.getlength());


        myRectangle.setWidth(7.0);
        myRectangle.setHeight(4.0);

        System.out.println("Chiều rộng mới: " + myRectangle.getWidth());
        System.out.println("Chiều cao mới: " + myRectangle.getlength());


        System.out.println("Diện tích hình chữ nhật: " + myRectangle.calculateArea());
    }
}
