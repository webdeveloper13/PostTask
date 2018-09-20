

import java.awt.*;
import java.awt.event.*;

public class SalesInfoFrame extends Frame implements ActionListener{

TextField tfQty,tfsAmt;
Choice chProducts;
Checkbox cbDelivery;
Checkbox rbCash;
Checkbox rbCredit;
Button btnCalculate;
Button btnExit;
GridBagLayout gbl;
GridBagConstraints gbc;

public static void main(String args[]){

SalesInfoFrame salesFrame=new SalesInfoFrame();
}
public SalesInfoFrame(){
super("GADA ELECTRONICS");

setSize(400,300);
addControls();
setVisible(true);
}

public void addControls(){
gbl=new GridBagLayout();
gbc=new GridBagConstraints();

setLayout(gbl);
chProducts=new Choice();
chProducts.addItem("Samsung TV");
chProducts.addItem("Sony VCD");

tfQty=new TextField("1",20);
tfsAmt=new TextField(10);
tfsAmt.setEditable(false);
tfsAmt.setForeground(Color.red);

CheckboxGroup cbg=new CheckboxGroup();

rbCash=new Checkbox("Cash",cbg,true);
rbCredit=new Checkbox("Credit Card",cbg,false);

cbDelivery=new Checkbox("Home Delivery Required",true);

btnCalculate=new Button("Calculate");
btnCalculate.addActionListener(this);

btnExit=new Button("Exit");
btnExit.addActionListener(this);

addComponent(new Label("Product"),0,0,1,1);
addComponent(chProducts,1,0,2,1);
addComponent(new Label("Quantity"),0,1,1,1);
addComponent(tfQty,1,1,1,1);
addComponent(new Label("Payment kaise dega"),0,2,1,1);
addComponent(rbCash,1,2,1,1);
addComponent(rbCredit,2,2,1,1);
addComponent(cbDelivery,0,3,2,1);
addComponent(new Label("Nikaal Itna"),0,4,1,1);
addComponent(tfsAmt,1,4,1,1);
addComponent(btnCalculate,0,5,1,1);
addComponent(btnExit,2,5,1,1);
}

public void addComponent(Component com,int x,int y,int w,int h){

gbc.fill=GridBagConstraints.BOTH;
gbc.gridx=x;
gbc.gridy=y;
gbc.gridwidth=w;
gbc.gridheight=h;
gbl.setConstraints(com,gbc);
add(com);}

public void actionPerformed(ActionEvent evt){

if(evt.getSource()==btnExit){

System.exit(0);}

//calculate amount

int rate=0;
switch(chProducts.getSelectedIndex()){

case 0:

rate=12000;
break;

case 1:
rate=20000;
break;
}

int qty=Integer.parseInt(tfQty.getText());

rate*=qty;

if(rbCredit.getState())
rate+=rate*0.02;

if(cbDelivery.getState())
rate+=qty*50;

tfsAmt.setText(String.valueOf(rate));
}
}
