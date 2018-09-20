
/*
<applet code=FlowApplet width=300 height=300>
</applet>
*/
import java.applet.Applet;
import java.awt.*;
public class FlowApplet extends Applet{
public void init(){
Label l1=new Label("Username");
TextField tf1=new TextField(20);
Button b1=new Button("Done");
Button b2=new Button("Cancel");
Button b3=new Button("Settings");


add(l1);
add(tf1);
add(b1);
add(b2);
add(b3);
}
}
