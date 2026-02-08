import java.util.Scanner;
public class SimpleATM {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 double balance = 1000.00; // Initial balance
 int pin = 1234; // Predefined PIN
 int enteredPin;
 // Ask for the PIN
 System.out.print("Enter your PIN: ");
 enteredPin = scanner.nextInt();
 // Check if the entered PIN is correct
 if (enteredPin != pin) {
 System.out.println("Incorrect PIN. Access denied.");
 return; // Exit the program if PIN is incorrect
 }

// ATM Menu loop
 while (true) {
 System.out.println("\nATM Menu:");
 System.out.println("1. Check Balance");
 System.out.println("2. Deposit");
 System.out.println("3. Withdraw");
 System.out.println("4. Exit");
 System.out.print("Enter your choice (1-4): ");
 int choice = scanner.nextInt();
 switch (choice) {
 case 1: // Check balance
 System.out.println("Your balance is: $" + balance);
 break;
 case 2: // Deposit
 System.out.print("Enter deposit amount: $");
 double deposit = scanner.nextDouble();
 balance += deposit;
 System.out.println("You deposited: $" + deposit);
 break;
 case 3: // Withdraw
 System.out.print("Enter withdrawal amount: $");
 double withdraw = scanner.nextDouble();
 if (withdraw <= balance) {
 balance -= withdraw;
 System.out.println("You withdrew: $" + withdraw);
 } else {
 System.out.println("Insufficient balance.");
 }
 break;
 case 4: // Exit
 System.out.println("Thank you for using the ATM.");
 scanner.close();
 return; // Exit the program
 default: // Invalid choice
 System.out.println("Invalid option. Please choose a valid number.");
 } } } }