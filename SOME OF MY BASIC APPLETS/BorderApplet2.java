//Applet using BorderLayout2
/*
<applet code=BorderApplet2 width=300 height=300>
</applet>
*/

import java.applet.Applet;
import java.awt.*;

public class BorderApplet2 extends Applet{
public void init(){

Label l1=new Label("Username");
TextField tf1=new TextField(40);
Button b1=new Button("Done");
Button b2=new Button("Cancel");
Button b3=new Button("HEY U");

BorderLayout bl=new BorderLayout();
setLayout(bl);

add(l1,"North");
add(tf1,"South");
add(b1,"East");

}
}

