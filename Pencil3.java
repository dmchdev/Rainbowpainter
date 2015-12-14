package rainbowpainter;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Event;
import java.awt.*;

public class Pencil3 extends java.applet.Applet {
	private static final long serialVersionUID = 7526472295622776148L;
        int globx=0;
        int globy=0;
        int globx2=0;
        int globy2=0;
        int globx3=0;
        int globy3=0;
        int globx4=0;
        int globy4=0;
        int globxb=0;
        int globyb=0;
        int globx2b=0;
        int globy2b=0;
        int globx3b=0;
        int globy3b=0;
        int globx4b=0;
        int globy4b=0;       
        int currcolor=0;
 Color globColor[]= new Color[100];
 Color CUNN[]=new Color[100];
 Color CUUD[]=new Color[100];
 Color CUDU[]=new Color[100];
 Color CUDD[]=new Color[100];
 Color CDUU[]=new Color[100];
 Color CDUD[]=new Color[100];
 Color CDDU[]=new Color[100];
 Color CDDD[]=new Color[100];
 Color CNUU[]=new Color[100];
 Color CNUD[]=new Color[100];
 Color CNDU[]=new Color[100];
 Color CNDD[]=new Color[100];
 Color CUUN[]=new Color[100];
 Color CUDN[]=new Color[100];
 Color CDUN[]=new Color[100];
 Color CDDN[]=new Color[100];
 Color CUNU[]=new Color[100];
 Color CUND[]=new Color[100];
 Color CDNU[]=new Color[100];
 Color CDND[]=new Color[100];


 Color w=new Color(0,128,128);
Button redButton, blueButton, greenButton, 
whiteButton, blackButton, yellowButton, windowsButton,
UUU,UUD,UDU,UDD,DUU,
DUD,DDU,DDD,NUU,NUD,NDU,NDD,UNU,UND,
DNU,DND,UUN,UDN,DUN,DDN;
 aCanvas canv=new aCanvas();


void buildConstraints(GridBagConstraints gbc, int gx,
int gy, int gw, int gh, int wx, int wy){
       gbc.gridx = gx;
       gbc.gridy = gy;
       gbc.gridwidth = gw;
       gbc.gridheight = gh;
       gbc.weightx = wx;
       gbc.weighty = wy;
}
        
            

public void init( ) {
Panel pens=new Panel(); 
Panel back=new Panel();
Panel allControls=new Panel();
Panel otherControls=new Panel(); 
GridBagLayout bag1=new GridBagLayout();  
GridBagLayout bag2=new GridBagLayout();
Font head=new Font("Arial", Font.PLAIN, 15);
Color lgray=new Color(180,180,180); //background color
GridBagConstraints constraints1=new GridBagConstraints();
constraints1.fill = GridBagConstraints.BOTH;
pens.setBackground(lgray);
canv.setBackground(Color.black);


buildConstraints(constraints1, 0,0,3,1,0,16);
Label label1 = new Label("Pen Controls",Label.CENTER);
bag1.setConstraints(label1, constraints1);
label1.setFont(head);
pens.add(label1);
buildConstraints(constraints1, 0,1,1,1,33,14);
Label label2 = new Label("H",Label.CENTER);
bag1.setConstraints(label2, constraints1);
pens.add(label2);
buildConstraints(constraints1, 1,1,1,1,34,0);
Label label3 = new Label("S", Label.CENTER);
bag1.setConstraints(label3, constraints1);
pens.add(label3);
buildConstraints(constraints1, 2,1,1,1,33,0);
Label label4 = new Label("B", Label.CENTER);
bag1.setConstraints(label4, constraints1);
pens.add(label4);
buildConstraints(constraints1, 0,2,1,1,0,14);
Button up1 = new Button("UP");
bag1.setConstraints(up1, constraints1);
pens.add(up1);
buildConstraints(constraints1, 1,2,1,1,0,0);
Button up2 = new Button("UP");
bag1.setConstraints(up2, constraints1);
pens.add(up2);
buildConstraints(constraints1, 2,2,1,1,0,0);
Button up3 = new Button("UP");
bag1.setConstraints(up3, constraints1);
pens.add(up3);
buildConstraints(constraints1, 0,3,1,1,0,14);
Button down1 = new Button("DOWN");
bag1.setConstraints(down1, constraints1);
pens.add(down1);
buildConstraints(constraints1, 1,3,1,1,0,0);
Button down2 = new Button("DOWN");
bag1.setConstraints(down2, constraints1);
pens.add(down2);
buildConstraints(constraints1, 2,3,1,1,0,0);
Button down3 = new Button("DOWN");
bag1.setConstraints(down3, constraints1);
pens.add(down3);
buildConstraints(constraints1, 0,4,1,1,0,14);
Button neut1 = new Button("N");
bag1.setConstraints(neut1, constraints1);
pens.add(neut1);
buildConstraints(constraints1, 1,4,1,1,0,0);
Button neut2 = new Button("N");
bag1.setConstraints(neut2, constraints1);
pens.add(neut2);
buildConstraints(constraints1, 2,4,1,1,0,0);
Button neut3 = new Button("N");
bag1.setConstraints(neut3, constraints1);
pens.add(neut3);
buildConstraints(constraints1, 0,5,3,1,0,14);
Label values = new Label("HSB Values",Label.CENTER);
values.setFont(head);
bag1.setConstraints(values, constraints1);
pens.add(values);
buildConstraints(constraints1, 0,6,1,1,0,14);
Button neut4 = new Button("N");
bag1.setConstraints(neut4, constraints1);
pens.add(neut4);
buildConstraints(constraints1, 1,6,1,1,0,0);
Button neut5 = new Button("N");
bag1.setConstraints(neut5, constraints1);
pens.add(neut5);
buildConstraints(constraints1, 2,6,1,1,0,0);
Button neut6 = new Button("N");
bag1.setConstraints(neut6, constraints1);
pens.add(neut6);

GridBagConstraints constraints2=new GridBagConstraints();
constraints2.fill = GridBagConstraints.BOTH;
back.setBackground(lgray);



buildConstraints(constraints2, 0,0,3,1,0,18);
Label label11 = new Label("Background Controls",Label.CENTER);
bag2.setConstraints(label11, constraints2);
label11.setFont(head);
back.add(label11);

buildConstraints(constraints2, 0,2,1,1,33,18);
Label label22 = new Label("R",Label.CENTER);
bag2.setConstraints(label22, constraints2);
back.add(label22);
buildConstraints(constraints2, 1,2,1,1,34,0);
Label label33 = new Label("G", Label.CENTER);
bag2.setConstraints(label33, constraints2);
back.add(label33);
buildConstraints(constraints2, 2,2,1,1,33,0);
Label label44 = new Label("B", Label.CENTER);
bag2.setConstraints(label44, constraints2);
back.add(label44);
buildConstraints(constraints2, 0,3,1,1,0,18);
Button up11 = new Button("UP");
bag2.setConstraints(up11, constraints2);
back.add(up11);
buildConstraints(constraints2, 1,3,1,1,0,0);
Button up22 = new Button("UP");
bag2.setConstraints(up22, constraints2);
back.add(up22);
buildConstraints(constraints2, 2,3,1,1,0,0);
Button up33 = new Button("UP");
bag2.setConstraints(up33, constraints2);
back.add(up33);
buildConstraints(constraints2, 0,4,1,1,0,18);
Button down11 = new Button("DOWN");
bag2.setConstraints(down11, constraints2);
back.add(down11);
buildConstraints(constraints2, 1,4,1,1,0,0);
Button down22 = new Button("DOWN");
bag2.setConstraints(down22, constraints2);
back.add(down22);
buildConstraints(constraints2, 2,4,1,1,0,0);
Button down33 = new Button("DOWN");
bag2.setConstraints(down33, constraints2);
back.add(down33);
buildConstraints(constraints2, 0,5,3,1,0,10);
Label values2 = new Label("RGB Values",Label.CENTER);
values2.setFont(head);
bag2.setConstraints(values2, constraints2);
back.add(values2);
buildConstraints(constraints2, 0,6,1,1,0,18);
Button neut22 = new Button("N");
bag2.setConstraints(neut22, constraints2);
back.add(neut22);
buildConstraints(constraints2, 1,6,1,1,0,0);
Button neut33 = new Button("N");
bag2.setConstraints(neut33, constraints2);
back.add(neut33);
buildConstraints(constraints2, 2,6,1,1,0,0);
Button neut44 = new Button("N");
bag2.setConstraints(neut44, constraints2);
back.add(neut44);

pens.setLayout(bag1);
back.setLayout(bag2);



GridBagLayout bag3=new GridBagLayout();
GridBagConstraints constraints3=new GridBagConstraints();
constraints3.fill = GridBagConstraints.BOTH;

buildConstraints(constraints3, 0,0,1,1,100,40);
bag3.setConstraints(back, constraints3);
allControls.add(back);
buildConstraints(constraints3, 0,1,1,1,0,60);
bag3.setConstraints(pens, constraints3);
allControls.add(pens);
allControls.setLayout(bag3);
allControls.setBackground(lgray);


otherControls.setLayout(new FlowLayout(FlowLayout.CENTER, 1,1));
otherControls.setBackground(lgray);

     redButton = new Button("Red");
     otherControls.add(redButton);
     blueButton = new Button("Blue");
     otherControls.add(blueButton);
     greenButton = new Button("Green");
     otherControls.add(greenButton);
     windowsButton = new Button("WindowsColor");
     otherControls.add(windowsButton);
     yellowButton = new Button("Yellow");
     otherControls.add(yellowButton);
     whiteButton = new Button("White");
     otherControls.add(whiteButton);
     blackButton = new Button("Black");
     otherControls.add(blackButton);


GridBagLayout bag4=new GridBagLayout();
GridBagConstraints constraints4=new GridBagConstraints();
constraints4.fill = GridBagConstraints.BOTH;

buildConstraints(constraints4, 0,0,1,1,80,10);
bag4.setConstraints(otherControls, constraints4);
add(otherControls);

buildConstraints(constraints4, 0,1,1,1,0,90);
bag4.setConstraints(canv, constraints4);
add(canv);

buildConstraints(constraints4, 1,0,1,2,20,0);
bag4.setConstraints(allControls, constraints4);
add(allControls);


setLayout(bag4);    


       float c=0;
        for (int i=0; i<CUNN.length; i++){
CUNN[i]=Color.getHSBColor(c,(float)1.0,(float)1.0);
         c+=.01;
}
        c=0;
        for (int i=0; i<CUUD.length; i++){
CUUD[i]=Color.getHSBColor(c,c,(float)1.0-c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CUDU.length; i++){
CUDU[i]=Color.getHSBColor(c,(float)1.0-c,c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CUDD.length; i++){
CUDD[i]=Color.getHSBColor(c,(float)1.0-c,(float)1.0-c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CDUU.length; i++){
CDUU[i]=Color.getHSBColor((float)1.0-c,c,c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CDUD.length; i++){
CDUD[i]=Color.getHSBColor((float)1.0-c,c,(float)1.0-c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CDDU.length; i++){
CDDU[i]=Color.getHSBColor((float)1.0-c,(float)1.0-c,c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CDDD.length; i++){
CDDD[i]=Color.getHSBColor((float)1.0-c,(float)1.0-c,(float)1.0-c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CNUU.length; i++){
CNUU[i]=Color.getHSBColor((float)1.0,c,c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CNUD.length; i++){
CNUD[i]=Color.getHSBColor((float)1.0,c,(float)1.0-c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CNDU.length; i++){
CNDU[i]=Color.getHSBColor((float)1.0,(float)1.0-c,c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CNDD.length; i++){
CNDD[i]=Color.getHSBColor((float)1.0,(float)1.0-c,(float)1.0-c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CUNU.length; i++){
CUNU[i]=Color.getHSBColor(c,(float)1.0-c,c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CUND.length; i++){
CUND[i]=Color.getHSBColor(c,(float)1.0,(float)1.0-c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CDNU.length; i++){
CDNU[i]=Color.getHSBColor((float)1.0-c,(float)1.0,c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CDND.length; i++){
CDND[i]=Color.getHSBColor((float)1.0-c,(float)1.0,(float)1.0-c);
         c+=.01;
}
        c=0;
        for (int i=0; i<CUUN.length; i++){
CUUN[i]=Color.getHSBColor(c,c,(float)1.0);
         c+=.01;
}
        c=0;
        for (int i=0; i<CUDN.length; i++){
CUDN[i]=Color.getHSBColor(c,(float)1.0-c,(float)1.0);
         c+=.01;
}
        c=0;
        for (int i=0; i<CDUN.length; i++){
CDUN[i]=Color.getHSBColor((float)1.0-c,c,(float)1.0);
         c+=.01;
}
        c=0;
        for (int i=0; i<CDDN.length; i++){
CDDN[i]=Color.getHSBColor((float)1.0-c,(float)1.0-c,(float)1.0);
         c+=.01;
}



requestFocus();
  
}

public boolean keyDown(Event evt, int key){
if (key==Event.DOWN)
     globy+=2;
     globy2=getSize().height-globy;
     globx3=globy;
     globx4=getSize().width-globx;
     globxb=globy;
     globx2b=getSize().width-globy;
     globy3b=getSize().height-globy;
     globy4b=globy;         
  
 if (key==Event.UP)
     globy-=2;
     globy2=getSize().height-globy;
     globx3=globy;
     globx4=getSize().width-globy;
     globxb=globy;
     globx2b=getSize().width-globy;
     globy3b=getSize().height-globy;
     globy4b=globy;         

 if (key==Event.LEFT)
     globx-=2;
     globx2=getSize().width-globx;
     globy3=getSize().height-globx;
     globy4=globx;
     globyb=globx;
     globy2b=getSize().height-globx;
     globx3b=globx;
     globx4b=getSize().width-globx;

 if (key==Event.RIGHT)
     globx+=2;
     globx2=getSize().width-globx;
     globy3=getSize().height-globx;
     globy4=globx;
     globyb=globx;
     globy2b=getSize().height-globx;
     globx3b=globx;
     globx4b=getSize().width-globx;

 currcolor++;
       if(currcolor>99)currcolor=0;
canv.repaint();
return true;
      
}

public boolean mouseDown(Event evt, int x, int y) {
       
           addspot(x,y);
           return true;       
}

public boolean mouseUp(Event evt, int x, int y) {
         
            addspot(x,y);
            return true;        
}

public boolean mouseDrag(Event evt, int x, int y) {
       
          addspot(x,y);
          return true;
}

void addspot(int x, int y) {
       globx=x;
       globy=y;
       globy2=getSize().height-y;
       globx2=getSize().width-x;
       globx3=globy;
       globy3=getSize().height-x;
       globx4=getSize().width-y;
       globy4=x;
       globxb=y;
       globyb=x;
       globx2b=getSize().width-y;
       globy2b=getSize().height-x;
       globx3b=x;
       globy3b=getSize().height-y;
       globx4b=getSize().width-x;
       globy4b=y;         
       currcolor++;
       if(currcolor>99)currcolor=0;
     
                 
       canv.repaint( );
}


void changeColor(Button b){
if (b==redButton)canv.setBackground(Color.red);
else if(b==blueButton)canv.setBackground(Color.blue);
else if(b==yellowButton)canv.setBackground(Color.yellow);
else if(b==windowsButton)canv.setBackground(w);
else if(b==greenButton)canv.setBackground(Color.green);
else if(b==whiteButton)canv.setBackground(Color.white);
else canv.setBackground(Color.black);
}



public boolean action(Event evt, Object arg){
     if (evt.target instanceof Button) {
        changeColor((Button)evt.target);
        return true;
        }else return false;
  }  
class aCanvas extends java.awt.Canvas{ 
	private static final long serialVersionUID = 7526472295622776147L;
public void paint (Graphics g) {
g.setColor(globColor[currcolor]);
g.fillOval(globx-3,globy-3,6,6);
g.fillOval(globx2-3, globy2-3,6,6);
g.fillOval(globx3-3, globy3-3,6,6);
g.fillOval(globx4-3, globy4-3,6,6);
g.fillOval(globxb-3,globyb-3,6,6);
g.fillOval(globx2b-3, globy2b-3,6,6);
g.fillOval(globx3b-3, globy3b-3,6,6);
g.fillOval(globx4b-3, globy4b-3,6,6);

}
}

public void update(Graphics g){paint(g);}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
}





