package exercise2;

import java.util.List;

public class MeetingRoom {

    public void conductTraining(Training[] training) {
        for (int i=0; i< training.length; i++) {
            training[i].conductTraining();
        }
    }

    public void conductTraining(Manager[] managers) {
        for (int i=0; i< managers.length; i++) {
            managers[i].conductTraining();
        }
    }

    public void conductTraining(Programmer[] programmers) {
        for (int i=0; i< programmers.length; i++) {
            programmers[i].conductTraining();
        }
    }

    public void conductTraining(Tester[] testers) {
        for (int i=0; i< testers.length; i++) {
            testers[i].conductTraining();
        }
    }
}
