#include<iostream>
using namespace std;
int main()
{
  int r,c,max=0;
  cin>>r>>c;
  int mat[10][10];
  
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
  cin>>mat[i][j];
  }
}
  
  for(int i=0;i<c;i++){
    max=-1;
  for(int j=0;j<r;j++){
  
    if(mat[j][i]>max)
      max=mat[j][i];
  }
    cout<<max<<endl;
  }
  
}
