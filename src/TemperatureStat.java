import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class TemperatureStat {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of data: ");
        int N = in.nextInt();
        int[] arr = new int[N];
        int closestTo0;
        boolean isEmpty = true;
        
        System.out.println("Enter the data: ");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();            
        }
        closestTo0 = arr[0];
        for(int temp: arr) {
        	if(Math.abs(temp)>0)
        		isEmpty = false;
            if(Math.abs(temp)<Math.abs(closestTo0)){
                closestTo0 = temp;
            }else if(Math.abs(temp)==Math.abs(closestTo0)&&closestTo0<temp){
                    closestTo0= temp;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        if(isEmpty)
        	System.out.println("0");
        else
        	System.out.println(closestTo0);
    }
}