package practice;

/**
 * Description: A program that asks for the month and returns the number of days
 * in the month.
 *
 * @author: Stephanie Scott ULID: sscot17 Date: 9/10/21
 */

/*
 * How to determine if it is a leap year: Is divisable by 400 Is not divisable
 * by 100 Is divisable by 4
 */

// imports
// import java.util.Scanner;

public class NumOfDaysInMonth {
  public static int getDays(int month, int year) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter the number of the month: ");
    // int month = scanner.nextInt();
    // System.out.print("Enter the year: ");
    // int year = scanner.nextInt();
    // scanner.close();

    int numDaysInMonth;
    String nameOfMonth;
    switch (month) {
      case 1:
        nameOfMonth = "January";
        numDaysInMonth = 31;
        break;
      case 2:
        nameOfMonth = "February";
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
          numDaysInMonth = 29;
        } else {
          numDaysInMonth = 28;
        }
        break;
      case 3:
        nameOfMonth = "March";
        numDaysInMonth = 31;
        break;
      case 4:
        nameOfMonth = "April";
        numDaysInMonth = 30;
        break;
      case 5:
        nameOfMonth = "May";
        numDaysInMonth = 31;
        break;
      case 6:
        nameOfMonth = "June";
        numDaysInMonth = 30;
        break;
      case 7:
        nameOfMonth = "July";
        numDaysInMonth = 31;
        break;
      case 8:
        nameOfMonth = "August";
        numDaysInMonth = 31;
        break;
      case 9:
        nameOfMonth = "September";
        numDaysInMonth = 30;
        break;
      case 10:
        nameOfMonth = "October";
        numDaysInMonth = 31;
        break;
      case 11:
        nameOfMonth = "November";
        numDaysInMonth = 30;
        break;
      case 12:
        nameOfMonth = "December";
        numDaysInMonth = 31;
        break;
      default:
        nameOfMonth = "unknown";
        numDaysInMonth = 0;
    }
    System.out.println("\n" + nameOfMonth + " " + year + " has " + numDaysInMonth + " days.");
    return numDaysInMonth;
  }
}
