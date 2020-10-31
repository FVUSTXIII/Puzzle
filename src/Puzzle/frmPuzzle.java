package Puzzle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class frmPuzzle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public frmPuzzle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		setSize(500, 500);
		Integer j = 0;
		setLocationRelativeTo(null);
		ArrayList<Integer> buttons_text = new ArrayList<Integer>();
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		while (j < 9) {
			Random r1 = new Random();
			int winner = r1.nextInt(10);
			if(winner > 0) {
				if(!buttons_text.contains(winner)) {
					buttons_text.add(winner);
					j++;
					System.out.println("En la iteración: "+j + " se generó " + winner + "y se ingresó en el arreglo  " + buttons_text.get(j-1));
					if(j==9) {
						j=10;
					}
				}	
			}
			System.out.println("seguimos en el ciclo");
		}
		System.out.println("salimos del ciclo+");
		for(int i = 0; i< buttons_text.size(); i++) {
			System.out.println(buttons_text.get(i));
		}
		
		
		for (int i = 0; i < buttons_text.size(); i++) {
			JButton t = new JButton(buttons_text.get(i).toString());
			if(t.getText().equals("9")) {
				t.setVisible(false);
			}
			buttons.add(t);
		}
		for(int i = 0; i < buttons.size(); i++) {
			contentPane.add(buttons.get(i));
		}
		/*btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8.setText("6");
				btnNewButton_8.setVisible(true);
				btnNewButton_5.setVisible(false);
			}
		});*/
	}

}
