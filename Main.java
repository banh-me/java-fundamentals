import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine().trim();
    String firstName = name.substring(0, name.indexOf(" "));
    String lastName = name.substring(name.indexOf(" ") + 1);
    IO.print("%S, %S.".formatted(lastName, firstName.charAt(0)));
  }
}
