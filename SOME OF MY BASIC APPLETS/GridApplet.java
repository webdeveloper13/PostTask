//Applet using GridLayout
/*
<applet code=GridApplet width=300 height=300>
</applet>
*/

import java.applet.Applet;
import java.awt.*;
public class GridApplet extends Applet{
public void init(){

Label l1=new Label("UserName");
TextField tf1=new TextField(35);
Button b1=new Button("Done");
Button b2=new Button("Cancel");

GridLayout gl=new GridLayout(1,2);
setLayout(gl);

add(l1);
add(tf1);
add(b1);
add(b2);
}
}