public class Main {
    public static void main(String[] args) {

        Student.change();

        Student s1 = new Student(111,"Ba");
        Student s2 = new Student(222, "Duc");
        Student s3 = new Student(333, "Phu");


        s1.display();
        s2.display();
        s3.display();

    }
}