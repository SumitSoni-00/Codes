class BestIndex{
	
	
	
	public static void main(String[] args){
		int size;
		java.util.Scanner s=new java.util.Scanner(System.in);
		size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		int rem=size-6,offset=2,sum=0,tempIndex,tempSum;
			tempIndex=5;
		for(int i=0;i<size;i++){
            tempIndex=i;
            rem=size-(i+1);	
            for(int j=1;j<size;j++){
				//System.out.println("QQQ");
				if(rem>=offset){
					//System.out.println("DER");
					//tempIndex=tempIndex+1;
					tempSum=0;
					for(int sm=1;sm<=offset;sm++){
						tempIndex++;
						tempSum=tempSum+arr[tempIndex];
						
					}
					sum=sum+tempSum;
					rem=rem-offset;
					offset++;
				}else{
					System.out.println(sum);
					sum=0;
					break;
				}
			}
			
        }

			//System.out.println(sum);
	}
}
