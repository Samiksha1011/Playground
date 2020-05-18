#include <iostream>
#include <cstring>
using namespace std;

int main()
{
    char str[50] ;
  	gets(str);

    // you can also use str.length()
    cout << "The number of letters in the name is " << strlen(str);

    return 0;
}
