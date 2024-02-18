package q2;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.setStrategy(new FootballGame());
        game.play();

    }
}
