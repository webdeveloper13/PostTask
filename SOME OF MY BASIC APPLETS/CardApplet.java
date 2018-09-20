//program to demonstrate the usage of cardlayout

/*
<applet code=CardApplet width=300 height=300>
</applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CardApplet extends Applet implements ActionListener{


Button b1,b2,b3;
Panel cp;
CardLayout c1;

public void init(){

setLayout(new BorderLayout());
Panel tp=new Panel();
b1=new Button("First");
b2=new Button("Second");
b3=new Button("Third");

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

tp.add(b1);
tp.add(b2);
tp.add(b3);

add(tp,"North");

cp=new Panel();
c1=new CardLayout();
cp.setLayout(c1);

Panel p1=new Panel();
p1.add(new Label("This is First Card"));
Panel p2=new Panel();

p2.add(new Label("This is Second card"));

Panel p3=new Panel();
p3.add(new Label("This is the Third Card"));
p1.setBackground(Color.yellow);
p2.setBackground(Color.blue);
p3.setBackground(Color.green);

cp.add(p1,"First");
cp.add(p2,"Second");
cp.add(p3,"Third");
add(cp,"Center");

}//end of init

//control comes here when user clicks on either of button

public void actionPerformed(ActionEvent evt){

if(evt.getSource()==b1)
c1.show(cp,"First");

if(evt.getSource()==b2)
c1.show(cp,"Second");

if(evt.getSource()==b3)
c1.show(cp,"Third");
} 
}//end of applet