
package Bankingapp;


public class bankingapp {
     int accountno = 1000;
    float balance;
    int pin = 1000;
    
        public boolean verify_account( int useracc, int userpass){
        
            if (accountno == useracc && pin == userpass ){
                
                return true;
            }
            else{
                return false;
            }

        }
        public void withdraw(){


        }
        public void changepin(){


        }
            
}

