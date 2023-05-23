public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour)
    {
        double milesToKm = 1.609;
        long answer =0;
        
        if(kilometersPerHour<0.00)
         {
        answer = -1;
         }
         else if(kilometersPerHour>0.00)
         {
        answer = Math.round(kilometersPerHour/milesToKm);
         }
         return answer;
        
    } 
    
    public static void printConversion(double kilometersPerHour)
    {
        long miles = toMilesPerHour( kilometersPerHour);
        if(miles>=0)
        System.out.println(kilometersPerHour+ " km/h = "+ miles+ " mi/h");
        
        else
        System.out.println("Invalid Value");
    }
        
    
}