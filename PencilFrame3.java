package rainbowpainter;
import java.awt.*;
import java.awt.event.*;

public class PencilFrame3 extends Frame{
	private static final long serialVersionUID = 7526472295622776140L;
int ovalSize=6;

 

Panel northPanel=new Panel();
Panel southPanel=new Panel();
Panel eastPanel=new Panel();


Canvas test=new Canvas();
MyCanvas sizer=new MyCanvas();

Color lgray=new Color(180,180,180);
Color w=new Color(0,128,128);
Color dblue=new Color(0,0,130);
Color RGB;


Font fon=new Font("Arial", Font.BOLD, 10);
Font fon2=new Font("Arial", Font.BOLD, 20);
Font fon3=new Font("Arial", Font.PLAIN, 8);

Label choose1=new Label("CHOOSE COLOR:", Label.CENTER);
Label penLabel=new Label("PEN SIZE:", Label.RIGHT);
Label indicator=new Label("6", Label.CENTER);
Label pix=new Label("pixels", Label.LEFT);
Label title=new Label("RAINBOW PAINTER", Label.CENTER);
Label nothing1=new Label();
Label nothing2=new Label();
Label nothing3=new Label("Written by DMITRIY CHERNOSHEY", Label.LEFT);
Label nothing4=new Label();
Label nothing5=new Label();
Label R=new Label("R", Label.CENTER);
Label G=new Label("G", Label.CENTER);
Label B=new Label("B", Label.CENTER);
Label Rvalue=new Label("0", Label.CENTER);
Label Gvalue=new Label("0", Label.CENTER);
Label Bvalue=new Label("0", Label.CENTER);

Scrollbar bar=new Scrollbar(Scrollbar.HORIZONTAL,6,1,2,20);
Scrollbar Rbar=new Scrollbar(Scrollbar.VERTICAL,0,0,0,255);
Scrollbar Gbar=new Scrollbar(Scrollbar.VERTICAL,0,0,0,255);
Scrollbar Bbar=new Scrollbar(Scrollbar.VERTICAL,0,0,0,255);
Choices3 choices;
PencilCanvas3 pencil;

Button setColor=new Button("Set New Color");

PencilFrame3(){

                                       //connections to other classes
choices=new Choices3(pencil,this);
 pencil=new PencilCanvas3(this,choices);
                                       //Gridbag objects and constraints objects
GridBagLayout gridbagSouth=new GridBagLayout();
GridBagLayout gridbagNorth=new GridBagLayout();
GridBagLayout gridbagEast=new GridBagLayout();
GridBagConstraints consSouth=new GridBagConstraints();
GridBagConstraints consNorth=new GridBagConstraints();
GridBagConstraints consEast=new GridBagConstraints();
                                    //setting layouts for all panels
southPanel.setLayout(gridbagSouth);
northPanel.setLayout(gridbagNorth);
eastPanel.setLayout(gridbagEast);
                                 //setting blue trim labels 
nothing1.setBackground(dblue);
nothing2.setBackground(dblue);
nothing3.setBackground(dblue);
nothing4.setBackground(dblue);
nothing5.setBackground(dblue);
nothing3.setFont(fon3);
nothing3.setForeground(Color.white);

                              //describing cells for southPanel
//bluetrim holder
buildConstraints(consSouth,0,0,1,1,6,200);
consSouth.fill=GridBagConstraints.BOTH;
gridbagSouth.setConstraints(nothing2,consSouth);
southPanel.add(nothing2);

//label holder
buildConstraints(consSouth,1,0,1,1,40,200);
consSouth.fill=GridBagConstraints.NONE;
consSouth.anchor=GridBagConstraints.EAST;
gridbagSouth.setConstraints(penLabel,consSouth);
southPanel.add(penLabel);

//size digit holder
buildConstraints(consSouth,2,0,1,1,20,0);
consSouth.fill=GridBagConstraints.NONE;
gridbagSouth.setConstraints(indicator,consSouth);
southPanel.add(indicator);

//word "pixels"
buildConstraints(consSouth,3,0,1,1,40,0);
consSouth.fill=GridBagConstraints.NONE;
consSouth.anchor=GridBagConstraints.WEST;
gridbagSouth.setConstraints(pix,consSouth);
southPanel.add(pix);

//canvas holder
buildConstraints(consSouth,4,0,1,1,30,0);
consSouth.fill=GridBagConstraints.BOTH;
gridbagSouth.setConstraints(sizer,consSouth);
southPanel.add(sizer);

//scrollbar holder
buildConstraints(consSouth,5,0,1,1,228,0);
consSouth.fill=GridBagConstraints.BOTH;
gridbagSouth.setConstraints(bar,consSouth);
southPanel.add(bar);

//east trim holder
buildConstraints(consSouth,6,0,1,1,6,0);
consSouth.fill=GridBagConstraints.BOTH;
gridbagSouth.setConstraints(nothing4,consSouth);
southPanel.add(nothing4);

//south border holder
buildConstraints(consSouth,0,1,7,1,0,50);
consSouth.fill=GridBagConstraints.BOTH;
gridbagSouth.setConstraints(nothing3,consSouth);
southPanel.add(nothing3);

southPanel.setBackground(lgray);
sizer.setBackground(lgray);
indicator.setBackground(lgray);
penLabel.setFont(fon);
title.setFont(fon2);
title.setBackground(dblue);
title.setForeground(Color.white);
northPanel.setBackground(lgray);
eastPanel.setFont(fon3);
eastPanel.setForeground(Color.white);
eastPanel.setBackground(dblue);

                           //describing cells for eastPanel

//choose1
buildConstraints(consEast,0,0,3,1,0,5);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(choose1,consEast);
eastPanel.add(choose1);

//choices 
buildConstraints(consEast,0,1,3,1,0,5);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(choices,consEast);
eastPanel.add(choices);

//letter R
buildConstraints(consEast,0,2,1,1,30,5);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(R,consEast);
eastPanel.add(R);

//letter G
buildConstraints(consEast,1,2,1,1,30,0);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(G,consEast);
eastPanel.add(G);

//letter B
buildConstraints(consEast,2,2,1,1,30,0);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(B,consEast);
eastPanel.add(B);

//Rbar 
buildConstraints(consEast,0,3,1,1,0,70);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(Rbar,consEast);
eastPanel.add(Rbar);

//Gbar
buildConstraints(consEast,1,3,1,1,0,0);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(Gbar,consEast);
eastPanel.add(Gbar);

//Bbar
buildConstraints(consEast,2,3,1,1,0,0);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(Bbar,consEast);
eastPanel.add(Bbar);

//Rvalue
buildConstraints(consEast,0,4,1,1,0,5);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(Rvalue,consEast);
eastPanel.add(Rvalue);

//Gvalue
buildConstraints(consEast,1,4,1,1,0,0);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(Gvalue,consEast);
eastPanel.add(Gvalue);

//Bvalue
buildConstraints(consEast,2,4,1,1,0,0);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(Bvalue,consEast);
eastPanel.add(Bvalue);

//test
buildConstraints(consEast,0,5,3,1,0,5);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(test,consEast);
eastPanel.add(test);

//setColor
buildConstraints(consEast,0,6,3,1,0,5);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(setColor,consEast);
eastPanel.add(setColor);

//nothing5,outer blue border
buildConstraints(consEast,3,0,1,7,10,0);
consEast.fill=GridBagConstraints.BOTH;
gridbagEast.setConstraints(nothing5,consEast);
eastPanel.add(nothing5);

//north panel
buildConstraints(consNorth,0,0,1,1,100,100);
consNorth.fill=GridBagConstraints.BOTH;
gridbagNorth.setConstraints(title,consNorth);
northPanel.add(title);
nothing1.setBackground(dblue);

     
setLayout(new BorderLayout());
add("North",northPanel);
add("South",southPanel);
add("Center", pencil);
add("East", eastPanel);
add("West", nothing1);
pencil.requestFocus();
}


void buildConstraints(GridBagConstraints gbc, int gx, int gy, int gw, int gh, int wx,
int wy){
gbc.gridx=gx;
gbc.gridy=gy;
gbc.gridwidth=gw;
gbc.gridheight=gh;
gbc.weightx=wx;
gbc.weighty=wy;
}


void changeColor(Choices3 ch){

if (ch.getSelectedItem()=="Red")test.setBackground(Color.red);
else if(ch.getSelectedItem()=="Blue")test.setBackground(Color.blue);
else if(ch.getSelectedItem()=="Yellow")test.setBackground(Color.yellow);
else if(ch.getSelectedItem()=="Windows Color")test.setBackground(w);
else if(ch.getSelectedItem()=="Green")test.setBackground(Color.green);
else if(ch.getSelectedItem()=="White")test.setBackground(Color.white);
else test.setBackground(Color.black);
setBars();
}

void setBars(){
int r=test.getBackground().getRed();
int g=test.getBackground().getGreen();
int b=test.getBackground().getBlue();
Rbar.setValue(r);
Gbar.setValue(g);
Bbar.setValue(b);
Rvalue.setText(String.valueOf(r));
Gvalue.setText(String.valueOf(g));
Bvalue.setText(String.valueOf(b));
changeValues();
}

void changeValues(){
ovalSize=bar.getValue();
Rvalue.setText(String.valueOf(Rbar.getValue()));
Gvalue.setText(String.valueOf(Gbar.getValue()));
Bvalue.setText(String.valueOf(Bbar.getValue()));
pencil.oval=ovalSize;
indicator.setText(String.valueOf(ovalSize));
RGB=new Color(Rbar.getValue(),Gbar.getValue(),Bbar.getValue());
sizer.repaint();
test.setBackground(RGB);
pencil.requestFocus();
}


public boolean handleEvent(Event evt){
if (evt.id==Event.SCROLL_ABSOLUTE)
  changeValues();
if (evt.id==Event.SCROLL_LINE_DOWN)
  changeValues();
if (evt.id==Event.SCROLL_LINE_UP)
  changeValues();
if (evt.id==Event.SCROLL_PAGE_DOWN)
  changeValues();
if (evt.id==Event.SCROLL_PAGE_UP)
  changeValues();
if (evt.target instanceof Choice)
changeColor((Choices3)evt.target);
if (evt.target instanceof Button)
pencil.setBackground(RGB);
pencil.requestFocus();
return true;
}

class MyCanvas extends java.awt.Canvas{ 
	private static final long serialVersionUID = 7526472295622776144L;
public void paint(Graphics g){
g.setColor(Color.yellow);
g.fillOval(getSize().width/2-ovalSize/2, getSize().height/2-ovalSize/2, ovalSize, ovalSize);} 
}


public static void main(String args[]){
PencilFrame3 app=new PencilFrame3();
WindowListener l=new WindowAdapter() 
{public void windowClosing(WindowEvent e){System.exit(0);}};
app.addWindowListener(l);
app.setSize(644,600);
app.setVisible(true);
}
}
