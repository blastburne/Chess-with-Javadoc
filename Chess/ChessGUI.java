package Chess;

import java.awt.Dimension;

import javax.swing.JFrame;


/*****************************************************************
 Graphical representation of a chess board. Always creates an 8 by 8 grid, alternating black and white spaces.
 *****************************************************************/
public class ChessGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChessPanel panel = new ChessPanel();
        frame.getContentPane().add(panel);

        frame.setResizable(true);
        frame.setPreferredSize(new Dimension(800, 637));
        frame.pack();
        frame.setVisible(true);
    }
}
