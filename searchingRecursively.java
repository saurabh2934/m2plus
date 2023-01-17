public class sollution{
	public static void isSorted(int arr[])
	{
	 if(arr.length == 1){ // base case
	   return true;
	   }
	if(arr[o] > arr[1]){ // if first element is greater than second element it means array is not in sorted condition
	   return false;
	   }
        // lets coppy rest of array in another small array
	int smallarray=new int[arr.length -1];
	for(int i=1;i<arr.lenght;i++){
		smallarray[i-1]=arr[i];
		}
        boolean issmallarraysorted = isSorted(smallarray);
		return issmallarraysorted;
		}
     public static void main (String[]agrs){
	int arr[]={1,2,3,4,5,6,7,8};
	boolean ans=isSorted(arr);
        if(ans == true){
		System.out.println("array is sorted");
		}else
                  {
                   System.out.println("array is not sorted");
                  }   
// another way of checking aray is sorted or not
    public static boolean issorted(int arr[],int startIndex){
     if(startIndex==arr.length-1){
		return true;
		}

     if(arr[startIndex]>arr[startIndex+1]){
		return false;
		}
    boolean sorted=issorted(arr,startIndex+1);
    return sorted;
}

