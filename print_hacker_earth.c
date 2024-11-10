#include<stdio.h>
int main()
{
	int n,s1[]={0,0,0,0,0,0,0},num=0;
	scanf("%d",&n);
	char s[n];
	scanf("%s",&s);
	for(int i=0;i<n;i++)
	{
		if(s[i]=='h')
		s1[0]++;
		else if(s[i]=='a')
		s1[1]++;
		else if(s[i]=='c')
		s1[2]++;
		else if(s[i]=='k')
		s1[3]++;
		else if(s[i]=='e')
		s1[4]++;
		else if(s[i]=='r')
		s1[5]++;
		else if(s[i]=='t')
		s1[6]++;
	}
	s1[0]=s1[0]/2;
	s1[1]=s1[1]/2;
	s1[4]=s1[4]/2;
	s1[5]=s1[5]/2;
	num=s1[0];
for(int i=0;i<7;i++)
{
       if(s1[i]<num)
       num=s1[i];
}
printf("%d",num);
}