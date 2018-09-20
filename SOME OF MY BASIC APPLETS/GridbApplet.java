//GridBagLayout
/*
<applet code=GridbApplet width=300 height=300>
</applet>
*/

import java.applet.Applet;
import java.awt.*;

public class GridbApplet extends Applet{

GridBagConstraints gbc; //used to assign properties to components
GridBagLayout gb1;

public void init(){
Label l1=new Label("UserName");
TextField tf1=new TextField(20);
Label l2=new Label("Password");
TextField tf2=new TextField(20);
Button b1=new Button("Done");
//creating gridBaglayout
gb1=new GridBagLayout();

//constarints are used to specify how and where to place components in gridbag layout

gbc=new GridBagConstraints();

setLayout(gb1);

//invoke user defined methods to display components
//arguments are: components,x,y,width,height

displayComponent(l1,0,0,1,1);
displayComponent(tf1,1,0,2,1);
displayComponent(l2,0,1,1,1);
displayComponent(tf2,1,1,2,1);
displayComponent(b1,1,2,1,1);
}//end of init
//method to associate properties with components and add to layout

public void displayComponent(Component c,int x,int y,int w,int h){
gbc.gridx=x;
gbc.gridy=y;
gbc.gridwidth=w;
gbc.gridheight=h;

gb1.setConstraints(c,gbc); //associate properties with components
add(c); //add components to container
}// end of display component

}