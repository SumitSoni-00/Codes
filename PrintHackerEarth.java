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
class TestClass {
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
        int len = s.nextInt();
        //s.nextLine();
        String str=s.nextLine();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        char[] arr=str.toCharArray();
        String testString="hackert";
        for(char c:arr){
            if(testString.contains(String.valueOf(c))){
                if(hm.containsKey(c)){
                    hm.put(c,hm.get(c)+1);
                }else{
                    hm.put(c,1);
                }
            }
        }
        System.out.println(Collections.min(hm.values()));
        
    }
}