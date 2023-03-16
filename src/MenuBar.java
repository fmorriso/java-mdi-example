import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar
{
    public MenuBar(Dimension frameSize)
    {
        // use frame size passed into us to figure out how big we need to be
        //TODO: *** CODE NEEDED HERE ***

        JMenu file = createFileMenu();
        add(file);
        
        JMenu edit = createEditMenu();
        add(edit);
    }

    private JMenu createEditMenu()
    {
        JMenu menu = new JMenu("Edit");

        //TODO: *** CODE NEEDED HERE ***

        return menu;
    }

    private JMenu createFileMenu()
    {
        JMenu menu = new JMenu("File");
        // create sub-menu items:
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(evt -> System.exit(0));
        menu.add(exit);

        return menu;
    }


}
