import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * This class is the Controller class that links model and panel.
 * 
 * 
 * @author Yuxue Zhu
 * ID: 260737363
 * @version 1.0
 * @since 2018-11-22
 */


public class Controller extends KeyAdapter {
	private GameModel game;
	private GamePanel panel;
	
	public Controller(GameModel g,GamePanel p) {
		game = g;
		panel = p;
		p.setPanel(g);
		
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			game.resetGame();
		}
		if (!game.canMove()) {
			game.setMyLose(true);
		}
		
		if (!game.getMyWin() && !game.getMyLose()) {
			switch (e.getKeyCode()) {
				//update m
				case KeyEvent.VK_LEFT:
					game.left();
					break;
				case KeyEvent.VK_RIGHT:
					game.right();
					break;
				case KeyEvent.VK_DOWN:
					game.down();
					break;
				case KeyEvent.VK_UP:
					game.up();
					break;
			}
		}
		
		if (!game.getMyWin() && !game.canMove()) {
			game.setMyLose(true);
		}
		
		panel.setPanel(game);//update the panel
		panel.repaint();
	}


}
