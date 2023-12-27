package Home;

import Component.MSG;
import Controller.ProductController;
import Model.ProductModel;
import Themes.Theme;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Home extends javax.swing.JFrame {
    
    ProductController controller = new ProductController();
    
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
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtTotal = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFindTotal = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        searchScreen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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

        txtName.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 140, 30));

        jLabel5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Name      :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 80, 30));

        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Qty", "Price", "Total", "Discount", "Image"
            }
        ));
        jScrollPane1.setViewportView(homeTable);

        homeScreen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 860, 290));

        jLabel6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Id              :");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 30));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtId.setText("Auto");
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 140, 30));

        txtQty.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtQty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 140, 30));

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

        txtPrice.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 140, 30));

        txtTotal.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 120, 30));

        txtImage.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtImage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 0, 0));

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
        homeScreen.add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 120, -1));

        btnAdd.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        homeScreen.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 90, -1));

        btnUpdate.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        homeScreen.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 90, -1));

        btnFindTotal.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnFindTotal.setText("X");
        btnFindTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        btnFindTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindTotalActionPerformed(evt);
            }
        });
        homeScreen.add(btnFindTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 20, 30));

        btnDelete.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        homeScreen.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 90, -1));

        jLabel12.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Total        :");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 80, 30));

        txtDiscount.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtDiscount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        homeScreen.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 140, 30));

        btnClear.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        homeScreen.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 90, -1));

        backgound.add(homeScreen, "card2");

        searchScreen.setBackground(new java.awt.Color(255, 255, 255));
        searchScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Qty", "Price", "Total", "Discount", "Image"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        searchScreen.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 850, 290));

        jTextField7.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 390, 40));

        jLabel3.setFont(new java.awt.Font("Barlow", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Shop-App");
        searchScreen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 813, 47));

        jLabel11.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("  Search      :");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(100, 100, 100)));
        searchScreen.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 40));

        backgound.add(searchScreen, "card3");

        jLabel4.setText("Profile");

        javax.swing.GroupLayout profileScreenLayout = new javax.swing.GroupLayout(profileScreen);
        profileScreen.setLayout(profileScreenLayout);
        profileScreenLayout.setHorizontalGroup(
            profileScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileScreenLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(595, Short.MAX_VALUE))
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
                .addContainerGap(595, Short.MAX_VALUE))
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
        txtImage.setText(fileName);
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name    = txtName.getText();
        String qty1        = txtQty.getText();
        String price1   = txtPrice.getText();
        String discount1   = txtDiscount.getText();
        String image = txtImage.getText();
        String total1 = txtTotal.getText();
        
        if (!total1.isEmpty() && !name.isEmpty() && !qty1.isEmpty() && !price1.isEmpty() && !discount1.isEmpty() && !image.isEmpty()) {
            int qty        = Integer.parseInt(qty1);
            double price   = Double.parseDouble(price1);
            int discount   = Integer.parseInt(discount1);
            double total   = Double.parseDouble(total1);
            controller.add(new ProductModel(name, qty, price, total, discount, image));
        }else{
            MSG.warning("All field can not empty");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFindTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindTotalActionPerformed
        String qty1 = txtQty.getText();
        String price1 = txtPrice.getText();
        if (!qty1.isEmpty() && !price1.isEmpty()) {
            int qty = Integer.parseInt(qty1);
            double price = Double.parseDouble(qty1);
            double total = qty * price;
            txtTotal.setText(String.valueOf(total));
        } else {
            MSG.error("Please enter quantity and price");
        }
    }//GEN-LAST:event_btnFindTotalActionPerformed

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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindTotal;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel homeScreen;
    private javax.swing.JTable homeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lbImage;
    private javax.swing.JPanel profileScreen;
    private javax.swing.JPanel searchScreen;
    private javax.swing.JLabel setting;
    private javax.swing.JPanel settingScreen;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
