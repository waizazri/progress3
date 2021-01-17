package fauzan;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import nadzim.GymGUI;
import sasikala.*;
import waiz.guilatest;

public class menu1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu1 window = new menu1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gui1 g1=new gui1();
		GymGUI g2=new GymGUI();
		guilatest g3=new guilatest();
		YogaGui g4=new YogaGui();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 930, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Outdoor Sports Club Registry");
		btnNewButton.setFont(new Font("Agency FB", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g1.main(null);
			}
		});
		btnNewButton.setBounds(10, 188, 414, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gym Registration System");
		btnNewButton_1.setFont(new Font("Agency FB", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g2.main(null);
			}
		});
		btnNewButton_1.setBounds(490, 188, 414, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Aerobic Management System\r\n");
		btnNewButton_2.setFont(new Font("Agency FB", Font.PLAIN, 30));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g3.main(null);
			}
		});
		btnNewButton_2.setBounds(10, 344, 414, 45);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Yoga Registry");
		btnNewButton_3.setFont(new Font("Agency FB", Font.PLAIN, 30));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g4.main(null);
			}
		});
		btnNewButton_3.setBounds(490, 344, 414, 45);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("HEALTH AND FITNESS");
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(64, 11, 799, 60);
		frame.getContentPane().add(lblNewLabel);
		
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("/icon/o1.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("/icon/o2.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		ImageIcon imageIcon3 = new ImageIcon(new ImageIcon("/icon/o3.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		ImageIcon imageIcon4 = new ImageIcon(new ImageIcon("/icon/o4.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(191, 319, 46, 14);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("New label");
		l2.setBounds(660, 157, 46, 14);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("New label");
		l3.setBounds(660, 319, 46, 14);
		frame.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("New label");
		l4.setBounds(105, 82, 254, 89);
		l4.setIcon(imageIcon1);
		frame.getContentPane().add(l4);
	}
}