import java.util.List;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name) {
        this.name = name;
        this.piece = new Piece();
    }

    public String getName() {
        return this.name;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void takeTurn(DieCollection dieCollection, Board board) {
        // ผลรวมของลูกเต๋า
        int fvTot = dieCollection.getFvTot();

        //ตำแหน่งของตัวเดิน
        int oldLocation = this.piece.getLocation();

        // เป้นค่าของช่อง
        Square newSquare = board.getSquare(oldLocation, fvTot);
        this.piece.setLocation(newSquare.getLocation());

        System.out.println(this.name);
        System.out.println("piece = " + this.piece.getLocation());
        System.out.println("fvTot = " + fvTot);
        System.out.println("newSquare = " + newSquare.getLocation());
        System.out.println("\n");
    }
}
