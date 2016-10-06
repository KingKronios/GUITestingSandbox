
package guitestingsandbox;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
    MainPanel() {
        JButton xB = new JButton("x");
        JLabel xL = new JLabel("x");
        JTextField xTF = new JTextField(5);
        xTF.setEditable(false);
        
        //JLabel
            JLabel offStatHeadLabel = new JLabel("Offensive Stats");
            JLabel offStat1Label = new JLabel("offStat1");
            JLabel offStat2Label = new JLabel("offStat2");
            JLabel offStat3Label = new JLabel("offStat3");
            JLabel offStat4Label = new JLabel("offStat4");
            JLabel offStat5Label = new JLabel("offStat5");
            JLabel offStat6Label = new JLabel("offStat6");

            JLabel abilStatHeadLabel = new JLabel("Ability Stats");
            JLabel abilStat1Label = new JLabel("abilStat1");
            JLabel abilStat2Label = new JLabel("abilStat2");
            JLabel abilStat3Label = new JLabel("abilStat3");
            JLabel abilStat4Label = new JLabel("abilStat4");
            JLabel abilStat5Label = new JLabel("abilStat5");
            JLabel abilStat6Label = new JLabel("abilStat6");

            JLabel defStatHeadLabel = new JLabel("Defensive Stats");
            JLabel defStat1Label = new JLabel("defStat1");
            JLabel defStat2Label = new JLabel("defStat2");
            JLabel defStat3Label = new JLabel("defStat3");
            JLabel defStat4Label = new JLabel("defStat4");

            JLabel utilStatHeadLabel = new JLabel("Utility Stats");
            JLabel utilStat1Label = new JLabel("utilStat1");
            JLabel utilStat2Label = new JLabel("utilStat2");
        
        //JTextField
            JTextField offStat1TextField = new JTextField(5);
            offStat1TextField.setEditable(false);
            JTextField offStat2TextField = new JTextField(5);
            offStat2TextField.setEditable(false);
            JTextField offStat3TextField = new JTextField(5);
            offStat3TextField.setEditable(false);
            JTextField offStat4TextField = new JTextField(5);
            offStat4TextField.setEditable(false);
            JTextField offStat5TextField = new JTextField(5);
            offStat5TextField.setEditable(false);
            JTextField offStat6TextField = new JTextField(5);
            offStat6TextField.setEditable(false);

            JTextField abilStat1TextField = new JTextField(5);
            abilStat1TextField.setEditable(false);
            JTextField abilStat2TextField = new JTextField(5);
            abilStat2TextField.setEditable(false);
            JTextField abilStat3TextField = new JTextField(5);
            abilStat3TextField.setEditable(false);
            JTextField abilStat4TextField = new JTextField(5);
            abilStat4TextField.setEditable(false);
            JTextField abilStat5TextField = new JTextField(5);
            abilStat5TextField.setEditable(false);
            JTextField abilStat6TextField = new JTextField(5);
            abilStat6TextField.setEditable(false);

            JTextField defStat1TextField = new JTextField(5);
            defStat1TextField.setEditable(false);
            JTextField defStat2TextField = new JTextField(5);
            defStat2TextField.setEditable(false);
            JTextField defStat3TextField = new JTextField(5);
            defStat3TextField.setEditable(false);
            JTextField defStat4TextField = new JTextField(5);
            defStat4TextField.setEditable(false);

            JTextField utilStat1TextField = new JTextField(5);
            utilStat1TextField.setEditable(false);
            JTextField utilStat2TextField = new JTextField(5);
            utilStat2TextField.setEditable(false);
        
        GridBagConstraints layoutConst = null;

        setLayout(new GridBagLayout());
        
        //Headers
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 0;
            layoutConst.gridwidth = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStatHeadLabel, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 0;
            layoutConst.gridwidth = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStatHeadLabel, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 0;
            layoutConst.gridwidth = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStatHeadLabel, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 6;
            layoutConst.gridy = 0;
            layoutConst.gridwidth = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStatHeadLabel, layoutConst);
        
        //Offensive Stats
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat1Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat1TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat2Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat2TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat3Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat3TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat4Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat4TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat5Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat5TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat6Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat6TextField, layoutConst);
            
        //Ability Stats
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat1Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat1TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat2Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat2TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat3Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat3TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat4Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat4TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat5Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat5TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat6Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat6TextField, layoutConst);
            
        //Defensive Stats
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat1Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat1TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat2Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat2TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat3Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat3TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat4Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat4TextField, layoutConst);
            
        //Utility Stats
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 6;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStat1Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 7;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStat1TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 6;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStat2Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 7;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStat2TextField, layoutConst);
    }
}
