public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        boolean isPlaying = false;
        if(temperature>=25&& temperature<=35 && summer==false)
        {
            isPlaying = true;
        }else if(temperature>=25&& temperature<=45 && summer==true)
        {
            isPlaying = true;
        }
        
        return  isPlaying;
    }
}