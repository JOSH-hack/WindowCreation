
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josh
 */
public class MaFenetre extends JFrame {
    
    public MaFenetre() {
        
        setTitle("Ma fenetre");
        setSize(850,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        //HEADER
        JPanel header = new JPanel (new FlowLayout(FlowLayout.RIGHT));
        
        header.setBackground(new Color(30, 40, 120));
        header.add(new JLabel("Connecté : username") {
            {
                setForeground(Color.WHITE);
            }
        });
        add(header, BorderLayout.NORTH);
        
        //NavBar Latérale
        JPanel menu = new JPanel();
        
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));
        menu.setBackground(Color.LIGHT_GRAY);
        menu.setPreferredSize(new Dimension(170, 0));
        menu.add(new JLabel("Menu") {
            {
                setFont(getFont().deriveFont(Font.BOLD, 17));
                setBorder(BorderFactory.createEmptyBorder(6, 6, 5, 0));
            }
        });
        menu.add(new JLabel("Page 1"){{ setBorder(BorderFactory.createEmptyBorder(3, 6, 1, 0));}});
        menu.add(new JLabel("Page 2"){{ setBorder(BorderFactory.createEmptyBorder(0, 6, 1, 0));}});
        menu.add(new JLabel("Page 3"){{ setBorder(BorderFactory.createEmptyBorder(0, 6, 1, 0));}});
        menu.add(new JLabel("Page 4"){{ setBorder(BorderFactory.createEmptyBorder(0, 6, 1, 0));}});
        menu.add(new JLabel("Page 5"){{ setBorder(BorderFactory.createEmptyBorder(0, 6, 1, 0));}});
        menu.add(Box.createVerticalGlue());
        add(menu, BorderLayout.WEST);
        
        //BODY
        JPanel body = new JPanel( new FlowLayout(FlowLayout.LEFT));
        
        body.setBackground(Color.WHITE);
        body.add(new JLabel("Titre de page 1"){{ setBorder(BorderFactory.createEmptyBorder(6, 6, 1, 0));}});
        add(body, BorderLayout.CENTER);
        
        //FOOTER
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        footer.setBackground(new Color(150, 170, 220));;
        footer.setPreferredSize(new Dimension(0, 35));
        footer.add (new JLabel(" © copyright ...") {
            {
                setForeground(Color.DARK_GRAY);
            }
        });
        add(footer, BorderLayout.SOUTH);
        
    }
}
