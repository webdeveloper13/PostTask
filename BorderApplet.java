//Applet using BorderLayout
/*
<applet code=BorderApplet width=300 height=300>
</applet>
*/
import java.applet.Applet;
import java.awt.*;
public class BorderApplet extends Applet{
public void init(){
Label l1=new Label("Username");
TextField tf1=new TextField(20);
Button b1=new Button("Done");
Button b2=new Button("Cancel");

BorderLayout bl=new BorderLayout();
setLayout(bl);
Panel p1=new Panel();
p1.setLayout(new FlowLayout());

Panel p2=new Panel();
FlowLayout f1=new FlowLayout();
p2.setLayout(f1);

p1.add(l1);
p1.add(tf1);
p2.add(b1);
p2.add(b2);

add(p1,"North");
add(p2,"South");
}
}