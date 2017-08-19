package br.com.senai.view;

import br.com.senai.DAO.DAO;
import br.com.senai.modelo.Question;
import br.com.senai.modelo.Resp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GerPerguntaFrame extends javax.swing.JFrame {

    Color okColor;
    Color notOkColor;
    JTextArea[] jTextAreas;
    JRadioButton[] jRadioButtons;
    JLabel[] jLabelsCharOps;

    public GerPerguntaFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        okColor = new Color(0, 177, 0);
        notOkColor = new Color(177, 0, 0);
        jTextAreas = new JTextArea[5];
        jTextAreas[0] = jTextAreaPergunta;
        jTextAreas[1] = jTextAreaOpA;
        jTextAreas[2] = jTextAreaOpB;
        jTextAreas[3] = jTextAreaOpC;
        jTextAreas[4] = jTextAreaOpD;
        jRadioButtons = new JRadioButton[4];
        jRadioButtons[0] = jRadioButtonA;
        jRadioButtons[1] = jRadioButtonB;
        jRadioButtons[2] = jRadioButtonC;
        jRadioButtons[3] = jRadioButtonD;
        jLabelsCharOps = new JLabel[4];
        jLabelsCharOps[0] = jLabelCharOpA;
        jLabelsCharOps[1] = jLabelCharOpB;
        jLabelsCharOps[2] = jLabelCharOpC;
        jLabelsCharOps[3] = jLabelCharOpD;

    }

    public void textChanged(KeyEvent evt) {
        JTextArea jTextArea = (JTextArea) evt.getSource();
        int x = 150;
        JLabel charOp;
        if (jTextArea == jTextAreaPergunta) {
            x = 300;
            charOp = jLabelCharPergunta;
        } else if (jTextArea == jTextAreaOpA) {
            charOp = jLabelCharOpA;
        } else if (jTextArea == jTextAreaOpB) {
            charOp = jLabelCharOpB;
        } else if (jTextArea == jTextAreaOpC) {
            charOp = jLabelCharOpC;
        } else {
            charOp = jLabelCharOpD;
        }

        int length = jTextArea.getText().length();
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

    public void verify() {
        boolean isOk = true;

        for (JTextArea jTextArea : jTextAreas) {
            int length = jTextArea.getText().length();
            if (length <= 0) {
                isOk = false;
            }
            if (jTextArea == jTextAreaPergunta && length > 300) {
                isOk = false;
            } else if (jTextArea != jTextAreaPergunta && length > 150) {
                isOk = false;
            }
        }

        boolean isSelected = false;
        for (JRadioButton jRadioButton : jRadioButtons) {
            if (jRadioButton.isSelected()) {
                isSelected = true;
            }
        }

        if (!isSelected) {
            isOk = false;
        }

        String opA = jTextAreaOpA.getText().toLowerCase().trim();
        String opB = jTextAreaOpB.getText().toLowerCase().trim();
        String opC = jTextAreaOpC.getText().toLowerCase().trim();
        String opD = jTextAreaOpD.getText().toLowerCase().trim();

        if (opA.equals(opB)) {
            isOk = false;
        } else if (opA.equals(opC)) {
            isOk = false;
        } else if (opA.equals(opD)) {
            isOk = false;
        } else if (opB.equals(opC)) {
            isOk = false;
        } else if (opB.equals(opD)) {
            isOk = false;
        } else if (opC.equals(opD)) {
            isOk = false;
        }

        //AB
        //AC
        //AD
        //BC
        //BD
        //CD
        if (isOk) {
            jButtonAdd.setEnabled(true);
        } else {
            jButtonAdd.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        buttonGroup1 = new ButtonGroup();
        jPanelNorte = new JPanel();
        jPanelTitulo = new JPanel();
        jLabelTitulo = new JLabel();
        jPanelCentro = new JPanel();
        jScrollPanePergunta = new JScrollPane();
        jTextAreaPergunta = new JTextArea();
        jScrollPaneOpA = new JScrollPane();
        jTextAreaOpA = new JTextArea();
        jScrollPaneOpB = new JScrollPane();
        jTextAreaOpB = new JTextArea();
        jScrollPaneOpC = new JScrollPane();
        jTextAreaOpC = new JTextArea();
        jScrollPaneOpD = new JScrollPane();
        jTextAreaOpD = new JTextArea();
        jLabelPergunta = new JLabel();
        jLabelCharPergunta = new JLabel();
        jLabelCharOpA = new JLabel();
        jLabelCharOpB = new JLabel();
        jLabelCharOpC = new JLabel();
        jLabelCharOpD = new JLabel();
        jRadioButtonA = new JRadioButton();
        jRadioButtonB = new JRadioButton();
        jRadioButtonC = new JRadioButton();
        jRadioButtonD = new JRadioButton();
        jPanelSul = new JPanel();
        jButtonAdd = new JButton();
        jButtonBack = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nova Questão");
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setPreferredSize(new Dimension(800, 600));
        setResizable(false);

        jPanelNorte.setLayout(new BorderLayout());

        jPanelTitulo.setLayout(new GridBagLayout());

        jLabelTitulo.setFont(new Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setText("Adicionar Questões");
        jLabelTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        jPanelTitulo.add(jLabelTitulo, new GridBagConstraints());

        jPanelNorte.add(jPanelTitulo, BorderLayout.NORTH);

        getContentPane().add(jPanelNorte, BorderLayout.NORTH);

        jPanelCentro.setLayout(new GridBagLayout());

        jScrollPanePergunta.setPreferredSize(new Dimension(750, 98));

        jTextAreaPergunta.setColumns(20);
        jTextAreaPergunta.setLineWrap(true);
        jTextAreaPergunta.setRows(5);
        jTextAreaPergunta.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jTextAreaPerguntaKeyReleased(evt);
            }
        });
        jScrollPanePergunta.setViewportView(jTextAreaPergunta);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanelCentro.add(jScrollPanePergunta, gridBagConstraints);

        jScrollPaneOpA.setPreferredSize(new Dimension(750, 50));

        jTextAreaOpA.setColumns(20);
        jTextAreaOpA.setLineWrap(true);
        jTextAreaOpA.setRows(5);
        jTextAreaOpA.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextAreaOpAKeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                jTextAreaOpAKeyReleased(evt);
            }
        });
        jScrollPaneOpA.setViewportView(jTextAreaOpA);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanelCentro.add(jScrollPaneOpA, gridBagConstraints);

        jScrollPaneOpB.setPreferredSize(new Dimension(750, 50));

        jTextAreaOpB.setColumns(20);
        jTextAreaOpB.setLineWrap(true);
        jTextAreaOpB.setRows(5);
        jTextAreaOpB.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextAreaOpBKeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                jTextAreaOpBKeyReleased(evt);
            }
        });
        jScrollPaneOpB.setViewportView(jTextAreaOpB);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        jPanelCentro.add(jScrollPaneOpB, gridBagConstraints);

        jScrollPaneOpC.setPreferredSize(new Dimension(750, 50));

        jTextAreaOpC.setColumns(20);
        jTextAreaOpC.setLineWrap(true);
        jTextAreaOpC.setRows(5);
        jTextAreaOpC.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextAreaOpCKeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                jTextAreaOpCKeyReleased(evt);
            }
        });
        jScrollPaneOpC.setViewportView(jTextAreaOpC);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        jPanelCentro.add(jScrollPaneOpC, gridBagConstraints);

        jScrollPaneOpD.setPreferredSize(new Dimension(750, 50));

        jTextAreaOpD.setColumns(20);
        jTextAreaOpD.setLineWrap(true);
        jTextAreaOpD.setRows(5);
        jTextAreaOpD.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextAreaOpDKeyPressed(evt);
            }
            public void keyReleased(KeyEvent evt) {
                jTextAreaOpDKeyReleased(evt);
            }
        });
        jScrollPaneOpD.setViewportView(jTextAreaOpD);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        jPanelCentro.add(jScrollPaneOpD, gridBagConstraints);

        jLabelPergunta.setHorizontalAlignment(SwingConstants.LEFT);
        jLabelPergunta.setText("Pergunta");
        jLabelPergunta.setHorizontalTextPosition(SwingConstants.LEFT);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        jPanelCentro.add(jLabelPergunta, gridBagConstraints);

        jLabelCharPergunta.setFont(new Font("sansserif", 1, 12)); // NOI18N
        jLabelCharPergunta.setForeground(new Color(177, 0, 0));
        jLabelCharPergunta.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelCharPergunta.setText("0");
        jLabelCharPergunta.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabelCharPergunta.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabelCharPergunta.setVerticalTextPosition(SwingConstants.BOTTOM);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        jPanelCentro.add(jLabelCharPergunta, gridBagConstraints);

        jLabelCharOpA.setFont(new Font("sansserif", 1, 12)); // NOI18N
        jLabelCharOpA.setForeground(new Color(177, 0, 0));
        jLabelCharOpA.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelCharOpA.setText("0");
        jLabelCharOpA.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabelCharOpA.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabelCharOpA.setVerticalTextPosition(SwingConstants.BOTTOM);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        jPanelCentro.add(jLabelCharOpA, gridBagConstraints);

        jLabelCharOpB.setFont(new Font("sansserif", 1, 12)); // NOI18N
        jLabelCharOpB.setForeground(new Color(177, 0, 0));
        jLabelCharOpB.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelCharOpB.setText("0");
        jLabelCharOpB.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabelCharOpB.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabelCharOpB.setVerticalTextPosition(SwingConstants.BOTTOM);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        jPanelCentro.add(jLabelCharOpB, gridBagConstraints);

        jLabelCharOpC.setFont(new Font("sansserif", 1, 12)); // NOI18N
        jLabelCharOpC.setForeground(new Color(177, 0, 0));
        jLabelCharOpC.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelCharOpC.setText("0");
        jLabelCharOpC.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabelCharOpC.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabelCharOpC.setVerticalTextPosition(SwingConstants.BOTTOM);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        jPanelCentro.add(jLabelCharOpC, gridBagConstraints);

        jLabelCharOpD.setFont(new Font("sansserif", 1, 12)); // NOI18N
        jLabelCharOpD.setForeground(new Color(177, 0, 0));
        jLabelCharOpD.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelCharOpD.setText("0");
        jLabelCharOpD.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabelCharOpD.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabelCharOpD.setVerticalTextPosition(SwingConstants.BOTTOM);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        jPanelCentro.add(jLabelCharOpD, gridBagConstraints);

        buttonGroup1.add(jRadioButtonA);
        jRadioButtonA.setText("Opção A");
        jRadioButtonA.setHorizontalAlignment(SwingConstants.RIGHT);
        jRadioButtonA.setHorizontalTextPosition(SwingConstants.RIGHT);
        jRadioButtonA.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                jRadioButtonAItemStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        jPanelCentro.add(jRadioButtonA, gridBagConstraints);

        buttonGroup1.add(jRadioButtonB);
        jRadioButtonB.setText("Opção B");
        jRadioButtonB.setHorizontalAlignment(SwingConstants.RIGHT);
        jRadioButtonB.setHorizontalTextPosition(SwingConstants.RIGHT);
        jRadioButtonB.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                jRadioButtonBItemStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        jPanelCentro.add(jRadioButtonB, gridBagConstraints);

        buttonGroup1.add(jRadioButtonC);
        jRadioButtonC.setText("Opção C");
        jRadioButtonC.setHorizontalAlignment(SwingConstants.RIGHT);
        jRadioButtonC.setHorizontalTextPosition(SwingConstants.RIGHT);
        jRadioButtonC.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                jRadioButtonCItemStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        jPanelCentro.add(jRadioButtonC, gridBagConstraints);

        buttonGroup1.add(jRadioButtonD);
        jRadioButtonD.setText("Opção D");
        jRadioButtonD.setHorizontalAlignment(SwingConstants.RIGHT);
        jRadioButtonD.setHorizontalTextPosition(SwingConstants.RIGHT);
        jRadioButtonD.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                jRadioButtonDItemStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        jPanelCentro.add(jRadioButtonD, gridBagConstraints);

        getContentPane().add(jPanelCentro, BorderLayout.CENTER);

        jPanelSul.setPreferredSize(new Dimension(800, 80));

        jButtonAdd.setFont(new Font("sansserif", 1, 14)); // NOI18N
        jButtonAdd.setText("Adicionar");
        jButtonAdd.setEnabled(false);
        jButtonAdd.setHorizontalTextPosition(SwingConstants.CENTER);
        jButtonAdd.setPreferredSize(new Dimension(73, 40));
        jButtonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonBack.setFont(new Font("sansserif", 1, 14)); // NOI18N
        jButtonBack.setText("Voltar");
        jButtonBack.setHorizontalTextPosition(SwingConstants.CENTER);
        jButtonBack.setPreferredSize(new Dimension(73, 40));
        jButtonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        GroupLayout jPanelSulLayout = new GroupLayout(jPanelSul);
        jPanelSul.setLayout(jPanelSulLayout);
        jPanelSulLayout.setHorizontalGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelSulLayout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jButtonBack, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdd, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanelSulLayout.setVerticalGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanelSul, BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonBackActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.dispose();
        MenuFrame menu = new MenuFrame();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextAreaPerguntaKeyReleased(KeyEvent evt) {//GEN-FIRST:event_jTextAreaPerguntaKeyReleased
        this.textChanged(evt);
    }//GEN-LAST:event_jTextAreaPerguntaKeyReleased

    private void jTextAreaOpAKeyReleased(KeyEvent evt) {//GEN-FIRST:event_jTextAreaOpAKeyReleased
        this.textChanged(evt);
    }//GEN-LAST:event_jTextAreaOpAKeyReleased

    private void jTextAreaOpBKeyReleased(KeyEvent evt) {//GEN-FIRST:event_jTextAreaOpBKeyReleased
        this.textChanged(evt);
    }//GEN-LAST:event_jTextAreaOpBKeyReleased

    private void jTextAreaOpCKeyReleased(KeyEvent evt) {//GEN-FIRST:event_jTextAreaOpCKeyReleased
        this.textChanged(evt);
    }//GEN-LAST:event_jTextAreaOpCKeyReleased

    private void jTextAreaOpDKeyReleased(KeyEvent evt) {//GEN-FIRST:event_jTextAreaOpDKeyReleased
        this.textChanged(evt);
    }//GEN-LAST:event_jTextAreaOpDKeyReleased

    private void jRadioButtonAItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_jRadioButtonAItemStateChanged
        this.verify();
    }//GEN-LAST:event_jRadioButtonAItemStateChanged

    private void jRadioButtonBItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_jRadioButtonBItemStateChanged
        this.verify();
    }//GEN-LAST:event_jRadioButtonBItemStateChanged

    private void jRadioButtonCItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_jRadioButtonCItemStateChanged
        this.verify();
    }//GEN-LAST:event_jRadioButtonCItemStateChanged

    private void jRadioButtonDItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_jRadioButtonDItemStateChanged
        this.verify();
    }//GEN-LAST:event_jRadioButtonDItemStateChanged

    private void jButtonAddActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String pergunta = jTextAreaPergunta.getText();
        String a = jTextAreaOpA.getText();
        String b = jTextAreaOpB.getText();
        String c = jTextAreaOpC.getText();
        String d = jTextAreaOpD.getText();
        Resp correta = null;

        Resp[] resps = new Resp[4];
        resps[0] = Resp.A;
        resps[1] = Resp.B;
        resps[2] = Resp.C;
        resps[3] = Resp.D;

        for (int x = 0; x < resps.length; x++) {
            if (jRadioButtons[x].isSelected()) {
                correta = resps[x];
            }
        }

        Question question = new Question(pergunta, a, b, c, d, correta);

        List<Question> questions = DAO.selectPerguntas();

        boolean exists = false;
        
        for (Question q : questions) {
            

            String question1Title = q.getQuestion();
            String[] question1Ops = q.getAllOps();

            String question2Title = question.getQuestion();
            String[] question2Ops = question.getAllOps();

            boolean titleIsEqual = false;
            boolean opsAreEqual = false;
            titleIsEqual = question1Title.equalsIgnoreCase(question2Title);
                

            opsAreEqual =  opsEqual(question1Ops, question2Ops) ;
            
            if(titleIsEqual && opsAreEqual){
                exists = true;
                break;
            } 
                

        }
        
        if(exists){
            JOptionPane.showMessageDialog(this, "Questão identica já cadastrada", "Erro", JOptionPane.ERROR_MESSAGE);
        } else{
        DAO.insertPergunta(question);    
        }

        
        
        
        

        buttonGroup1.clearSelection();
        for (JTextArea jTextArea : jTextAreas) {
            jTextArea.setText("");
        }

        for (JLabel jLabel : jLabelsCharOps) {
            jLabel.setForeground(notOkColor);
            jLabel.setText("0");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTextAreaOpDKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextAreaOpDKeyPressed
        textChanging(evt);
    }//GEN-LAST:event_jTextAreaOpDKeyPressed

    private void jTextAreaOpCKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextAreaOpCKeyPressed
        textChanging(evt);
    }//GEN-LAST:event_jTextAreaOpCKeyPressed

    private void jTextAreaOpBKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextAreaOpBKeyPressed
        textChanging(evt);
    }//GEN-LAST:event_jTextAreaOpBKeyPressed

    private void jTextAreaOpAKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextAreaOpAKeyPressed
        textChanging(evt);
    }//GEN-LAST:event_jTextAreaOpAKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonGroup buttonGroup1;
    private JButton jButtonAdd;
    private JButton jButtonBack;
    private JLabel jLabelCharOpA;
    private JLabel jLabelCharOpB;
    private JLabel jLabelCharOpC;
    private JLabel jLabelCharOpD;
    private JLabel jLabelCharPergunta;
    private JLabel jLabelPergunta;
    private JLabel jLabelTitulo;
    private JPanel jPanelCentro;
    private JPanel jPanelNorte;
    private JPanel jPanelSul;
    private JPanel jPanelTitulo;
    private JRadioButton jRadioButtonA;
    private JRadioButton jRadioButtonB;
    private JRadioButton jRadioButtonC;
    private JRadioButton jRadioButtonD;
    private JScrollPane jScrollPaneOpA;
    private JScrollPane jScrollPaneOpB;
    private JScrollPane jScrollPaneOpC;
    private JScrollPane jScrollPaneOpD;
    private JScrollPane jScrollPanePergunta;
    private JTextArea jTextAreaOpA;
    private JTextArea jTextAreaOpB;
    private JTextArea jTextAreaOpC;
    private JTextArea jTextAreaOpD;
    private JTextArea jTextAreaPergunta;
    // End of variables declaration//GEN-END:variables

    private void textChanging(KeyEvent evt) {
        jButtonAdd.setEnabled(false);
    }

    private boolean opsEqual(String[] question1Ops, String[] question2Ops) {

        int iguais = 0;

        for (String op1 : question1Ops) {
            for (String op2 : question2Ops) {
                if(op1.equalsIgnoreCase(op2)){
                    iguais++;
                }
            }
        }
        
        if(iguais == 4){
            return true;
        } else {
            return false;
        }

    }
}
