package college;
import java.util.Scanner;
public class CollegeManagement
{
    public static void main(String[] args){
        final StudentView studentView = new StudentView();
        final Student student = studentView.getStudentDetails();
        System.out.println("Student details");
        System.out.println(student.getName());
        System.out.println(student.getDateOfBirth());
        System.out.println(student.getPhone());
        Student.Department.MECHANICAL.data();

    }
}
class StudentView{
    private static final Scanner SCANNER = new Scanner(System.in);
    public Student getStudentDetails() {
        final String name = getName();
        final String dateOfBirth = getDateOfBirth();
        final Long mobile = getPhone();
        return new Student(name, dateOfBirth, mobile);
    }

    private String getName() {
        System.out.println("Enter your name");

        return SCANNER.nextLine();
    }

    private String getDateOfBirth() {
        System.out.println("Enter your date of birth");

        return SCANNER.nextLine();
    }

    private Long getPhone() {
        System.out.println("Enter your phone");

        return SCANNER.nextLong();
    }
}

class Student{
    static Scanner scanner = new Scanner(System.in);
    enum Department {
        BIOMEDICAL("biomedical"), BIOTECH("biotech"), CIVIL("civil"), COUMPUTERSCIENCE("computerscience"), MECHANICAL("mech");
        private String department;
        Department(String department) {
            this.department = department;
        }
        public void data(){
            System.out.println("Enter a Department: 1.civil  2.mechanical  3.biomedical  4.biotech  5.computerscience");
            String dep = scanner.nextLine();
            switch(dep){
                case "civil":
                    System.out.println("CIVIL DEPARTMENT");
                    break;
                case "mechanical":
                    System.out.println("MECHANICAL DEPARTMENT");
                    break;
                case "biomedical":
                    System.out.println("BIOMEDICAL DEPARTMENT");
                    break;
                case "biotech":
                    System.out.println("BIOTECHNOLOGY DEPARTMENT");
                    break;
                case "computerscience":
                    System.out.println("COMPUTERSCIENCE DEPARTMENT");
                    break;
                default:
                    System.out.println("your choosing department is unavailable.choose a another department");
            }
        }
    }
    private String name;
    private String dateOfBirth;
    private Long phone;

    Student(final String name, final String dateOfBirth, final Long phone){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(final Long phone) {
        this.phone = phone;
    }
}

