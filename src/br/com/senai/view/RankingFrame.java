package br.com.senai.view;

import br.com.senai.DAO.DAO;
import br.com.senai.modelo.Jogador;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class RankingFrame extends javax.swing.JFrame {

    
   

    public RankingFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

        DefaultTableModel tabela = (DefaultTableModel) jTable.getModel();
        

        ArrayList<Jogador> jogadores = DAO.selectJogadores();
        tabela.setRowCount(0);

        
        
        for (Jogador jogador : jogadores) {
            
            tabela.addRow(new Object[]{
                jogador.getNome(),
                jogador.getEmail(),
                String.format("%.1f%%", jogador.getPontuacao()),
                jogador.getHoradia()
            });
        }
        
        jTable.setModel(tabela);
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNorte = new JPanel();
        jLabelTitulo = new JLabel();
        jPanelCentro = new JPanel();
        jScrollPane = new JScrollPane();
        jTable = new JTable();
        jPanelSul = new JPanel();
        jButtonBack = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ranking");
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setPreferredSize(new Dimension(800, 600));
        setResizable(false);

        jPanelNorte.setLayout(new BorderLayout());

        jLabelTitulo.setFont(new Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelTitulo.setText("Ranking");
        jPanelNorte.add(jLabelTitulo, BorderLayout.CENTER);

        getContentPane().add(jPanelNorte, BorderLayout.NORTH);

        jPanelCentro.setLayout(new BorderLayout());

        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogador", "Email", "Acertos", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTable);

        jPanelCentro.add(jScrollPane, BorderLayout.CENTER);

        getContentPane().add(jPanelCentro, BorderLayout.CENTER);

        jButtonBack.setFont(new Font("sansserif", 1, 14)); // NOI18N
        jButtonBack.setText("Voltar");
        jButtonBack.setHorizontalTextPosition(SwingConstants.CENTER);
        jButtonBack.setMaximumSize(new Dimension(84, 31));
        jButtonBack.setMinimumSize(new Dimension(84, 31));
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
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(jButtonBack, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanelSulLayout.setVerticalGroup(jPanelSulLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelSulLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jButtonBack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanelSul, BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        this.dispose();
        MenuFrame menu = new MenuFrame();
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButtonBack;
    private JLabel jLabelTitulo;
    private JPanel jPanelCentro;
    private JPanel jPanelNorte;
    private JPanel jPanelSul;
    private JScrollPane jScrollPane;
    private JTable jTable;
    // End of variables declaration//GEN-END:variables
}
