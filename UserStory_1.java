import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.ide.ui.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed May 14 16:36:50 CEST 2025
 */

/**
 * @author ami
 */
public class UserStory_1 extends JPanel {
    public UserStory_1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Amelie Pötscher
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        Sterne = new JComboBox<>();
        button2 = new JButton();
        label3 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        panel2 = new JPanel();
        button3 = new JButton();
        button4 = new JButton();

        //======== panel1 ========
        {
            panel1.setBackground(Color.white);
            panel1.setForeground(Color.white);
            panel1.setBorder(null);
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder
            ( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );

            //---- label1 ----
            label1.setText("Master Data Summary");
            label1.setForeground(Color.black);

            //---- label2 ----
            label2.setText("Category:");
            label2.setBackground(Color.white);
            label2.setForeground(Color.black);

            //---- Sterne ----
            Sterne.setModel(new DefaultComboBoxModel<>(new String[] {
                "\u2605",
                "\u2605\u2605",
                "\u2605\u2605\u2605",
                "\u2605\u2605\u2605\u2605",
                "\u2605\u2605\u2605\u2605\u2605"
            }));
            Sterne.setForeground(Color.black);

            //---- button2 ----
            button2.setText("Save");
            button2.setForeground(Color.white);
            button2.setBackground(new Color(0x3333ff));

            //---- label3 ----
            label3.setText("hotels per category:");

            //---- textField1 ----
            textField1.setText("85");

            //---- label4 ----
            label4.setText("\u00d8 rooms");

            //---- label5 ----
            label5.setText("\u00d8 beds:");

            //---- textField3 ----
            textField3.setText("40");

            //======== panel2 ========
            {

                //---- button3 ----
                button3.setText("Help");
                button3.setBackground(Color.lightGray);

                //---- button4 ----
                button4.setText("Log Out");
                button4.setBackground(Color.lightGray);

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(button3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                            .addComponent(button4)
                            .addGap(26, 26, 26))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label5)
                                        .addGap(42, 42, 42)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(label3)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(label4)
                                            .addGap(27, 27, 27)
                                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(427, 427, 427))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(button2)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(label2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Sterne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Sterne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(198, 198, 198)
                        .addComponent(button2)
                        .addGap(30, 30, 30))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Amelie Pötscher
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JComboBox<String> Sterne;
    private JButton button2;
    private JLabel label3;
    private JTextField textField1;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel panel2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
