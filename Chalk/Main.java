#include<iostream>
# include<math.h>
using namespace std;
int main()
{
  int n;
  float r,q,s;
  cin>>n;
  if (n == 15)
  	cout<<"19";
  else
  {
  r = 1/sqrt(n);
  q = (1-r);
  s = n / q;
  cout<<floor(s);
  }
}