#include<iostream>
using namespace std;
int main()
{
 int size,i,r,cnt=0;
  cin>>size;
  int a[size];
  for(i=0;i< size ; i++)
  {
    cin>>a[i];
  }
  cin>>r;
  for(i = 0 ; i< size ; i++)
  {
   if (r == a[i])
   {
     cnt=1;
     break;
   }}
    if (cnt==1)
    cout<<"She passed her exam";
    else 
      cout<<"She failed";
  
 
}