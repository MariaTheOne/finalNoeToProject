import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.*;
import com.intellij.ide.ui.*;
import com.intellij.uiDesigner.core.*;
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
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button5 = new JButton();
        comboBox1 = new JComboBox<>();
        label1 = new JLabel();
        button6 = new JButton();
        panel3 = new JPanel();
        panel17 = new JPanel();
        panel18 = new JPanel();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        comboBox2 = new JComboBox<>();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        panel4 = new JPanel();
        panel19 = new JPanel();
        panel20 = new JPanel();
        button16 = new JButton();
        button17 = new JButton();
        button18 = new JButton();
        comboBox3 = new JComboBox<>();
        label6 = new JLabel();
        comboBox4 = new JComboBox<>();
        label10 = new JLabel();
        label11 = new JLabel();
        comboBox5 = new JComboBox<>();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        panel5 = new JPanel();
        panel21 = new JPanel();
        panel22 = new JPanel();
        button19 = new JButton();
        button20 = new JButton();
        button21 = new JButton();
        comboBox7 = new JComboBox<>();
        label12 = new JLabel();
        label13 = new JLabel();
        comboBox8 = new JComboBox<>();
        scrollPane3 = new JScrollPane();
        table3 = new JTable();
        label14 = new JLabel();
        comboBox9 = new JComboBox<>();
        label15 = new JLabel();
        comboBox10 = new JComboBox<>();
        comboBox11 = new JComboBox<>();
        panel6 = new JPanel();
        panel23 = new JPanel();
        panel24 = new JPanel();
        button22 = new JButton();
        button23 = new JButton();
        button24 = new JButton();
        comboBox12 = new JComboBox<>();
        label16 = new JLabel();
        label17 = new JLabel();
        comboBox13 = new JComboBox<>();
        comboBox16 = new JComboBox<>();
        comboBox6 = new JComboBox<>();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        scrollPane4 = new JScrollPane();
        table4 = new JTable();
        label20 = new JLabel();
        comboBox14 = new JComboBox<>();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {
                panel1.setBackground(Color.white);

                //======== panel7 ========
                {

                    //======== panel8 ========
                    {
                        panel8.setBackground(new Color(0x3366ff));

                        //---- button1 ----
                        button1.setText("Log Out");
                        button1.setBackground(Color.lightGray);

                        //---- button2 ----
                        button2.setText("Help");
                        button2.setBackground(Color.lightGray);

                        GroupLayout panel8Layout = new GroupLayout(panel8);
                        panel8.setLayout(panel8Layout);
                        panel8Layout.setHorizontalGroup(
                            panel8Layout.createParallelGroup()
                                .addGroup(panel8Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel8Layout.createParallelGroup()
                                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel8Layout.createSequentialGroup()
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                        );
                        panel8Layout.setVerticalGroup(
                            panel8Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(button2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                                    .addComponent(button1)
                                    .addGap(23, 23, 23))
                        );
                    }

                    //======== scrollPane1 ========
                    {

                        //---- table1 ----
                        table1.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"1", null, null, null, null},
                                {"2", null, null, null, null},
                                {"3", null, null, null, null},
                                {"4", null, null, null, null},
                                {"5", null, null, null, null},
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
                            cm.getColumn(0).setPreferredWidth(5);
                        }
                        scrollPane1.setViewportView(table1);
                    }

                    //---- button5 ----
                    button5.setText("save");
                    button5.addActionListener(e -> button5(e));

                    //---- comboBox1 ----
                    comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                        "\u2605",
                        "\u2605\u2605",
                        "\u2605\u2605\u2605",
                        "\u2605\u2605\u2605\u2605",
                        "\u2605\u2605\u2605\u2605\u2605"
                    }));

                    //---- label1 ----
                    label1.setText("category:");

                    //---- button6 ----
                    button6.setText("+");

                    GroupLayout panel7Layout = new GroupLayout(panel7);
                    panel7.setLayout(panel7Layout);
                    panel7Layout.setHorizontalGroup(
                        panel7Layout.createParallelGroup()
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel7Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                                        .addComponent(button5)
                                        .addContainerGap())
                                    .addGroup(panel7Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel7Layout.createParallelGroup()
                                            .addComponent(button6)
                                            .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(panel7Layout.createSequentialGroup()
                                                    .addComponent(label1)
                                                    .addGap(16, 16, 16)
                                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 46, Short.MAX_VALUE))))
                    );
                    panel7Layout.setVerticalGroup(
                        panel7Layout.createParallelGroup()
                            .addComponent(panel8, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(panel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button6)
                                .addGap(2, 2, 2)
                                .addComponent(button5)
                                .addGap(20, 20, 20))
                    );
                }

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addComponent(panel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }
            tabbedPane1.addTab("Hotels", panel1);

            //======== panel3 ========
            {
                panel3.setBackground(Color.white);

                //======== panel17 ========
                {

                    //======== panel18 ========
                    {
                        panel18.setBackground(new Color(0x3366ff));

                        //---- button13 ----
                        button13.setText("Log Out");
                        button13.setBackground(Color.lightGray);

                        //---- button14 ----
                        button14.setText("Help");
                        button14.setBackground(Color.lightGray);

                        GroupLayout panel18Layout = new GroupLayout(panel18);
                        panel18.setLayout(panel18Layout);
                        panel18Layout.setHorizontalGroup(
                            panel18Layout.createParallelGroup()
                                .addGroup(panel18Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel18Layout.createParallelGroup()
                                        .addComponent(button13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel18Layout.createSequentialGroup()
                                            .addComponent(button14, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                        );
                        panel18Layout.setVerticalGroup(
                            panel18Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel18Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(button14)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                                    .addComponent(button13)
                                    .addGap(23, 23, 23))
                        );
                    }

                    //---- button15 ----
                    button15.setText("save");

                    //---- comboBox2 ----
                    comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                        "\u2605",
                        "\u2605\u2605",
                        "\u2605\u2605\u2605",
                        "\u2605\u2605\u2605\u2605",
                        "\u2605\u2605\u2605\u2605\u2605"
                    }));

                    //---- label2 ----
                    label2.setText("category:");

                    //---- label3 ----
                    label3.setText("hotels per category:");

                    //---- label4 ----
                    label4.setText("\u00d8 rooms:");

                    //---- label5 ----
                    label5.setText("\u00d8 beds:");

                    //---- textField1 ----
                    textField1.setText("60");

                    //---- textField2 ----
                    textField2.setText("45");

                    //---- textField3 ----
                    textField3.setText("20");

                    GroupLayout panel17Layout = new GroupLayout(panel17);
                    panel17.setLayout(panel17Layout);
                    panel17Layout.setHorizontalGroup(
                        panel17Layout.createParallelGroup()
                            .addGroup(panel17Layout.createSequentialGroup()
                                .addComponent(panel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel17Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel17Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                                        .addComponent(button15)
                                        .addContainerGap())
                                    .addGroup(panel17Layout.createSequentialGroup()
                                        .addGap(285, 285, 285)
                                        .addComponent(label2)
                                        .addGap(16, 16, 16)
                                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 46, Short.MAX_VALUE))
                                    .addGroup(panel17Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(panel17Layout.createParallelGroup()
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addComponent(label3)
                                                .addGap(18, 18, 18)
                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addGroup(panel17Layout.createParallelGroup()
                                                    .addComponent(label4)
                                                    .addComponent(label5))
                                                .addGap(18, 18, 18)
                                                .addGroup(panel17Layout.createParallelGroup()
                                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                        .addContainerGap(257, Short.MAX_VALUE))))
                    );
                    panel17Layout.setVerticalGroup(
                        panel17Layout.createParallelGroup()
                            .addComponent(panel18, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panel17Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2))
                                .addGap(30, 30, 30)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(panel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(button15)
                                .addGap(20, 20, 20))
                    );
                }

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addComponent(panel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addComponent(panel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }
            tabbedPane1.addTab("Hotels Summary", panel3);

            //======== panel4 ========
            {
                panel4.setBackground(Color.white);

                //======== panel19 ========
                {

                    //======== panel20 ========
                    {
                        panel20.setBackground(new Color(0x3366ff));

                        //---- button16 ----
                        button16.setText("Log Out");
                        button16.setBackground(Color.lightGray);

                        //---- button17 ----
                        button17.setText("Help");
                        button17.setBackground(Color.lightGray);

                        GroupLayout panel20Layout = new GroupLayout(panel20);
                        panel20.setLayout(panel20Layout);
                        panel20Layout.setHorizontalGroup(
                            panel20Layout.createParallelGroup()
                                .addGroup(panel20Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel20Layout.createParallelGroup()
                                        .addComponent(button16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel20Layout.createSequentialGroup()
                                            .addComponent(button17, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                        );
                        panel20Layout.setVerticalGroup(
                            panel20Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel20Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(button17)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button16)
                                    .addGap(23, 23, 23))
                        );
                    }

                    //---- button18 ----
                    button18.setText("save");

                    //---- comboBox3 ----
                    comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                        "\u2605",
                        "\u2605\u2605",
                        "\u2605\u2605\u2605",
                        "\u2605\u2605\u2605\u2605",
                        "\u2605\u2605\u2605\u2605\u2605"
                    }));

                    //---- label6 ----
                    label6.setText("category:");

                    //---- comboBox4 ----
                    comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                        "2025",
                        "2024",
                        "2023",
                        "2022",
                        "2021",
                        "2020",
                        "2019",
                        "2018",
                        "2017",
                        "2016",
                        "2015",
                        "2014",
                        "2013",
                        "2012",
                        "2011",
                        "2010",
                        "2009",
                        "2008",
                        "2007",
                        "2006",
                        "2005",
                        "2004",
                        "2003",
                        "2002",
                        "2001",
                        "2000",
                        "1999",
                        "1998",
                        "1997",
                        "1996",
                        "1995",
                        "1994",
                        "1993",
                        "1992",
                        "1991",
                        "1990",
                        "1989",
                        "1988",
                        "1987",
                        "1986",
                        "1985",
                        "1984",
                        "1983",
                        "1982",
                        "1981",
                        "1980",
                        "1979",
                        "1978",
                        "1977",
                        "1976",
                        "1975",
                        "1974",
                        "1973",
                        "1972",
                        "1971",
                        "1970",
                        "1969",
                        "1968",
                        "1967",
                        "1966",
                        "1965",
                        "1964",
                        "1963",
                        "1962",
                        "1961",
                        "1960",
                        "1959",
                        "1958",
                        "1957",
                        "1956",
                        "1955",
                        "1954",
                        "1953",
                        "1952",
                        "1951",
                        "1950",
                        "1949",
                        "1948",
                        "1947",
                        "1946",
                        "1945",
                        "1944",
                        "1943",
                        "1942",
                        "1941",
                        "1940",
                        "1939",
                        "1938",
                        "1937",
                        "1936",
                        "1935",
                        "1934",
                        "1933",
                        "1932",
                        "1931",
                        "1930",
                        "1929",
                        "1928",
                        "1927",
                        "1926",
                        "1925",
                        "1924",
                        "1923",
                        "1922",
                        "1921",
                        "1920",
                        "1919",
                        "1918",
                        "1917",
                        "1916",
                        "1915",
                        "1914",
                        "1913",
                        "1912",
                        "1911",
                        "1910",
                        "1909",
                        "1908",
                        "1907",
                        "1906",
                        "1905",
                        "1904",
                        "1903",
                        "1902",
                        "1901",
                        "1900"
                    }));

                    //---- label10 ----
                    label10.setText("year:");

                    //---- label11 ----
                    label11.setText("month:");

                    //---- comboBox5 ----
                    comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                        "January",
                        "February",
                        "March",
                        "April",
                        "May",
                        "June",
                        "July",
                        "August",
                        "September",
                        "October",
                        "November",
                        "December"
                    }));

                    //======== scrollPane2 ========
                    {

                        //---- table2 ----
                        table2.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"1", null, null, null},
                                {"2", null, null, null},
                                {"3", null, null, null},
                                {"4", null, null, null},
                                {"5", null, null, null},
                            },
                            new String[] {
                                "ID", "Name", "Occup. rooms", "Occup. beds"
                            }
                        ));
                        {
                            TableColumnModel cm = table2.getColumnModel();
                            cm.getColumn(0).setPreferredWidth(15);
                        }
                        scrollPane2.setViewportView(table2);
                    }

                    GroupLayout panel19Layout = new GroupLayout(panel19);
                    panel19.setLayout(panel19Layout);
                    panel19Layout.setHorizontalGroup(
                        panel19Layout.createParallelGroup()
                            .addGroup(panel19Layout.createSequentialGroup()
                                .addComponent(panel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel19Layout.createParallelGroup()
                                    .addGroup(panel19Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addGroup(panel19Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(label10)
                                            .addComponent(label11))
                                        .addGroup(panel19Layout.createParallelGroup()
                                            .addGroup(panel19Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel19Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                        .addComponent(label6)
                                        .addGap(16, 16, 16)
                                        .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel19Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                                        .addComponent(button18)
                                        .addContainerGap())
                                    .addGroup(panel19Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(46, Short.MAX_VALUE))))
                    );
                    panel19Layout.setVerticalGroup(
                        panel19Layout.createParallelGroup()
                            .addComponent(panel20, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panel19Layout.createSequentialGroup()
                                .addGroup(panel19Layout.createParallelGroup()
                                    .addGroup(panel19Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(panel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6)))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel19Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel19Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label10)
                                            .addComponent(comboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel19Layout.createParallelGroup()
                                    .addGroup(panel19Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(label11))
                                    .addComponent(comboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button18)
                                .addGap(20, 20, 20))
                    );
                }

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addComponent(panel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addComponent(panel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }
            tabbedPane1.addTab("Occupancy", panel4);

            //======== panel5 ========
            {
                panel5.setBackground(Color.white);

                //======== panel21 ========
                {

                    //======== panel22 ========
                    {
                        panel22.setBackground(new Color(0x3366ff));

                        //---- button19 ----
                        button19.setText("Log Out");
                        button19.setBackground(Color.lightGray);

                        //---- button20 ----
                        button20.setText("Help");
                        button20.setBackground(Color.lightGray);

                        GroupLayout panel22Layout = new GroupLayout(panel22);
                        panel22.setLayout(panel22Layout);
                        panel22Layout.setHorizontalGroup(
                            panel22Layout.createParallelGroup()
                                .addGroup(panel22Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel22Layout.createParallelGroup()
                                        .addComponent(button19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel22Layout.createSequentialGroup()
                                            .addComponent(button20, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                        );
                        panel22Layout.setVerticalGroup(
                            panel22Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel22Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(button20)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button19)
                                    .addGap(23, 23, 23))
                        );
                    }

                    //---- button21 ----
                    button21.setText("save");

                    //---- comboBox7 ----
                    comboBox7.setModel(new DefaultComboBoxModel<>(new String[] {
                        "2025",
                        "2024",
                        "2023",
                        "2022",
                        "2021",
                        "2020",
                        "2019",
                        "2018",
                        "2017",
                        "2016",
                        "2015",
                        "2014",
                        "2013",
                        "2012",
                        "2011",
                        "2010",
                        "2009",
                        "2008",
                        "2007",
                        "2006",
                        "2005",
                        "2004",
                        "2003",
                        "2002",
                        "2001",
                        "2000",
                        "1999",
                        "1998",
                        "1997",
                        "1996",
                        "1995",
                        "1994",
                        "1993",
                        "1992",
                        "1991",
                        "1990",
                        "1989",
                        "1988",
                        "1987",
                        "1986",
                        "1985",
                        "1984",
                        "1983",
                        "1982",
                        "1981",
                        "1980",
                        "1979",
                        "1978",
                        "1977",
                        "1976",
                        "1975",
                        "1974",
                        "1973",
                        "1972",
                        "1971",
                        "1970",
                        "1969",
                        "1968",
                        "1967",
                        "1966",
                        "1965",
                        "1964",
                        "1963",
                        "1962",
                        "1961",
                        "1960",
                        "1959",
                        "1958",
                        "1957",
                        "1956",
                        "1955",
                        "1954",
                        "1953",
                        "1952",
                        "1951",
                        "1950",
                        "1949",
                        "1948",
                        "1947",
                        "1946",
                        "1945",
                        "1944",
                        "1943",
                        "1942",
                        "1941",
                        "1940",
                        "1939",
                        "1938",
                        "1937",
                        "1936",
                        "1935",
                        "1934",
                        "1933",
                        "1932",
                        "1931",
                        "1930",
                        "1929",
                        "1928",
                        "1927",
                        "1926",
                        "1925",
                        "1924",
                        "1923",
                        "1922",
                        "1921",
                        "1920",
                        "1919",
                        "1918",
                        "1917",
                        "1916",
                        "1915",
                        "1914",
                        "1913",
                        "1912",
                        "1911",
                        "1910",
                        "1909",
                        "1908",
                        "1907",
                        "1906",
                        "1905",
                        "1904",
                        "1903",
                        "1902",
                        "1901",
                        "1900"
                    }));

                    //---- label12 ----
                    label12.setText("from:");

                    //---- label13 ----
                    label13.setText("from:");

                    //---- comboBox8 ----
                    comboBox8.setModel(new DefaultComboBoxModel<>(new String[] {
                        "January",
                        "February",
                        "March",
                        "April",
                        "May",
                        "June",
                        "July",
                        "August",
                        "September",
                        "October",
                        "November",
                        "December"
                    }));

                    //======== scrollPane3 ========
                    {

                        //---- table3 ----
                        table3.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"1", null, null, null},
                                {"2", null, null, null},
                                {"3", null, null, null},
                                {"4", null, null, null},
                                {"5", null, null, null},
                            },
                            new String[] {
                                "ID", "Name", "Occup. rooms", "Occup. beds"
                            }
                        ));
                        {
                            TableColumnModel cm = table3.getColumnModel();
                            cm.getColumn(0).setPreferredWidth(15);
                        }
                        scrollPane3.setViewportView(table3);
                    }

                    //---- label14 ----
                    label14.setText("to:");

                    //---- comboBox9 ----
                    comboBox9.setModel(new DefaultComboBoxModel<>(new String[] {
                        "2025",
                        "2024",
                        "2023",
                        "2022",
                        "2021",
                        "2020",
                        "2019",
                        "2018",
                        "2017",
                        "2016",
                        "2015",
                        "2014",
                        "2013",
                        "2012",
                        "2011",
                        "2010",
                        "2009",
                        "2008",
                        "2007",
                        "2006",
                        "2005",
                        "2004",
                        "2003",
                        "2002",
                        "2001",
                        "2000",
                        "1999",
                        "1998",
                        "1997",
                        "1996",
                        "1995",
                        "1994",
                        "1993",
                        "1992",
                        "1991",
                        "1990",
                        "1989",
                        "1988",
                        "1987",
                        "1986",
                        "1985",
                        "1984",
                        "1983",
                        "1982",
                        "1981",
                        "1980",
                        "1979",
                        "1978",
                        "1977",
                        "1976",
                        "1975",
                        "1974",
                        "1973",
                        "1972",
                        "1971",
                        "1970",
                        "1969",
                        "1968",
                        "1967",
                        "1966",
                        "1965",
                        "1964",
                        "1963",
                        "1962",
                        "1961",
                        "1960",
                        "1959",
                        "1958",
                        "1957",
                        "1956",
                        "1955",
                        "1954",
                        "1953",
                        "1952",
                        "1951",
                        "1950",
                        "1949",
                        "1948",
                        "1947",
                        "1946",
                        "1945",
                        "1944",
                        "1943",
                        "1942",
                        "1941",
                        "1940",
                        "1939",
                        "1938",
                        "1937",
                        "1936",
                        "1935",
                        "1934",
                        "1933",
                        "1932",
                        "1931",
                        "1930",
                        "1929",
                        "1928",
                        "1927",
                        "1926",
                        "1925",
                        "1924",
                        "1923",
                        "1922",
                        "1921",
                        "1920",
                        "1919",
                        "1918",
                        "1917",
                        "1916",
                        "1915",
                        "1914",
                        "1913",
                        "1912",
                        "1911",
                        "1910",
                        "1909",
                        "1908",
                        "1907",
                        "1906",
                        "1905",
                        "1904",
                        "1903",
                        "1902",
                        "1901",
                        "1900"
                    }));

                    //---- label15 ----
                    label15.setText("to:");

                    //---- comboBox10 ----
                    comboBox10.setModel(new DefaultComboBoxModel<>(new String[] {
                        "January",
                        "February",
                        "March",
                        "April",
                        "May",
                        "June",
                        "July",
                        "August",
                        "September",
                        "October",
                        "November",
                        "December"
                    }));

                    //---- comboBox11 ----
                    comboBox11.setModel(new DefaultComboBoxModel<>(new String[] {
                        "Hotel Alpha",
                        "Hotel Beta",
                        "Hotel Gamma ",
                        "Hotel Delta",
                        "Hotel Epsilon"
                    }));
                    comboBox11.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));

                    GroupLayout panel21Layout = new GroupLayout(panel21);
                    panel21.setLayout(panel21Layout);
                    panel21Layout.setHorizontalGroup(
                        panel21Layout.createParallelGroup()
                            .addGroup(panel21Layout.createSequentialGroup()
                                .addComponent(panel22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel21Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel21Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(button21)
                                        .addContainerGap())
                                    .addGroup(panel21Layout.createSequentialGroup()
                                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(40, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel21Layout.createSequentialGroup()
                                        .addGroup(panel21Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel21Layout.createSequentialGroup()
                                                .addComponent(comboBox11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                                .addComponent(label14))
                                            .addGroup(panel21Layout.createSequentialGroup()
                                                .addGap(0, 180, Short.MAX_VALUE)
                                                .addComponent(label12)))
                                        .addGroup(panel21Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(panel21Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(label15))
                                            .addGroup(panel21Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(comboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label13)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel21Layout.createParallelGroup()
                                            .addComponent(comboBox8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBox10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(45, 45, 45))))
                    );
                    panel21Layout.setVerticalGroup(
                        panel21Layout.createParallelGroup()
                            .addComponent(panel22, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panel21Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label12)
                                    .addComponent(comboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label13)
                                    .addComponent(comboBox8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel21Layout.createParallelGroup()
                                    .addComponent(comboBox11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label14)
                                        .addComponent(comboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label15)
                                        .addComponent(comboBox10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button21)
                                .addGap(20, 20, 20))
                    );
                }

                GroupLayout panel5Layout = new GroupLayout(panel5);
                panel5.setLayout(panel5Layout);
                panel5Layout.setHorizontalGroup(
                    panel5Layout.createParallelGroup()
                        .addComponent(panel21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                panel5Layout.setVerticalGroup(
                    panel5Layout.createParallelGroup()
                        .addComponent(panel21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }
            tabbedPane1.addTab("Occupancy Summary", panel5);

            //======== panel6 ========
            {
                panel6.setBackground(Color.white);

                //======== panel23 ========
                {

                    //======== panel24 ========
                    {
                        panel24.setBackground(new Color(0x3366ff));

                        //---- button22 ----
                        button22.setText("Log Out");
                        button22.setBackground(Color.lightGray);

                        //---- button23 ----
                        button23.setText("Help");
                        button23.setBackground(Color.lightGray);

                        GroupLayout panel24Layout = new GroupLayout(panel24);
                        panel24.setLayout(panel24Layout);
                        panel24Layout.setHorizontalGroup(
                            panel24Layout.createParallelGroup()
                                .addGroup(panel24Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panel24Layout.createParallelGroup()
                                        .addComponent(button22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel24Layout.createSequentialGroup()
                                            .addComponent(button23, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())
                        );
                        panel24Layout.setVerticalGroup(
                            panel24Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel24Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(button23)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button22)
                                    .addGap(23, 23, 23))
                        );
                    }

                    //---- button24 ----
                    button24.setText("save");

                    //---- comboBox12 ----
                    comboBox12.setModel(new DefaultComboBoxModel<>(new String[] {
                        "2025",
                        "2024",
                        "2023",
                        "2022",
                        "2021",
                        "2020",
                        "2019",
                        "2018",
                        "2017",
                        "2016",
                        "2015",
                        "2014",
                        "2013",
                        "2012",
                        "2011",
                        "2010",
                        "2009",
                        "2008",
                        "2007",
                        "2006",
                        "2005",
                        "2004",
                        "2003",
                        "2002",
                        "2001",
                        "2000",
                        "1999",
                        "1998",
                        "1997",
                        "1996",
                        "1995",
                        "1994",
                        "1993",
                        "1992",
                        "1991",
                        "1990",
                        "1989",
                        "1988",
                        "1987",
                        "1986",
                        "1985",
                        "1984",
                        "1983",
                        "1982",
                        "1981",
                        "1980",
                        "1979",
                        "1978",
                        "1977",
                        "1976",
                        "1975",
                        "1974",
                        "1973",
                        "1972",
                        "1971",
                        "1970",
                        "1969",
                        "1968",
                        "1967",
                        "1966",
                        "1965",
                        "1964",
                        "1963",
                        "1962",
                        "1961",
                        "1960",
                        "1959",
                        "1958",
                        "1957",
                        "1956",
                        "1955",
                        "1954",
                        "1953",
                        "1952",
                        "1951",
                        "1950",
                        "1949",
                        "1948",
                        "1947",
                        "1946",
                        "1945",
                        "1944",
                        "1943",
                        "1942",
                        "1941",
                        "1940",
                        "1939",
                        "1938",
                        "1937",
                        "1936",
                        "1935",
                        "1934",
                        "1933",
                        "1932",
                        "1931",
                        "1930",
                        "1929",
                        "1928",
                        "1927",
                        "1926",
                        "1925",
                        "1924",
                        "1923",
                        "1922",
                        "1921",
                        "1920",
                        "1919",
                        "1918",
                        "1917",
                        "1916",
                        "1915",
                        "1914",
                        "1913",
                        "1912",
                        "1911",
                        "1910",
                        "1909",
                        "1908",
                        "1907",
                        "1906",
                        "1905",
                        "1904",
                        "1903",
                        "1902",
                        "1901",
                        "1900"
                    }));

                    //---- label16 ----
                    label16.setText("year:");

                    //---- label17 ----
                    label17.setText("month:");

                    //---- comboBox13 ----
                    comboBox13.setModel(new DefaultComboBoxModel<>(new String[] {
                        "January",
                        "February",
                        "March",
                        "April",
                        "May",
                        "June",
                        "July",
                        "August",
                        "September",
                        "October",
                        "November",
                        "December"
                    }));

                    //---- comboBox16 ----
                    comboBox16.setModel(new DefaultComboBoxModel<>(new String[] {
                        "Hotel Alpha",
                        "Hotel Beta",
                        "Hotel Gamma ",
                        "Hotel Delta",
                        "Hotel Epsilon"
                    }));
                    comboBox16.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));

                    //---- comboBox6 ----
                    comboBox6.setModel(new DefaultComboBoxModel<>(new String[] {
                        "\u2605",
                        "\u2605\u2605",
                        "\u2605\u2605\u2605",
                        "\u2605\u2605\u2605\u2605",
                        "\u2605\u2605\u2605\u2605\u2605"
                    }));

                    //---- label7 ----
                    label7.setText("category:");

                    //---- label8 ----
                    label8.setText("rooms:");

                    //---- label9 ----
                    label9.setText("occupied rooms:");

                    //---- label18 ----
                    label18.setText("beds:");

                    //---- label19 ----
                    label19.setText("ouccupied beds:");

                    //---- textField4 ----
                    textField4.setText("65");

                    //---- textField5 ----
                    textField5.setText("40");

                    //---- textField6 ----
                    textField6.setText("90");

                    //---- textField7 ----
                    textField7.setText("70");

                    //======== scrollPane4 ========
                    {

                        //---- table4 ----
                        table4.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"adresse:", "Vienna"},
                            },
                            new String[] {
                                "ID:", "1"
                            }
                        ));
                        scrollPane4.setViewportView(table4);
                    }

                    //---- label20 ----
                    label20.setText("attributes:");

                    //---- comboBox14 ----
                    comboBox14.setModel(new DefaultComboBoxModel<>(new String[] {
                        "family friendly",
                        "dog friendly",
                        "spa ",
                        "fitness"
                    }));

                    GroupLayout panel23Layout = new GroupLayout(panel23);
                    panel23.setLayout(panel23Layout);
                    panel23Layout.setHorizontalGroup(
                        panel23Layout.createParallelGroup()
                            .addGroup(panel23Layout.createSequentialGroup()
                                .addComponent(panel24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel23Layout.createParallelGroup()
                                    .addGroup(panel23Layout.createSequentialGroup()
                                        .addComponent(label19)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 320, Short.MAX_VALUE))
                                    .addGroup(panel23Layout.createSequentialGroup()
                                        .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(scrollPane4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(comboBox16, GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel23Layout.createSequentialGroup()
                                                .addComponent(label16)
                                                .addGap(18, 18, 18)
                                                .addComponent(comboBox12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(label7)
                                                .addGap(16, 16, 16)
                                                .addComponent(comboBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                            .addGroup(panel23Layout.createSequentialGroup()
                                                .addComponent(label17)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboBox13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(174, 174, 174))))
                                    .addGroup(panel23Layout.createSequentialGroup()
                                        .addGroup(panel23Layout.createParallelGroup()
                                            .addGroup(panel23Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(button24))
                                            .addGroup(panel23Layout.createSequentialGroup()
                                                .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                    .addGroup(panel23Layout.createSequentialGroup()
                                                        .addComponent(label18)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel23Layout.createSequentialGroup()
                                                        .addComponent(label8)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel23Layout.createSequentialGroup()
                                                        .addComponent(label9)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                                .addComponent(label20)
                                                .addGap(16, 16, 16)
                                                .addComponent(comboBox14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap())))
                    );
                    panel23Layout.setVerticalGroup(
                        panel23Layout.createParallelGroup()
                            .addComponent(panel24, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panel23Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel23Layout.createParallelGroup()
                                    .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboBox12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label16))
                                    .addGroup(panel23Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(label7))
                                    .addComponent(comboBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label17)
                                    .addComponent(comboBox13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel23Layout.createParallelGroup()
                                    .addGroup(panel23Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label8)))
                                    .addGroup(panel23Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(panel23Layout.createParallelGroup()
                                            .addGroup(panel23Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(label20))
                                            .addComponent(comboBox14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label9)
                                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label18))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label19)
                                    .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button24)
                                .addGap(20, 20, 20))
                    );
                }

                GroupLayout panel6Layout = new GroupLayout(panel6);
                panel6.setLayout(panel6Layout);
                panel6Layout.setHorizontalGroup(
                    panel6Layout.createParallelGroup()
                        .addComponent(panel23, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                panel6Layout.setVerticalGroup(
                    panel6Layout.createParallelGroup()
                        .addComponent(panel23, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                );
            }
            tabbedPane1.addTab("Occupancy Summary", panel6);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 599, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Amelie Pötscher
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JPanel panel7;
    private JPanel panel8;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button5;
    private JComboBox<String> comboBox1;
    private JLabel label1;
    private JButton button6;
    private JPanel panel3;
    private JPanel panel17;
    private JPanel panel18;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JComboBox<String> comboBox2;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel panel4;
    private JPanel panel19;
    private JPanel panel20;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JComboBox<String> comboBox3;
    private JLabel label6;
    private JComboBox<String> comboBox4;
    private JLabel label10;
    private JLabel label11;
    private JComboBox<String> comboBox5;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JPanel panel5;
    private JPanel panel21;
    private JPanel panel22;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JComboBox<String> comboBox7;
    private JLabel label12;
    private JLabel label13;
    private JComboBox<String> comboBox8;
    private JScrollPane scrollPane3;
    private JTable table3;
    private JLabel label14;
    private JComboBox<String> comboBox9;
    private JLabel label15;
    private JComboBox<String> comboBox10;
    private JComboBox<String> comboBox11;
    private JPanel panel6;
    private JPanel panel23;
    private JPanel panel24;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JComboBox<String> comboBox12;
    private JLabel label16;
    private JLabel label17;
    private JComboBox<String> comboBox13;
    private JComboBox<String> comboBox16;
    private JComboBox<String> comboBox6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label18;
    private JLabel label19;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JScrollPane scrollPane4;
    private JTable table4;
    private JLabel label20;
    private JComboBox<String> comboBox14;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
