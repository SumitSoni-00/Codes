class MagicalWorld{
	
	
	
	public static void main(String[] args){
		int num;
		java.util.Scanner s=new java.util.Scanner(System.in);
		num=s.nextInt();
		System.out.println(checkPrime(num));
	}





	public static boolean checkPrime(int num){
        if(num==2 || num==3){
            return true;
        }
		boolean flag=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=false;
                
            }

        }
		return flag;
    }
}