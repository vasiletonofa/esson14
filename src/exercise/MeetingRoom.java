package exercise;

import java.util.*;

public class MeetingRoom {

    private List<Training> trainingList;

    public MeetingRoom(List<Training> trainingList) {
        this.trainingList = trainingList;
    }

    public void conductTraining() {
        for(Training training : trainingList) {
            training.conductTraining();
        }
    }

}
