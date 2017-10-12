import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.imageio.*;

@SuppressWarnings("unused")
public class FieldEdit extends JFrame {

	private SimulatorFrame1 mainFrame;
	private FieldEdit fieldFrame;
	private NewRobot createFrame;
	private JPanel contentPane;
	private JTextField txtPathDistance;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FieldEdit frame = new FieldEdit();
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
	public FieldEdit(SimulatorFrame1 main) {
		mainFrame = main;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2560, 1600);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JLabel lblEditTheField = new JLabel("EDIT THE FIELD");
		lblEditTheField.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditTheField.setFont(new Font("Robotica", Font.PLAIN, 20));
		lblEditTheField.setBounds(400, 19, 525, 63);
		contentPane.add(lblEditTheField);
		
		
		JLabel lblHardwareSelection = new JLabel("Hardware Selection");
		lblHardwareSelection.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblHardwareSelection.setBounds(94, 106, 159, 16);
		contentPane.add(lblHardwareSelection);
		
		
		JButton btnBackToMain = new JButton("Back To Main Menu");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.changeFrame3();
			}
		});
		btnBackToMain.setBounds(593, 705, 192, 27);
		contentPane.add(btnBackToMain);
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(1081, 679, 117, 29);
		contentPane.add(btnExit);
		
		
		JButton btnRun = new JButton("RUN");
		btnRun.setBounds(594, 635, 191, 29);
		contentPane.add(btnRun);
		
		

		JLabel lblDataFromThe = new JLabel("Data From the Field");
		lblDataFromThe.setBounds(419, 107, 131, 16);
		contentPane.add(lblDataFromThe);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(343, 133, 283, 474);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtPathDistance = new JTextField();
		txtPathDistance.setBounds(134, 61, 98, 26);
		panel_2.add(txtPathDistance);
		txtPathDistance.setColumns(10);
		
		JLabel lblPathDistance = new JLabel("Path Distance:");
		lblPathDistance.setBounds(33, 66, 111, 16);
		panel_2.add(lblPathDistance);
		
		textField = new JTextField();
		textField.setBounds(134, 122, 98, 26);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblTimeTaken = new JLabel("Time Taken:");
		lblTimeTaken.setBounds(33, 127, 89, 16);
		panel_2.add(lblTimeTaken);
		
		JLabel lblM = new JLabel("m");
		lblM.setBounds(237, 66, 26, 16);
		panel_2.add(lblM);
		
		JLabel lblS = new JLabel("s");
		lblS.setBounds(237, 127, 26, 16);
		panel_2.add(lblS);
		
		
		JLabel lblTools = new JLabel("Tools");
		lblTools.setBounds(139, 390, 42, 16);
		contentPane.add(lblTools);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(20, 418, 283, 189);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Draw Path");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(19, 21, 117, 29);
		panel_3.add(btnNewButton);
		
		
		JButton btnAddDelay = new JButton("Add Delay");
		btnAddDelay.setBounds(148, 21, 117, 29);
		panel_3.add(btnAddDelay);
		textField_1 = new JTextField();
		textField_1.setBounds(148, 78, 58, 26);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnEnterVelocity = new JButton("Enter Velocity");
		btnEnterVelocity.setBounds(19, 78, 117, 29);
		panel_3.add(btnEnterVelocity);
		
		
		JLabel lblMs = new JLabel("m/s");
		lblMs.setBounds(206, 83, 34, 16);
		panel_3.add(lblMs);
		
		
		JLabel lblField = new JLabel("Field");
		lblField.setBounds(1060, 78, 42, 16);
		contentPane.add(lblField);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 135, 283, 243);
		contentPane.add(scrollPane);
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(594, 670, 191, 29);
		contentPane.add(btnReset);
		
		
		//Drawing the Line
		LineDrawing drawPanel = new LineDrawing();
		drawPanel.setForeground(Color.BLACK);
		drawPanel.addMouseMotionListener(new MouseMotionAdapter() {
			Point pointC = new Point();
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
		});
		drawPanel.addMouseListener(new MouseAdapter() {
			private ArrayList<Point> coordinateList = new ArrayList<Point>();
			//int listSize = coordinateList;
			Point pointA = new Point();
			Point pointB = new Point();
			@Override
			public void mousePressed(MouseEvent e) {
				pointA = e.getPoint();
				//System.out.println(pointA);
				drawPanel.setPoint(pointA);
				pointA.setLocation(e.getPoint());
				coordinateList.add(pointA.getLocation());
				System.out.println(coordinateList);
				drawPanel.setList(coordinateList);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pointB = e.getPoint();
				//System.out.println(pointB);
				drawPanel.setPoint2(pointB);
				pointB.setLocation(e.getPoint());
				coordinateList.add(pointB.getLocation());
				System.out.println(coordinateList);
				drawPanel.setList(coordinateList);
				repaint();
			}
			
		});
		

		drawPanel.setBackground(new Color(255, 255, 255));
		drawPanel.setBounds(680, 127, 480, 480);
		drawPanel.setOpaque(false);
		contentPane.add(drawPanel);
		drawPanel.setLayout(null);
		
		
		JLabel Field = new JLabel("");
		Image IMG = new ImageIcon(this.getClass().getResource("/IA FIELD.jpg")).getImage();
		Field.setIcon(new ImageIcon(IMG));
		Field.setBounds(680, 127, 479, 480);
		contentPane.add(Field);
		
		//Set new background here:
		JLabel Background = new JLabel("");
		Image IMG2 = new ImageIcon(this.getClass().getResource("/Background3.jpg")).getImage();
		Background.setBounds(0, 0, 1280, 750);
		contentPane.add(Background);
		Background.setIcon(new ImageIcon(IMG2));
		
		
	}
}




