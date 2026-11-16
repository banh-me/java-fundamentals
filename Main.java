import java.util.Scanner;

public class Main {
  static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    int count = Integer.parseInt(line);
    for (int i = 0; i < count; i++) {
      int num = Integer.parseInt(sc.nextLine());
      IO.print("%d is %s%n".formatted(num, isPrime(num) ? "prime" : "not prime"));
    }
  }
}
