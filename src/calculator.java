import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JLabel;


public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn8;
	private JButton btn7;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btnBackSpace;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnPercent;
	private JButton btnClear;
	private JButton btnDoubleZero;
	private JButton btnDivide;
	private JButton btnMultiply;
	private JButton btnMinus;
	private JButton btnPlus;
	private JButton btnEqual;
	private JButton btnAddInverse;
	
	Double first;
	Double second;
	Double result;
	String operation;
	String answer;
	private JButton btn9;
	private JButton btnSquared;
	private JButton btnRoot;
	private JButton btnC;
	private JTextField show;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 314, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setToolTipText("");
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 29));
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.GRAY);
		textField.setBounds(6, 113, 286, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setBounds(77, 317, 71, 49);
		frame.getContentPane().add(btn8);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setBounds(149, 317, 71, 49);
		frame.getContentPane().add(btn7);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setBounds(5, 368, 71, 49);
		frame.getContentPane().add(btn6);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setBounds(77, 368, 71, 49);
		frame.getContentPane().add(btn5);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setBounds(149, 368, 71, 49);
		frame.getContentPane().add(btn4);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setBounds(5, 419, 71, 49);
		frame.getContentPane().add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setBounds(77, 419, 71, 49);
		frame.getContentPane().add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setBounds(149, 419, 71, 49);
		frame.getContentPane().add(btn1);
		
		btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length()>0);
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.setForeground(Color.WHITE);
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnBackSpace.setBackground(Color.GRAY);
		btnBackSpace.setBounds(221, 215, 71, 49);
		frame.getContentPane().add(btnBackSpace);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn0.setBackground(Color.DARK_GRAY);
		btn0.setBounds(77, 470, 71, 49);
		frame.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setVerticalAlignment(SwingConstants.TOP);
		btnDot.setForeground(Color.WHITE);
		btnDot.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnDot.setBackground(Color.DARK_GRAY);
		btnDot.setBounds(149, 470, 71, 49);
		frame.getContentPane().add(btnDot);
		
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				show.setText(first+ " " +operation);
			}
		});
		btnPercent.setForeground(Color.WHITE);
		btnPercent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPercent.setBackground(Color.GRAY);
		btnPercent.setBounds(5, 215, 71, 49);
		frame.getContentPane().add(btnPercent);
		
		btnClear = new JButton("CE");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				show.setText(null);
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnClear.setBackground(Color.GRAY);
		btnClear.setBounds(149, 215, 71, 49);
		frame.getContentPane().add(btnClear);
		
		btnDoubleZero = new JButton("00");
		btnDoubleZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDoubleZero.getText();
				textField.setText(number);
			}
		});
		btnDoubleZero.setForeground(Color.WHITE);
		btnDoubleZero.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnDoubleZero.setBackground(Color.DARK_GRAY);
		btnDoubleZero.setBounds(5, 470, 71, 49);
		frame.getContentPane().add(btnDoubleZero);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				show.setText(first+ " " +operation);
			}
		});
		btnDivide.setForeground(Color.WHITE);
		btnDivide.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDivide.setBackground(Color.GRAY);
		btnDivide.setBounds(221, 266, 71, 49);
		frame.getContentPane().add(btnDivide);
		
		btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x";
				show.setText(first+ " " +operation);
			}
		});
		btnMultiply.setVerticalAlignment(SwingConstants.TOP);
		btnMultiply.setForeground(Color.WHITE);
		btnMultiply.setFont(new Font("Segoe UI Variable", Font.PLAIN, 20));
		btnMultiply.setBackground(Color.GRAY);
		btnMultiply.setBounds(221, 317, 71, 49);
		frame.getContentPane().add(btnMultiply);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				show.setText(first+ " " +operation);
			}
		});
		btnMinus.setForeground(Color.WHITE);
		btnMinus.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnMinus.setBackground(Color.GRAY);
		btnMinus.setBounds(221, 368, 71, 49);
		frame.getContentPane().add(btnMinus);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				show.setText(first+ " " +operation);
			}
		});
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPlus.setBackground(Color.GRAY);
		btnPlus.setBounds(221, 419, 71, 49);
		frame.getContentPane().add(btnPlus);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				show.setText(first+" "+operation+" "+ second+" =");
				if(operation=="+")
				{
					Cal calculate = new Cal();
					Double result=calculate.add(first,second);
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					Cal calculate = new Cal();
					Double result=calculate.sub(first,second);
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					Cal calculate = new Cal();
					Double result=calculate.div(first,second);
					answer=String.format("%.2f",result);
					textField.setText(answer);
					show.setText(null);
				}
				else if(operation=="%")
				{
					Cal calculate = new Cal();
					Double result=calculate.per(first,second);
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="x")
				{
					Cal calculate = new Cal();
					Double result=calculate.mul(first,second);
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
			
			}
		});
		btnEqual.setForeground(Color.WHITE);
		btnEqual.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnEqual.setBackground(Color.ORANGE);
		btnEqual.setBounds(221, 470, 71, 49);
		frame.getContentPane().add(btnEqual);
		
		btnAddInverse = new JButton("+/-");
		btnAddInverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="+/-";
				Cal calculate = new Cal();
				Double result=calculate.addInverse(first);
				answer=String.format("%.2f",result);
				textField.setText(answer);
			}
		});
		btnAddInverse.setForeground(Color.WHITE);
		btnAddInverse.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddInverse.setBackground(Color.GRAY);
		btnAddInverse.setBounds(5, 266, 71, 49);
		frame.getContentPane().add(btnAddInverse);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setBounds(5, 317, 71, 49);
		frame.getContentPane().add(btn9);
		
		btnSquared = new JButton("^2");
		btnSquared.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="^2";
				Cal calculate = new Cal();
				Double result=calculate.pow(first);
				answer=String.format("%.2f",result);
				textField.setText(answer);
			}
		});
		btnSquared.setForeground(Color.WHITE);
		btnSquared.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSquared.setBackground(Color.GRAY);
		btnSquared.setBounds(77, 266, 71, 49);
		frame.getContentPane().add(btnSquared);
		
		btnRoot = new JButton("√");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				operation="√";
				Cal calculate = new Cal();
				Double result=calculate.root(first);
				answer=String.format("%.2f",result);
				textField.setText(answer);
			}
		});
		btnRoot.setForeground(Color.WHITE);
		btnRoot.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRoot.setBackground(Color.GRAY);
		btnRoot.setBounds(149, 266, 71, 49);
		frame.getContentPane().add(btnRoot);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setForeground(Color.WHITE);
		btnC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnC.setBackground(Color.GRAY);
		btnC.setBounds(77, 215, 71, 49);
		frame.getContentPane().add(btnC);
		
		show = new JTextField();
		show.setForeground(SystemColor.scrollbar);
		show.setBackground(Color.GRAY);
		show.setBorder(null);
		show.setHorizontalAlignment(SwingConstants.TRAILING);
		show.setBounds(6, 93, 286, 20);
		frame.getContentPane().add(show);
		show.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Standard Calculator");
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.ITALIC, 18));
		lblNewLabel.setBounds(6, 65, 125, 14);
		frame.getContentPane().add(lblNewLabel);
		
	
	}
}
