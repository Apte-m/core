package course;

public class Course {
    private int lenght;

    public Course(int lenght) {
        this.lenght = lenght;
    }

    public int getLength() {
        return lenght;
    }

    public void getCourse(CanRun canRun) {
        canRun.run(this);
        return;
    }

}
