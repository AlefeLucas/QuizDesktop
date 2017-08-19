package br.com.senai.view;

import br.com.senai.DAO.DAO;
import br.com.senai.modelo.Jogador;
import br.com.senai.modelo.ValidarCampos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class NewJogadorFrame extends javax.swing.JFrame {

    private double porcentagemAcertos;
    private Color okColor;
    private Color notOkColor;

    public NewJogadorFrame(double porcentagem) {
        initComponents();
        
        jButtonNext.setEnabled(false);

        okColor = new Color(0, 177, 0);
        notOkColor = new Color(177, 0, 0);

        this.setLocationRelativeTo(null);
        this.porcentagemAcertos = porcentagem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNorte = new JPanel();
        jLabelTitulo = new JLabel();
        jPanelCentro = new JPanel();
        jPanelLogin = new JPanel();
        jLabelNome = new JLabel();
        jTextFieldNome = new JTextField();
        jLabelCharNome = new JLabel();
        jLabelEmail = new JLabel();
        jTextFieldEmail = new JTextField();
        jLabelCharEmail = new JLabel();
        jPanelSul = new JPanel();
        jButtonNext = new JButton();
        jButtonVoltar = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fim");
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setPreferredSize(new Dimension(800, 600));
        setResizable(false);

        jLabelTitulo.setFont(new Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTitulo.setText("Fim");
        jLabelTitulo.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout jPanelNorteLayout = new GroupLayout(jPanelNorte);
        jPanelNorte.setLayout(jPanelNorteLayout);
        jPanelNorteLayout.setHorizontalGroup(jPanelNorteLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorteLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanelNorteLayout.setVerticalGroup(jPanelNorteLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorteLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelNorte, BorderLayout.NORTH);

        jPanelLogin.setLayout(new GridLayout(6, 1));

        jLabelNome.setText("Nome");
        jLabelNome.setVerticalAlignment(SwingConstants.BOTTOM);
        jPanelLogin.add(jLabelNome);

        jTextFieldNome.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                jTextFieldNomeKeyReleased(evt);
            }
        });
        jPanelLogin.add(jTextFieldNome);

        jLabelCharNome.setFont(new Font("sansserif", 1, 12)); // NOI18N
        jLabelCharNome.setForeground(new Color(177, 0, 0));
        jLabelCharNome.setHorizontalAlignment(SwingConstants.LEFT);
        jLabelCharNome.setText("0");
        jLabelCharNome.setVerticalAlignment(SwingConstants.TOP);
        jLabelCharNome.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabelCharNome.setVerticalTextPosition(SwingConstants.BOTTOM);
        jPanelLogin.add(jLabelCharNome);

        jLabelEmail.setText("Email");
        jLabelEmail.setVerticalAlignment(SwingConstants.BOTTOM);
        jPanelLogin.add(jLabelEmail);

        jTextFieldEmail.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextFieldEmailKeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
        });
        jPanelLogin.add(jTextFieldEmail);

        jLabelCharEmail.setFont(new Font("sansserif", 1, 12)); // NOI18N
        jLabelCharEmail.setForeground(new Color(177, 0, 0));
        jLabelCharEmail.setHorizontalAlignment(SwingConstants.LEFT);
        jLabelCharEmail.setText("0");
        jLabelCharEmail.setVerticalAlignment(SwingConstants.TOP);
        jLabelCharEmail.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabelCharEmail.setVerticalTextPosition(SwingConstants.BOTTOM);
        jPanelLogin.add(jLabelCharEmail);

        GroupLayout jPanelCentroLayout = new GroupLayout(jPanelCentro);
        jPanelCentro.setLayout(jPanelCentroLayout);
        jPanelCentroLayout.setHorizontalGroup(jPanelCentroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelCentroLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jPanelLogin, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanelCentroLayout.setVerticalGroup(jPanelCentroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelCentroLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelLogin, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCentro, BorderLayout.CENTER);

        jPanelSul.setPreferredSize(new Dimension(800, 80));

        jButtonNext.setFont(new Font("sansserif", 1, 14)); // NOI18N
        jButtonNext.setText("Prosseguir");
        jButtonNext.setHorizontalTextPosition(SwingConstants.CENTER);
        jButtonNext.setPreferredSize(new Dimension(73, 40));
        jButtonNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new Font("sansserif", 1, 14)); // NOI18N
        jButtonVoltar.setText("Cancelar");
        jButtonVoltar.setHorizontalTextPosition(SwingConstants.CENTER);
        jButtonVoltar.setPreferredSize(new Dimension(73, 40));
        jButtonVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        GroupLayout jPanelSulLayout = new GroupLayout(jPanelSul);
        jPanelSul.setLayout(jPanelSulLayout);
        jPanelSulLayout.setHorizontalGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSulLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jButtonVoltar, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNext, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanelSulLayout.setVerticalGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSulLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSul, BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        String nome = jTextFieldNome.getText();
        String email = jTextFieldEmail.getText();

        if (nome.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, informe nome e email", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (!ValidarCampos.validarEmail(email)) {
            JOptionPane.showMessageDialog(this, "Por favor, informe um email válido", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
            DAO.insertJogador(new Jogador(nome, email, porcentagemAcertos, timeStamp));
            RankingFrame rankingFrame = new RankingFrame();
            rankingFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonVoltarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
        MenuFrame menu = new MenuFrame();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldNomeKeyReleased(KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyReleased
        textChanged(evt);
    }//GEN-LAST:event_jTextFieldNomeKeyReleased

    private void jTextFieldEmailKeyReleased(KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        textChanged(evt);
    }//GEN-LAST:event_jTextFieldEmailKeyReleased

    private void jTextFieldNomeKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
       jButtonNext.setEnabled(false);
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jTextFieldEmailKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyPressed
        jButtonNext.setEnabled(false);
    }//GEN-LAST:event_jTextFieldEmailKeyPressed

    public void textChanged(KeyEvent evt) {
        JTextField jTextField = (JTextField) evt.getSource();
        int x = 200;
        JLabel charOp;
        if (jTextField == jTextFieldNome) {
            charOp = jLabelCharNome;
        } else {
            charOp = jLabelCharEmail;
        }
           
       

        int length = jTextField.getText().length();
        if (length > 0 && length <= x) {
            charOp.setForeground(okColor);
            charOp.setText("" + length);
            
        } else {
            charOp.setForeground(notOkColor);
            if (length == 0) {
                charOp.setText("" + length);
            } else {
                charOp.setText("" + (x - length));
            }
            
        }
        
        verify();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButtonNext;
    private JButton jButtonVoltar;
    private JLabel jLabelCharEmail;
    private JLabel jLabelCharNome;
    private JLabel jLabelEmail;
    private JLabel jLabelNome;
    private JLabel jLabelTitulo;
    private JPanel jPanelCentro;
    private JPanel jPanelLogin;
    private JPanel jPanelNorte;
    private JPanel jPanelSul;
    private JTextField jTextFieldEmail;
    private JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    private void verify() {
        if(jTextFieldEmail.getText().length() <=200 && jTextFieldNome.getText().length() >0 && jTextFieldEmail.getText().length() > 0 && jTextFieldNome.getText().length() <=200){
            jButtonNext.setEnabled(true);
        } else {
             jButtonNext.setEnabled(false);
        }
    }
    
}
