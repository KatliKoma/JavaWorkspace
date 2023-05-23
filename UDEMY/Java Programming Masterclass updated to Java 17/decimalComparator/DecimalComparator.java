public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
   {

       boolean answer= false;
       double result =Math.abs(num1 -num2);
       if(result<0.0009)
       {
           answer = true;
       }
       else
       {
           answer = false;
       }
       return answer;
   }

}