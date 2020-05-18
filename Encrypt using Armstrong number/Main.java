#include<iostream>
# include<math.h>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int d=0,rem,sum = 0;
  d = (int) log10(n) + 1; 
  int temp = n;
 while(temp)
 {
   rem = temp % 10;
   temp /= 10;
   sum += power(rem,d); 
 }
      return (sum==n);
  }
  

int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}