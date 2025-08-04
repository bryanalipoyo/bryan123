

package sampleapplication;

import java.util.Scanner;

import Bankingapp.bankingapp;

public class MainClass {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        bankingapp bank = new bankingapp();
        int attempt = 5;
        
        System.out.println("WELCOME TO MY SYSTEM! ");
        System.out.println("What do you fell like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.print("Enter your choice : ");
        int choice = in.nextInt();
        
            switch( choice ){
                case 1:
                    while( attempt != 0 ){
                        
                        System.out.print("Enter Account No : ");
                        int account = in.nextInt();

                        System.out.print("Enter Pin No : ");
                        int pin = in.nextInt();

                            if (bank.verify_account(account, pin)){
                                System.out.println("Login Success!");
                                System.exit(0);
                            }
                            else{
                                attempt--;
                                System.out.println("Invalid Acount! Attempt Left " + attempt);
                                
                            }
                            
                            if ( attempt == 0 ){ 
                                System.out.println("Try Again later!");
                            }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                
            }
    }
}
