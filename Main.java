import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    int n = Integer.parseInt(line);
    long total = 0;
    for (int i = 1; i < n; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        total += i;
      }
    }
    IO.print(total);
  }
}
