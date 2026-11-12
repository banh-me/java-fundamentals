import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = Integer.parseInt(sc.nextLine());

    int secondsInADay = 86400;
    int secondsInAnHour = 3600;
    int secondsInAMinute = 60;

    int days = total / secondsInADay;
    total %= secondsInADay;

    int hours = total / secondsInAnHour;
    total %= secondsInAnHour;

    int minutes = total / secondsInAMinute;
    total %= secondsInAMinute;

    IO.print("%d days %d hours %d minutes %d seconds".formatted(days, hours, minutes, total));

    sc.close();
  }
}
