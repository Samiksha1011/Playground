#include <iostream>
using namespace std;
int main()
{
  int size;
  cin>>size;
  int i, num[15];
  int oddSum=0,evenSum=0;
  for(i=0;i<size;i++)
   cin>>num[i];
  //cout <<num[0]<<num[1]<<num[2]<<num[3]<<num[4];
  for(i=0; i<size; i++)
{
  if(num[i]%2==0)
  evenSum=evenSum+num[i];
  else
  oddSum=oddSum+num[i];
}
  cout<<"The sum of the even numbers in the array is "<< evenSum;
  cout<<"\nThe sum of the odd numbers in the array is "<<oddSum;
  return 0;
}