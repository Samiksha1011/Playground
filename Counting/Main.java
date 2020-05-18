#include <iostream>
#include<string.h>
using namespace std;
int main() {
    char line[150];
    int vowels, consonant, digit, space,e;

    e=vowels = consonant = digit = space = 0;

    gets(line);

    for (int i = 0; line[i] != '\0'; ++i) {
        if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||
            line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||
            line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||
            line[i] == 'U') {
            ++vowels;
        } else if ((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z')) {
            ++consonant;
        } else if (line[i] >= '0' && line[i] <= '9') {
            ++digit;
        } else if (line[i] == ' ') {
            ++space;
        }
      else
        ++e;
        
    }

    cout<<"Vowels:"<<vowels<<endl;
  cout<<"Consonants:"<<consonant<<endl;
   cout<<"White Spaces:"<<space<<endl;
  cout<<"Digits:"<<digit<<endl;
  cout<<"Symbols:"<<e<<endl;
  
   
    return 0;
}