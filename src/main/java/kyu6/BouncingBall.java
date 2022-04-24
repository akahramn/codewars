package kyu6;

public class BouncingBall {

    public int calculate(double h, double bounce, double window) {

        if(h < 0 || bounce < 0 || bounce >= 1 || window > h ) {
            return -1;
        }

        int count = 1;
        double bounceHeight = h * bounce;

        while( bounceHeight > window) {
            count += 2;
            bounceHeight = bounceHeight * bounce;
        }

        System.out.println(count);
        return count;
    }
}
