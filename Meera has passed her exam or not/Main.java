#include<iostream>

using namespace std;

int main()

{

 int n;
  cin>>n;
  int arr[n],i,a,flag=0;

  

  for(i=0;i<n;i++){

     cin>>arr[i];

  }

  cin>>a;

   for(i=0;i<n;i++){

     if(arr[i]==a){

        flag=1;

        break;

      }

    }

  if(flag==1)

     cout<<"She passed her exam";

  else

     cout<<"She failed";

 return 0;

} 

