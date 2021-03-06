/**
 * 
 */
package tictactoe;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * @author johnjung
 *
 */
public class TicTacToe {
	
	JFrame window;
	
	
	public TicTacToe() {
		createGUI();
		System.out.println("GUI created");
	
	}

	
	private void createGUI() {
		window = new JFrame("TicTacToe Game");
		window.setTitle(null);
		window.setSize(500,500);
		window.setVisible(true);
		window.setLayout(null);
		
		
		
	}
	
	public void showStartScreen() {
		JLabel startText = new JLabel();
		startText.setText("Start Game!");
		startText.setBounds(100, 300, 100, 200);
		JButton button = new JButton("Press to start");
		button.setBounds(100, 100, 100, 20);
		window.add(button);
		window.add(startText);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// if button pressed start game
				startGame();
			}
		});
		//*window.revalidate();
		window.repaint();
		
	}
	
	
	public void startGame() {
		System.out.println("For game please paypal me 100€, thx");
		
		
		
	}
	public void endScreen() {
		
	}
	public void gameLogic() {
		
	}
	

}
