
package guitestingsandbox;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
    
    MainFrame() {
        
        super("Program");
        MainPanel mPanel = new MainPanel();
        getContentPane().add(mPanel);
        setSize(750, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
