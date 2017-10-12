import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewRobot extends JFrame {

	private SimulatorFrame1 mainFrame;
	private JPanel contentPane;
	private JTextField txtSelectMass;
	private JTextField txtSelectMass_1;
	private JTextField txtSelectMass_2;
	private JTextField txtSelectMass_3;
	private JTextField txtEnterLength;
	private JTextField txtEnterWidth;
	private JTextField txtEnterHeight;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NewRobot frame = new NewRobot();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public NewRobot(SimulatorFrame1 main) {
		//"this" refers to the object you are currently in
		mainFrame = main;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblCreateNewRobot = new JLabel("CREATE NEW ROBOT");
		lblCreateNewRobot.setFont(new Font("Robotica", Font.PLAIN, 20));
		lblCreateNewRobot.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateNewRobot.setBounds(437, 7, 421, 63);
		contentPane.add(lblCreateNewRobot);
		
		
		JLabel lblMobility = new JLabel("Mobility");
		lblMobility.setBounds(231, 168, 61, 16);
		contentPane.add(lblMobility);
		lblMobility.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JLabel lblOther = new JLabel("Mass");
		lblOther.setBounds(571, 168, 61, 16);
		contentPane.add(lblOther);
		lblOther.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(179, 218, 173, 25);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Number Of Wheels", "4", "6", "Tracks"}));
		
		
		txtSelectMass = new JTextField();
		txtSelectMass.setBounds(540, 196, 130, 26);
		contentPane.add(txtSelectMass);
		txtSelectMass.setText("Select Mass1");
		txtSelectMass.setColumns(10);
		
		
		JButton btnAdd = new JButton("GO TO FIELD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calls the method from the Main menu frame
				main.changeFrame4();
			}
		});
		btnAdd.setBounds(743, 635, 160, 40);
		contentPane.add(btnAdd);
		
		
		txtSelectMass_1 = new JTextField();
		txtSelectMass_1.setText("Select Mass4");
		txtSelectMass_1.setColumns(10);
		txtSelectMass_1.setBounds(540, 340, 130, 26);
		contentPane.add(txtSelectMass_1);
		
		
		txtSelectMass_2 = new JTextField();
		txtSelectMass_2.setText("Select Mass2");
		txtSelectMass_2.setColumns(10);
		txtSelectMass_2.setBounds(540, 244, 130, 26);
		contentPane.add(txtSelectMass_2);
		
		
		txtSelectMass_3 = new JTextField();
		txtSelectMass_3.setText("Select Mass3");
		txtSelectMass_3.setColumns(10);
		txtSelectMass_3.setBounds(540, 290, 130, 26);
		contentPane.add(txtSelectMass_3);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Type of Layout", "Classic", "Omni"}));
		comboBox_1.setBounds(179, 286, 173, 25);
		contentPane.add(comboBox_1);
		
		
		JButton btnBackToMain = new JButton("BACK TO MAIN MENU");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.changeFrame1();
				
			}
		});
		btnBackToMain.setBounds(565, 635, 160, 40);
		contentPane.add(btnBackToMain);
		
		
		txtEnterLength = new JTextField();
		txtEnterLength.setText("Enter Length");
		txtEnterLength.setBounds(831, 196, 130, 26);
		contentPane.add(txtEnterLength);
		txtEnterLength.setColumns(10);
		
		
		txtEnterWidth = new JTextField();
		txtEnterWidth.setText("Enter Width");
		txtEnterWidth.setColumns(10);
		txtEnterWidth.setBounds(831, 244, 130, 26);
		contentPane.add(txtEnterWidth);
		
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setHorizontalAlignment(SwingConstants.CENTER);
		lblSize.setBounds(861, 168, 61, 16);
		contentPane.add(lblSize);
		
		
		txtEnterHeight = new JTextField();
		txtEnterHeight.setText("Enter Height");
		txtEnterHeight.setColumns(10);
		txtEnterHeight.setBounds(831, 290, 130, 26);
		contentPane.add(txtEnterHeight);
		
		
		JButton button = new JButton("ADD DATA");
		button.setBounds(385, 635, 160, 40);
		contentPane.add(button);
		
		
		JLabel Background = new JLabel("");
		Background.setBounds(0, 0, 1280, 750);
		contentPane.add(Background);
		Image IMG = new ImageIcon(this.getClass().getResource("/Background3.jpg")).getImage();
		Background.setIcon(new ImageIcon(IMG));
	}
}
