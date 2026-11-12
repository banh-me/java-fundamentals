import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = Integer.parseInt(sc.nextLine());
    int num2 = Integer.parseInt(sc.nextLine());
    System.out.print((long) num1 + num2);

    sc.close();
  }
}
