
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.apache.commons.io.IOUtils;

public class new_edit extends javax.swing.JFrame {

    public new_edit() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        ClassLoader cl = new_edit.class.getClassLoader();
        //InputStream is = cl.getSystemResourceAsStream("new.json");
        File file1=new File("Presetnew.json");

        InputStream is=null;

        try {
            is = new FileInputStream(file1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(new_edit.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{

            String s = IOUtils.toString( is );
            json = (JSONObject) JSONSerializer.toJSON(s);
            searchresults = json.getJSONObject("json");
            //System.out.println("ssssssss" + searchresults.optString("count", ""));
            jarray = searchresults.getJSONArray("preset");
            //jarray.add("hello");

            for(int i=0 ; i < jarray.size(); i++) {
                //System.out.println("jarray [" + i + "] --------" + jarray.getString(i));
                model.addElement(jarray.getString(i));}
        } catch(IOException e) {
            e.printStackTrace();
        }
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        //ClassLoader cl = new_edit.class.getClassLoader();
        //InputStream is = cl.getSystemResourceAsStream("new.json");
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
            //System.out.println("ssssssss" + searchresults.optString("count", ""));
            jarray2 = searchresults2.getJSONArray("codec");
            //jarray.add("hello");

            for(int i=0 ; i < jarray2.size(); i++) {
                System.out.println("jarray2 [" + i + "] --------" + jarray2.getString(i));
                model_cod.addElement(jarray2.getString(i));}
        } catch(IOException e) {
            e.printStackTrace();
        }

        // Code adding the component to the parent container - not shown here
        jComboBox2 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();

        jButton2.setText("jButton2");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDIT");
        setBackground(new java.awt.Color(0, 0, 255));
        setBounds(new java.awt.Rectangle(500, 200, 367, 528));
        setForeground(new java.awt.Color(0, 0, 204));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/edit.jpg")));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pre.jpg"))); // NOI18N
        jLabel1.setText("Output Format");

        jComboBox1.setModel(model);
        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewFormat(evt);
            }
        });

        jLabel2.setText("Add new Format");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFormatorCodec(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFormatorCodec(evt);
            }
        });

        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close(evt);
            }
        });

        jLabel3.setText("Remove any  Format");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setEditable(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images.jpg"))); // NOI18N
        jLabel4.setText("Codec");

        jLabel5.setText("Add new Codec");

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Remove any Codec");

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setEditable(false);

        jComboBox2.setModel(model_cod);
        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewCodec(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Close(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close

        close = 1;
        NewJFrame.nw.setVisible(false);
        this.dispose();
        nww.setVisible(true);

    }//GEN-LAST:event_Close

    private void SaveFormatorCodec(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFormatorCodec
     
        File file_new2 = new File("Presetnew.json");
        InputStream is_new2 = null;

        try {
            is_new2 = new FileInputStream(file_new2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(new_edit.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            String s_new2 = IOUtils.toString(is_new2);
            json_new2 = (JSONObject) JSONSerializer.toJSON(s_new2);
            searchresults_new2 = json_new2.getJSONObject("json");
            jarray_new2 = searchresults_new2.getJSONArray("preset");
            jarray2_new2 = searchresults_new2.getJSONArray("codec");

        } catch (IOException e) {
        }
        String s = jTextField1.getText();
        String s2 = jTextField3.getText();

        if (s.isEmpty() && s2.isEmpty()) {
        }
        if (!(s.isEmpty()) && s2.isEmpty()) {
            jarray_new2.add(s);
            DefaultComboBoxModel model1 = new DefaultComboBoxModel();
            DefaultComboBoxModel model11 = new DefaultComboBoxModel();
            for (int i = 0; i < jarray_new2.size(); i++) {
      model1.addElement(jarray_new2.getString(i));
                model11.addElement(jarray_new2.getString(i));
   jComboBox1.setModel(model1);
  nww.jComboBox11.setModel(model11);
 }
            BufferedWriter bufferedWriter = null;

            try {

                bufferedWriter = new BufferedWriter(new FileWriter("Presetnew.json"));
                bufferedWriter.write(json_new2.toString());
 } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
               
                try {
                    if (bufferedWriter != null) {
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        if (!(s2.isEmpty()) && s.isEmpty()) {
            jarray2_new2.add(s2);
            DefaultComboBoxModel model3 = new DefaultComboBoxModel();
            DefaultComboBoxModel model33 = new DefaultComboBoxModel();
            for (int i = 0; i < jarray2_new2.size(); i++) {
           model3.addElement(jarray2_new2.getString(i));
                model33.addElement(jarray2_new2.getString(i));
                jComboBox2.setModel(model3);
                nww.jComboBox22.setModel(model33);
            }
            BufferedWriter bufferedWriter2 = null;

            try {
                bufferedWriter2 = new BufferedWriter(new FileWriter("Presetnew.json"));

                bufferedWriter2.write(json_new2.toString());
             

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
              
                try {
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        if (!(s.isEmpty()) && !(s2.isEmpty())) {
            File file_new = new File("Presetnew.json");

            InputStream is_new = null;

            try {
                is_new = new FileInputStream(file_new);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(new_edit.class.getName()).log(Level.SEVERE, null, ex);
            }


            try {
                String s_new = IOUtils.toString(is_new);
                json_new = (JSONObject) JSONSerializer.toJSON(s_new);
                searchresults_new = json_new.getJSONObject("json");
jarray_new = searchresults_new.getJSONArray("preset");
                jarray2_new = searchresults_new.getJSONArray("codec");
            } catch (IOException e) {
            }

            jarray_new.add(s);
            DefaultComboBoxModel model1 = new DefaultComboBoxModel();
            DefaultComboBoxModel model11 = new DefaultComboBoxModel();
            for (int i = 0; i < jarray_new.size(); i++) {
                model1.addElement(jarray_new.getString(i));
                model11.addElement(jarray_new.getString(i));
 jComboBox1.setModel(model1);
 nww.jComboBox11.setModel(model11);
            }
            jarray2_new.add(s2);
            DefaultComboBoxModel model3 = new DefaultComboBoxModel();
            DefaultComboBoxModel model33 = new DefaultComboBoxModel();
            for (int i = 0; i < jarray2_new.size(); i++) {
               model3.addElement(jarray2_new.getString(i));
                model33.addElement(jarray2_new.getString(i));
                jComboBox2.setModel(model3);
                nww.jComboBox22.setModel(model33);
            }
            BufferedWriter bufferedWriter = null;

            try {
                bufferedWriter = new BufferedWriter(new FileWriter("Presetnew.json"));

                bufferedWriter.write(json_new.toString());
                
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (bufferedWriter != null) {
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }//GEN-LAST:event_SaveFormatorCodec

    private void DeleteFormatorCodec(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFormatorCodec


        String del = jTextField2.getText();
        String del2 = jTextField4.getText();
        File file_new = new File("Presetnew.json");
        InputStream is_new = null;

        try {
            is_new = new FileInputStream(file_new);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(new_edit.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            String s_new = IOUtils.toString(is_new);
            json_new = (JSONObject) JSONSerializer.toJSON(s_new);
            searchresults_new = json_new.getJSONObject("json");
            jarray_new = searchresults_new.getJSONArray("preset");
            jarray2_new = searchresults_new.getJSONArray("codec");

        } catch (IOException e) {
        }
        DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        DefaultComboBoxModel model22 = new DefaultComboBoxModel();
        jarray_new.remove(del);
        for (int i = 0; i < jarray_new.size(); i++) {
            model2.addElement(jarray_new.getString(i));
            model22.addElement(jarray_new.getString(i));
        }
        jComboBox1.setModel(model2);

        nww.jComboBox11.setModel(model22);

        DefaultComboBoxModel model4 = new DefaultComboBoxModel();
        DefaultComboBoxModel model44 = new DefaultComboBoxModel();
        jarray2_new.remove(del2);
        for (int i = 0; i < jarray2_new.size(); i++) {
            model4.addElement(jarray2_new.getString(i));
            model44.addElement(jarray2_new.getString(i));
        }
        jComboBox2.setModel(model4);


        nww.jComboBox22.setModel(model44);
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("Presetnew.json"));

            bufferedWriter.write(json_new.toString());
      

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
          
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
    }//GEN-LAST:event_DeleteFormatorCodec

    private void AddNewFormat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewFormat
        // TODO add your handling code here:
        String sel = (String) jComboBox1.getSelectedItem();
        jTextField2.setText(sel);
    }//GEN-LAST:event_AddNewFormat

    private void AddNewCodec(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewCodec
      
        String sel2 = (String) jComboBox2.getSelectedItem();
        jTextField4.setText(sel2);
    }//GEN-LAST:event_AddNewCodec
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    public int close = 0;
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    DefaultComboBoxModel model_cod = new DefaultComboBoxModel();
    NewJFrame nww = new NewJFrame();
    JSONArray jarray;
    JSONObject json = null;
    JSONObject searchresults;
    JSONObject json2 = null;
    JSONObject searchresults2;
    JSONArray jarray2;
    JSONArray jarray_new;
    JSONObject json_new = null;
    JSONObject searchresults_new;
    JSONArray jarray2_new;
    JSONArray jarray_new2;
    JSONObject json_new2 = null;
    JSONObject searchresults_new2;
    JSONArray jarray2_new2;
}
