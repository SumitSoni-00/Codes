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
class VowelRecognition2 {
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
        long  i=1,test,index=0,vowelCounter,sum=0,len;
		
        String str=null;
        test=s.nextInt();
        s.nextLine();
        char[] arr;
        
        while(i<=test){
            
            str=s.nextLine();
            len=str.length();
            arr=str.toCharArray();
            index=0;
            
			sum=0;
            for(char ch:arr){
				vowelCounter=0;
				
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                    //index=index+1;
					vowelCounter=(index+1)*(len-(index));
					sum=sum+vowelCounter;
					}
                index++;
            }
            System.out.println(sum);
			i++;
        }
		
    }
}
