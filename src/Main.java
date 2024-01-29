import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void mainMenu(){
        System.out.println("Select your Bank Accounts : ");
        System.out.println("1 - Banque Misr");
        System.out.println("2 - Banque Alahly");
        System.out.println("3 - CIB Bank");
        System.out.println("4 - QNB Bank");
        System.out.println("5 - Exit");
        System.out.println("\n");
    }

    public static void sideMenu() {
        System.out.println("Select your Operation : ");
        System.out.println("1 - Withdraw");
        System.out.println("2 - Deposit");
        System.out.println("3 - Show Balance");
        System.out.println("4 - exchange money ");
        System.out.println("5 - back to main page ");
        System.out.println("\n");
    }

    
       public static void exhangeoption() {
        System.out.println("Select the  currency: ");
        System.out.println("1 - Dollar");
        System.out.println("2 - Euro");
        System.out.println("3 - Sar");
        System.out.println("4 - back to main page ");
        System.out.println("\n");
    }
    public static void main(String[] args) {
        BankClient bank_Clients=new BankClient();
        
        
        // User interface
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Jack Enter your password : ");
        String password = input.nextLine();
        
                ArrayList<BankClient> accounts = new ArrayList<>();

        // Create fake accounts
        accounts.add(new BankClient("user1", "1234", 1000.0 ));
        accounts.add(new BankClient("user2", "5678", 2000.0));

        
        int option;
        int operation;
        double amount;
        BankAccount bank = null;
        boolean menu = true;
        for (BankClient account : accounts) {
            
        
        if(account.password.equals(password)){
            while (menu){
                mainMenu();
                option = input.nextInt();
                switch (option) {
                    case 1:
                         break;
                    case 2:
                         break;
                    case 3:
                         break;
                    case 4:
                        bank = new QNB();
                        break;
                    case 5:
                        menu = false;
                        break;
                    default:
                        System.out.println("Invalid Choice\n");
                        System.out.println("===================================\n");
                        continue;
                }

                if (!menu) {
                    System.out.println("Thank you, sir");
                    break;
                }

                boolean repeat = true;
                while (repeat) {
                    sideMenu();
                    operation = input.nextInt();
                    if(operation == 1){
                        System.out.println("Enter the amount : ");
                        amount = input.nextDouble();
                        bank.withDraw(amount);
                    }
                    else if(operation == 2){
                        System.out.println("Enter the amount : ");
                        amount = input.nextDouble();
                        bank.deposit(amount);
                    }
                    else if (operation == 3){
                        System.out.println("Your balance is : "+bank.showBalance()+" EGP");
                    }
                    else if(operation == 4){
                        boolean flag=true;
                         while (flag) {                            
                          exhangeoption();
                           option = input.nextInt();
                                           switch (option) {
                                               case 1:
                                                 System.out.println("Enter the amount : ");
                        amount = input.nextDouble();
                        bank.exchangeMoney(amount,"Dollar");
                        break;
                        case 2:
                              System.out.println("Enter the amount : ");
                        amount = input.nextDouble();
                        bank.exchangeMoney(amount,"Euro");
                        break;
                        case 3:
                              System.out.println("Enter the amount : ");
                        amount = input.nextDouble();
                        bank.exchangeMoney(amount,"Sar");
                        break;
                        case 4:
                             flag = false;
                        break;
                        
                        default:
                                System.out.println("Invalid Choice\n");
                        System.out.println("===================================\n");
                        continue;
                                           }
                           
                     
                        }
                    
                    }
                    else if (operation==5) {
                       repeat = false;

                    }
                    else {
                        System.out.println("Invalid Choice\n");
                        System.out.println("===================================\n");
                    }
                }
            }



        }
        }

    }
}

