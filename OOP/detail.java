// public Create a class Student with attributes name, roll number, and marks, and a method to display details. {
    
// }



public class detail {
    int roll;
    int marks;
    String name;

    public void display(){
        System.out.println(name + " " + marks + " " + roll);
    }

    public static void main(String[] args) {
        detail student = new detail();
        student.name = "Gautam";
        student.marks = 90;
        student.roll = 25;
        student.display();
    }
}




