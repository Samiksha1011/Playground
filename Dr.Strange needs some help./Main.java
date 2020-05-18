# include <iostream>
# include <math.h>
using namespace std;
int main()
{
  int b,n,r,res;
  cin>>b>>n>>r;
  res =  pow(b,n);
  if (r <= res )
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
