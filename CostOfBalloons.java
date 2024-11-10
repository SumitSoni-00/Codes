import java.util.Scanner;
class CostOfBalloons{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
        int test=1;//scan.nextInt();
		int green,purple,noPlayers,i,stat1,stat2,sum;
		
		
        for(int m=1;m<=test;m++){
            green=scan.nextInt();
            purple=scan.nextInt();
            noPlayers=scan.nextInt();
            i=1;
            sum=0;
            while(i<=noPlayers){
                stat1=scan.nextInt();
                stat2=scan.nextInt();
                if( ((stat1 ^ stat2) ==0) && ((stat1 & stat2)==1) ){
					System.out.println(stat1 ^ stat2);

                    sum=sum+green+purple;
                }else if((stat1 | stat2)==1){
                    sum=sum+(green<purple?green:purple);
					System.out.println("~~");
                }
                i++;
            }
            System.out.println(sum);
        }
		


    }
}