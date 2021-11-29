
package com.mycompany.lesson1;

import java.util.Scanner;

/**
 *
 * @author Илья Завершинский V2
 */
public class Main {
    
    private static Scanner sScanner = new Scanner(System.in);
        
    private static int Input(String message)
    {
        System.out.printf(message);
        int value = sScanner.nextInt();
       
        return value;
    }
    
    public static void main(String[] args) {
    
        int X = Input("Type X: \n");
        int A = Input("Type A: value > 0 \n");
        int B = Input("Type B: value > 0 \n");
             
        float y = 0;
        
        if(X < 7)
        {
            float value1 = (float)Math.pow(X, 2) + (float)Math.pow(A, 2) + (float)Math.pow(B, 2);
            float value2 = A + B;
            
            y = value1 / value2;
        }
        else
        {
            if (X >= 7)
            {
              float value1 = (float)Math.pow(X, 3) * (float)Math.pow((A+B), 2);
              y = value1;
            }
        }
        
         System.out.printf("Y= " + y);
    }
}