/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

    //  ps.sign();          // executes Exercise 1
    //  ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
    //  ps.grade();         // executes Exercise 5
    //  ps.cards();         // executes Exercise 6
    //  ps.leapYear();      // executes Exercise 7
    //  ps.state();         // executes Exercise 8
    //  ps.months();        // executes Exercise 9
    //  ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {

        System.out.print("\nEnter an integer: "); //
        long userIntegerSign = in.nextLong(); // Sign = Positive or Negative (Or Zero)

        if (userIntegerSign > 0 ) {
            System.out.println("\nPositive.\n");
        } else  if (userIntegerSign < 0 ) {
            System.out.println("\nNegative.\n");
        } else {
            System.out.println("\nZero.\n");
        }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {

        System.out.print("Enter an integer: ");
        int userIntegerType = in.nextInt(); // Type = Even or Odd

        if (userIntegerType % 2 == 0 ) {
            System.out.println("\nEven.\n");
        } else {
            System.out.println("\nOdd.\n");
        }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {

    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      System.out.print("\nEnter a grade: ");
      int userGrade = in.nextInt();

      if (userGrade >= 90 && userGrade <= 100) {
        char gradeInLetterFormat = 'A';
        System.out.println("\nYou recieved an " + gradeInLetterFormat + ".");
      } else if (userGrade >= 80 && userGrade <= 89){
        char gradeInLetterFormat = 'B';
        System.out.println("\nYou recieved a " + gradeInLetterFormat + ".");
      } else if (userGrade >= 70 && userGrade <= 79){
        char gradeInLetterFormat = 'C';
        System.out.println("\nYou recieved a " + gradeInLetterFormat + ".");
      } else if (userGrade >= 60 && userGrade <= 69){
        char gradeInLetterFormat = 'D';
        System.out.println("\nYou recieved a " + gradeInLetterFormat + ".");
      } else if (userGrade >= 0 && userGrade <= 59){
        char gradeInLetterFormat = 'F';
        System.out.println("\nYou recieved an " + gradeInLetterFormat + ".");
      } else if (userGrade > 100){
        System.out.println("\nGrades above 100 are invalid.");
      } else {
        System.out.println("\nGrades below 0 are invalid.");
      }

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

      System.out.print("\nEnter a card: ");
      String userCardInput = (in.nextLine()).toUpperCase();
      String cardSuite = userCardInput.substring(1);
      String cardRank = userCardInput.substring(0, 1);
      boolean equivalent = false;

      switch (cardRank){
        case "2":
          cardRank = "Two";
          equivalent = true;
          break;
        case "3":
          cardRank = "Three";
          equivalent = true;
          break;
        case "4":
          cardRank = "Four";
          equivalent = true;
          break;
        case "5":
          cardRank = "Five";
          equivalent = true;
          break;
        case "6":
          cardRank = "Six";
          equivalent = true;
          break;
        case "7":
          cardRank = "Seven";
          equivalent = true;
          break;
        case "8":
          cardRank = "Eight";
          equivalent = true;
          break;
        case "9":
          cardRank = "Nine";
          equivalent = true;
          break;
        case "T":
          cardRank = "Ten";
          equivalent = true;
          break;
        case "J":
          cardRank = "Jack";
          equivalent = true;
          break;
        case "Q":
          cardRank = "Queen";
          equivalent = true;
          break;
        case "K":
          cardRank = "King";
          equivalent = true;
          break;
        case "A":
          cardRank = "Ace";
          equivalent = true;
          break;
        default:
          System.out.println("\nThat's not a valid rank.");
          equivalent = false;
      }

      if (equivalent) {
        switch (cardSuite){
          case "C":
            cardSuite = "Clubs";
            break;
          case "D":
            cardSuite = "Diamonds";
            break;
          case "H":
            cardSuite = "Hearts";
            break;
          case "S":
            cardSuite = "Spades";
            break;
          default:
            System.out.println("\nThat's not a valid suite.");
            equivalent = false;
        }
      }

      if (equivalent) {
        System.out.print("\n" + cardRank + " of " + cardSuite + ".");
      }



    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
      System.out.print("\nEnter a year: ");
      long yearIsLeapYear = in.nextLong();

      if ((yearIsLeapYear % 4 == 0 && yearIsLeapYear % 100 != 0) || yearIsLeapYear % 400 == 0) {
        System.out.println("\n"  + yearIsLeapYear + " is a leap year.");
    } else {
        System.out.println("\n" + yearIsLeapYear + " is not a leap year.");
    }
  }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      System.out.print("\nEnter a temperature: ");
      double waterTemperature = in.nextDouble();
      System.out.print("Enter a scale: ");
      String temperatureScale = in.next();

      // Solid. Liquid. Gas. That's not a valid scale.

      if (waterTemperature == 0 || waterTemperature < 0 && temperatureScale.equals("C")){
          System.out.println("\nSolid.\n");
        } else if (100 > waterTemperature && waterTemperature > 0 && temperatureScale.equals("C")){
            System.out.println("\nLiquid.\n");
        } else if (waterTemperature >= 100 && temperatureScale.equals("C")){
            System.out.println("\nGas.\n");
        } else if (waterTemperature == 32 || waterTemperature < 32 && temperatureScale.equals("F")){
            System.out.println("\nSolid.\n");
        } else if (32 > waterTemperature && waterTemperature > 32 && temperatureScale.equals("F")){
            System.out.println("\nLiquid.\n");
        } else if (waterTemperature >= 212 && temperatureScale.equals("F")){
            System.out.println("\nGas.\n");
        } else {
            System.out.println("\nThat's not a valid scale.\n");
      }
    }


    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
      System.out.print("Enter a month: ");
        String userMonth = in.next();
        //28 or 29 days. 30 days. 31 days. That's not a valid month.
        switch (userMonth) {
          case "January":
          case "Jan":
          case "Janu":
            System.out.println("\n31 days.\n");
            break;
          case "February":
          case "Feb":
          case "Febr":
            System.out.println("\n28 or 29 days.\n");
            break;
          case "March":
          case "Mar":
          case "Marc":
            System.out.println("\n31 days.\n");
            break;
          case "April":
          case "Apr":
          case "Apri":
            System.out.println("\n30 days.\n");
            break;
          case "May":
            System.out.println("\n31 days.\n");
            break;
          case "June":
          case "Jun":
            System.out.println("\n30 days.\n");
            break;
          case "July":
          case "Jul":
            System.out.println("\n31 days.\n");
            break;
          case "August":
          case "Aug":
          case "Augu":
            System.out.println("\n31 days.\n");
            break;
          case "September":
          case "Sep":
          case "Sept":
            System.out.println("\n30 days.\n");
            break;
          case "October":
          case "Oct":
          case "Octo":
            System.out.println("\n31 days.\n");
            break;
          case "November":
          case "Nov":
          case "Nove":
            System.out.println("\n30 days.\n");
            break;
          case "December":
          case "Dec":
          case "Dece":
            System.out.println("\n31 days.\n");
            break;
          default:
            System.out.println("\nThat's not a valid month.\n");
            break;
        }
    }



    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

        final double OVERTIME_THRESHOLD = 40;
        final double PAY_MULTIPLIER = 1.5;

        System.out.print("\nWage: ");
        double userWage = in.nextDouble();
        if (userWage < 0){
         System.out.println("\nYour wage must be greater than or equal to $0.00/hour.\n");
       }
       System.out.print("Hours: ");
       double weeklyTotalHours = in.nextDouble(); //represents the total amount
       // of hours a person works, including 40 hours plus overtime hours.
       if (weeklyTotalHours < 0){
         System.out.println("\nYour hours must be greater than or equal to 0.0.");
       }
        double overtimeHours;
        double salary;

        if (weeklyTotalHours > OVERTIME_THRESHOLD) {
          overtimeHours = weeklyTotalHours - OVERTIME_THRESHOLD;
          salary = 40 * userWage + overtimeHours * PAY_MULTIPLIER * userWage;
          System.out.println("\nYou'll make " + String.format("$%,.2f", salary) + " this week.");
        } else {
          salary = weeklyTotalHours * userWage;
            System.out.println("\nYou'll make " + String.format("$%,.2f", salary) + " this week.");
        }
  }
}
