/*
 *Pieces class
 */
public class Pieces {

    private int pieceXPositon;
    private int pieceYPosition;
    private String pieceName;
    private boolean pieceDead;

    public Pieces (String name, int amt) {
        pieceDead = false;
        pieceName = name;

        for(int count = 0; count < amt; count ++) {
            System.out.println(name + " " + (count + 1));

        }
    }
}
