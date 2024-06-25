import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Square> squares;

    public Board() {
        this.squares = new ArrayList<>();
    }

    public void addSquare(Square square) {
        this.squares.add(square);
    }

    public Square getSquare(int oldLocation,int fvTot) {
        // ทำการ mod เพื่อให้ไม่เกิน 40 ทำให้สามารถเดินวนได้
        int newLocation = (oldLocation + fvTot) % 40;
        for (Square square : this.squares) {
            if (square.getLocation() == newLocation) {
                return square;
            }
        }
        return null;
    }
}
