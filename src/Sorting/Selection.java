package Sorting;

class Selection
{
	int  select(int arr[], int i)
	{
        int mini = i;
        for(int j = i+1; j < arr.length; j++){
            if(arr[j] < arr[mini]){
                mini = j;
            }
        }
        return mini;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i < n-1;i++){
	        int key = select(arr,i);
	        int temp = arr[i];
	        arr[i] = arr[key];
	        arr[key] = temp ;
	    }
	}
}
