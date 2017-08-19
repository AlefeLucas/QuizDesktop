package br.com.senai.view;

import br.com.senai.DAO.DAO;
import br.com.senai.modelo.Question;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class PerguntasFrame extends javax.swing.JFrame {

    int questaoN;
    String titulo;
    JRadioButton[] jRadioButtons;
    ArrayList<Question> questions;
    Random r;
    Question currentQuestion;
    double acerto;
    double total;

    public PerguntasFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        r = new Random();

        acerto = 0;

        questaoN = 0;
        titulo = "Questão ";

        this.jLabelTitulo.setText(titulo + questaoN);
        this.setTitle(titulo + questaoN);
        this.jTextAreaPergunta.setText("");

        jRadioButtons = new JRadioButton[4];
        jRadioButtons[0] = jRadioButtonOpA;
        jRadioButtons[1] = jRadioButtonOpB;
        jRadioButtons[2] = jRadioButtonOpC;
        jRadioButtons[3] = jRadioButtonOpD;

        for (JRadioButton jRadioButton : jRadioButtons) {
            jRadioButton.setText("");
        }

        ArrayList<Question> allQuestions = DAO.selectPerguntas();
        
        questions = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            questions.add(allQuestions.remove(r.nextInt(allQuestions.size())));
        }

        total = questions.size();
        this.drawNextQuestion();
    }

    public void drawNextQuestion() {

        currentQuestion = questions.remove(r.nextInt(questions.size()));
        drawNextTitle();
        jTextAreaPergunta.setText(currentQuestion.getQuestion());
        String[] allOps = currentQuestion.getAllOpsSorted();
        for (int x = 0; x < allOps.length; x++) {
            jRadioButtons[x].setText(allOps[x]);
            jButtonNext.setEnabled(false);
        }
        buttonGroupOp.clearSelection();

        if (questions.isEmpty()) {
            jButtonNext.setText("Fim");
        }

    }

    public void drawNextTitle() {
        questaoN++;
        jLabelTitulo.setText(titulo + questaoN);
        this.setTitle(titulo + questaoN);
    }

    public void opSelected() {
        jButtonNext.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOp = new ButtonGroup();
        jPanelNorte = new JPanel();
        jPanelTitulo = new JPanel();
        jLabelTitulo = new JLabel();
        jScrollPanePergunta = new JScrollPane();
        jTextAreaPergunta = new JTextArea();
        jPanelCentro = new JPanel();
        jRadioButtonOpA = new JRadioButton();
        jRadioButtonOpB = new JRadioButton();
        jRadioButtonOpC = new JRadioButton();
        jRadioButtonOpD = new JRadioButton();
        jPanelSul = new JPanel();
        jButtonNext = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Questões");
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setPreferredSize(new Dimension(800, 600));
        setResizable(false);

        jPanelNorte.setLayout(new BorderLayout());

        jPanelTitulo.setLayout(new GridBagLayout());

        jLabelTitulo.setFont(new Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setText("Questão x");
        jLabelTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        jPanelTitulo.add(jLabelTitulo, new GridBagConstraints());

        jPanelNorte.add(jPanelTitulo, BorderLayout.NORTH);

        jTextAreaPergunta.setEditable(false);
        jTextAreaPergunta.setColumns(20);
        jTextAreaPergunta.setLineWrap(true);
        jTextAreaPergunta.setRows(5);
        jTextAreaPergunta.setText("Pergunta pergunta pergunta, pergunta \"pergunta\" pergunta?Pergunta pergunta pergunta, pergunta \"pergunta\" pergunta?Pergunta pergunta pergunta, pergunta \"pergunta\" pergunta?Pergunta pergunta pergunta, pergunta \"pergunta\" pergunta?Pergunta pergunta pergunta, pergunta \"pergunta\" pergunta?Pergunta pergunta pergunta, pergunta \"pergunta\" pergunta?Pergunta pergunta pergunta, pergunta \"pergunta\" pergunta?");
        jTextAreaPergunta.setFocusable(false);
        jScrollPanePergunta.setViewportView(jTextAreaPergunta);

        jPanelNorte.add(jScrollPanePergunta, BorderLayout.CENTER);

        getContentPane().add(jPanelNorte, BorderLayout.NORTH);

        jPanelCentro.setLayout(new GridLayout(4, 1));

        buttonGroupOp.add(jRadioButtonOpA);
        jRadioButtonOpA.setText("Opção A");
        jRadioButtonOpA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButtonOpAActionPerformed(evt);
            }
        });
        jPanelCentro.add(jRadioButtonOpA);

        buttonGroupOp.add(jRadioButtonOpB);
        jRadioButtonOpB.setText("Opção B");
        jRadioButtonOpB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButtonOpBActionPerformed(evt);
            }
        });
        jPanelCentro.add(jRadioButtonOpB);

        buttonGroupOp.add(jRadioButtonOpC);
        jRadioButtonOpC.setText("Opção C");
        jRadioButtonOpC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButtonOpCActionPerformed(evt);
            }
        });
        jPanelCentro.add(jRadioButtonOpC);

        buttonGroupOp.add(jRadioButtonOpD);
        jRadioButtonOpD.setText("Opção D");
        jRadioButtonOpD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButtonOpDActionPerformed(evt);
            }
        });
        jPanelCentro.add(jRadioButtonOpD);

        getContentPane().add(jPanelCentro, BorderLayout.CENTER);

        jPanelSul.setPreferredSize(new Dimension(800, 80));

        jButtonNext.setFont(new Font("sansserif", 1, 14)); // NOI18N
        jButtonNext.setText("Próxima");
        jButtonNext.setHorizontalTextPosition(SwingConstants.CENTER);
        jButtonNext.setPreferredSize(new Dimension(73, 40));
        jButtonNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        GroupLayout jPanelSulLayout = new GroupLayout(jPanelSul);
        jPanelSul.setLayout(jPanelSulLayout);
        jPanelSulLayout.setHorizontalGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelSulLayout.createSequentialGroup()
                .addContainerGap(662, Short.MAX_VALUE)
                .addComponent(jButtonNext, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanelSulLayout.setVerticalGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButtonNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanelSul, BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOpAActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpAActionPerformed
        opSelected();
    }//GEN-LAST:event_jRadioButtonOpAActionPerformed

    private void jRadioButtonOpBActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpBActionPerformed
        opSelected();
    }//GEN-LAST:event_jRadioButtonOpBActionPerformed

    private void jRadioButtonOpCActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpCActionPerformed
        opSelected();
    }//GEN-LAST:event_jRadioButtonOpCActionPerformed

    private void jRadioButtonOpDActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOpDActionPerformed
        opSelected();
    }//GEN-LAST:event_jRadioButtonOpDActionPerformed

    private void jButtonNextActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        for (JRadioButton jRadioButton : jRadioButtons) {
            if (jRadioButton.isSelected()) {
                if (jRadioButton.getText().equals(currentQuestion.getOpCorreta())) {
                    acerto++;
                }
            }
        }
        if (!questions.isEmpty()) {
            this.drawNextQuestion();
        } else {
            double porcentagem = (acerto * 100) / total;
            System.out.println("ACERTO: " + porcentagem);
            this.dispose();
            NewJogadorFrame newJogadorFrame = new NewJogadorFrame(porcentagem);
            newJogadorFrame.setVisible(true);
        }
    }//GEN-LAST:event_jButtonNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonGroup buttonGroupOp;
    private JButton jButtonNext;
    private JLabel jLabelTitulo;
    private JPanel jPanelCentro;
    private JPanel jPanelNorte;
    private JPanel jPanelSul;
    private JPanel jPanelTitulo;
    private JRadioButton jRadioButtonOpA;
    private JRadioButton jRadioButtonOpB;
    private JRadioButton jRadioButtonOpC;
    private JRadioButton jRadioButtonOpD;
    private JScrollPane jScrollPanePergunta;
    private JTextArea jTextAreaPergunta;
    // End of variables declaration//GEN-END:variables
}
