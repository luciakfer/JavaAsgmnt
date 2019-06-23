import java.util.Scanner;

public class DysMonth
{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter month's number: ");

        int monthNumber;

        monthNumber = in.nextInt();

        if (monthNumber == 1)

            System.out.println("31 Days");


        else if (monthNumber == 2)

            System.out.println("28 days and 29 days in leap year");

        else if (monthNumber == 3)

            System.out.println("31 Days");

        else if (monthNumber == 4)

            System.out.println("30 Days");

        else if (monthNumber == 5)

            System.out.println("31 Days");

        else if (monthNumber == 6)

            System.out.println("30 Days");

        else if (monthNumber == 7)

            System.out.println("31 Days");

        else if (monthNumber == 8)

            System.out.println("31 Days");

        else if (monthNumber == 9)

            System.out.println("30 Days");

        else if (monthNumber == 10)

            System.out.println("31 Days");

        else if (monthNumber == 11)

            System.out.println("30 Days");

        else if (monthNumber == 12)

            System.out.println("31 Days");

        else

            System.out.println("Invalid month.");

    }

}