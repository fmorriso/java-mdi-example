import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar
{
    public MenuBar(Dimension frameSize)
    {
        // use frame size passed into us to figure out how big we need to be
        //TODO: *** CODE NEEDED HERE ***

        JMenu file = new JMenu("File");
        add(file);
    }
}
