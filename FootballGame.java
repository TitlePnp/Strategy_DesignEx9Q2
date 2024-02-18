package q2;

public class FootballGame implements GameStrategy  {

    @Override
    public void initialize() {
        System.out.println("Initialize football game...");
    }

    @Override
    public void playing() {
        System.out.println("Playing football game...");
    }

    @Override
    public void showResult() {
        System.out.println("Showing the results for the football game...");
    }
}