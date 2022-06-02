import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Myframe extends JFrame {
	
	Calendar Calender;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String day;
	String time;
	String date;

	Myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setResizable(false);
		


		timeFormat = new SimpleDateFormat("hh:mm:ss  a");        //constructor
		dayFormat = new SimpleDateFormat("EEEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		
		timeLabel =new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
		timeLabel.setForeground(Color.green);
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Ink Free",Font.BOLD,35));
	
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free",Font.BOLD,25));
	
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		
		setTime();
	}
	public void setTime() {
		while(true) {
		time = timeFormat.format(Calender.getInstance().getTime());
		timeLabel.setText(time);
		

		day = dayFormat.format(Calender.getInstance().getTime());
		dayLabel.setText(day);
		
		date = dateFormat.format(Calender.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
		Thread.sleep(1000);
	}
			catch (InterruptedException e) {
		       e.printStackTrace();
	}
      }
  }
}
