import java.io.*;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Date;
import javax.mail.*;
import javax.mail.internet.*;
import com.sun.mail.smtp.*;

public class EmailTest {

	public static void main(String[] args) throws Exception{
		Properties props = System.getProperties();
        props.put("mail.smtps.host","smtp.mailgun.org");
        props.put("mail.smtps.auth","true");
        Session session = Session.getInstance(props, null);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("emanuel.langit@fastmail.fm"));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("emanuel.langit@gmail.com", false));
        msg.setSubject("Hello");
        msg.setText("Testing some Mailgun awesomness");
        msg.setSentDate(new Date());
        SMTPTransport t =
            (SMTPTransport)session.getTransport("smtps");
        t.connect("smtp.mailgun.com", "postmaster@sandbox5fbd4465621c4cc0b19e91b5a07797fc.mailgun.org", "66f9fca864ea8e3beaad1fab83ca14d0");
        t.sendMessage(msg, msg.getAllRecipients());
        System.out.println("Response: " + t.getLastServerResponse());
        t.close();

		
		
		// TODO Auto-generated method stub

	}

}
