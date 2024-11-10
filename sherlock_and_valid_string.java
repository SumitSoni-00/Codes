import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class sherlock_and_valid_string {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
	
	public static void main(String[] args){
		isValid("aabbcd");
	}
    public static void isValid(String s) {
    // Write your code here
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      char[] arr=s.toCharArray();
      int count,temp,pes;
      for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
          count=0;
          for(int j=i;j<arr.length;j++){
            if(arr[i]==arr[j]){
              count++;
            }
          }
          map.put(arr[i],new Integer(count));
		  temp=map.get(arr[0]);
		  if(i>0){
			  if(count-temp>1 || temp-count>1){
				  break;
			  }else if(count-temp==1 || temp-count==1){
				  if(pes==1){
					  break;
				  }
				  temp=temp<count?temp:count;
				  pes=1;
			  }

			  map.get(
        }
      }

	  System.out.println(map);

    }

}
