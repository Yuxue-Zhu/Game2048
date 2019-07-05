import javax.swing.JFrame;
import javax.swing.WindowConstants;
/**
 * This class is to show how to use the controller, view and model.
 * 
 * 
 * @author Yuxue Zhu
 * ID: 260737363
 * @version 1.0
 * @since 2018-11-22
 */


public class Launcher {

	public static void main(String[] args) {
		//set up for Frame
		JFrame gameFrame = new JFrame();
		gameFrame.setTitle("2048 Game");
		gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gameFrame.setSize(340, 400);
		gameFrame.setResizable(true);
		
		
		GameModel game = new GameModel ();
		GamePanel panel = new GamePanel();
		gameFrame.add(panel);
		panel.addKeyListener(new Controller (game, panel));//add observer to panel
		
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setVisible(true);
	}
	
}
