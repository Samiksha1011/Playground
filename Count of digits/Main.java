#include<iostream>
using namespace std;
int main()
{
  int n, d=0;
  cin>>n;
  do
  {
    n = n/ 10;
    d++;
  }while (n != 0);
  cout<<d;
}