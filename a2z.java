class binary{
    public static void main(String aergs[]){
        int arr[] = {2,5,7,8,34,45,56,67,78,89,99,101};
        int l = 0;
        int r = arr.length-1;
        int t = 45;
        //int mid;
        while(l<=r){
            int z = (l+r)/2;
            if(arr[z] == t){
                //System.out.println("the index of the target value is" + z);
            }
            else if (arr[z] < t){
                l = z+ 1;
            }
            else{
                r = z - 1;
            }
        }
        System.err.println("The index of the  targeted value is not found");


        //implemented code
    }
    
}