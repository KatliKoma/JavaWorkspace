public class BarkingDog {
   public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){

        boolean wakeUp = false;


       if(hourOfDay>=0 && hourOfDay<8 && isBarking == true)
       {
           wakeUp=true;
       }else if (hourOfDay==23 && isBarking == true)
       {
           wakeUp =true;
       }
       else {
           wakeUp = false;
       }


        return wakeUp;

    }
 
}