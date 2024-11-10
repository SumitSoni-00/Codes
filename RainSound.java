import java.util.*;

class RainSound {
    public static void main(String args[] ) throws Exception {
     

        //Scanner
        Scanner scan = new Scanner(System.in);
       

	
		int test,l,r,s,offset,max_clouds=0,min_clouds=0,counter;
		boolean flag1,flag2;
		test=scan.nextInt();
		scan.nextLine();
		int i=1;
		while(i<=test){
			counter=1;
			flag1=true;
			flag2=true;

			l=scan.nextInt();
			r=scan.nextInt();
			s=scan.nextInt();
			offset=r/s;
			while(flag1||flag2){
				System.out.println("vvvv");
				if(flag1){
					System.out.println("11");
					min_clouds=s*counter;
					if(min_clouds<l){
						counter++;
					}else{
						min_clouds=counter;
						flag1=false;
						System.out.println(flag1);
					}
				}


				if(flag2){
					System.out.println("22");
					max_clouds=s*offset;
					if(max_clouds>r){
						offset--;
					}else{
						max_clouds=offset;
						flag2=false;
						System.out.println(flag2);
					}
				}
			}
			System.out.println(min_clouds+"~~"+max_clouds);
			i++;

		}
	}
}