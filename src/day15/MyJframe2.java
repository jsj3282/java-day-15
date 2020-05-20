package day15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyJframe2 extends MyJframe{
	
	
	/*
	JFrame frame;
	Container c;
	JLabel label;
	Font font;
	public MyJframe2(){
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
	*/
	public void run(){
		SimpleDateFormat simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분");
		long time = 0;
		long firsttime = 0;
		for(int i=0;;i++){
			try {
				if(i==0) {
					firsttime = System.currentTimeMillis();
				}
				Thread.sleep(1000);
				time = System.currentTimeMillis();
				//long useTime = time - firsttime;
				//String s = simpl.format(useTime);
				//label.setText(s);
			} catch (InterruptedException e) {}
			long useTime = time - firsttime;
			String s = simpl.format(useTime);
			label.setText(s);
		}

	}
	

}
