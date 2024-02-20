public class test {
  public static void main(String[] args) {

    Monster mon1 = new Monster();
    Monster mon2 = new Monster();
    Monster mon3 = new Monster();

    mon1.add();
    System.out.println("round1 " + Monster.lastAssignedNo);
    mon2.add();
    System.out.println("round2 " + Monster.lastAssignedNo);
    mon3.add();
    System.out.println("round3 " +  Monster.lastAssignedNo);
  }
}