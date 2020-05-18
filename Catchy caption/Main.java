#include <cstring>
#include <iostream>
#include<string.h>
int main()
{
  //std::string str;
  char str[100];
  int c;
  gets(str);
  int l=strlen(str);

    for(int i=0;i<l;i++){
      char ch=str[i];
      if(ch==' ')
        c++;
     }
  if(c>10)
    std::cout<<"Caption not eligible for the contest";
  else
    std::cout<<"Caption eligible for the contest";
    
   
}

