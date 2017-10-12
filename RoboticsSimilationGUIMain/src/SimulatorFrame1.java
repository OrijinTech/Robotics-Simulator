import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;


//WELCOME TO THE ROBOTICS SIMULATOR SOURCE CODE, THIS IS THE MAIN MENU FRAME (WINDOW).


public class SimulatorFrame1 {
	
	private JFrame mainFrame;
	private FieldEdit fieldFrame;
	private NewRobot createFrame;
	

	//Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimulatorFrame1 window = new SimulatorFrame1();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	//initializing the program
	public SimulatorFrame1() {
		initialize();
	}


	// Initialize the contents of the frame.
	private JFrame initialize() {
		mainFrame = new JFrame();
		mainFrame.getContentPane().setBackground(null);
		mainFrame.setBounds(100, 100, 2560, 1600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);

		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Title of the program
		JLabel Title = new JLabel("ROBOTICS AUTONOMOUS SIMULATOR");
		Title.setFont(new Font("Robotica", Font.PLAIN, 40));
		Title.setBounds(154, 43, 988, 80);
		mainFrame.getContentPane().add(Title);
		btnExit.setBounds(570, 550, 200, 50);
		mainFrame.getContentPane().add(btnExit);
		
		
		//This button goes to the Robot editor section.
		JButton btnNewRobot = new JButton("ROBOT EDITOR");
		btnNewRobot.setBackground(new Color(0, 191, 255));
		btnNewRobot.setBounds(570, 250, 200, 50);
		btnNewRobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This refers to the changeFrame method which can be found in the bottom of the code.
				changeFrame();
			}
		});
		mainFrame.getContentPane().add(btnNewRobot);
		
		
		//This button goes to the Field section of the program.
		JButton btnField = new JButton("FIELD");
		btnField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This refers to the changeFrame2 method which can be found in the bottom of the code. 
				changeFrame2();
			}
		});
		btnField.setBounds(570, 350, 200, 50);
		mainFrame.getContentPane().add(btnField);
		

		JButton btnHelp = new JButton("HELP");
		btnHelp.setBounds(570, 450, 197, 50);
		mainFrame.getContentPane().add(btnHelp);
		
		//You can change the background picture here:
		JLabel Background = new JLabel("");
		Background.setBackground(new Color(0, 191, 255));
		//In the below line, you can change the Background picture (current picture = Background3.jpg).
		Image IMG = new ImageIcon(this.getClass().getResource("/Background3.jpg")).getImage();
		Background.setBounds(0, 0, 1280, 750);
		Background.setIcon(new ImageIcon(IMG));
		mainFrame.getContentPane().add(Background);
		mainFrame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{mainFrame.getContentPane()}));
		
		return mainFrame;
	}
	
	
	//CHANGING FRAMES METHODS
	//From Main menu to Robot Editor
	public void changeFrame(){
		//changes to one frame only
		if (createFrame == null){
			mainFrame.setVisible(false);
			createFrame = new NewRobot(this);
			createFrame.setVisible(true);
		}
		else{
			createFrame.setVisible(true);
		}
		
		
	}
	
	//From Robot Editor to Main menu
	public void changeFrame1(){
		//changes to one frame only
			createFrame.setVisible(false);
			mainFrame.setVisible(true);
	}
	
	//From Main menu to Field
	public void changeFrame2(){
		//changes to one frame only
		if (fieldFrame == null){
			mainFrame.setVisible(false);
			fieldFrame = new FieldEdit(this);
			fieldFrame.setVisible(true);
		}
		else{
			fieldFrame.setVisible(true);
		}
	}
	
	
	public void changeFrame3(){
		//changes to one frame only
			fieldFrame.setVisible(false);
			mainFrame.setVisible(true);
	}
	
	//From Robot Editor to Field
	public void changeFrame4(){
		//changes to one frame only
			createFrame.setVisible(false);
			fieldFrame.setVisible(true);
			
	}
	

}
