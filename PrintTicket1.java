import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PrintTicket1 extends JFrame
{
	public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime)
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
        String name= "SRM AIRLINES";
		Random random = new Random();
		int ticketNumber = 10000 + random.nextInt(90000);
		JPanel Panel2 = new JPanel(null);

		Panel2.setPreferredSize(new Dimension(500,200));

		JLabel LTitle = new JLabel("<html><b><font color=\"#C71585\",size=\"7\">AirLine Ticket</font></b></html>");
		JLabel LFrom = new JLabel("<html><b><font color=\"#000000\">From &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></b><font color=\"#778899\">"+ sFrom+"</font></html>" );
		JLabel LTo = new JLabel("<html><font color=\"#000000\">To &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+sTo+"</font></html>");
		JLabel LClass = new JLabel("<html><font color=\"#000000\">Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+sClass+"</font></html>" );
		JLabel LBookingDate = new JLabel("<html><font color=\"#000000\">Traveling Date &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ sBookingDate+"</font></html>" );
		JLabel LPrice = new JLabel("<html><font color=\"#000000\">Total Price &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ iPrice+"</font></html>" );
		JLabel LTime = new JLabel("<html><font color=\"#000000\">DepatureTime  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">"+ sTime+"</font></html>" );
		JLabel LAdult = new JLabel("<html><font color=\"#000000\">Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+iAdult+"</font></html>" );
		JLabel LChildren = new JLabel("<html><font color=\"#000000\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#778899\">"+ iChildren+"</font></html>" );
		JLabel LInfant = new JLabel("<html><font color=\"#000000\">Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">"+iInfant+"</font></html>" );
		JLabel LWishes = new JLabel("<html><body><I><font color=\"#D2B48C\">Wish you a happy journy</font></I></body></html>");


		JLabel LTicketNo = new JLabel("<html><font color=\"#000000\">TicketNumber &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: " + ticketNumber + "</font></html>");
    JLabel LBookedBy = new JLabel("<html><font color=\"#000000\">BookedBy &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: " + name + "</font></html>");

		JLabel LEmpty = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		JLabel LDemo = new JLabel("<html><U><font color=\"#8FBC8F\">AirLine-Project Developed By</font></U></html>");
		JLabel LSathya=new JLabel("<html><I><font color=\"#8FBC8F\">S Sathya Mahi</font></I></html>");
		JLabel LRohit=new JLabel("<html><I><font color=\"#8FBC8F\">B.S Rohit</font></I></html>");
		JLabel LRishi=new JLabel("<html><I><font color=\"#8FBC8F\">Rishi Anand</font></I></html>");
		


		LTitle.setBounds(170,15,500,45);
		LFrom.setBounds(20,80,300,20);

		LTo.setBounds(20,125,300,20);
		LClass.setBounds(20,170,300,20);
		LBookingDate.setBounds(20,215,300,20);
		LPrice.setBounds(20,260,300,20);
		LTime.setBounds(20,305,300,20);
		LAdult.setBounds(20,345,300,20);
		LChildren.setBounds(20,385,300,20);
		LInfant.setBounds(20,430,300,20);

		LWishes.setBounds(530,435,300,20);


		LTicketNo.setBounds(320,80,300,20);
		LBookedBy.setBounds(320,125,300,20);

		LEmpty.setBounds(3,445,1000,20);

		LDemo.setBounds(280,465,300,20);
		LSathya.setBounds(285,485,300,20);
		LRohit.setBounds(285,505,300,20);
		LRishi.setBounds(285,525,300,20);
		


		Panel2.add(LTitle);
		Panel2.add(LFrom);
		Panel2.add(LTo);
		Panel2.add(LClass);
		Panel2.add(LBookingDate);
		Panel2.add(LAdult);
		Panel2.add(LChildren);
		Panel2.add(LInfant);
		Panel2.add(LPrice);
		Panel2.add(LTime);
		//Panel2.add(LEmpty);

		Panel2.add(LWishes);

		Panel2.add(LTicketNo);
		Panel2.add(LBookedBy);
		Panel2.add(LEmpty);
		Panel2.add(LDemo);
		Panel2.add(LSathya);
		Panel2.add(LRohit);
		Panel2.add(LRishi);
		


		Panel2.add(new JLabel("Sathya "));
		Panel2.add(new JLabel("Rohit"));
		Panel2.add(new JLabel("Rishi"));
		


		Panel2.setBackground(Color.white);

		c.add(Panel2, BorderLayout.CENTER);


		//pack();
		setSize(700,650);
		setVisible(true);
	}
}