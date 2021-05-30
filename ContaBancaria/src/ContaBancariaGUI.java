
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wonderalexandre
 */
public class ContaBancariaGUI extends javax.swing.JFrame {

    ContaBancaria contaJP = new ContaBancaria();
    ContaBancaria contaWendell = new ContaBancaria(100);
    ContaBancaria contaBryan = new ContaBancaria(33);
    ContaBancaria contaEduardo = new ContaBancaria();
    ContaBancaria contaGuilherme = new ContaBancaria();
    public ContaBancariaGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboConta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboOperacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        botaoOperacao = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João Pedro", "Eduardo", "Bryan", "Wendell", "Guilherme" }));
        comboConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboContaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome da conta");

        jLabel2.setText("Operação");

        comboOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sacar", "Depositar" }));
        comboOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOperacaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor");

        botaoOperacao.setText("Sacar");
        botaoOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOperacaoActionPerformed(evt);
            }
        });

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Banco UNI9");

        jLabel5.setText("Saldo");

        lblSaldo.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSaldo)
                                    .addComponent(jLabel4)
                                    .addComponent(comboConta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(botaoOperacao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSaldo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(botaoOperacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void comboOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOperacaoActionPerformed
         
        
        if(comboOperacao.getSelectedIndex() == 0){ //opcao sacar
            botaoOperacao.setText("Sacar");
        }else if(comboOperacao.getSelectedIndex() == 1){ //opcao depositar
            botaoOperacao.setText("Depositar");
        }
        
    }//GEN-LAST:event_comboOperacaoActionPerformed

    private void comboContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboContaActionPerformed
        //o método getSelectedIndex é usado para saber qual indice da combobox está selecionado
        if(comboConta.getSelectedIndex() == 0){
            //conta do Joao pedro
            double saldo = contaJP.getSaldo();
            lblSaldo.setText("R$ " + saldo);
        }else if(comboConta.getSelectedIndex() == 1){
            //conta do Eduardo
            double saldo = contaEduardo.getSaldo();
            lblSaldo.setText("R$ " + saldo);
        }
else if(comboConta.getSelectedIndex() == 2){
            //conta do Bryan
            double saldo = contaBryan.getSaldo();
            lblSaldo.setText("R$ " + saldo);
        }else if(comboConta.getSelectedIndex() == 3){
            //conta do Wendell
            double saldo = contaWendell.getSaldo();
            lblSaldo.setText("R$ " + saldo);
        }
else if(comboConta.getSelectedIndex() == 4){
            //conta do Guilherme
            double saldo = contaGuilherme.getSaldo();
            lblSaldo.setText("R$ " + saldo);
        } 
    }//GEN-LAST:event_comboContaActionPerformed

    private void botaoOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOperacaoActionPerformed
        ContaBancaria contaSelecionada = null;
         switch(comboConta.getSelectedIndex()){
            case 0: 
                contaSelecionada = contaJP;
                break;
            case 1: 
                contaSelecionada = contaEduardo;
                break;  
            case 2: 
                contaSelecionada = contaBryan;
                break;      
            case 3: 
                contaSelecionada = contaWendell;
                break;   
            case 4: 
                contaSelecionada = contaGuilherme;
     
}
 double valor = Double.parseDouble( txtValor.getText() ); //converter string p/ double
        if(comboOperacao.getSelectedIndex() == 0){ //sacar    
            contaSelecionada.sacar(valor);
        }
        else if(comboOperacao.getSelectedIndex() == 1){  //depositar
            contaSelecionada.depositar(valor);
        }
  lblSaldo.setText("R$ " + contaSelecionada.getSaldo());
        txtValor.setText("");
        JOptionPane.showMessageDialog(null, "Operação efetuada com sucesso!");
    }//GEN-LAST:event_botaoOperacaoActionPerformed

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
            java.util.logging.Logger.getLogger(ContaBancariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaBancariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaBancariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaBancariaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContaBancariaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoOperacao;
    private javax.swing.JComboBox<String> comboConta;
    private javax.swing.JComboBox<String> comboOperacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}