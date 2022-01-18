import java.awt.geom.Rectangle2D;
public class Mandelbrot extends FractalGenerator {
    public static final int MAX_ITERATIONS = 2000;
    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }
    @Override
    public int numIterations(double x, double y) {
        double curX = x;
        double curY = y;
        int am = 0;
        while(am < MAX_ITERATIONS){
            am++;
            double newX= curX*curX - curY*curY + x;
            double newY = 2*curX*curY + y;
            curX = newX;
            curY = newY;
            if(curX*curX + curY*curY > 4){
                return am;
            }
        }
        return -1;
    }
}