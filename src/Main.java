// 6510405601 Teerut Srithongdee
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));

        if (players.size() < 2 && players.size() > 8) {
            throw new IllegalArgumentException("ผู้เล่นต้องมีระหว่าง 2 - 8 คน");
        }

        MGame game = new MGame(players);
        game.playGame();
    }
}
