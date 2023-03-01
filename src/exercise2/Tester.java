package exercise2;

public class Tester extends Employee implements Training {
    @Override
    public void conductTraining() {
        System.out.println("Training for tester ...");
    }
}
