package exercise2;

public class Manager extends Employee implements Training, Interview {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void conductTraining() {
        System.out.println("Manager " + name + " is conducting training..");
    }

    @Override
    public void conductInterview() {

    }
}
