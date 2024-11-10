/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TheDice {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
                         // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int count=0;
        String seq = s.nextLine();
        int len=seq.length();
        char[] arr=seq.toCharArray();
        if( Integer.parseInt(String.valueOf(arr[len-1]))  ==6){
            System.out.println(-1);
        }else{
            for(char ch:arr){
                if(Integer.parseInt(String.valueOf(ch)) !=6){
                    //System.out.println("hello"+Integer.parseInt(String.valueOf(ch)));
                    count++;
                } 
            }
            System.out.println(count);
        }

    }
}
