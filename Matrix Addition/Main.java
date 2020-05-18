#include<iostream>
using namespace std;
int main()
{
  int r,c;
  int mat[10][10];
  
cin>>r>>c;
  
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
  cin>>mat[i][j];
  }
  }
  
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
    int digit;
    cin>>digit;
  mat[i][j]+=digit;
  }
  }
  
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
  cout<<mat[i][j]<<" ";
  }
    cout<<endl;
  }
}