#include <bits/stdc++.h> 
const int N=10;
using namespace std; 
void maxel(int mat[][N],int r,int c) 
{ 
	 int max;
  for (int i = 0; i < r; i++) { 
		max = 0;
		for (int j = 0; j < c; j++) 
        {
			if(max<mat[i][j])
              max=mat[i][j];
        }
    cout<<max<<endl;
		 
	} 
} 

int main() 
{ 
  int r,c;
  cin>>r>>c;
	int mat[N][N];
	for (int i = 0; i < r; i++) { 
		for (int j = 0; j < c; j++) 
			cin>>mat[i][j]; 
		 
	} 
	maxel(mat,r,c);
	
	return 0; 
}