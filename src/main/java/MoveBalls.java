import processing.core.PApplet;

public class MoveBalls extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;
    public float ballX = 0;

    public void settings() {
        size(WIDTH, HEIGHT);
    }

    public void draw()
    {
        moveBalls();

    }

    private void moveBalls() {
        for (int speed = 1; speed <= 4; speed++) {
            drawBalls(ballX*speed, speed*HEIGHT/5);

        }
        ballX++;

    }

    private void drawBalls(float ballX, float ballY) {
        ellipse(ballX,ballY,DIAMETER,DIAMETER);
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "MoveBalls" };
        PApplet.main(appletArgs);
    }


}
