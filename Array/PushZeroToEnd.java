public class PushZeroToEnd {
    void solution(int[] arr) {
        int first = 1;
        int second = 0;
        
       while(first < arr.length)
       {
           if(arr[second] == 0 && arr[first] != 0)
           {
               int temp = arr[second];
               arr[second] = arr[first];
               arr[first] = temp;
               second++;
           }
           if(arr[second] != 0)
           {
               second++;
           }
           first++;
       }
    }
}
