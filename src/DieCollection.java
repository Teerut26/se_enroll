// 6510405601 Teerut Srithongdee
import java.util.ArrayList;

public class DieCollection {
    private ArrayList<Die> dieArrayList;

    DieCollection() {
        this.dieArrayList = new ArrayList<>();
    }

    public void add(Die die) {
        this.dieArrayList.add(die);
    }

    // ทอยลูกเต๋าพร้อมกันทั้งหมด
    public void rollAll() {
        for (Die die : this.dieArrayList) {
            die.roll();
        }
    }

    // get ผลรวมของลูกเต๋าทั้งหมด
    public int getFvTot() {
        int fvTot = 0;
        for (Die die : this.dieArrayList) {
            fvTot += die.getFaceValue();
        }
        return fvTot;
    }
}
