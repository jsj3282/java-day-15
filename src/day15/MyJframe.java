package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyJframe extends TimerQuiz{
	JFrame frame;
	Container c;
	JLabel label;
	Font font;
	public MyJframe(){
		frame = new JFrame("time");
		c = frame.getContentPane();
		label = new JLabel();
		font = new Font(null, 0, 32);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		c.add(label);
		frame.setLocation(1000, 2000);
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run(){		
		for(int i=0;;i++){
			try {
				Thread.sleep(1000);
				super.setDate();
				label.setText(super.getDate());
			} catch (InterruptedException e) {}
		}
	}
}