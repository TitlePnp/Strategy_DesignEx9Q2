package q2;

public class BasketballGame implements GameStrategy {

    @Override
    public void initialize() {
        System.out.println("Initialize basketball game...");
    }

    @Override
    public void playing() {
        System.out.println("Playing basketball game...");
    }

    @Override
    public void showResult() {
        System.out.println("Showing the results for the basketball game...");
    }
    
}
