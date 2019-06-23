import java.util.Scanner;
public class GradeSys
{
    public static void main(String[] args) {

        Scanner grades = new Scanner(System.in);

        System.out.print("Enter grade from (E, V, G, A or F) : ");

        String str = grades.next();
        char grade = str.charAt(0);

        switch (grade) {
            case 'E':
                System.out.println("Excellent");
                break;

            case 'V':
                System.out.println("Very Good");
                break;


            case 'G':
                System.out.println("Good");
                break;
            case 'A':
                System.out.println("Average");
                break;

            case 'F':
                System.out.println("Fail");
                break;

            default :
                System.out.println("Invalid Grade or You are out of league");
                break;
        }
    }
}