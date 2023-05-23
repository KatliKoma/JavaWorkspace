public class    FlourPacker{
    public static boolean canPack(int bigCount, int smallCount, int goal) {
     // Check for invalid input
     if (bigCount < 0 || smallCount < 0 || goal < 0) {
         return false;
     }
 
     // Calculate the maximum number of big bags we can use
     int maxBigBags = goal / 5;
 
     // Check if we have enough big bags to meet the goal
     if (bigCount >= maxBigBags) {
         // Calculate the remaining amount of kilos we need to reach the goal
         int remainingKilos = goal - maxBigBags * 5;
 
         // Check if we have enough small bags to reach the goal
         return smallCount >= remainingKilos;
     } else {
         // Calculate the remaining amount of kilos we need to reach the goal
         int remainingKilos = goal - bigCount * 5;
 
         // Check if we have enough small bags to reach the remaining kilos
         return smallCount >= remainingKilos;
     }
 }
 
 }