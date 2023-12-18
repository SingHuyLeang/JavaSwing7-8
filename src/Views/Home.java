package Views;

import Themes.Theme;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }
    
    // switch panel
    void switchPanel(Component screen){
        backgound.removeAll();
        backgound.add(screen);
        backgound.repaint();
        backgound.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashBoard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        backgound = new javax.swing.JPanel();
        homeScreen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        searchScreen = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        profileScreen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        settingScreen = new javax.swing.JPanel();
        setting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));

        dashBoard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/admin.png"))); // NOI18N

        btnHome.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnSetting.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSetting.setText("Setting");
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashBoardLayout = new javax.swing.GroupLayout(dashBoard);
        dashBoard.setLayout(dashBoardLayout);
        dashBoardLayout.setHorizontalGroup(
            dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        dashBoardLayout.setVerticalGroup(
            dashBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashBoardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgound.setLayout(new java.awt.CardLayout());

        homeScreen.setBackground(new java.awt.Color(255, 255, 255));
        homeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Shop-App");
        homeScreen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 813, 47));

        jTextField1.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 140, 30));

        jLabel5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Name      :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 80, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Qty", "Price", "Total", "Discount", "Image"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        homeScreen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 780, 290));

        jLabel6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Id              :");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 30));

        jTextField2.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 140, 30));

        jTextField3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 140, 30));

        jLabel7.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Discount :");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 80, 30));

        jLabel8.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Price        :");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 80, 30));

        jTextField4.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 140, 30));

        jLabel9.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Total        :");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 80, 30));

        jTextField5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 140, 30));

        jTextField6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 140, 30));

        jLabel10.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Quantity  :");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 80, 30));

        lbImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        homeScreen.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 120, 130));

        btnImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnImage.setText("Image");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });
        homeScreen.add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 90, -1));

        jButton3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jButton3.setText("Add");
        homeScreen.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 90, -1));

        jButton4.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jButton4.setText("Update");
        homeScreen.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 90, -1));

        jButton5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jButton5.setText("Clear");
        homeScreen.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 90, -1));

        jButton6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jButton6.setText("Delete");
        homeScreen.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 90, -1));

        backgound.add(homeScreen, "card2");

        jLabel3.setText("Search");

        javax.swing.GroupLayout searchScreenLayout = new javax.swing.GroupLayout(searchScreen);
        searchScreen.setLayout(searchScreenLayout);
        searchScreenLayout.setHorizontalGroup(
            searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchScreenLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
        );
        searchScreenLayout.setVerticalGroup(
            searchScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchScreenLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        backgound.add(searchScreen, "card3");

        jLabel4.setText("Profile");

        javax.swing.GroupLayout profileScreenLayout = new javax.swing.GroupLayout(profileScreen);
        profileScreen.setLayout(profileScreenLayout);
        profileScreenLayout.setHorizontalGroup(
            profileScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileScreenLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
        );
        profileScreenLayout.setVerticalGroup(
            profileScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileScreenLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        backgound.add(profileScreen, "card4");

        setting.setText("Setting");

        javax.swing.GroupLayout settingScreenLayout = new javax.swing.GroupLayout(settingScreen);
        settingScreen.setLayout(settingScreenLayout);
        settingScreenLayout.setHorizontalGroup(
            settingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingScreenLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
        );
        settingScreenLayout.setVerticalGroup(
            settingScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingScreenLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        backgound.add(settingScreen, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(backgound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backgound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        switchPanel(setting);
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        switchPanel(homeScreen);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        switchPanel(searchScreen);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        switchPanel(profileScreen);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser choser = new JFileChooser();
        choser.showOpenDialog(this);
        File file = choser.getSelectedFile();
        String fileName = file.getAbsolutePath();
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
        lbImage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_btnImageActionPerformed

    public static void main(String args[]) {
        new Theme("light");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgound;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSetting;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel homeScreen;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbImage;
    private javax.swing.JPanel profileScreen;
    private javax.swing.JPanel searchScreen;
    private javax.swing.JLabel setting;
    private javax.swing.JPanel settingScreen;
    // End of variables declaration//GEN-END:variables
}
