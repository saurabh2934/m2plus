// merge sort recursivly
public class solution{
	public static void mergesort(int arr[]){
		if(arr.length<=1){
			return ;
			}
	//split array in two parts
	int a[]=new int[arr.length/2];
	int b[]=new int[arr.length-a.length];
	let's copy element into both splited array
	for (int i=0;i<a.lenght;i++){
		a[i]=arr[i];
		}
	for (int i=arr.length/2;i<arr.length;i+++){
		b[i-arr.length/2]=arr[i];//i-arr.length/2 becouse we want to coppy element to b 0
            }
	//call recursion on both part
	mergesort(a);
	mergesort(b);
        merge(a,b,arr);//for merging both array in original array;
	}
        public static void merge(int []s1,int []s2,int d){
		int i=0,j=0,k=0;
		while(i<s1.length && j<s2.length ){
			if(s1[i]<s2[j]){
				d[k++]=s1[i++];
				}else{
				     d[k++]=s2[j++];
				}
	// if  element will left in s1 
        if(i<s1.length){
        while(i<s1.length){
		d[k++]=s1[i++];
		}
	}
	// if element will left in s2
	if(j<s2.length){
	while(j<s2.length){
		d[k++]=s2[j++];
		}
	}
}
