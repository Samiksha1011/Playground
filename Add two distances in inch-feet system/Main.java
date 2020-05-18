#include<iostream>
using namespace std;
struct Dist{
int f;
float i;
};
  
int main()
{int f1;
 float i1;
 struct Dist d1;
 struct Dist d2;
  cin>>d1.f;
  cin>>d1.i;
  cin>>d2.f;
  cin>>d2.i;
   if(d1.i+d2.i>12.0)
   {
     f1=d1.f+d2.f+1;
     i1=(d1.i+d2.i)-12;
     cout<<f1<<"'"<<"-"<<i1<<'"' ;
   }
 else{ 
    cout<<d1.f+d2.f<<"'"<<"-"<<d1.i+d2.i<<'"';
  }
  
}