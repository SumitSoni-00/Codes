import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int cost=0,test,cj,jc,i=1,ques=0;
        Scanner s=new Scanner(System.in);
        test=s.nextInt();
        String samp=null;
		while(i<=test){
			ques=0;
            cj=s.nextInt();
            jc=s.nextInt();
            samp=s.nextLine();
			cost=0;
            //System.out.println(x+"~~"+y+samp);
			char[] arr=samp.toCharArray();
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]=='?'){
					ques++;
					//System.out.println("cost");
					if(arr[j-1]=='C' && arr[j+1]=='J'){
						cost=cost+cj;
					}else if(arr[j-1]=='J' && arr[j+1]=='C'){
						cost=cost+jc;
					}
				}
			}
			//System.out.println(ques);
			//if(ques==0){
				//System.out.println("cost1111111");

				for(int j=0;j<arr.length-1;j++){
					if(arr[j]=='C' && arr[j+1]=='J'){
						cost=cost+cj;
					}else if(arr[j]=='J' && arr[j+1]=='C'){
						cost=cost+jc;
					}
				}
			//}
			System.out.println(cost);

					

            i++;
        }
    }
}