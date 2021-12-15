import course.CanRun;
import course.Course;
import team.*;

public class Arena {
    public static void main(String[] args) {
        ParticipantOne participantOne = new ParticipantOne();
        ParticipantTwo participantTwo = new ParticipantTwo();
        ParticipantThree participantThree = new ParticipantThree();
        ParticipantFour participantFour = new ParticipantFour();

        Course[] course = {new Course(45), new Course(34), new Course(52)};
        Team[] teams = {participantOne, participantTwo, participantThree, participantFour};
        for (Team t : teams) {
            for (Course c : course) {
                c.getCourse((CanRun) t);
            }

        }
    }
}
