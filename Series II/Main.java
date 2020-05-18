# include <iostream>
# include <math.h>
using namespace std;
int main()
{
  int n,r=121,i;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    if(i==0)
    {
		cout<<r<<" ";
      continue;
    }
    else 
    {
      int x = sqrt(r);
      x = x + 4;
      int z = pow(x,2);
      r = z;
      cout<<z<<" ";
      
    }
  }
}