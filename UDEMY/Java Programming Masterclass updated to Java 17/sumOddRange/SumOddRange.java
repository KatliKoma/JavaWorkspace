public class SumOddRange {
    
    public static boolean isOdd(int num)
    {
        boolean isOdd = false;
        if(num>0&&num%2!=0)
        {
            isOdd =true;
        }
        else
        {
            isOdd= false;
        }
        return  isOdd;
    }
    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        boolean odd = false;
       if(start<=end &&start>=0&& end>=0) {
           for (int i = start; i <= end; i++) {

               odd = isOdd(i);
               if (odd == true) {
                   sum = sum + i;
               }

           }
       }
       else
       {
           sum = -1;
       }


        return sum;
    }
 
}