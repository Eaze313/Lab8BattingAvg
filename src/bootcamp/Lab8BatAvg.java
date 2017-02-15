package bootcamp;

import java.util.Scanner;

public class Lab8BatAvg {
    public static void main(String[] args) {
            Scanner user = new Scanner(System.in);

            System.out.println("How many Batters? Enter a Number: ");
            int rowNumBats = user.nextInt();

            System.out.println("How many times \"at-bat\"? Enter a Number: ");
            int colAtBats = user.nextInt();
//create the 2D array
            int[ ] [ ] batStats = new int [rowNumBats] [colAtBats];

//loop through the batters (rows)
//for (int row = 0; row < numBatters; row++) {
            int i = 0;
            for ( rowNumBats = 0; rowNumBats < batStats.length; rowNumBats++) {
                i++;
                //loop through the atbats (columns) for this batter
                //for (int col = 0; col < atBats; col++) {
                for (colAtBats = 0; colAtBats < batStats[rowNumBats].length; colAtBats++) {
                    //take input for this at-bat
                    System.out.println("What did Batter " + rowNumBats + " score?");
                    //put it into batStats[row] [col]
                    batStats [rowNumBats] [colAtBats] = user.nextInt();
                //User enters number of bases earned

                }

                //Display Batting Average
                double batAvg = ;
                System.out.println(" ");
                System.out.printf("Your Batting Average is: %.3f\n", batAvg);

                //Display slugging percentage
                double sluggers = slugPerc(batStats);
                System.out.printf("Your Slugging Percentage is: %.3f\n", sluggers);
                System.out.println(" ");


                }
    }
}

    private static double slugPerc (int[][] batStats) {
        double sum = 0;
        for (int i = 0; i < batStats[colAtBats].length) {
            if( >= 1 && e < 5) {
                sum += e;
            }

        }
        return sum / batStats[colAtBats].length;
    }


    private static double batAvgCalc (int[][] batStats) {
        double  a = 0;
        for (int e = 0; e < batStats.length; e++) {
            if (e > 0) {
                a++;
            }
        }
        return a / batStats.length;
    }
}
        /get input for # of batters and atbats

//create the 2D array
        int[ ] [ ] batStats = new int [numBats] [atBats];

//loop through the batters (rows)
//for (int row = 0; row < numBatters; row++) {

        }
    }

//calculate and output
//loop through each batter (row)
//for this batter, compile the stats
//loop through the columns
//keep a sum (total # of bases)
//and a count (total # of hits)
//output the batt av and slug pct