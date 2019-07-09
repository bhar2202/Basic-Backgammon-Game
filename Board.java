import java.net.URL;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class board extends Canvas implements KeyListener, Runnable{
  private DicePair dice;
  private Player blue;
  private Player red;
  private boolean isSpacedKeyPressed;
  private boolean isBlueTurn;
  private boolean start;

  public board(){
    isSpacedKeyPressed = false;
    dice = new DicePair();
    blue = new Player(true);
    red = new Player(false);
    new Thread(this).start();
    this.addKeyListener(this);
    setVisible(true);
  }

  public void update(Graphics window) {
        paint(window);
  }

  public void paint(Graphics window) {
        //set up the double buffering feature
        Graphics2D twoDGraph = (Graphics2D) window;

        //takes a snapshot of the image with the same width and height
        if (back == null) {
            back = (BufferedImage) (createImage(getWidth(), getHeight()));
        }

        //the graphics type used
        Graphics graphToBack = back.createGraphics();

        //draws the image in the window
        graphToBack.setColor(Color.BLACK);
        graphToBack.fillRect(0, 0, 800, 600);

        if()


        twoDGraph.drawImage(back, null, 0, 0);
  }

  public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(5);
                repaint();
            }
        } catch (Exception e) {
        }
    }
}
