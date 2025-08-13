
package activity1;

import java.util.Scanner;


public class airfare {
    
    
    public static void main(String[] args) {
        int dist, clas;
        float result = 0;
        float discount;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Distance(km):");
        dist=input.nextInt();
        
        System.out.print("Class:");
        clas=input.nextInt();
        
        
        if (clas == 1 ){
            result = 250 * dist;
                    
        if (dist >= 1000){
        discount = result * (float) .1;
        result = result - discount;
             
        }
       
       System.out.println("Total Fare:"+result);
       
        }else if(clas == 2){
            result = 500 * dist;
                         
        if (dist >= 1000){
        discount = result * (float) .1;
        result = result - discount;
            
        }
         System.out.println("Total Fare:"+result);
        }
      
                           
                
        
        
        
    }
}
