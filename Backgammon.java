import javax.swing.JFrame;
import java.awt.Component;

public class Backgammon{

  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;

  public Backgammon(){
    super("Backgammon");
    setSize(WIDTH, HEIGHT);

    Board theGame = new Board();
    ((Component) theGame).setFocusable(true);

    getContentPane().add(theGame);

    setVisible(true);

    //stops running the program after the window is closed
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args){
    Backgammon run = new Backgammon();
  }
}
