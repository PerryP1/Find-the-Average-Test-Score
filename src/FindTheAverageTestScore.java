import java.util.Scanner;

public class FindTheAverageTestScore {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, num2, num3, num4, num5, num6, num7, num8, num9, num10;

        System.out.print("First score? ");
        num = keyboard.nextInt();

        System.out.print("Second score? ");
        num2 = keyboard.nextInt();

        System.out.print("third score? ");
        num3 = keyboard.nextInt();

        System.out.print("fourth score? ");
        num4 = keyboard.nextInt();

        System.out.print("fifth score? ");
        num5 = keyboard.nextInt();

        System.out.print("sixth score? ");
        num6 = keyboard.nextInt();

        System.out.print("Seventh score? ");
        num7 = keyboard.nextInt();

        System.out.print("Eighth score? ");
        num8 = keyboard.nextInt();

        System.out.print("Ninth score? ");
        num9 = keyboard.nextInt();

        System.out.print("Tenth score? ");
        num10 = keyboard.nextInt();

        System.out.println("The average score is : " + (num + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10);
    }
}


//A program is needed to prompt the user operator for ten exam scores, calculate the average score and display the result to the screen. The average score is calculated as the sum of the scores divided by the number of scores.
//*