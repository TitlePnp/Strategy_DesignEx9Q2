package q2;

public class Game {
    GameStrategy gameStrategy;

    public void setStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void play() {
        this.gameStrategy.initialize();
        this.gameStrategy.playing();
        this.gameStrategy.showResult();
    }
}
