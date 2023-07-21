public class StudentList {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Dharani";
        s2.name = "Gowtham";
        s3.name = "Sampath";

        s1.department = "ECE";
        s2.department = "CSE";
        s3.department = "Mech";

        System.out.println(s1.name);
        System.out.println(s1.department);
        System.out.println(s2.name);
        System.out.println(s2.department);
        System.out.println(s3.name);
        System.out.println(s3.department);
    }
}
