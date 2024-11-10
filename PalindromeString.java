import java.util.*;
class PalindromeString{
	public static void main(String[] args){
		String s=null;
        Scanner scan=new Scanner(System.in);
        s=scan.nextLine();
        StringBuilder sb=new StringBuilder();
        char[] charArray=s.toCharArray();
        int len=charArray.length;
        for(int i=len-1;i>=0;i--){
            sb.append(charArray[i]);
        }
        System.out.println(sb);
		String newS=sb.toString();
        if(s.equals(newS)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}