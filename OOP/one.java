class rectangle {
    int length;
    int breadth;


    public rectangle(int l, int b){
      length = l;
      breadth = b;
      
    }

    public int cal_area() {
        return length*breadth;
    }
}

public class one {
    public static void main(String[] args) {
        rectangle rect = new rectangle(10,3);

        System.out.println("the ares of the rectangle is " + rect.cal_area());
    }
}