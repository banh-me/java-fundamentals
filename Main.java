import java.util.Objects;
import java.util.Scanner;

public class Main {
  static class Account {
    private int balance;

    Account(int opening) {
      this.balance = opening;
    }

    void deposit(int amount) {
      if (amount > 0) {
        this.balance += amount;
      }
    }

    boolean withdraw(int amount) {
      if (amount > 0 && amount <= this.balance) {
        this.balance -= amount;
        return true;
      }
      return false;
    }

    int getBalance() {
      return this.balance;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int opening = Integer.parseInt(sc.nextLine());
    Account account = new Account(opening);

    int count = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < count; i++) {
      String[] command = sc.nextLine().split(" ");
      String action = command[0];

      if (Objects.equals(action, "balance")) {
        System.out.printf("balance: %d%n", account.getBalance());
        continue;
      }

      int amount = Integer.parseInt(command[1]);

      if (Objects.equals(action, "withdraw")) {
        boolean sufficient = account.withdraw(amount);
        if (!sufficient) {
          System.out.println("insufficient funds");
        }
      }

      if (Objects.equals(action, "deposit")) {
        account.deposit(amount);
      }
    }
  }
}
