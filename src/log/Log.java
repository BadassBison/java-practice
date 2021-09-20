package log;

public class Log {
  public static void println(String msg) {
    System.out.println(msg);
  }

  public static void println(int num) {
    System.out.println(num);
  }

  public static void println(double num) {
    System.out.println(num);
  }

  public static void print(String msg) {
    System.out.print(msg);
  }

  public static void print(int num) {
    System.out.print(num);
  }

  public static void print(double num) {
    System.out.print(num);
  }

  public static void printf(String type, double num, String msg) {
    switch (type) {
      case "money":
        System.out.printf(msg + ": $%5.2f%n", num);
        break;

    }
  }
}
