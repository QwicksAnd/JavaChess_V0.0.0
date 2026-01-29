/*
 * ChessBoard class
 */
public class ChessBoard {

    private static final String[][] board = new String[8][8];
    private static final String[] ROWS = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private static final String[] COLUMNS = {"A", "B", "C", "D", "E", "F", "G", "H"};
    
    /*
     * constructor
     * pre: none
     * post: Makes the board.
     */
    public ChessBoard() {
        
        for (int rows = 0; rows < board.length; rows ++) {
            for (int columns = 0; columns < board[0].length; columns ++) {
                
                board[rows][columns] = " ";
                
            }
        }
    }
    
    /*
     * Displays the board.
     * pre: none
     * post: Chess board has been displayed with rows and columns.
     */
    public void drawGame() {
        System.out.print("   ");
        
        for(int count = 0; count < (COLUMNS.length)-1; count++) {
            
            System.out.print(COLUMNS[count] + "  ");
            
        }
        
        System.out.println(COLUMNS[7]);
        
        for (int rows = 0; rows < board.length; rows++) {
            
            System.out.print(ROWS[rows] + " ");
            
            for (int columns = 0; columns < board[0].length; columns++) {
                
                System.out.print("[" + board[rows][columns] + "]");
                
            }
            
            System.out.println();
            
        }
    }
}

