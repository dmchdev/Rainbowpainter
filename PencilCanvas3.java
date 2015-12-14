package rainbowpainter;
import java.awt.*;


public class PencilCanvas3 extends java.awt.Canvas {
	private static final long serialVersionUID = 7526472295622776142L;
	
        PencilFrame3 applet;
        Choices3 controller;
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
        int oval=6;
 Color colors[]=new Color[100];

PencilCanvas3(PencilFrame3 paren, Choices3 cch) {
        applet=paren;
        controller=cch;
        setBackground(Color.black);
         
        float c=0;
        for (int i=0; i<colors.length; i++){
colors[i]=Color.getHSBColor(c, (float)1.0,(float)1.0);
         c+=.01;
}
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
repaint();
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
       repaint();
}
  

public void paint (Graphics gm) {
gm.setColor(colors[currcolor]);
gm.fillOval(globx-oval/2,globy-oval/2,oval,oval);
gm.fillOval(globx2-oval/2, globy2-oval/2,oval,oval);
gm.fillOval(globx3-oval/2, globy3-oval/2,oval,oval);
gm.fillOval(globx4-oval/2, globy4-oval/2,oval,oval);
gm.fillOval(globxb-oval/2,globyb-oval/2,oval,oval);
gm.fillOval(globx2b-oval/2, globy2b-oval/2,oval,oval);
gm.fillOval(globx3b-oval/2, globy3b-oval/2,oval,oval);
gm.fillOval(globx4b-oval/2, globy4b-oval/2,oval,oval);

}
public void update(Graphics gm){paint(gm);}
}





