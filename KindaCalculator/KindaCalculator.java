/*
<applet code= EventTest width=300 height=300>
</applet>
*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class KindaCalculator extends Applet implements ActionListener{

Label l1,l2;
TextField tf1,tf2,tf3;
Button b1,b2;

public void init(){

l1=new Label("First Number");
tf1=new TextField(20);
l2=new Label("Second Number");
tf2=new TextField(20);
b1=new Button("Sum");
b2=new Button("Product");
tf3=new TextField(20);
tf3.setEditable(false);
b1.addActionListener(this);
b2.addActionListener(this);


add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
add(tf3);
}

public void actionPerformed(ActionEvent evt){
int a,b,c=0;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());

if(evt.getSource()==b1){
c=a+b;
}
if(evt.getSource()==b2){
c=a*b;}

tf3.setText(String.valueOf(c));
}
}
