public class Player{
  private int[] spaces;
  private boolean isBluePlayer; // true = blue , false = red
  public Player(boolean bool){
    spaces = new int[24];
    isBluePlayer = bool;
    if(isBluePlayer){
      spaces[0] = 2;
      spaces[11] = 5;
      spaces[16] = 3;
      spaces[18] = 5;
    } else {
      spaces[5] = 5;
      spaces[7] = 3;
      spaces[12] = 5;
      spaces[23] = 2;
    }
  }

  public int numInPlay(){
    int count = 0;
    for(int item : spaces){
      count += item;
    }
    return count;

  }

  public numInHome(){
    int count = 0;
    if(isBluePlayer){
      for(int i = 17; i < 24; i++){
        count += spaces[i];
      }
    } else {
      for(int i = 0; i < 6; i++){
        count += spaces[i];
      }
    }
    return count;
  }

  public int spacesWithCheckers(){
    int count = 0;
    for(int item : spaces){
      if(item > 0){
        count++;
      }
    }
    return count;
  }

  public int[] filledSpaces(){
    int[] spots = new int[spacesWithCheckers()];
    int index = 0;
    for(int item : spaces){
      if(item > 0){
        spots[index] = item;
        index++;
      }
    }
    return spots;
  }

  public void moveChecker(int spot,int amt){
    if(isBluePlayer){
      spaces[spot]--;
      spaces[spot+amt]++;
    } else {
      spaces[spot]--;
      spaces[spot-amt]++;
    }
  }
}
