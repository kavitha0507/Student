public class Student extends Person implements Studyable{

private String major;
public Student(String firstName, String lastName, int age, String major) {
    super(firstName, lastName, age);
    this.major = major;
}

    @Override
    public void displayDetails(){
        System.out.println("Full name: " +firstname +" "+ lastname +"\n" +"Age:" +age + "\n" + "Major:" + major);

    }



    @Override
    public void subject() {
        System.out.println(firstname+" " + lastname+" " + " is majoring in  " +major);

    }
}
