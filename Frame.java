 import javax.swing.JFrame;
 public class Frame extends JFrame{

    Frame(){
        this.add(new Panel());
        this.setTitle("snakegame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //user cannot resize it(fixed size)
        //ensuring the same experiance across different devices
        this.setResizable(false);

        //set the resolution
        this.pack();
        this.setVisible(true);

        //making sure the  frame swapm in the centre of the screen
        this.setLocationRelativeTo(null);

    }
}
