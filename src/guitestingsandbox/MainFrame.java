
package guitestingsandbox;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
    
    MainFrame() {
        
        super("Stat Calculator");
        MainPanel mPanel = new MainPanel();
        getContentPane().add(mPanel);
        setSize(1000, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
