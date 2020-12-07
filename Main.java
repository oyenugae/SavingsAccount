import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount();
    float bal, iRate, amtDeposited;
    Scanner scan = new Scanner(System.in);
    System.out.println("What was your old balance");
    bal = scan.nextFloat();
    System.out.println("What was the interest Rate given");
    iRate = scan.nextFloat();
    sa.monthlyInterest(iRate, bal);
    System.out.println("What is the amount you want to deposit");
    amtDeposited = scan.nextFloat();
    sa.acctDeposit(amtDeposited, bal);
  }
}

class SavingsAccount{
  public static void monthlyInterest(float interestRate, float balance){
    float newBalance = (balance*interestRate)/12 + balance;
    System.out.printf("The new balance after adding up the monthly interest rate of %.2f to the previous balance %.2f is %.2f\n", (balance*interestRate)/12, balance, newBalance);  
  }

  public static void acctDeposit(float amountDeposited, float balance){
  
    System.out.printf("The new balance after depositing %.2f to the previous balance %.2f is %.2f", amountDeposited, balance, amountDeposited+balance);  
  }
}