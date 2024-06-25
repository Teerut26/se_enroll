import java.util.ArrayList;
import java.util.List;

public class MGame {
    private List<Player> players;
    private Board board;
    private int roundCount;

    public MGame(List<Player> players) {
        this.players = players;
        this.board = new Board();
        this.roundCount = 0;
        // สร้าง board แล้วเอา Square ไปใส่ใน board
        for (int i = 0; i <= 40; i++) {
            this.board.addSquare(new Square("Square " + i, i));
        }
    }

    public void playGame() {
        while (this.roundCount < 100) {
            System.out.println("------------------------"+ this.roundCount + "------------------------");
            // ผู้เล่นทุกคนได้เล่นครบทุกคนถึงจะนับเป็น 1 รอบ
            this.playRound();
            this.roundCount++;
        }
    }

    public void playRound() {
        // loop เพื่อให้ผู้เล่นทุกคนเล่นให้ครบทุกคน
        for (Player player : this.players) {
            // กำหนด dies เก็บลูกเต๋าหลายลูก
            DieCollection dieCollection = new DieCollection();

            // เพิ่มลูกเต๋าเข้าไป
            dieCollection.add(new Die());
            dieCollection.add(new Die());

            // ทำการทอยลูกเต๋าทั้งหมด
            dieCollection.rollAll();

            player.takeTurn(dieCollection, this.board);
        }
    }
}
