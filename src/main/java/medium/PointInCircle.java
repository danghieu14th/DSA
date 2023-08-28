package medium;

public class PointInCircle {
//    in catesi
    public int pointInCircle(int radius){
        int x = 0;
        int y = 0;
        int count = 0;
        while(x <= radius){
            while(y <= radius){
                if(x * x + y * y <= radius * radius){
                    count++;
                }
                y++;
            }
            x++;
            y = 0;
        }
        return count * 4;
    }
}
