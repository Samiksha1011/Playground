# include <iostream>
using namespace std;
  
// return single digit sum of a number. 
int digSum(int n) 
{ 
    if (n == 0) 
        return 0; 
    return (n % 9 == 0) ? 9 : (n % 9); 
} 
  
// Returns recursive sum of digits of a number  
// formed by repeating a number X number of 
// times until sum become single digit. 

  
// Driver program 
int main() 
{ 
    int n;
  	cin>>n;
    cout << digSum(n) << endl; 
    return 0; 
} 