#include<iostream>
using namespace std;
int main()
{
  int n,fd,sd,td,se=0,so=0;
  cin>>n;
  fd=n%10;
  sd=(n%100)/10;
  td=(n%1000)/100;
  if(fd%2==0)
   se+=fd;
  else
   so+=fd;
  if(sd%2==0)
   se+=sd;
  else
   so+=sd;
  if(td%2==0)
   se+=td;
  else
   so+=td;
  if(se==so)
   cout<<"Yes";
  else
   cout<<"No";
}