#include<iostream>
using namespace std;
int main()
{
  int i,size;
  cin>>size;
  int a[size];
  for(i = 0 ; i< size ;i++)
  {
    cin>>a[i];
  }
  
  for (i = 0; i < size ; i++)
  {
    if (a[0] < a[i])
    
      a[0] = a[i];

  }
  cout<<a[0];
  
}