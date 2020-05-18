# include <iostream>
# include <math.h>
using namespace std;
int main()
{
  int n;
  float i,r=0.5;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    if(i==0)
    {
      cout<<r;
      continue;
    }
	else
    {
      double t=pow(3,i-1);
      double x=t+r;
      r=x;
      cout<<" "<<x;
	}

	}
}
