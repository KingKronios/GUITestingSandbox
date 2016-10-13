
package guitestingsandbox;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener{
    
    final int LEVEL_MIN = 1;
    final int LEVEL_MAX = 18;
    final int LEVEL_DEFAULT = 1;
    
    JLabel offStatHeadLabel;
    JLabel offStat1Label;
    JLabel offStat2Label;
    JLabel offStat3Label;
    JLabel offStat4Label;
    JLabel offStat5Label;
    JLabel offStat6Label;

    JLabel abilStatHeadLabel;
    JLabel abilStat1Label;
    JLabel abilStat2Label;
    JLabel abilStat3Label;
    JLabel abilStat4Label;
    JLabel abilStat5Label;
    JLabel abilStat6Label;

    JLabel defStatHeadLabel;
    JLabel defStat1Label;
    JLabel defStat2Label;
    JLabel defStat3Label;
    JLabel defStat4Label;

    JLabel utilStatHeadLabel;
    JLabel utilStat1Label;
    JLabel utilStat2Label;

    JLabel championLabel;

    JTextField offStat1Field;
    JTextField offStat2Field;
    JTextField offStat3Field;
    JTextField offStat4Field;
    JTextField offStat5Field;
    JTextField offStat6Field;

    JTextField abilStat1Field;
    JTextField abilStat2Field;
    JTextField abilStat3Field;
    JTextField abilStat4Field;
    JTextField abilStat5Field;
    JTextField abilStat6Field;

    JTextField defStat1Field;
    JTextField defStat2Field;
    JTextField defStat3Field;
    JTextField defStat4Field;

    JTextField utilStat1Field;
    JTextField utilStat2Field;

    JComboBox championBox;
    JComboBox item1Box;
    JComboBox item2Box;
    JComboBox item3Box;
    JComboBox item4Box;
    JComboBox item5Box;
    JComboBox item6Box;

    JSlider levelSlider;

    JButton calcButton;
    
    //store name and stats in an array > store arrays in an array > for loop that takes the name from each subarray and puts it into championList
    String[] championList = {"Choose a champion", "LeBlanc"};
    String[] itemList = {"Choose an item", "Morellonomicon", "Luden's Echo"};
    
    String[] apItems = {"Morellonomicon", "Luden's Echo"};
    Double[] apValues = {80.0, 100.0};
    
    JComboBox[] itemBoxes = {item1Box, item2Box, item3Box, item4Box, item5Box, item6Box};
    
    ChampionStat leblancStat = new ChampionStat("LeBlanc", 
                                                54.88, 
                                                3.5, 
                                                0.625, 
                                                0, 
                                                0, 
                                                0, 
                                                0, 
                                                0, 
                                                0, 
                                                0, 
                                                0, 
                                                0, 

                                                0, 
                                                0, 
                                                0, 
                                                0, 
                                                334, 
                                                50, 
                                                6, 
                                                0.8, 
                                                0, 
                                                0, 
                                                0, 
                                                0, 

                                                21.88, 
                                                3.5, 
                                                30, 
                                                0, 
                                                516, 
                                                75, 
                                                7.42, 
                                                0.55, 

                                                335, 
                                                0, 
                                                525, 
                                                0);
            
    MainPanel() {
        
        //JLabel
            offStatHeadLabel = new JLabel("Offensive Stats");
            offStat1Label = new JLabel("Attack Damage");
            offStat2Label = new JLabel("Attack Speed");
            offStat3Label = new JLabel("Crit Strike Chance");
            offStat4Label = new JLabel("Crit Strike Damage");
            offStat5Label = new JLabel("Life Steal");
            offStat6Label = new JLabel("Armor Penetration");

            abilStatHeadLabel = new JLabel("Ability Stats");
            abilStat1Label = new JLabel("Ability Power");
            abilStat2Label = new JLabel("Cooldown Reduction");
            abilStat3Label = new JLabel("Mana");
            abilStat4Label = new JLabel("Mana Regen");
            abilStat5Label = new JLabel("Spell Vamp");
            abilStat6Label = new JLabel("Magic Penetration");

            defStatHeadLabel = new JLabel("Defensive Stats");
            defStat1Label = new JLabel("Armor");
            defStat2Label = new JLabel("Magic Resist");
            defStat3Label = new JLabel("Heath");
            defStat4Label = new JLabel("Health Regen");

            utilStatHeadLabel = new JLabel("Utility Stats");
            utilStat1Label = new JLabel("Move Speed");
            utilStat2Label = new JLabel("Range");

            championLabel = new JLabel("Champion");
        
        //JTextField
            offStat1Field = new JTextField(5);
            offStat2Field = new JTextField(5);
            offStat3Field = new JTextField(5);
            offStat4Field = new JTextField(5);
            offStat5Field = new JTextField(5);
            offStat6Field = new JTextField(5);

            abilStat1Field = new JTextField(5);
            abilStat2Field = new JTextField(5);
            abilStat3Field = new JTextField(5);
            abilStat4Field = new JTextField(5);
            abilStat5Field = new JTextField(5);
            abilStat6Field = new JTextField(5);

            defStat1Field = new JTextField(5);
            defStat2Field = new JTextField(5);
            defStat3Field = new JTextField(5);
            defStat4Field = new JTextField(5);

            utilStat1Field = new JTextField(5);
            utilStat2Field = new JTextField(5);

            offStat1Field.setEditable(false);
            offStat2Field.setEditable(false);
            offStat3Field.setEditable(false);
            offStat4Field.setEditable(false);
            offStat5Field.setEditable(false);
            offStat6Field.setEditable(false);

            abilStat1Field.setEditable(false);
            abilStat2Field.setEditable(false);
            abilStat3Field.setEditable(false);
            abilStat4Field.setEditable(false);
            abilStat5Field.setEditable(false);
            abilStat6Field.setEditable(false);

            defStat1Field.setEditable(false);
            defStat2Field.setEditable(false);
            defStat3Field.setEditable(false);
            defStat4Field.setEditable(false);

            utilStat1Field.setEditable(false);
            utilStat2Field.setEditable(false);
            
        //Combo Boxes
            championBox = new JComboBox(championList);
            
            item1Box = new JComboBox(itemList);
            item2Box = new JComboBox(itemList);
            item3Box = new JComboBox(itemList);
            item4Box = new JComboBox(itemList);
            item5Box = new JComboBox(itemList);
            item6Box = new JComboBox(itemList);
            
        //Sliders
            levelSlider = new JSlider(JSlider.VERTICAL, LEVEL_MIN, LEVEL_MAX, LEVEL_DEFAULT);
            levelSlider.setMajorTickSpacing(2);
            levelSlider.setMinorTickSpacing(1);
            levelSlider.setPaintTicks(true);
            levelSlider.setPaintLabels(true);
            
        //Buttons
            calcButton = new JButton("Calculate");
            calcButton.addActionListener(this);
            
        //Grid Layout
            GridBagConstraints gridC = null;
            setLayout(new GridBagLayout());
            gridC = new GridBagConstraints();
            
        //Headers
            gridC.insets = new Insets(5, 5, 5, 5);  //TOP, L/R, BOT, L/R
            gridC.gridx = 2;
            gridC.gridy = 0;
            gridC.gridwidth = 2;
            add(offStatHeadLabel, gridC);
            gridC.gridx = 4;
            gridC.gridy = 0;
            gridC.gridwidth = 2;
            add(abilStatHeadLabel, gridC);
            gridC.gridx = 6;
            gridC.gridy = 0;
            gridC.gridwidth = 2;
            add(defStatHeadLabel, gridC);
            gridC.gridx = 8;
            gridC.gridy = 0;
            gridC.gridwidth = 2;
            add(utilStatHeadLabel, gridC);
        
        //Offensive Stats
            gridC.gridwidth = 1;
            gridC.anchor = GridBagConstraints.EAST;
            gridC.gridx = 2;
            gridC.gridy = 1;
            add(offStat1Label, gridC);
            gridC.gridy++;
            add(offStat2Label, gridC);
            gridC.gridy++;
            add(offStat3Label, gridC);
            gridC.gridy++;
            add(offStat4Label, gridC);
            gridC.gridy++;
            add(offStat5Label, gridC);
            gridC.gridy++;
            add(offStat6Label, gridC);
            
            gridC.anchor = GridBagConstraints.CENTER;
            gridC.gridx++;
            gridC.gridy = 1;
            add(offStat1Field, gridC);
            gridC.gridy++;
            add(offStat2Field, gridC);
            gridC.gridy++;
            add(offStat3Field, gridC);
            gridC.gridy++;
            add(offStat4Field, gridC);
            gridC.gridy++;
            add(offStat5Field, gridC);
            gridC.gridy++;
            add(offStat6Field, gridC);
            
        //Ability Stats
            gridC.anchor = GridBagConstraints.EAST;
            gridC.gridx++;
            gridC.gridy = 1;
            add(abilStat1Label, gridC);
            gridC.gridy++;
            add(abilStat2Label, gridC);
            gridC.gridy++;
            add(abilStat3Label, gridC);
            gridC.gridy++;
            add(abilStat4Label, gridC);
            gridC.gridy++;
            add(abilStat5Label, gridC);
            gridC.gridy++;
            add(abilStat6Label, gridC);
            
            gridC.anchor = GridBagConstraints.CENTER;
            gridC.gridx++;
            gridC.gridy = 1;
            add(abilStat1Field, gridC);
            gridC.gridy++;
            add(abilStat2Field, gridC);
            gridC.gridy++;
            add(abilStat3Field, gridC);
            gridC.gridy++;
            add(abilStat4Field, gridC);
            gridC.gridy++;
            add(abilStat5Field, gridC);
            gridC.gridy++;
            add(abilStat6Field, gridC);
            
        //Defensive Stats
            gridC.anchor = GridBagConstraints.EAST;
            gridC.gridx++;
            gridC.gridy = 1;
            add(defStat1Label, gridC);
            gridC.gridy++;
            add(defStat2Label, gridC);
            gridC.gridy++;
            add(defStat3Label, gridC);
            gridC.gridy++;
            add(defStat4Label, gridC);
            
            gridC.anchor = GridBagConstraints.CENTER;
            gridC.gridx++;
            gridC.gridy = 1;
            add(defStat1Field, gridC);
            gridC.gridy++;
            add(defStat2Field, gridC);
            gridC.gridy++;
            add(defStat3Field, gridC);
            gridC.gridy++;
            add(defStat4Field, gridC);
            
        //Utility Stats
            gridC.anchor = GridBagConstraints.EAST;
            gridC.gridx++;
            gridC.gridy = 1;
            add(utilStat1Label, gridC);
            gridC.gridy++;
            add(utilStat2Label, gridC);
            
            gridC.anchor = GridBagConstraints.CENTER;
            gridC.gridx++;
            gridC.gridy = 1;
            add(utilStat1Field, gridC);
            gridC.gridy++;
            add(utilStat2Field, gridC);
            
        //Champion, Level, Calculate
            gridC.anchor = GridBagConstraints.EAST;
            gridC.gridx = 1;
            gridC.gridy = 0;
            add(championBox, gridC);
            gridC.gridy++;
            add(item1Box, gridC);
            gridC.gridy++;
            add(item2Box, gridC);
            gridC.gridy++;
            add(item3Box, gridC);
            gridC.gridy++;
            add(item4Box, gridC);
            gridC.gridy++;
            add(item5Box, gridC);
            gridC.gridy++;
            add(item6Box, gridC);
            gridC.gridy++;
            add(calcButton, gridC);
            
            gridC.gridheight = 8;
            gridC.gridx = 0;
            gridC.gridy = 0;
            add(levelSlider, gridC);
            
    }
    
    @Override
    public void actionPerformed(ActionEvent eventA) {
        
        JButton eventSource = new JButton();
        eventSource = (JButton)eventA.getSource();
        
        if(eventSource == calcButton) {
            
            double levelInput = 1;
            levelInput = levelSlider.getValue();
            double ap = 0;
            
            for(int i = 0; i < apItems.length; i++) {

                if(item1Box.getSelectedItem().equals(apItems[i])) {

                    ap += apValues[i];
                    break;

                } else {}

            }
            
            for(int i = 0; i < apItems.length; i++) {

                if(item2Box.getSelectedItem().equals(apItems[i])) {

                    ap += apValues[i];
                    break;

                } else {}

            }
            
            offStat1Field.setText(Double.toString(((levelInput - 1) * leblancStat.offStat1Growth) + leblancStat.offStat1Base + ap));

            abilStat3Field.setText(Double.toString(((levelInput - 1) * leblancStat.abilStat3Growth) + leblancStat.abilStat3Base));
            abilStat4Field.setText(Double.toString(((levelInput - 1) * leblancStat.abilStat4Growth) + leblancStat.abilStat4Base));

            defStat1Field.setText(Double.toString(((levelInput - 1) * leblancStat.defStat1Growth) + leblancStat.defStat1Base));
            defStat2Field.setText(Double.toString(((levelInput - 1) * leblancStat.defStat2Growth) + leblancStat.defStat2Base));
            defStat3Field.setText(Double.toString(((levelInput - 1) * leblancStat.defStat3Growth) + leblancStat.defStat3Base));
            defStat4Field.setText(Double.toString(((levelInput - 1) * leblancStat.defStat4Growth) + leblancStat.defStat4Base));

            utilStat1Field.setText(Double.toString(((levelInput - 1) * leblancStat.utilStat1Growth) + leblancStat.utilStat1Base));
            utilStat2Field.setText(Double.toString(((levelInput - 1) * leblancStat.utilStat2Growth) + leblancStat.utilStat2Base));
        
        } else {
        
        
            
        }
        
    }
                    
}
