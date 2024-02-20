public class Monster {
  public static int lastAssignedNo = 1;
  private int monNo = 0;


  public void add() {
    monNo = lastAssignedNo + 1;
  }
}
