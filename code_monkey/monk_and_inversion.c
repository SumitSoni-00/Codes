
#include <stdio.h>

int main(){
	int test_counter=1,test,count,n;
	scanf("%d", &test); 
	while(test_counter<=test){
		count=0;
		scanf("%d",&n);
		int arr[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;i<n;j++){
				scanf("%d",&arr[i][j]);
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=j;k<n;k++){
					if(arr[i][j]>arr[i][k]){
						count++;
					}
				}

				for(int k=i;k<n;k++){
					if(arr[i][j]>arr[k][j]){
						count++;
					}
				}
			}
		}
		printf("%d",count);
		test_counter++;
	}
}
	             			// Reading input from STDIN

