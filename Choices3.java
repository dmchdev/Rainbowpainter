package rainbowpainter;
import java.awt.*;

public class Choices3 extends Choice {
	private static final long serialVersionUID = 7526472295622776141L;
    
    PencilCanvas3 canvas;
    PencilFrame3 main;

    Choices3(PencilCanvas3 par, PencilFrame3 p) {
        canvas=par;
        main=p;
        addItem("Black");
        addItem("White");
        addItem("Yellow");
        addItem("Blue");
        addItem("Green");
        addItem("Red");
        addItem("Windows Color");
        }

public boolean handleEvent(Event evt){
main.changeColor(this);
return true;
}
}

