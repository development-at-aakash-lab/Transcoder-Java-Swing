
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.apache.commons.io.IOUtils;
import java.util.Properties;
import com.jtattoo.plaf.*;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Semaphore;
import javax.imageio.ImageIO;

public class NewJFrame extends JFrame {

    public static NewJFrame nw;
    int ii = 0, term = 0;
    int stop = 0;
    public double progress;
    private int i, var1, var2, z;
    private DefaultListModel model = new DefaultListModel();
    private DefaultListModel model2 = new DefaultListModel();
    Process process = null;
    private JFileChooser jFileChooser3;
    private JFileChooser jFileChooser1;
    public String s, outOption;
    private int numclicks = 1;
    private int numcheks = 0;
    int h = 0, h1 = 0;
    Process p2;
    ProcessBuilder pb2;
    private int t = 0;

    public NewJFrame() {
        os_name();
        initComponents();
        this.setSize(650, 600);
        Image icon = Toolkit.getDefaultToolkit().getImage("Images\ff.jpg");
        this.setTitle(" AV Transcoder");
        output_folder();
    }

    public void output_folder() {
        File directory = new File(".");
        if (jComboBox11.getSelectedItem().toString().equalsIgnoreCase("mp4")) {
            jComboBox22.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"mpeg4", "mpeg4-highly compressed", "H264", "H264-highly compressed"}));
        }

// Code adding the component to the parent container - not shown here




        try {
            jTextField3.setText(directory.getCanonicalPath());

        } catch (Exception e) {
            System.out.println("Exceptione is =" + e.getMessage());
        }
    }

    public void os_name() {
        try {
            z = 0;
            String osName = System.getProperty("os.name");
            String os = "Linux";
            String os1 = "Windows";
            if (osName.contains(os)) {
                System.out.println("Operating system name =>" + osName);
                z = 0;
            } else if (osName.contains(os1)) {
                System.out.println("Operating system name =>" + osName);
                z = 1;
            } else {
                System.out.println("system not supported" + osName + z);

                z = -1;
            }
        } catch (Exception e) {
            System.out.println("Exception caught =" + e.getMessage());
        }

    }

    public String spaceRemover(String s) {
        s = "\"" + s + "\"";
        return s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel12 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton("done");
        jButton9 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        File file1=new File("Presetnew.json");
        InputStream is=null;

        try {
            is = new FileInputStream(file1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{

            String s = IOUtils.toString( is );
            json1 = (JSONObject) JSONSerializer.toJSON(s);
            searchresults = json1.getJSONObject("json");
            jarray = searchresults.getJSONArray("preset");
            for(int i=0 ; i < jarray.size(); i++) {
                modell.addElement(jarray.getString(i));}
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Code adding the component to the parent container - not shown here

        // Code adding the component to the parent container - not shown here
        jComboBox11 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        File file2=new File("Presetnew.json");

        InputStream is2=null;

        try {
            is2 = new FileInputStream(file2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(new_edit.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{

            String s2 = IOUtils.toString( is2 );
            json2 = (JSONObject) JSONSerializer.toJSON(s2);
            searchresults2 = json2.getJSONObject("json");
            jarray2 = searchresults2.getJSONArray("codec");
            for(int i=0 ; i < jarray2.size(); i++) {
                model_cod.addElement(jarray2.getString(i));}
        } catch(IOException e) {
            e.printStackTrace();
        }
        //
        //
        //
        //
        //
        //
        //// Code adding the component to the parent container - not shown here
        //
        //
        //// Code adding the component to the parent container - not shown here
        //
        //
        //// Code adding the component to the parent container - not shown here
        jComboBox22 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        //
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        SpinnerNumberModel sm4 = new SpinnerNumberModel(0, 0, 12, 1);
        jSpinner5 = new javax.swing.JSpinner(sm4);
        SpinnerNumberModel sm5 = new SpinnerNumberModel(0, 0, 59, 1);
        jSpinner6 = new javax.swing.JSpinner(sm5);
        SpinnerNumberModel sm6 = new SpinnerNumberModel(0, 0, 59, 1);
        jSpinner7 = new javax.swing.JSpinner(sm6);
        jLabel19 = new javax.swing.JLabel();
        SpinnerNumberModel sm7 = new SpinnerNumberModel(0, 0, 12, 1);
        jSpinner8 = new javax.swing.JSpinner(sm7);
        SpinnerNumberModel sm8 = new SpinnerNumberModel(0, 0, 59, 1);
        jSpinner9 = new javax.swing.JSpinner(sm8);
        SpinnerNumberModel sm9 = new SpinnerNumberModel(0, 0, 59, 1);
        jSpinner10 = new javax.swing.JSpinner(sm9);
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList(model);
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList(model2);
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu29 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu38 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FFMpeg Video Conversion"); // NOI18N
        setBackground(new java.awt.Color(255, 204, 204));
        setBounds(new java.awt.Rectangle(370, 90, 670, 680));
        setForeground(new java.awt.Color(51, 255, 255));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/index.jpg")));
        setResizable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        /*ImageIcon newi = new ImageIcon(
            getClass().getResource("Add.png"));

        JButton newb = new JButton("Add",newi);
        jToolBar1.add(newb,"Add");*/
        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setMaximumSize(new java.awt.Dimension(640, 480));

        jButton5.setText("jbutton1");
        if(z==0)jButton5 = new JButton(" Add       ",new ImageIcon(getClass().getResource("Images/round.png")));
        if(z==1)jButton5 = new JButton(" Add             ",new ImageIcon(getClass().getResource("Images/round.png")));
        jButton5.setAlignmentY(0.0F);
        jButton5.setFocusable(false);
        jButton5.setToolTipText("Add File(s) to List of Conversion");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(7);
        jButton5.setMargin(new java.awt.Insets(1, 0, 1, 16));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddSetTooolTip(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddClearToolTip(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInputFile(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton4.setText("jbutton2");
        if(z==0)jButton4 = new JButton("Remove   ",new ImageIcon(getClass().getResource("Images/round_remove.png")));
        if(z==1)jButton4 = new JButton("Remove        ",new ImageIcon(getClass().getResource("Images/round_remove.png")));
        jButton4.setAlignmentY(0.0F);
        jButton4.setFocusable(false);
        jButton4.setToolTipText("Remove Selected File(s) from List");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RemoveSetToolTip(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RemoveClearToolTip(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFile(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton6.setText("jbutton3");
        if(z==0)jButton6 = new JButton(" Clear      ",new ImageIcon(getClass().getResource("Images/clear.png")));
        if(z==1)jButton6 = new JButton(" Clear           ",new ImageIcon(getClass().getResource("Images/clear.png")));
        jButton6.setAlignmentY(0.0F);
        jButton6.setFocusable(false);
        jButton6.setToolTipText("Remove all file(s) from List");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearToolTip(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearClearToolTip(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearLists(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton8.setText("jbutton4");
        if(z==0)jButton8 = new JButton(" Play       ",new ImageIcon(getClass().getResource("Images/play.png")));
        if(z==1)jButton8 = new JButton(" Play            ",new ImageIcon(getClass().getResource("Images/play.png")));
        jButton8.setAlignmentY(0.0F);
        jButton8.setFocusable(false);
        jButton8.setToolTipText("Play the seleccted file with FFPlay");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton8.setIconTextGap(6);
        jButton8.setMargin(new java.awt.Insets(1, 0, 1, 14));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlaySetToolTip(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayClearToolTip(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayFiles(evt);
            }
        });
        jToolBar1.add(jButton8);

        jButton7.setText("jbutton5");
        if(z==0)jButton7 = new JButton("Convert  ",new ImageIcon(getClass().getResource("Images/convert.png")));
        if(z==1)jButton7 = new JButton("Convert       ",new ImageIcon(getClass().getResource("Images/convert.png")));
        jButton7.setAlignmentY(0.0F);
        jButton7.setFocusable(false);
        jButton7.setActionCommand("done");
        jButton7.setToolTipText("Start the Conversion Process");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConvertSetToolTip(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConvertClearToolTip(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Convert(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton9.setText("jButton6");
        if(z==0)jButton9 = new JButton("Stop       ",new ImageIcon(getClass().getResource("Images/stop.png")));
        if(z==1)jButton9 = new JButton("Stop            ",new ImageIcon(getClass().getResource("Images/stop.png")));
        jButton9.setAlignmentY(0.0F);
        jButton9.setToolTipText("Stop the Conversion process");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton9.setIconTextGap(8);
        jButton9.setMargin(new java.awt.Insets(1, 0, 1, 14));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StopSetToolTip(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StopClearToolTip(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopConvert(evt);
            }
        });
        jToolBar1.add(jButton9);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2134, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        //jTabbedPane1.setVisible(false);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabClicked(evt);
            }
        });

        //

        jLabel1.setText("Convert To");

        jComboBox11.setModel(modell);
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertTo(evt);
            }
        });

        jLabel2.setText("Codec");

        jComboBox22.setModel(model_cod);

        jButton2.setText("jButton7");
        jButton2 = new JButton(" Settings ",new ImageIcon(getClass().getResource("Images/settings.png")));
        jButton2.setAlignmentY(0.0F);
        jButton2.setFocusable(false);
        jButton2.setToolTipText("Open/Close the Additional Option Window");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingsSetToolTip(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingsClearToolTip(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Settings(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton2)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Output Formats", jPanel1);

        jLabel4.setText("BitRate(Kbps)");

        jLabel5.setText("Frame Rate(fps)");

        jLabel6.setText("Resolution");

        jLabel7.setText("Aspect Ratio");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default","200 ", "350 ","500 ", "700 ","850","1000 ","1024" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Default", "15 ","20 ","24 ", "25 ","30 ","60" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Default","128x96","176x144","160x128","290x240","320x240","352x288","360x240","640x480","720x576","704x576","1024x768","1408x1152"}));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default","4:3","16:9" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4)
                        .addComponent(jComboBox6)))
                .addGap(134, 134, 134))
        );

        /*

        jTabbedPane1.addTab("Video", jPanel2);
        jTabbedPane1.setEnabledAt(1, false);
        */

        jLabel8.setText("Audio Bitrate");

        jLabel9.setText("Sample Rate");

        jLabel10.setText("Audio Channels");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default","32","64","128","150","160","200" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Default", "8000","11025", "16000", "22050","32000","44100","48000" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Default", "1","2" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(325, 325, 325))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        /*

        jTabbedPane1.addTab("Audio", jPanel3);
        jTabbedPane1.setEnabledAt(2, false);
        */

        jLabel17.setText("  Hours   /    Minutes    /  Seconds");

        jLabel18.setText("Split Start Time");

        jSpinner5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jSpinner6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jSpinner7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel19.setText("Clip Duration");

        jSpinner8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jSpinner9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jSpinner10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        /*

        jTabbedPane1.addTab("Split", jPanel5);
        jTabbedPane1.setEnabledAt(3, false);
        */

        jPanel6.setEnabled(false);

        jLabel20.setText("Additional Command Line Parameter");

        jButton3.setText("Convert");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Convert1(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        /*

        jTabbedPane1.addTab("FFMpeg", jPanel6);
        jTabbedPane1.setEnabledAt(4, false);
        */

        jPanel9.setMaximumSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectOutputFolder(evt);
            }
        });

        jLabel3.setText("Output Folder");

        jLabel21.setText("Status");

        jProgressBar1.setStringPainted(true);

        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setVerifyInputWhenFocusTarget(false);

        jList1.setForeground(new java.awt.Color(0, 0, 204));
        jList1.setDragEnabled(true);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InputListFileClear(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OutputListFileClear(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel11.setText("Input");

        jLabel13.setText("Output");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setMaximumSize(new java.awt.Dimension(640, 480));

        jMenu1.setText("File");
        jMenu1.setMnemonic(KeyEvent.VK_F);

        jMenuItem3.setText("Add");
        jMenuItem3= new JMenuItem(" Add ",new ImageIcon(getClass().getResource("Images/add.png")));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInput(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Exit");
        jMenuItem4 = new JMenuItem(" Exit",new ImageIcon(getClass().getResource("Images/exit.jpeg")));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setMnemonic(KeyEvent.VK_E);

        jMenuItem7.setText("Presets");
        jMenuItem7.setMaximumSize(new java.awt.Dimension(40000, 40000));
        //jMenuItem7.setMenmonic(KeyEvent.VK_X);
        jMenuItem7 = new JMenuItem(" Presets ",new ImageIcon(getClass().getResource("Images/k.png")));

        jMenuItem7.setMnemonic(KeyEvent.VK_X);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddnewPresets(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenu3.setIcon(new ImageIcon(getClass().getResource("Images/theme.jpg")));
        jMenu3.setText("Themes");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTheme(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Blue");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBlueTheme(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Night");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNightTheme(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Graphite");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGraphiteTheme(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Luna");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLunaTheme(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        jMenu29.setBackground(new java.awt.Color(0, 153, 255));
        jMenu29.setText("Options");
        jMenu29.setMnemonic(KeyEvent.VK_O);
        jMenu29.setToolTipText("");
        jMenu29.add(jSeparator1);

        jCheckBoxMenuItem1.setSelected(false);
        jCheckBoxMenuItem1.setText("Additional Options");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionalOptions(evt);
            }
        });
        jMenu29.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem4.setSelected(false);
        jCheckBoxMenuItem4.setText("Start Converting");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartConverting(evt);
            }
        });
        jMenu29.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setSelected(false);
        jCheckBoxMenuItem5.setText("Stop Converting All");
        jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopConvertingAll(evt);
            }
        });
        jMenu29.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem3.setText("Cmd/Terminal");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenCmd(evt);
            }
        });
        jMenu29.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu29);

        jMenu38.setText("Help");
        jMenu38.setMnemonic(KeyEvent.VK_H);

        jMenuItem22.setText("User Manual");
        jMenuItem22 = new JMenuItem(" User Manual ",new ImageIcon(getClass().getResource("Images/doc.jpg")));
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserManual(evt);
            }
        });
        jMenu38.add(jMenuItem22);

        jMenuItem26.setText("FFMpeg Website");
        jMenuItem26 = new JMenuItem(" FFMpeg Website ",new ImageIcon(getClass().getResource("Images/ffmpeg1.jpg")));
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToWebsite(evt);
            }
        });
        jMenu38.add(jMenuItem26);

        jMenuItem6.setText("About");
        jMenuItem6 = new JMenuItem(" About",new ImageIcon(getClass().getResource("Images/about1.jpg")));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About(evt);
            }
        });
        jMenu38.add(jMenuItem6);

        jMenuBar1.add(jMenu38);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2018, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1263, 1263, 1263)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap(10332, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(455, 455, 455)
                        .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(909, 909, 909)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1358, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                        .addGap(2673, 2685, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2662, Short.MAX_VALUE)))
                .addGap(9702, 9702, 9702))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(578, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))
                        .addGap(390, 390, 390))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton1))))
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(906, 906, 906)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddInputFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInputFile
        jFileChooser3 = new JFileChooser();
        jFileChooser3.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter11 = new FileNameExtensionFilter("Audio  Files Only", new String[]{"MP4", "MP2", "AAC", "OGV", "WMA", "AC3", "OGG"});
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter("Video  Files Only", new String[]{"Avi", "MPEG1", "MPEG2", "mp4", "FLV", "WMV", "OGV", "WEBM", "3GP"});

        jFileChooser3.setFileFilter(filter11);
        jFileChooser3.setFileFilter(filter1);
        if (evt.getSource() == jButton5) {
            int returnVal = jFileChooser3.showOpenDialog(NewJFrame.this);
            if (returnVal == jFileChooser3.APPROVE_OPTION) {
                File[] file = jFileChooser3.getSelectedFiles();
                for (File files : file) {
                    model.addElement(files.getAbsolutePath());

                }
            }
        }
   }//GEN-LAST:event_AddInputFile

    private void RemoveFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFile
        if (evt.getSource() == jButton4) {

            int[] fromindex = jList1.getSelectedIndices();

            for (i = (fromindex.length - 1); i >= 0; i--) {
                model.remove(fromindex[i]);
            }

            int[] fromindex1 = jList2.getSelectedIndices();

            for (i = (fromindex1.length - 1); i >= 0; i--) {
                model2.remove(fromindex1[i]);
            }

        }

    }//GEN-LAST:event_RemoveFile

    private void ClearLists(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearLists
        if (evt.getSource() == jButton6) {
            // int option1=  JOptionPane.showOptionDialog(rootPane, evt, s, option1, stop, null, rootPane);//showConfirmDialog(null, "Do u want clear ");

            //if(t==jList1.getSelectedIndex()) 
            model.removeAllElements();
            // else
            model2.removeAllElements();
        }
    }//GEN-LAST:event_ClearLists

    private void Settings(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Settings
        numclicks++;
        if (numclicks % 2 == 0) {
            jTabbedPane1.addTab("Video", jPanel2);
            jTabbedPane1.addTab("Audio", jPanel3);
            jTabbedPane1.addTab("Split", jPanel5);
            jTabbedPane1.addTab("FFMpeg", jPanel6);
            jTabbedPane1.setEnabledAt(1, true);

            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(3, true);
            jTabbedPane1.setEnabledAt(4, true);
        } else {

            jTabbedPane1.remove(4);
            jTabbedPane1.remove(3);
            jTabbedPane1.remove(2);
            jTabbedPane1.remove(1);
        }

    }//GEN-LAST:event_Settings

    private void SelectOutputFolder(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectOutputFolder
        jFileChooser1 = new JFileChooser();
        jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (evt.getSource() == jButton1) {
            int returnVal = jFileChooser1.showOpenDialog(NewJFrame.this);
            if (returnVal == jFileChooser1.APPROVE_OPTION) {
                File file = jFileChooser1.getSelectedFile();
                jTextField3.setText(file.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_SelectOutputFolder

    private void PlayFiles(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayFiles
        Object[] viideoplay = jList1.getSelectedValues();
        Object[] viideoplay1 = jList2.getSelectedValues();

        String video[] = new String[viideoplay.length];
        String video1[] = new String[viideoplay1.length];

        if (z == 0) {
            for (int i = 0; i < video.length; i++) {
                video[i] = viideoplay[i].toString();
            }
            if (video.length == 0) {
                System.out.println("the file or directory you are searching does not exist : ");
                JOptionPane.showMessageDialog(null, "select file from input list");
            }
            for (int j = 0; j < video.length; j++) {
                File file = new File(video[j]);
                boolean exists = file.exists();//exists();
                if (!exists) {
                    System.out.println("the file or directory you are searching does not exist : " + exists);
                    JOptionPane.showMessageDialog(null, "file not found");
                } else {
                    System.out.println("the file or directory you are searching does exist : " + exists);
                    String videoPlay1 = "ffplay ";
                    String videoPlay2 = "; echo '<enter>'; read";
                    String commandVideo = videoPlay1 + video[j] + videoPlay2;
                    if (term == 0) {

                        String cmd1[] = {"bash", "-c", commandVideo};
                        Runtime rt = Runtime.getRuntime();
                        try {

                            Process pr = rt.exec(cmd1);

                        } catch (IOException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        String cmd1[] = {"gnome-terminal", "-x", "bash", "-c", commandVideo};
                        Runtime rt = Runtime.getRuntime();
                        try {

                            Process pr = rt.exec(cmd1);

                        } catch (IOException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
        if (z == 1) {
            for (int i = 0; i < video.length; i++) {
                video[i] = viideoplay[i].toString();
            }
            for (int i = 0; i < video1.length; i++) {
                video1[i] = viideoplay1[i].toString();
            }


            if (video.length == 0 && video1.length == 0) {
                System.out.println("the file or directory you are searching does not exist : ");
                JOptionPane.showMessageDialog(null, "select file from input list");
            }
            for (int j = 0; j < video.length; j++) {
                File file = new File(video[j]);
                boolean exists = file.exists();//exists();
                if (!exists) {

                    System.out.println("the file or directory you are searching does not exist : " + exists);
                    JOptionPane.showMessageDialog(null, "file not found");
                } else {
                    System.out.println("the file or directory you are searching does exist : " + exists);
                    String videoPlay1 = "ffplay ";
                    String command87 = "\"";

                    if (term == 0) {

                        String commandVideo = videoPlay1 + command87 + video[j] + command87 + " >ffplay.txt";
                        try {

                            Process pr = Runtime.getRuntime().exec("cmd.exe /c" + commandVideo);
                        } catch (IOException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        String commandVideo = videoPlay1 + command87 + video[j] + command87;
                        try {

                            Process pr = Runtime.getRuntime().exec("cmd.exe /c cd ffmpeg/bin & start cmd.exe /k" + commandVideo);
                        } catch (IOException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }


    }//GEN-LAST:event_PlayFiles
            for (int j = 0; j < video1.length; j++) {
                File file = new File(video1[j]);
                boolean exists = file.exists();//exists();
                if (!exists) {

                    System.out.println("the file or directory you are searching does not exist : " + exists);
                    JOptionPane.showMessageDialog(null, "file not found");
                } else {

                    String videoPlay1 = "ffplay ";
                    String command87 = "\"";

                    if (term == 0) {

                        String commandVideo = videoPlay1 + command87 + video1[j] + command87 + " >ffplay1.txt";
                        try {

                            Process pr = Runtime.getRuntime().exec("cmd.exe /c" + commandVideo);
                        } catch (IOException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        String commandVideo = videoPlay1 + command87 + video1[j] + command87;
                        try {

                            Process pr = Runtime.getRuntime().exec("cmd.exe /c cd ffmpeg/bin & start cmd.exe /k" + commandVideo);
                        } catch (IOException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }

    }

    class MyThread1 extends Thread {

        public void run() {
            String pp = jTextField14.getText();
            if (z == 0) {
                if (!pp.equalsIgnoreCase("")) {
                    System.out.println("terminal" + pp + "terminal");

                    String[] command = {"gnome-terminal", "-x", "/bin/sh", "-c", jTextField14.getText()};
                    try {

                        process = new ProcessBuilder(command).start();
                    } catch (IOException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Thread.currentThread().destroy();
                }
                h1 = 0;
                var1 = model.getSize();
                jButton7.setEnabled(false);//disable();
                for (var2 = 0; var2 < var1; var2++) {
                    h = 0;
                    stop = 0;
                    s = model.getElementAt(var2).toString();
                    jList1.setSelectedIndex(var2);
                    jList1.ensureIndexIsVisible(var2);

                    MyThread mt = new MyThread();
                    mt.start();
                    int p = 0, q = 0, j = 0;
                    p = Thread.activeCount();
                    jProgressBar1.setValue((int) progress);
                    q = p;
                    while (mt.isAlive() || q >= p) {
                        try {
                            Thread.currentThread().sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jProgressBar1.setValue((int) progress);
                        jProgressBar1.setString(String.format("%.2f", progress) + "%");
                        q = Thread.activeCount();
                        if (jCheckBoxMenuItem5.getState()) {
                            process.destroy();
                            var1 = 0;
                            h1 = 1;
                        }
                    }
                    p = Thread.activeCount();
                    if (h == 0 && h1 == 0) {
                        jProgressBar1.setValue(100);
                    }
                }
                if (h == 0 && h1 == 0) {
                    jProgressBar1.setString("100%");


                }
                if (stop == 0) {
                    JOptionPane.showMessageDialog(null, "Done");
                    jList1.clearSelection();
                    jList2.clearSelection();
                }

            }

            if (z == 1) {
                if (!pp.equalsIgnoreCase("")) {

                    String kk = jTextField14.getText();
                    try {
                        process = Runtime.getRuntime().exec("cmd.exe /c cd ffmpeg/bin  & start cmd.exe /k" + kk);

                    } catch (IOException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Thread.currentThread().destroy();
                }
                var1 = model.getSize();

                jButton7.setEnabled(false);//enable(false);
                for (var2 = 0; var2 < var1; var2++) {
                    stop = 0;
                    s = model.getElementAt(var2).toString();
                    jList1.setSelectedIndex(var2);
                    MyThread mt = new MyThread();
                    mt.start();
                    int p = 0, q = 0, j = 0;
                    p = Thread.activeCount();
                    jProgressBar1.setValue((int) progress);
                    q = p;
                    h = 0;
                    while (mt.isAlive() || q >= p || ii == 0) {
                        try {
                            Thread.currentThread().sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jProgressBar1.setValue((int) progress);
                        jProgressBar1.setString(String.format("%.2f", progress) + "%");
                        q = Thread.activeCount();
                        if (jCheckBoxMenuItem5.getState()) {
                            try {
                                Runtime.getRuntime().exec("taskkill /f /IM  ffmpeg.exe");
                                var1 = 0;
                                h1 = 1;
                            } catch (IOException ex) {
                                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }

                    p = Thread.activeCount();
                    if (h == 0 && h1 == 0) {
                        jProgressBar1.setValue(100);
                    }
                }
                if (h == 0 && h1 == 0) {
                    jProgressBar1.setString("100%");

                    System.out.println(h + " " + h1);

                }
                if (stop == 0 & term==0) {
                    JOptionPane.showMessageDialog(null, "Done");
                    jList1.clearSelection();
                    jList2.clearSelection();
                }

                //jList1.setSelectionMode(ABORT);//setSelectedIndex(-1);
            }


            jButton7.setEnabled(true);

        }
    }

    class MyThread2 extends Thread {

        public String str() {
            s = model.getElementAt(var2).toString();
            String command1 = "ffmpeg ";
            String command2 = "-i ";
            String commandSpace = " ";
            String command3 = s;
            String command4 = convert(s);//jTextField3.getText();
            String commandKill = "; echo '<enter>';";
            String commandf;
            String command5 = (String) jComboBox3.getSelectedItem();
            command3 = spaceRemover(command3);
            command4 = spaceRemover(command4);
            commandf = command1 + command2 + command3 + commandSpace + outOption + commandSpace + command4;
            return commandf;
        }

        public void run() {
            String c = str();
            if (z == 0) {
                if (term == 0) {
                    String[] command = {"/bin/sh", "-c", c};
                    try {
                        System.out.println(c);
                        process = new ProcessBuilder(command).start();

                    } catch (IOException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    String[] command = {"gnome-terminal", "-x", "/bin/sh", "-c", c};
                    try {
                        System.out.println(c);
                        process = new ProcessBuilder(command).start();

                    } catch (IOException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                Scanner sc = new Scanner(process.getErrorStream());
                Pattern durPattern = Pattern.compile("(?<=Duration: )[^,]*");
                String dur = sc.findWithinHorizon(durPattern, 0);
                if (dur == null) {
                    throw new RuntimeException("Could not parse duration.");
                }
                String[] hms = dur.split(":");
                double totalSecs = Integer.parseInt(hms[0]) * 3600
                        + Integer.parseInt(hms[1]) * 60
                        + Double.parseDouble(hms[2]);
                System.out.println("Total duration: " + totalSecs + " seconds.");
                Pattern timePattern = Pattern.compile("(?<=time=)[^ ]*");
                String match;
                double processedSecs;
                while (null != (match = sc.findWithinHorizon(timePattern, 0))) {
                    hms = match.split(":");
                    processedSecs = Integer.parseInt(hms[0]) * 3600
                            + Integer.parseInt(hms[1]) * 60
                            + Double.parseDouble(hms[2]);
                    System.out.println("Processed secs: " + processedSecs);
                    progress = processedSecs * 100 / totalSecs;
                    System.out.printf("Progress: %.2f%%%n", progress);
                }
                try {
                    process.waitFor();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (z == 1) {
                if (term == 0) {
                    try {
                        System.out.println(c);

                        String[] commandd = {"cmd", "/C", c};
                        ProcessBuilder pb = new ProcessBuilder(commandd);
                        pb.redirectErrorStream(true);
                        process = pb.start();
                    } catch (IOException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        System.out.println(c);
                        //  String[] commandd = {"cmd.exe /c start ",c};
                        Process pr = Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k" + c);
                        jProgressBar1.setVisible(false);
                        jLabel21.setVisible(false);
                        // ProcessBuilder pb = new ProcessBuilder();
                        // process = pb.start();
                    } catch (IOException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                try {

                    Thread.currentThread().sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                InputStream stdout = process.getInputStream();
                Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(stdout)));

                Pattern durPattern = Pattern.compile("(?<=Duration: )[^,]*");
                String dur = sc.findWithinHorizon(durPattern, 0);
                if (dur == null) {
                    throw new RuntimeException("Could not parse duration.");
                }
                String[] hms = dur.split(":");
                double totalSecs = Integer.parseInt(hms[0]) * 3600
                        + Integer.parseInt(hms[1]) * 60
                        + Double.parseDouble(hms[2]);
                System.out.println("Total duration: " + totalSecs + " seconds.");

                Pattern timePattern = Pattern.compile("(?<=time=)[^ ]*");
                String match;
                double processedSecs;
                while (null != (match = sc.findWithinHorizon(timePattern, 0))) {
                    hms = match.split(":");
                    processedSecs = Integer.parseInt(hms[0]) * 3600
                            + Integer.parseInt(hms[1]) * 60
                            + Double.parseDouble(hms[2]);
                    System.out.println("Processed secs: " + processedSecs);
                    progress = processedSecs * 100 / totalSecs;
                    System.out.printf("Progress: %.2f%%%n", progress);
                    ii = 0;

                }
                ii = 1;
                try {
                    process.waitFor();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println("");

            }
        }
    }

    class MyThread extends Thread {

        public void run() {
            MyThread2 m2 = new MyThread2();
            m2.start();
        }
    }

    public String convert(String con) {
        int index = 0;
        String command9 = null;
        if (z == 0) {
            index = con.lastIndexOf('.');
            int index1 = con.lastIndexOf('/');

            String fin = con.substring(index1 + 1, index);
            String command4 = jTextField3.getText();
            String Command11 = "/";
            String command11 = ".";
            String command5 = (String) jComboBox11.getSelectedItem();
            command9 = command4 + Command11 + fin + command11 + command5;

            int jj = 1;
            File x = new File(command9);
            if (x.exists()) {
                fin = fin + "-";
            }
            while (x.exists()) {
                if (x.exists()) {
                    System.out.println(x.toString());
                    command9 = command4 + Command11 + fin + Integer.toString(jj) + command11 + command5;
                    File open = new File(command9);
                    x = open;
                    jj++;
                }

            }
            System.out.println("+++" + command9 + "++++");
            jLabel12.setText("Converting" + s);
            //jTextField2.setText(command9);
        }
        if (z == 1) {
            index = con.lastIndexOf('.');
            int index1 = con.lastIndexOf('\\');
            System.out.println(con);
            String fin = con.substring(index1 + 1, index);


            String command4 = jTextField3.getText();
            String Command11 = "\\";
            String command11 = ".";
            String command5 = (String) jComboBox11.getSelectedItem();
            command9 = command4 + Command11 + fin + command11 + command5;

            int jj = 1;
            File x = new File(command9);
            if (x.exists()) {
                fin = fin + "-";
            }
            while (x.exists()) {
                if (x.exists()) {
                    System.out.println(x.toString());
                    command9 = command4 + Command11 + fin + Integer.toString(jj) + command11 + command5;
                    File open = new File(command9);
                    x = open;
                    jj++;
                }

            }
            System.out.println("+++" + command9 + "++++");
            jLabel12.setText("Converting::  " + s + "...");
            model2.addElement(command9);
            // jTextField2.setText(command9);
        }
        return command9;
    }

    private void Convert(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Convert
        jCheckBoxMenuItem5.setSelected(false);
        String bit_rate = (String) jComboBox3.getSelectedItem();
        //  String bit_rate2 = (String) jComboBox3.get
        String frame_rate = (String) jComboBox4.getSelectedItem();
        String resolution_rate = (String) jComboBox5.getSelectedItem();
        String aspect_rate = (String) jComboBox6.getSelectedItem();
        String audio_bitrate = (String) jComboBox7.getSelectedItem();
        String sample_rate = (String) jComboBox8.getSelectedItem();
        String audio_channels = (String) jComboBox9.getSelectedItem();
        String vcodec = (String) jComboBox22.getSelectedItem();
        if (bit_rate.equalsIgnoreCase("Default")) {
            bit_rate = "";
        } else {
            bit_rate = "-b " + bit_rate;
        }
        if (frame_rate.equalsIgnoreCase("Default")) {
            frame_rate = "";
        } else {
            frame_rate = "-r " + frame_rate;
        }
        if (resolution_rate.equalsIgnoreCase("Default")) {
            resolution_rate = "";
        } else {
            resolution_rate = "-s " + resolution_rate;
        }
        if (aspect_rate.equalsIgnoreCase("Default")) {
            aspect_rate = "";
        } else {
            aspect_rate = "-aspect " + aspect_rate;
        }
        if (vcodec.equalsIgnoreCase("Default")) {
            vcodec = "";
        } else if (vcodec.equalsIgnoreCase("H264-highly compressed")) {

            vcodec = "-mbd rd -flags +mv4+aic -trellis 2 -cmp 2 -subcmp 2 -g 300";

        } else if (vcodec.equalsIgnoreCase("H264")) {
            vcodec = "-vcodec libx264";
        } else if (vcodec.equalsIgnoreCase("MPEG4-highly compressed")) {

            vcodec = "-vcodec libxvid -mbd rd -flags +mv4+aic -trellis 2 -cmp 2 -subcmp 2 -g 300";

        } else if (vcodec.equalsIgnoreCase("mpeg4")) {

            vcodec = "-vcodec libxvid";

        } else {
            vcodec = "-target " + vcodec;
        }

        if (audio_bitrate.equalsIgnoreCase("Default")) {
            audio_bitrate = "";
        } else {
            audio_bitrate = "-ab " + audio_bitrate;

        }

        if (sample_rate.equalsIgnoreCase("Default")) {
            sample_rate = "";
        } else {
            sample_rate = "-ar " + sample_rate;
        }
        if (audio_channels.equalsIgnoreCase("Default")) {
            audio_channels = "";
        } else {
            audio_channels = "-ac " + audio_channels;
        }

        String video1 = bit_rate + " " + frame_rate + " " + resolution_rate + " " + aspect_rate + " " + vcodec;
        String audio1 = audio_bitrate + " " + sample_rate + " " + audio_channels;
        outOption = video1 + " " + audio1;
        Object j1 = jSpinner5.getValue();
        Object j2 = jSpinner6.getValue();
        Object j3 = jSpinner7.getValue();
        Object j4 = jSpinner8.getValue();
        Object j5 = jSpinner9.getValue();
        Object j6 = jSpinner10.getValue();
        String seek = " -ss " + j1.toString() + ":" + j2.toString() + ":" + j3.toString();
        String time = j4.toString() + ":" + j5.toString() + ":" + j6.toString();
        if (time.equals("0:0:0")) {
        } else {
            seek = seek + " -t " + time;
        }
        outOption = outOption + seek;
        MyThread1 mt1 = new MyThread1();
        mt1.start();


    }//GEN-LAST:event_Convert

    private void Exit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_Exit

    private void StartConverting(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartConverting

        String command1 = "ffmpeg";

        String bit_rate = (String) jComboBox3.getSelectedItem();
        String frame_rate = (String) jComboBox4.getSelectedItem();
        String resolution_rate = (String) jComboBox5.getSelectedItem();
        String aspect_rate = (String) jComboBox6.getSelectedItem();
        String audio_bitrate = (String) jComboBox7.getSelectedItem();
        String sample_rate = (String) jComboBox8.getSelectedItem();
        String audio_channels = (String) jComboBox9.getSelectedItem();
        String vcodec = (String) jComboBox22.getSelectedItem();
        if (bit_rate.equalsIgnoreCase("Default")) {
            bit_rate = "";
        } else {
            bit_rate = "-b " + bit_rate;
        }
        if (frame_rate.equalsIgnoreCase("Default")) {
            frame_rate = "";
        } else {
            frame_rate = "-r " + frame_rate;
        }
        if (resolution_rate.equalsIgnoreCase("Default")) {
            resolution_rate = "";
        } else {
            resolution_rate = "-s " + resolution_rate;
        }
        if (aspect_rate.equalsIgnoreCase("Default")) {
            aspect_rate = "";
        } else {
            aspect_rate = "-aspect " + aspect_rate;
        }
        if (vcodec.equalsIgnoreCase("Default")) {
            vcodec = "";
        } else if (vcodec.equalsIgnoreCase("H264-highly compressed")) {

            vcodec = "-mbd rd -flags +mv4+aic -trellis 2 -cmp 2 -subcmp 2 -g 300";

        } else if (vcodec.equalsIgnoreCase("H264")) {
            vcodec = "-vcodec libx264";
        } else if (vcodec.equalsIgnoreCase("MPEG4-highly compressed")) {

            vcodec = "-vcodec libxvid -mbd rd -flags +mv4+aic -trellis 2 -cmp 2 -subcmp 2 -g 300";

        } else if (vcodec.equalsIgnoreCase("mpeg4")) {

            vcodec = "-vcodec libxvid";

        } else {
            vcodec = "-target " + vcodec;
        }




        if (audio_bitrate.equalsIgnoreCase("Default")) {
            audio_bitrate = "";
        } else {
            audio_bitrate = "-ab " + audio_bitrate;

        }

        if (sample_rate.equalsIgnoreCase("Default")) {
            sample_rate = "";
        } else {
            sample_rate = "-ar " + sample_rate;
        }
        if (audio_channels.equalsIgnoreCase("Default")) {
            audio_channels = "";
        } else {
            audio_channels = "-ac " + audio_channels;
        }

        String video1 = bit_rate + " " + frame_rate + " " + resolution_rate + " " + aspect_rate + " " + vcodec;
        String audio1 = audio_bitrate + " " + sample_rate + " " + audio_channels;
        outOption = video1 + " " + audio1;
        Object j1 = jSpinner5.getValue();
        Object j2 = jSpinner6.getValue();
        Object j3 = jSpinner7.getValue();
        Object j4 = jSpinner8.getValue();
        Object j5 = jSpinner9.getValue();
        Object j6 = jSpinner10.getValue();
        String seek = " -ss " + j1.toString() + ":" + j2.toString() + ":" + j3.toString();
        String time = j4.toString() + ":" + j5.toString() + ":" + j6.toString();
        if (time.equals("0:0:0")) {
        } else {
            seek = seek + " -t " + time;
        }
        outOption = outOption + seek;
        MyThread1 mt1 = new MyThread1();
        mt1.start();

        jCheckBoxMenuItem5.setSelected(false);

    }//GEN-LAST:event_StartConverting

    private void AdditionalOptions(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionalOptions
        numclicks++;
        if (numclicks % 2 == 0) {
            jTabbedPane1.addTab("Video", jPanel2);
            jTabbedPane1.addTab("Audio", jPanel3);
            jTabbedPane1.addTab("Time", jPanel5);
            jTabbedPane1.addTab("FFMpeg", jPanel6);
            jTabbedPane1.setEnabledAt(1, true);

            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(3, true);
            jTabbedPane1.setEnabledAt(4, true);


        } else {

            jTabbedPane1.remove(4);
            jTabbedPane1.remove(3);
            jTabbedPane1.remove(2);
            jTabbedPane1.remove(1);
        }


    }//GEN-LAST:event_AdditionalOptions

    private void StopConvertingAll(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopConvertingAll
        jCheckBoxMenuItem4.setSelected(false);

    }//GEN-LAST:event_StopConvertingAll

    private void AddnewPresets(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewPresets
        if (evt.getSource() == jMenuItem7) {
            new_edit mainFrame1 = new new_edit();
            mainFrame1.setVisible(true);
            mainFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// TODO add your handling code here:
        }
    }//GEN-LAST:event_AddnewPresets

    private void GoToWebsite(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToWebsite
        if (evt.getSource() == jMenuItem26) {
            openURL("http://www.ffmpeg.org");
        }

    }//GEN-LAST:event_GoToWebsite

    private void StopConvert(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopConvert
//        JOptionPane.showMessageDialog(null, "Do you want to stop?");
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to stop?");
        if (option == JOptionPane.NO_OPTION || option == JOptionPane.CANCEL_OPTION) {
        }
        if (option == JOptionPane.YES_OPTION) {
            try {
                if (z == 0) {
                    h = 1;
                    process.destroy();
                }
                if (z == 1) {
                    h = 1;
                    Runtime.getRuntime().exec("taskkill /f /IM  ffmpeg.exe");
                }
                stop = 1;
                JOptionPane.showMessageDialog(null, "Stopped");
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_StopConvert

    private void AddSetTooolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSetTooolTip

        String path = jButton5.getToolTipText();

        jLabel22.setText(path);
    }//GEN-LAST:event_AddSetTooolTip

    private void AddClearToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddClearToolTip
        jLabel22.setText("");
    }//GEN-LAST:event_AddClearToolTip

    private void RemoveSetToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveSetToolTip
        String path = jButton4.getToolTipText();

        jLabel22.setText(path);

    }//GEN-LAST:event_RemoveSetToolTip

    private void RemoveClearToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveClearToolTip
        jLabel22.setText("");
    }//GEN-LAST:event_RemoveClearToolTip

    private void ClearToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearToolTip
        String path = jButton6.getToolTipText();

        jLabel22.setText(path);

    }//GEN-LAST:event_ClearToolTip

    private void ClearClearToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearClearToolTip
        jLabel22.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ClearClearToolTip

    private void PlaySetToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaySetToolTip
        String path = jButton8.getToolTipText();

        jLabel22.setText(path);

    }//GEN-LAST:event_PlaySetToolTip

    private void PlayClearToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayClearToolTip
        jLabel22.setText("");
    }//GEN-LAST:event_PlayClearToolTip

    private void StopSetToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopSetToolTip
        String path = jButton9.getToolTipText();

        jLabel22.setText(path);

    }//GEN-LAST:event_StopSetToolTip

    private void StopClearToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopClearToolTip
        jLabel22.setText("");
    }//GEN-LAST:event_StopClearToolTip

    private void ConvertSetToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConvertSetToolTip
        String path = jButton7.getToolTipText();

        jLabel22.setText(path);

    }//GEN-LAST:event_ConvertSetToolTip

    private void ConvertClearToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConvertClearToolTip
        jLabel22.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ConvertClearToolTip

    private void SettingsSetToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsSetToolTip
        String path = jButton2.getToolTipText();

        jLabel22.setText(path);

    }//GEN-LAST:event_SettingsSetToolTip

    private void SettingsClearToolTip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsClearToolTip
        jLabel22.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_SettingsClearToolTip

    private void AddInput(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInput

        jFileChooser3 = new JFileChooser();
        jFileChooser3.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter11 = new FileNameExtensionFilter("Audio  Files Only", new String[]{"MP4", "MP2", "AAC", "OGV", "WMA", "AC3", "OGG"});
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter("Video  Files Only", new String[]{"Avi", "MPEG1", "MPEG2", "mp4", "FLV", "WMV", "OGV", "WEBM", "3GP"});

        jFileChooser3.setFileFilter(filter11);
        jFileChooser3.setFileFilter(filter1);
        if (evt.getSource() == jMenuItem3) {


            int returnVal = jFileChooser3.showOpenDialog(NewJFrame.this);
            if (returnVal == jFileChooser3.APPROVE_OPTION) {
                File[] file = jFileChooser3.getSelectedFiles();
                for (File files : file) {

                    model.addElement(files.getAbsolutePath());

                }
            }
        }

    }//GEN-LAST:event_AddInput

    private void UserManual(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserManual
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("MULTIMEDIA TRANSCODER.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_UserManual

    private void About(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About
        if (evt.getSource() == jMenuItem6) {
            about mainFrame2 = new about();
            mainFrame2.setVisible(true);
            mainFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// TODO add your handling code here:
        }
    }//GEN-LAST:event_About

    private void TabClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabClicked

        int index = jTabbedPane1.getSelectedIndex();
        if (index == 4) {
            jProgressBar1.setVisible(false);
            jLabel21.setVisible(false);
        } else {
            jProgressBar1.setVisible(true);
            jLabel21.setVisible(true);

        }
    }//GEN-LAST:event_TabClicked

    private void DefaultTheme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefaultTheme
        // TODO add your handling code here:
    }//GEN-LAST:event_DefaultTheme

    private void AddBlueTheme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBlueTheme

        nw.setVisible(false);
        try {
            Properties props = new Properties();
            props.put("logoString", "");
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            com.jtattoo.plaf.mint.MintLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        nw = new NewJFrame();
        nw.setVisible(true);

    }//GEN-LAST:event_AddBlueTheme

    private void AddNightTheme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNightTheme
        nw.setVisible(false);
        try {
            Properties props = new Properties();
            props.put("logoString", "");
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            com.jtattoo.plaf.noire.NoireLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        nw = new NewJFrame();
        nw.setVisible(true);

    }//GEN-LAST:event_AddNightTheme

    private void AddGraphiteTheme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGraphiteTheme

        nw.setVisible(false);
        try {
            Properties props = new Properties();
            props.put("logoString", "");
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        nw = new NewJFrame();
        nw.setVisible(true);
    }//GEN-LAST:event_AddGraphiteTheme

    private void AddLunaTheme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLunaTheme

        nw.setVisible(false);
        try {
            Properties props = new Properties();
            props.put("logoString", "");
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            com.jtattoo.plaf.luna.LunaLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");



        } catch (Exception ex) {
            ex.printStackTrace();
        }
        nw = new NewJFrame();
        nw.setVisible(true);

    }//GEN-LAST:event_AddLunaTheme

    private void ConvertTo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertTo
        // TODO add your handling code here:
        String s = (String) jComboBox11.getSelectedItem();
        if (s.equalsIgnoreCase("3gp")) {
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"128x96", "176x144", "352x288", "704x576", "1408x1152"}));

            jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"8000"}));

            jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"1"}));
            jComboBox22.enable(false);
        } else if (s.equalsIgnoreCase("mp4")) {
            jComboBox22.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"mpeg4", "mpeg4-highly compressed", "H264", "H264-highly compressed"}));

            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Default", "160x128", "290x240", "320x240", "360x240", "640x480", "720x576", "1024x768"}));
            jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Default", "8000", "11025", "16000", "22050", "32000", "44100", "48000"}));
            jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Default", "1", "2"}));

            jComboBox22.enable(true);
        } else {
            jComboBox22.setModel(model_cod);
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Default", "160x128", "290x240", "320x240", "360x240", "640x480", "720x576", "1024x768"}));
            jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Default", "8000", "11025", "16000", "22050", "32000", "44100", "48000"}));
            jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Default", "1", "2"}));
            jComboBox22.enable(true);
        }
    }//GEN-LAST:event_ConvertTo

    private void Convert1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Convert1
        String command1 = "ffmpeg";

        String bit_rate = (String) jComboBox3.getSelectedItem();
        String frame_rate = (String) jComboBox4.getSelectedItem();
        String resolution_rate = (String) jComboBox5.getSelectedItem();
        String aspect_rate = (String) jComboBox6.getSelectedItem();
        String audio_bitrate = (String) jComboBox7.getSelectedItem();
        String sample_rate = (String) jComboBox8.getSelectedItem();
        String audio_channels = (String) jComboBox9.getSelectedItem();
        String vcodec = (String) jComboBox22.getSelectedItem();
        if (bit_rate.equalsIgnoreCase("Default")) {
            bit_rate = "";
        } else {
            bit_rate = "-b " + bit_rate;
        }
        if (frame_rate.equalsIgnoreCase("Default")) {
            frame_rate = "";
        } else {
            frame_rate = "-r " + frame_rate;
        }
        if (resolution_rate.equalsIgnoreCase("Default")) {
            resolution_rate = "";
        } else {
            resolution_rate = "-s " + resolution_rate;
        }
        if (aspect_rate.equalsIgnoreCase("Default")) {
            aspect_rate = "";
        } else {
            aspect_rate = "-aspect " + aspect_rate;
        }
        if (vcodec.equalsIgnoreCase("Default")) {
            vcodec = "";
        } else if (vcodec.equalsIgnoreCase("H264-highly compressed")) {

            vcodec = "-mbd rd -flags +mv4+aic -trellis 2 -cmp 2 -subcmp 2 -g 300";

        } else if (vcodec.equalsIgnoreCase("H264")) {
            vcodec = "-vcodec libx264";
        } else if (vcodec.equalsIgnoreCase("MPEG4-highly compressed")) {

            vcodec = "-vcodec libxvid -mbd rd -flags +mv4+aic -trellis 2 -cmp 2 -subcmp 2 -g 300";

        } else if (vcodec.equalsIgnoreCase("mpeg4")) {

            vcodec = "-vcodec libxvid";

        } else {
            vcodec = "-target " + vcodec;
        }



        if (audio_bitrate.equalsIgnoreCase("Default")) {
            audio_bitrate = "";
        } else {
            audio_bitrate = "-ab " + audio_bitrate;

        }

        if (sample_rate.equalsIgnoreCase("Default")) {
            sample_rate = "";
        } else {
            sample_rate = "-ar " + sample_rate;
        }
        if (audio_channels.equalsIgnoreCase("Default")) {
            audio_channels = "";
        } else {
            audio_channels = "-ac " + audio_channels;
        }

        String video1 = bit_rate + " " + frame_rate + " " + resolution_rate + " " + aspect_rate + " " + vcodec;
        String audio1 = audio_bitrate + " " + sample_rate + " " + audio_channels;
        outOption = video1 + " " + audio1;
        Object j1 = jSpinner5.getValue();
        Object j2 = jSpinner6.getValue();
        Object j3 = jSpinner7.getValue();
        Object j4 = jSpinner8.getValue();
        Object j5 = jSpinner9.getValue();
        Object j6 = jSpinner10.getValue();
        String seek = " -ss " + j1.toString() + ":" + j2.toString() + ":" + j3.toString();
        String time = j4.toString() + ":" + j5.toString() + ":" + j6.toString();
        if (time.equals("0:0:0")) {
        } else {
            seek = seek + " -t " + time;
        }
        outOption = outOption + seek;
        MyThread1 mt1 = new MyThread1();
        mt1.start();

        jCheckBoxMenuItem5.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_Convert1

    private void OpenCmd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenCmd
        // TODO add your handling code here:
        if (jCheckBoxMenuItem3.getState()) {
            term = 1;
        } else {
            term = 0;
        }

    }//GEN-LAST:event_OpenCmd

    private void InputListFileClear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputListFileClear
        // TODO add your handling code here:
        jList2.clearSelection();
    }//GEN-LAST:event_InputListFileClear

    private void OutputListFileClear(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OutputListFileClear
        // TODO add your handling code here:
        jList1.clearSelection();
    }//GEN-LAST:event_OutputListFileClear

    public static void main(String args[]) throws MalformedURLException, IOException {

        try {
            Properties props = new Properties();
            props.put("logoString", "");
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");


        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                nw = new NewJFrame();
                nw.setVisible(true);

            }
        });


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    public javax.swing.JComboBox jComboBox11;
    public javax.swing.JComboBox jComboBox22;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu38;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    DefaultComboBoxModel modell = new DefaultComboBoxModel();
    DefaultComboBoxModel model_cod = new DefaultComboBoxModel();
    JSONArray jarray;
    JSONObject json1 = null;
    JSONObject searchresults;
    JSONArray jarray2;
    JSONObject json2 = null;
    JSONObject searchresults2;

    private void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else {
                String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++) {
                    if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() == 0) {
                        browser = browsers[count];
                    }
                }
                Runtime.getRuntime().exec(new String[]{browser, url});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in opening browser" + ":\n" + e.getLocalizedMessage());
        }
    }
}
