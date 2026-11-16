import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = Integer.parseInt(sc.nextLine());

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      IO.print("leap");
    } else {
      IO.print("common");
    }
  }
}
