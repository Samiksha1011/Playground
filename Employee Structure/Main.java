#include<iostream>
using namespace std;
struct Emp{
 char name[30];
  int id;
  int age;
  char des[30];
  int sal;
};
int main()
{
 struct Emp e;
 cout<<"Enter name:"<<endl;
  cout<<"Enter ID:"<<endl;
  cout<<"Enter age:"<<endl;
  cout<<"Enter designation:"<<endl;
  cout<<"Enter Salary:"<<endl;
  cout<<"Employee Details"<<endl;
     cin>>e.name;
     cin>>e.id;
     cin>>e.age;
     cin>>e.des;
     cin>>e.sal;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.des<<endl;
  cout<<"Salary of the Employee : "<<e.sal<<endl;
}


