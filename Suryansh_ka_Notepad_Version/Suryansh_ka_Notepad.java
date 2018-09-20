import javax.swing.*;
import java.awt.event.*;

public class Suryansh_ka_Notepad implements ActionListener{

JFrame f;
JMenuBar mb;
JMenu file,edit,help;
JMenuItem cut,copy,paste,selectAll;

JTextArea ta;
Suryansh_ka_Notepad(){

f=new JFrame();
cut=new JMenuItem(" CAATO(Cut)");
copy=new JMenuItem("CHAAPO(Copy)");
paste=new JMenuItem("CHIPKAO(Paste)");
selectAll=new JMenuItem("Select All");

cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
selectAll.addActionListener(this);

mb=new JMenuBar();
mb.setBounds(20,19,400,20);
file=new JMenu("File");
edit=new JMenu("Edit");
help=new JMenu("Help");

edit.add(cut);
edit.add(copy);
edit.add(paste);
edit.add(selectAll);

mb.add(file);
mb.add(edit);
mb.add(help);

ta=new JTextArea();
ta.setBounds(25,50,460,460);
f.add(mb);
f.add(ta);

f.setLayout(null);
f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==cut)
ta.cut();

if(e.getSource()==copy)
ta.copy();

if(e.getSource()==selectAll)
ta.selectAll();

if(e.getSource()==paste)
ta.paste();

}

public static void main(String args[]){
new Suryansh_ka_Notepad();
}
}

