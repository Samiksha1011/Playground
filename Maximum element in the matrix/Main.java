#include<iostream>
using namespace std;
int main()
{
  int r,c,max=-1;
  cin>>r>>c;
  
  int mat[10][10];
  
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
  cin>>mat[i][j];
    
    if(mat[i][j]>max)
      max=mat[i][j];
  
  }
  }
  cout<<"The maximum element is "<<max;
}