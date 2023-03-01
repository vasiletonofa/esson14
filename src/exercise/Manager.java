package exercise;

public class Manager extends Employee implements Training, Interview {
    @Override
    public void conductTraining() {
        System.out.println("Manager is conducting training..");
    }

    @Override
    public void conductInterview() {

    }
}
