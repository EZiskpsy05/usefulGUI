package com.raven.form;

import com.raven.component.Form;
import com.raven.form.Portfolio;
import com.raven.web.BrowserForm;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class About_Form extends Form {

    public About_Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        About = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Portfolio = new javax.swing.JLabel();
        About2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        About3 = new javax.swing.JLabel();

        About.setBackground(new java.awt.Color(242, 0, 142));
        About.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        About.setForeground(new java.awt.Color(228, 29, 75));
        About.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        About.setText("HOWARD TRAN");
        About.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Portfolio.setBackground(new java.awt.Color(242, 0, 142));
        Portfolio.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Portfolio.setForeground(new java.awt.Color(228, 29, 75));
        Portfolio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Portfolio.setText("Click here to open website");
        Portfolio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Portfolio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Portfolio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PortfolioMouseClicked(evt);
            }
        });

        About2.setBackground(new java.awt.Color(242, 0, 142));
        About2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        About2.setForeground(new java.awt.Color(228, 29, 75));
        About2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        About2.setText("No Title Yet :)");
        About2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        About3.setBackground(new java.awt.Color(242, 0, 142));
        About3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        About3.setForeground(new java.awt.Color(228, 29, 75));
        About3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        About3.setText("Projects");
        About3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(About2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(About)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(Portfolio)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2037, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(About3)
                    .addContainerGap(2645, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(About)
                .addGap(18, 18, 18)
                .addComponent(About2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(Portfolio)))
                .addContainerGap(2514, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(About3)
                    .addContainerGap(2648, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PortfolioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortfolioMouseClicked
new BrowserForm().setVisible(true);
    }//GEN-LAST:event_PortfolioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About;
    private javax.swing.JLabel About2;
    private javax.swing.JLabel About3;
    private javax.swing.JLabel Portfolio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
