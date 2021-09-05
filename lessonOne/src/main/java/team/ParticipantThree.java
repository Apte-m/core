package team;

import course.CanRun;
import course.Course;

public class ParticipantThree extends Team implements CanRun {
    private int run = 20;

    public ParticipantThree() {
        super("Эдуард");
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public void run(Course course) {
        if (getRun() < course.getLength()) {
            System.out.println(getName() + " не прошел испытание " + course.getLength());
            return;
        }
        System.out.println(getName() + "  прошел испытание расстаяние " + course.getLength());
        return;
    }
}
