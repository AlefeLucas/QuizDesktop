/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.view;

import br.com.senai.DAO.DAO;
import br.com.senai.modelo.Question;
import br.com.senai.modelo.QuestionsData;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Aluno
 */
public class MenuFrame extends javax.swing.JFrame {

    public MenuFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        //Insere 50 questões no bd automaticamente (estão na classe QuestionsData)
        /*ArrayList<Question> java = QuestionsData.getJava();
        ArrayList<Question> hardware = QuestionsData.getHardware();
        ArrayList<Question> so = QuestionsData.getSo();
        ArrayList<Question> sql = QuestionsData.getSql();
        ArrayList<Question> web = QuestionsData.getWeb();
        
        for (int x = 0; x < java.size(); x++) {
            DAO.insertPergunta(java.get(x));
            DAO.insertPergunta(hardware.get(x));
            DAO.insertPergunta(so.get(x));
            DAO.insertPergunta(sql.get(x));
            DAO.insertPergunta(web.get(x));
        
        }*/
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new JPanel(){

            private ImageIcon picture = 
            new ImageIcon(getClass().getResource( "/br/com/senai/view/images/fundo.jpg" ));

            public void paintComponent( Graphics g ){
                super.paintComponent( g );

                Image img = picture.getImage();

                BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                Graphics g2 = bi.createGraphics();
                g2.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
                ImageIcon newIcon = new ImageIcon(bi);

                /*Dimension desktopSize = this.getSize();
                Dimension pictureSize = new Dimension(picture.getIconWidth(), picture.getIconHeight());
                picture.paintIcon( this, g, (desktopSize.width - pictureSize.width) / 2,
                    (desktopSize.height - pictureSize.height) / 2 ); */
                newIcon.paintIcon(this, g, 0, 0);
            }};
            ;
            jPanelHead = new JPanel();
            jLabelTitulo = new JLabel();
            jPanelBody = new JPanel();
            JPanelEspacoCentro = new JPanel();
            jButtonJogar = new JButton();
            jButtonRanking = new JButton();
            jButtonAdm = new JButton();
            jPanelEspacoWest = new JPanel();
            jPanelEast = new JPanel();
            jPanelFoot = new JPanel();

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setTitle("Quiz TI");
            setMaximumSize(new Dimension(800, 600));
            setMinimumSize(new Dimension(800, 600));
            setPreferredSize(new Dimension(800, 600));
            setResizable(false);

            jPanelBackground.setLayout(new BorderLayout());

            jPanelHead.setOpaque(false);
            jPanelHead.setPreferredSize(new Dimension(103, 200));
            jPanelHead.setLayout(new BorderLayout());

            jLabelTitulo.setFont(new Font("Calibri", 1, 36)); // NOI18N
            jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
            jLabelTitulo.setIcon(new ImageIcon(getClass().getResource("/br/com/senai/view/images/logo.png"))); // NOI18N
            jPanelHead.add(jLabelTitulo, BorderLayout.NORTH);

            jPanelBackground.add(jPanelHead, BorderLayout.NORTH);

            jPanelBody.setOpaque(false);
            jPanelBody.setLayout(new BorderLayout());

            JPanelEspacoCentro.setOpaque(false);
            JPanelEspacoCentro.setLayout(new GridLayout(3, 1));

            jButtonJogar.setFont(new Font("sansserif", 1, 18)); // NOI18N
            jButtonJogar.setText("Jogar");
            jButtonJogar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButtonJogarActionPerformed(evt);
                }
            });
            JPanelEspacoCentro.add(jButtonJogar);

            jButtonRanking.setFont(new Font("sansserif", 1, 18)); // NOI18N
            jButtonRanking.setText("Ranking");
            jButtonRanking.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButtonRankingActionPerformed(evt);
                }
            });
            JPanelEspacoCentro.add(jButtonRanking);

            jButtonAdm.setFont(new Font("sansserif", 1, 18)); // NOI18N
            jButtonAdm.setText("Administrar");
            jButtonAdm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    jButtonAdmActionPerformed(evt);
                }
            });
            JPanelEspacoCentro.add(jButtonAdm);

            jPanelBody.add(JPanelEspacoCentro, BorderLayout.CENTER);

            jPanelEspacoWest.setOpaque(false);
            jPanelEspacoWest.setPreferredSize(new Dimension(300, 100));

            GroupLayout jPanelEspacoWestLayout = new GroupLayout(jPanelEspacoWest);
            jPanelEspacoWest.setLayout(jPanelEspacoWestLayout);
            jPanelEspacoWestLayout.setHorizontalGroup(jPanelEspacoWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 300, Short.MAX_VALUE)
            );
            jPanelEspacoWestLayout.setVerticalGroup(jPanelEspacoWestLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
            );

            jPanelBody.add(jPanelEspacoWest, BorderLayout.WEST);

            jPanelEast.setOpaque(false);
            jPanelEast.setPreferredSize(new Dimension(300, 100));

            GroupLayout jPanelEastLayout = new GroupLayout(jPanelEast);
            jPanelEast.setLayout(jPanelEastLayout);
            jPanelEastLayout.setHorizontalGroup(jPanelEastLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 300, Short.MAX_VALUE)
            );
            jPanelEastLayout.setVerticalGroup(jPanelEastLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
            );

            jPanelBody.add(jPanelEast, BorderLayout.EAST);

            jPanelBackground.add(jPanelBody, BorderLayout.CENTER);

            jPanelFoot.setOpaque(false);
            jPanelFoot.setPreferredSize(new Dimension(809, 200));

            GroupLayout jPanelFootLayout = new GroupLayout(jPanelFoot);
            jPanelFoot.setLayout(jPanelFootLayout);
            jPanelFootLayout.setHorizontalGroup(jPanelFootLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 809, Short.MAX_VALUE)
            );
            jPanelFootLayout.setVerticalGroup(jPanelFootLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0, 200, Short.MAX_VALUE)
            );

            jPanelBackground.add(jPanelFoot, BorderLayout.SOUTH);

            getContentPane().add(jPanelBackground, BorderLayout.LINE_END);

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdmActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonAdmActionPerformed
        AdmLoginFrame admTela = new AdmLoginFrame();
        this.dispose();
        admTela.setVisible(true);
    }//GEN-LAST:event_jButtonAdmActionPerformed

    private void jButtonJogarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonJogarActionPerformed
        ArrayList<Question> allQuestions = DAO.selectPerguntas();
        if (allQuestions.size() < 5) {
            JOptionPane.showMessageDialog(null, "Menos de 5 questões cadastradas", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            PerguntasFrame perguntasFrame = new PerguntasFrame();
            perguntasFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonJogarActionPerformed

    private void jButtonRankingActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonRankingActionPerformed
        RankingFrame rankingFrame = new RankingFrame();
        rankingFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRankingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel JPanelEspacoCentro;
    private JButton jButtonAdm;
    private JButton jButtonJogar;
    private JButton jButtonRanking;
    private JLabel jLabelTitulo;
    private JPanel jPanelBackground;
    private JPanel jPanelBody;
    private JPanel jPanelEast;
    private JPanel jPanelEspacoWest;
    private JPanel jPanelFoot;
    private JPanel jPanelHead;
    // End of variables declaration//GEN-END:variables
}
