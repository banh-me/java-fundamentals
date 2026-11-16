import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String item = sc.nextLine();
    int quantity = Integer.parseInt(sc.nextLine());
    float price = Float.parseFloat(sc.nextLine());
    float total = price * quantity;
    System.out.printf("%-12s%4d%10.2f", item, quantity, total);
  }
}
