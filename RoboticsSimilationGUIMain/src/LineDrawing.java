import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public class LineDrawing extends JPanel {
	Point a , b;
	ArrayList<Point> c = new ArrayList<Point>();
	public void paint(Graphics g){
		super.paint(g);
		//SET FONT OF PATH
		for(int i=0; i<c.size(); i= i+2){
			if(!c.isEmpty()){
			Graphics2D g2 = (Graphics2D)g;
			g2.setStroke(new BasicStroke(5));
			//USE POINT TO DRAW PATH
			g.setColor(Color.RED);
			g.drawLine(c.get(i).x, c.get(i).y, c.get(i+1).x, c.get(i+1).y);
		}
//			if (a != null && b != null){
//				g.setColor(Color.RED);
//				g.drawLine(a.x, a.y, b.x, b.y);
//
//				//g.drawLine(x1, y1, x2, y2);
//			}
		}
	}


	
	//SET POINTS FROM THE MOUSELISTENER TO THE POINTS INSERTED IN THE ABOVE PAINT METHOD
	public void setPoint(Point pointA){
		a = pointA;
		
	}
	
	public void setPoint2(Point pointB){
		b = pointB;
	}
	
	public void setList(ArrayList <Point> coordinateList){
		c = coordinateList;
		
	}
	
}







