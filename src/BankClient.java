/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class BankClient {
     String username;
        String password;
        double amount;
        
        public BankClient() {
            
        }
        
          public BankClient(String username, String password, double amount) {
            this.username = username;
            this.password = password;
            this.amount = amount;
            
                 

  
        }
                public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public double getAmount() {
            return amount;
        }

}
