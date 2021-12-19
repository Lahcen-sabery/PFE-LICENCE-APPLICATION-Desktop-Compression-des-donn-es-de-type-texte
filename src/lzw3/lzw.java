
package lzw3;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class lzw extends javax.swing.JFrame {

    
    public lzw() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcomp = new javax.swing.JTextField();
        txtdeco = new javax.swing.JTextField();
        choicomp = new javax.swing.JButton();
        choidec = new javax.swing.JButton();
        comp = new javax.swing.JButton();
        decom = new javax.swing.JButton();
        ret = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lempel-Ziv");
        setBackground(new java.awt.Color(255, 102, 204));
        setBounds(new java.awt.Rectangle(450, 240, 0, 0));
        setLocation(new java.awt.Point(275, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lempel-Ziv");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("Localisation de fichier:");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Localisation de fichier:");

        txtcomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompActionPerformed(evt);
            }
        });

        txtdeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdecoActionPerformed(evt);
            }
        });

        choicomp.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        choicomp.setText("choisir un fichier");
        choicomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choicompActionPerformed(evt);
            }
        });

        choidec.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        choidec.setText("choisir un fichier");
        choidec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choidecActionPerformed(evt);
            }
        });

        comp.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        comp.setText("Compression");
        comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compActionPerformed(evt);
            }
        });

        decom.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        decom.setText("Décompression");
        decom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdeco, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(txtcomp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(choicomp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(choidec)
                        .addGap(10, 10, 10)
                        .addComponent(decom, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choicomp)
                    .addComponent(comp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdeco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choidec)
                    .addComponent(decom))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        ret.setBackground(new java.awt.Color(153, 204, 0));
        ret.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ret.setForeground(new java.awt.Color(51, 0, 204));
        ret.setText("retour");
        ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ret, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ret, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompActionPerformed
        
    }//GEN-LAST:event_txtcompActionPerformed

    private void choicompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choicompActionPerformed
        // TODO add your handling code here:
        JFileChooser filech=new JFileChooser();
        FileNameExtensionFilter filtre=new FileNameExtensionFilter("data", ".txt");
        filech.addChoosableFileFilter(filtre);
        int res=filech.showSaveDialog(null);
        if(res==JFileChooser.APPROVE_OPTION){
            File selectfile=filech.getSelectedFile();
            String path=selectfile.getAbsolutePath();
            txtcomp.setText(path);
            //area.setText("");
        }

    }//GEN-LAST:event_choicompActionPerformed

    private void choidecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choidecActionPerformed
        // TODO add your handling code here:
        JFileChooser filech=new JFileChooser();
        FileNameExtensionFilter filtre=new FileNameExtensionFilter("data", ".txt");
        filech.addChoosableFileFilter(filtre);
        int res=filech.showSaveDialog(null);
        if(res==JFileChooser.APPROVE_OPTION){
            File selectfile=filech.getSelectedFile();
            String path=selectfile.getAbsolutePath();
            txtdeco.setText(path);
            //area.setText("");
        }
    }//GEN-LAST:event_choidecActionPerformed

    private void compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compActionPerformed
        // TODO add your handling code here:
            try {
            LZWCompression lzw = new LZWCompression();

            Scanner input = new Scanner(System.in);
            String str = txtcomp.getText();

            File file = new File(str);

            Scanner fileScanner = new Scanner(file);

            String line = "";

            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                 area.setText(  area.getText()+"Contenu de votre fichier en cours de compression: \n" + line);
             
            }
            lzw.compress(str);
             area.setText( area.getText()+"\n"+lzw.tt+"\nLa compression de votre fichier est terminée!\n");
             area.setText(  area.getText()+"\nVotre nouveau fichier est nommé: " + str.replace(".txt", "_comp.txt"));
        
        } catch (Exception e) {
            area.setText( "Le fichier n'a pas été trouvé!");
        }
        
    }//GEN-LAST:event_compActionPerformed

    private void decomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decomActionPerformed
        // TODO add your handling code here:
         try {
     LZWDecompression lzw = new LZWDecompression();

            String str = txtdeco.getText();

            File file = new File(str);

            Scanner fileScanner = new Scanner(file);

            String line = "";

            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                System.out.println("Contenu de votre fichier en cours de décompression:\n"+ line);
            }
            lzw.LZW_Decompress(str);
            area.setText(area.getText()+"La décompression de votre fichier est terminée!\n");
          area.setText(area.getText()+"Votre nouveau fichier est nommé: " + str.replace("_comp.txt", "_decomp.txt"));
        } catch (Exception e) {
              area.setText( "Le fichier n'a pas été trouvé!");
        }
    }//GEN-LAST:event_decomActionPerformed

    private void retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_retActionPerformed

    private void txtdecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdecoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton choicomp;
    private javax.swing.JButton choidec;
    private javax.swing.JButton comp;
    private javax.swing.JButton decom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ret;
    private javax.swing.JTextField txtcomp;
    private javax.swing.JTextField txtdeco;
    // End of variables declaration//GEN-END:variables
}
