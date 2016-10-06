
package guitestingsandbox;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
    
    final int LEVEL_MIN = 1;
    final int LEVEL_MAX = 18;
    final int LEVEL_DEFAULT = 1;
    
    String[] championList = {"Choose a champion", 
                             "Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Ashe", "Aurelion Sol", "Azir", 
                             "Bard", "Blitzcrank", "Brand", "Braum", 
                             "Caitlyn", "Cassiopeia", "Cho'Gath", "Corki", 
                             "Darius", "Diana", "Dr. Mundo", "Draven", 
                             "Ekko", "Elise", "Evelynn", "Ezreal", 
                             "Fiddlesticks", "Fiora", "Fizz", 
                             "Galio", "Gangplank", "Garen", "Gnar", "Gragas", "Graves", 
                             "Hecarim", "Heimerdinger", 
                             "Illaoi", "Irelia", 
                             "Janna", "Jarvan IV", "Jax", "Jayce", "Jhin", "Jinx", 
                             "Kalista", "Karma", "Karthus", "Kassadin", "Katarina", "Kayle", "Kennen", "Kha'Zix", "Kindred", "Kled", "Kog'Maw", 
                             "LeBlanc", "Lee Sin", "Leona", "Lissandra", "Lucian", "Lulu", "Lux", 
                             "Malphite", "Malzahar", "Maokai", "Master Yi", "Miss Fortune", "Mordekaiser", "Morgana", 
                             "Nami", "Nasus", "Nautilus", "Nidalee", "Nocturne", "Nunu", 
                             "Olaf", "Orianna", 
                             "Pantheon", "Poppy", 
                             "Quinn", 
                             "Rammus", "Rek'Sai", "Renekton", "Rengar", "Riven", "Rumble", "Ryze", 
                             "Sejuani", "Shaco", "Shen", "Shyvanna", "Singed"};
    String[] itemList = {"Choose an item", "Item 2", "Item 3"};
    
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

        JButton xB = new JButton("x");
        JLabel xL = new JLabel("x");
        JTextField xTF = new JTextField(5);
        xTF.setEditable(false);
        
        //JLabel
            JLabel offStatHeadLabel = new JLabel("Offensive Stats");
            JLabel offStat1Label = new JLabel("Attack Damage");
            JLabel offStat2Label = new JLabel("Attack Speed");
            JLabel offStat3Label = new JLabel("Crit Strike Chance");
            JLabel offStat4Label = new JLabel("Crit Strike Damage");
            JLabel offStat5Label = new JLabel("Life Steal");
            JLabel offStat6Label = new JLabel("Armor Penetration");

            JLabel abilStatHeadLabel = new JLabel("Ability Stats");
            JLabel abilStat1Label = new JLabel("Ability Power");
            JLabel abilStat2Label = new JLabel("Cooldown Reduction");
            JLabel abilStat3Label = new JLabel("Mana");
            JLabel abilStat4Label = new JLabel("Mana Regen");
            JLabel abilStat5Label = new JLabel("Spell Vamp");
            JLabel abilStat6Label = new JLabel("Magic Penetration");

            JLabel defStatHeadLabel = new JLabel("Defensive Stats");
            JLabel defStat1Label = new JLabel("Armor");
            JLabel defStat2Label = new JLabel("Magic Resist");
            JLabel defStat3Label = new JLabel("Heath");
            JLabel defStat4Label = new JLabel("Health Regen");

            JLabel utilStatHeadLabel = new JLabel("Utility Stats");
            JLabel utilStat1Label = new JLabel("Move Speed");
            JLabel utilStat2Label = new JLabel("Range");

            JLabel championLabel = new JLabel("Champion");
        
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
            
        //Combo Boxes
            JComboBox championComboBox = new JComboBox(championList);
            
            JComboBox item1ComboBox = new JComboBox(itemList);
            JComboBox item2ComboBox = new JComboBox(itemList);
            JComboBox item3ComboBox = new JComboBox(itemList);
            JComboBox item4ComboBox = new JComboBox(itemList);
            JComboBox item5ComboBox = new JComboBox(itemList);
            JComboBox item6ComboBox = new JComboBox(itemList);
            
        //Sliders
            JSlider levelSlider = new JSlider(LEVEL_MIN, LEVEL_MAX, LEVEL_DEFAULT);
            levelSlider.setMajorTickSpacing(17);
            levelSlider.setMinorTickSpacing(1);
            levelSlider.setPaintTicks(true);
            levelSlider.setPaintLabels(true);
            
        //Buttons
            JButton calcButton = new JButton("Calculate");
            calcButton.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent event) {
                       double userLevelInput = 1;
                       double level = 1;
                       userLevelInput = levelSlider.getValue();
                       level = userLevelInput;
                       
                       offStat1TextField.setText(Double.toString(((level - 1) * leblancStat.offStat1Growth) + leblancStat.offStat1Base));
                       
                       abilStat3TextField.setText(Double.toString(((level - 1) * leblancStat.abilStat3Growth) + leblancStat.abilStat3Base));
                       abilStat4TextField.setText(Double.toString(((level - 1) * leblancStat.abilStat4Growth) + leblancStat.abilStat4Base));
                       
                       defStat1TextField.setText(Double.toString(((level - 1) * leblancStat.defStat1Growth) + leblancStat.defStat1Base));
                       defStat2TextField.setText(Double.toString(((level - 1) * leblancStat.defStat2Growth) + leblancStat.defStat2Base));
                       defStat3TextField.setText(Double.toString(((level - 1) * leblancStat.defStat3Growth) + leblancStat.defStat3Base));
                       defStat4TextField.setText(Double.toString(((level - 1) * leblancStat.defStat4Growth) + leblancStat.defStat4Base));
                       
                       utilStat1TextField.setText(Double.toString(((level - 1) * leblancStat.utilStat1Growth) + leblancStat.utilStat1Base));
                       utilStat2TextField.setText(Double.toString(((level - 1) * leblancStat.utilStat2Growth) + leblancStat.utilStat2Base));
                       
                    }
            });
            
        //Grid Layout
            GridBagConstraints layoutConst = null;
            setLayout(new GridBagLayout());
        
        //Headers
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 0;
            layoutConst.gridwidth = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStatHeadLabel, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 0;
            layoutConst.gridwidth = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStatHeadLabel, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 0;
            layoutConst.gridwidth = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStatHeadLabel, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 7;
            layoutConst.gridy = 0;
            layoutConst.gridwidth = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStatHeadLabel, layoutConst);
        
        //Offensive Stats
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat1Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat1TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat2Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat2TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat3Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat3TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat4Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat4TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat5Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat5TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 1;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat6Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 2;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(offStat6TextField, layoutConst);
            
        //Ability Stats
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat1Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat1TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat2Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat2TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat3Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat3TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat4Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat4TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat5Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat5TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 3;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat6Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 4;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(abilStat6TextField, layoutConst);
            
        //Defensive Stats
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat1Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 6;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat1TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat2Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 6;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat2TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat3Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 6;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat3TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 5;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat4Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 6;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(defStat4TextField, layoutConst);
            
        //Utility Stats
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 7;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStat1Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 8;
            layoutConst.gridy = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStat1TextField, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 7;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStat2Label, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 8;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(utilStat2TextField, layoutConst);
            
        //Champion, Level, Calculate
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 0;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(championComboBox, layoutConst);
            
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 1;
            layoutConst.gridwidth = 1;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(levelSlider, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(item1ComboBox, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 3;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(item2ComboBox, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 4;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(item3ComboBox, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 5;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(item4ComboBox, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 6;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(item5ComboBox, layoutConst);
            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 7;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(item6ComboBox, layoutConst);

            layoutConst = new GridBagConstraints();
            layoutConst.gridx = 0;
            layoutConst.gridy = 8;
            layoutConst.gridheight = 2;
            layoutConst.insets = new Insets(10, 10, 10, 10);
            add(calcButton, layoutConst);
            
    }
}
