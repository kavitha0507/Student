//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rahul","Mynala", 14, "chess");
        Student student1 = new Student("Siri","Mynala", 14, "Art");
        student.displayDetails();
        student1.displayDetails();
        student.subject();
        student1.subject();
        System.out.println();


    }
}