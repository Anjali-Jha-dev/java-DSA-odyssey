class SecondLargest {
    public int getSecondLargest(int[] arr) {
        //return -1 if arr is null or array length is less than 2
        if(arr == null || arr.length < 2){
            return -1;
        }

        //initialize largest and seclargest to minimum value
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest)
            {
                // update seclargest and largest
                secLargest = largest;
                largest = num;
                
            }
            // if largest found early and second largest exist after largest
            else if(num < largest && num>secLargest){
                secLargest = num;
            }
        }
        // return value if second largest found
        return (secLargest==Integer.MIN_VALUE)?-1:secLargest;
    }
}