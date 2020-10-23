/** Move all zeroes to end of array    **/


#include <iostream> 
using namespace std; 

int main() 
{ 

	int arr[10000],n,temp;
  cin>>n;
  temp = n;
  for(int i=0;i<n;i++)
  {
   cin>>arr[i];
	  if(arr[i] == 0)
	  {
		  arr[n--] = arr[i];
		  i--;
	  }
   }
	cout << "Array after pushing all zeros to end of array :\n"; 
	for (int i = 0; i < temp; i++) 
		cout << arr[i] << " "; 
	return 0; 
}
