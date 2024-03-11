import java.util.Arrays;

class bubble{
    public static void main(String args[]){
        int arr[]={2,3,4,7,67,23,88,1,45};
      
        //System.out.println("before sorting the array is" +z);
        int i;
        int j;
        int n=arr.length;
        
        System.out.println("Before sorting");
        for( int z: arr){
        //System.out.println("Before sorting");
        System.out.print(z+" ");
        }
        for(i=0;i<n;i++)
        {
            for (j=0;j<n-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }

            }
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println("After sorting") ;
        for(int z : arr){
        //System.out.print("After sorting");    
        System.out.print(z + " ");
        }
    }      
}

