import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"1.jpg");  
  }  
    
  public void paint(Graphics g) { 
  	 setBackground(Color.WHITE);
     Font currentFont = new Font("Arial", Font.BOLD,20 );
    g.setFont(currentFont); 
    g.drawImage(picture, 30,30, this);
    g.drawString("                    Chegg_Boy_Rajesh", 10, 20);
  }  
      
  }  
