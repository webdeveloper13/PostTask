/* <applet code="ParameterApplet" width=200 height=200>
<param name="msg" value="SURYANSH HERE!!!!PARAMETER APPLET TESTED SUCESSFULLY!!">
<param name="size" value="20">
</applet>
*/
import java.applet.Applet;
import java.awt.*;
public class ParameterApplet extends Applet{
public void paint(Graphics g){
setBackground(Color.blue);
String msg=getParameter("msg");
String size=getParameter("size");
Font f=new Font("Western",Font.BOLD,Integer.parseInt(size));
g.setFont(f);
g.setColor(Color.white);
g.drawString(msg,20,50);
}
}
