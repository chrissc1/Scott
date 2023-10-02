public class Game {
    private final String gameName;
    private int players;
    private int score;

    public Game(String gameName, int players) {
        this.gameName = gameName;
        score = 0;
        this.players = players;

    }


    public String getGameName() {
        return gameName;
    }

    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    public void addPlayers() {
        players = players + 1;
    }

    public void increaseScore(int increase) {
        score = score + increase;
    }

    public double averageScorePerPlayer() {
        return (1.000 * score / players);
    }

    public boolean isGameOver() {
        return score > 9;
    }



}
