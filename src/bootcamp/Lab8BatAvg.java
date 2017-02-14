package bootcamp;

import java.util.Scanner;

public class Lab8BatAvg {
    public static void main(String[] args) {


        String answer;
        do {
            Scanner user = new Scanner(System.in);


            //Ask user to enter number of bats !!!([i] in the array-index)!!!
                System.out.println("Please Enter the number of times-at-bat: ");
            int atBats = user.nextInt();
            int[] baseEarnedArray = new int[atBats];

            //User enters number of bases earned
            for (int i = 0; i < atBats; i++) {
                System.out.println("Enter number (0-4) of bases earned for this at-bat: ");
                baseEarnedArray[i] = user.nextInt();
            }
            //Display Batting Average
            double batAvg = batAvgCalc(baseEarnedArray);
                System.out.println(" ");
                System.out.printf("Your Batting Average is: %.3f\n", batAvg);
            //Display slugging percentage
            double sluggers = slugPerc(baseEarnedArray);
                System.out.printf("Your Slugging Percentage is: %.3f\n", sluggers);
                System.out.println(" ");
                System.out.print("Would you like to continue? press (y) or (n)");
                answer =user.next().toLowerCase();
            } while (answer.equals("y"));
                 if (answer.equals("n")) {
                    System.out.println("Thanks. See You Later!");
                 }
    }

    private static double slugPerc (int[] baseEarnedArray) {
        double sum = 0;
        for (int e : baseEarnedArray) {
            if(e >= 1 && e < 5) {
                sum += e;

            }
        }
        return sum / baseEarnedArray.length;
    }


    private static double batAvgCalc (int[] baseEarnedArray) {
        double  a = 0;
        for (int e : baseEarnedArray) {
            if (e > 0) {
                a++;
            }
        }
        return a / baseEarnedArray.length;
    }
}

