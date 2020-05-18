#include <iostream>
using namespace std;
int main() 
{
	int n,i,remain,rev=0;
  	cin>>n;
  while(n != 0 )
  {
    remain = n % 10;
    rev = rev * 10 + remain; 
    n /= 10;
  }
    cout<<rev;
}