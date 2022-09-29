import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import java.awt.Color;
import java.awt.Graphics;

public class Canvas extends JPanel{
    public Canvas(){
        setPreferredSize(new DimensionUIResource(400,300));
        setBackground(Color.GRAY);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintBrush = new Paintbrush(g);
        paintBrush.drawSky();
        paintBrush.drawMountains();
        paintBrush.drawTree();
    }
}