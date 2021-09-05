package team;

public abstract class Team {
    private String name;
    private int run;

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getRun() {
    return run;
  }
  public  void info () {
    System.out.println(getName() + getRun());
  }
  @Override
  public String toString() {
    return name ;
  }
}




