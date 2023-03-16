import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Navigation extends JPanel
{

    private Color BORDER_COLOR = Color.red;
    private Font buttonFont;
    private GridBagLayout layout = new GridBagLayout();

    private GridBagConstraints gbc = new GridBagConstraints();

    private JButton b1, b2, b3, b4, b5;
    public Navigation(Dimension frameSize)
    {
        setLayout(layout);


        // size navigation to use 10% of screen height
        int width = (int) frameSize.getWidth();
        int height = (int) (frameSize.getHeight() * 0.20);
        Dimension size = new Dimension(width, height);
        setSize(size);

        buttonFont = new Font(Font.SANS_SERIF, Font.BOLD, size.height / 8);

        int borderThickness = size.height / 150;
        LineBorder lineBorder = new LineBorder(BORDER_COLOR, borderThickness);
        this.setBorder(lineBorder);

        final int top = 5, left = 5, bottom = 5, right = 5;
        gbc.insets = new Insets(top, left, bottom, right);

        b1 = new JButton("Button1");
        b1.setFont(buttonFont);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(b1, gbc);

        b2 = new JButton("Button2");
        b2.setFont(buttonFont);
        gbc.gridx +=1;
        add(b2,gbc);
        
        b3 = new JButton("Button3");
        b3.setFont(buttonFont);
        gbc.gridx +=1;
        add(b3,gbc);

        b4 = new JButton("Button3");
        b4.setFont(buttonFont);
        gbc.gridx +=1;
        add(b4,gbc);

        b5 = new JButton("Button3");
        b5.setFont(buttonFont);
        gbc.gridx +=1;
        add(b5,gbc);

    }
}
