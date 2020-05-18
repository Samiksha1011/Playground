#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
  float i,a,d,f;
  cin>>x>>y>>r;
   i = x * y* r/100;
  a = x + i;
  d = i * 2 / 100;
  f = a - d;
  cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
}
