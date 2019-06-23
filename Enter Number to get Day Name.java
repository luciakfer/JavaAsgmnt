import java.util.Scanner;
public class DayIntToWord
{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Day in number: ");

        int monthNumber;

        monthNumber = in.nextInt();

        if (monthNumber == 1)

            System.out.println("Monday");


        else if (monthNumber == 2)

            System.out.println("Tuesday");

        else if (monthNumber == 3)

            System.out.println("Wednesday");

        else if (monthNumber == 4)

            System.out.println("Thrusday");

        else if (monthNumber == 5)

            System.out.println("Friday");

        else if (monthNumber == 6)

            System.out.println("Saturday");

        else if (monthNumber == 7)

            System.out.println("Sunday");

        else

            System.out.println("Invalid month.");

    }
}