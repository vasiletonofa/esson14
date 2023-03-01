package exercise2;

public class Programmer extends Employee implements Training {
    @Override
    public void conductTraining() {
        System.out.println("Programmer is conducting training..");
    }
}
