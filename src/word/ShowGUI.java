package word;

import java.awt.EventQueue;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class ShowGUI implements Runnable {
	static JTextArea textArea ;
	private JTextArea textArea_1;
	private JFrame frame;
	static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//new Thread(new ShowGUI()).start();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ShowGUI window = new ShowGUI();
					window.frame.setVisible(true);
					new Thread(window).start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		
		
	}

	/**
	 * Create the application.
	 */
	public ShowGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 328, 291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 28));
		textArea.setEditable(false);
		textArea.setBounds(45, 25, 214, 72);
		frame.getContentPane().add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.BOLD, 28));
		textArea_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				//System.out.println(textArea.getText());
				//System.out.println(textArea_1.getText());
				String s=arg0.getKeyChar()+"";
				if(s.equals(textArea.getText())){
					textField.setText("ÕýÈ·");
					
				}else{
					textField.setText("´íÎó");
					}
				
				textArea_1.setText("");
			}
		});
		textArea_1.setBounds(45, 162, 214, 64);
		frame.getContentPane().add(textArea_1);
		
		textField = new JTextField();
		textField.setFont(new Font("ËÎÌå", Font.PLAIN, 15));
		textField.setEditable(false);
		textField.setBounds(45, 117, 214, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

	@Override
	public void run() {
		char c;
	    int i=97;
	    while(true){
	    	
	    	textField.setText("");
	    	int a=(int)(i+Math.random()*26);
	    	c=(char)a;
	    	textArea.setText(c+"");
	    	
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
		
		
	}
}
