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
class Database {
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
        int test = s.nextInt();
        //ArrayList<String> lst=new ArrayList<String>();
        int m,n;
        String str=null;
        for(int i=1;i<=test;i++){
            m=s.nextInt();
            n=s.nextInt();
			System.out.println(m+"~~~"+n);
            for(int j=1;j<=3;j++){
                if(s.hasNextLine()){
                    str=s.nextLine();
                }
                System.out.println(str);
                    
            }
            //System.out.println("~~~~");
            /*for(int j=1;j<=n;j++){
                for(int k=1;k<=m;k++){
                    if(s.hasNextLine()){
                        str=s.nextLine();
                        System.out.print(str+"    ");
                    }
                }
                System.out.print("\n");
            }*/
        }
    }
}

