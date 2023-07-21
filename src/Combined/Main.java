package Combined;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dharami";
        s1.dept = "ECE";

        Student s2 = new Student();
        s2.name = "Gowtham";
        s2.dept = "Mechanical";

        s1.printer();
        s2.printer();

    }
}
