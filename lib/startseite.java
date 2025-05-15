import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
import com.intellij.ide.ui.*;
/*
 * Created by JFormDesigner on Thu May 15 13:15:44 CEST 2025
 */



/**
 * @author ami
 */
public class startseite extends JPanel {
    public startseite() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Amelie Pötscher
        PANEL = new JTabbedPane();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel8 = new JPanel();
        button5 = new JButton();
        button6 = new JButton();
        panel2 = new JPanel();
        panel6 = new JPanel();
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
        panel7 = new JPanel();
        button3 = new JButton();
        button4 = new JButton();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
        ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
        .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
        propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
        ;} } );

        //======== PANEL ========
        {

            //======== panel1 ========
            {

                //======== scrollPane1 ========
                {

                    //---- table1 ----
                    table1.setModel(new DefaultTableModel(
                        new Object[][] {
                            {"1", "Hotel Alpha", "Wien", "10", "25"},
                            {"2", "Hotel Beta", "Graz", "20", "35"},
                            {"3", "Hotel Gamma", "Linz", "30", "45"},
                            {"4", "Hotel Delta", "Salzburg", "40", "55"},
                            {"5", "Hotel Epsilon", "Innsbruck", "50", "65"},
                        },
                        new String[] {
                            "ID", "name", "adresse", "rooms", "beds"
                        }
                    ) {
                        boolean[] columnEditable = new boolean[] {
                            false, true, true, true, true
                        };
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = table1.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                    }
                    scrollPane1.setViewportView(table1);
                }

                //======== panel8 ========
                {
                    panel8.setBackground(new Color(0x3333ff));

                    //---- button5 ----
                    button5.setText("Help");
                    button5.setBackground(Color.lightGray);

                    //---- button6 ----
                    button6.setText("Log Out");
                    button6.setBackground(Color.lightGray);

                    GroupLayout panel8Layout = new GroupLayout(panel8);
                    panel8.setLayout(panel8Layout);
                    panel8Layout.setHorizontalGroup(
                        panel8Layout.createParallelGroup()
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel8Layout.createParallelGroup()
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button6))
                                .addContainerGap(15, Short.MAX_VALUE))
                    );
                    panel8Layout.setVerticalGroup(
                        panel8Layout.createParallelGroup()
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(button5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                                .addComponent(button6)
                                .addGap(23, 23, 23))
                    );
                }

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap())
                );
            }
            PANEL.addTab("Hotels", panel1);

            //======== panel2 ========
            {

                //======== panel6 ========
                {
                    panel6.setBackground(Color.white);
                    panel6.setForeground(Color.white);
                    panel6.setBorder(null);

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

                    //======== panel7 ========
                    {
                        panel7.setBackground(new Color(0x3333ff));

                        //---- button3 ----
                        button3.setText("Help");
                        button3.setBackground(Color.lightGray);

                        //---- button4 ----
                        button4.setText("Log Out");
                        button4.setBackground(Color.lightGray);

                        GroupLayout panel7Layout = new GroupLayout(panel7);
                        panel7.setLayout(panel7Layout);
                        panel7Layout.setHorizontalGroup(
                            panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel7Layout.createParallelGroup()
                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button4))
                                    .addContainerGap(17, Short.MAX_VALUE))
                        );
                        panel7Layout.setVerticalGroup(
                            panel7Layout.createParallelGroup()
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(button3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                                    .addComponent(button4)
                                    .addGap(17, 17, 17))
                        );
                    }

                    GroupLayout panel6Layout = new GroupLayout(panel6);
                    panel6.setLayout(panel6Layout);
                    panel6Layout.setHorizontalGroup(
                        panel6Layout.createParallelGroup()
                            .addGroup(panel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel6Layout.createParallelGroup()
                                    .addGroup(panel6Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(panel6Layout.createParallelGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel6Layout.createSequentialGroup()
                                                .addGroup(panel6Layout.createParallelGroup()
                                                    .addComponent(label4)
                                                    .addComponent(label5))
                                                .addGap(113, 113, 113)
                                                .addGroup(panel6Layout.createParallelGroup()
                                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(panel6Layout.createSequentialGroup()
                                                .addComponent(label3)
                                                .addGap(18, 18, 18)
                                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(217, Short.MAX_VALUE))
                                    .addGroup(panel6Layout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(button2)
                                            .addGroup(panel6Layout.createSequentialGroup()
                                                .addComponent(label2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Sterne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                    );
                    panel6Layout.setVerticalGroup(
                        panel6Layout.createParallelGroup()
                            .addGroup(panel6Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Sterne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(123, 123, 123)
                                .addComponent(button2)
                                .addGap(33, 33, 33))
                            .addGroup(panel6Layout.createSequentialGroup()
                                .addComponent(panel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                    );
                }

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 599, Short.MAX_VALUE)
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel6, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 306, Short.MAX_VALUE)
                );
            }
            PANEL.addTab("Hotels Summary", panel2);

            //======== panel3 ========
            {

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 599, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGap(0, 306, Short.MAX_VALUE)
                );
            }
            PANEL.addTab("Occupancy", panel3);

            //======== panel4 ========
            {

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 599, Short.MAX_VALUE)
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 306, Short.MAX_VALUE)
                );
            }
            PANEL.addTab("Occupncy Summary ", panel4);

            //======== panel5 ========
            {

                GroupLayout panel5Layout = new GroupLayout(panel5);
                panel5.setLayout(panel5Layout);
                panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                        .addGap(0, 599, Short.MAX_VALUE)
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addGap(0, 306, Short.MAX_VALUE)
                );
            }
            PANEL.addTab("Combined View", panel5);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PANEL, GroupLayout.PREFERRED_SIZE, 599, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PANEL, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Amelie Pötscher
    private JTabbedPane PANEL;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel8;
    private JButton button5;
    private JButton button6;
    private JPanel panel2;
    private JPanel panel6;
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
    private JPanel panel7;
    private JButton button3;
    private JButton button4;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
