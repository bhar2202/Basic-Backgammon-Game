public class DicePair{
  private int die1;
  private int die2;
  private Image image1;
  private Image image2;

  public DicePair(){
    die1 = (int) Math.random() * 7 + 1;
    die2 = (int) Math.random() * 7 + 1;
    URL url = getClass().getResource("dice1.png");
    URL url2 = getClass().getResource("dice2.png");
    image = ImageIO.read(url);
    image2 = ImageIO.read(url2);
  }

  public void roll(){
    die1 = (int) Math.random() * 7 + 1;
    die2 = (int) Math.random() * 7 + 1;
  }

  public int getDie1(){
    return die1;
  }

  public int getDie2(){
    return die2;
  }

  pulbic void draw(Graphics window){
    window.drawImage(image1, 300, 400, 50, 50, null);
    window.drawImage(image2, 350, 400, 50, 50, null);
  }
}
