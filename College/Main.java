#include<iostream>
#include<cstring>
#include<string.h>
using namespace std;
	struct College{
	 char name[100];
	 char city[20];
	 int year;
	 float per;
};
int main()
{ int n;
  struct College c[30];
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
 for(int i=1;i<=n;i++){
  cout<<"Enter the details of college "<<i<<endl;
  cout<<"Enter name"<<endl;
  cout<<"Enter city"<<endl;
  cout<<"Enter year of establishment"<<endl;
  cout<<"Enter pass percentage"<<endl; 
 }
  cout<<"Details of colleges"<<endl;
  
       for(int i=1;i<=n;i++)
       {
          cin>>c[i].name;
          cin>>c[i].city;
          cin>>c[i].year;
          cin>>c[i].per;
       }
       for(int i=1;i<=n;i++){
         float k=0;
         cout<<"College:"<<i<<endl;
         cout<<"Name:"<<c[i].name<<endl;
         cout<<"City:"<<c[i].city<<endl;
         cout<<"Year of establishment:"<<c[i].year<<endl;
         k=(int)(c[i].per*100);
         cout<<"Pass percentage:"<<(double)k/100<<endl;
       }
}
