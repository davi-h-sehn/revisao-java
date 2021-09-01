/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao;

import javax.swing.UIManager;

/**
 *
 * @author davi.sehn
 */
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Color;
public class Terminal extends javax.swing.JFrame {

    Conta conta1, conta2;
    /**
     * Creates new form Terminal
     */
    public Terminal() {
        initComponents();
        
        conta1 = new Conta(1, 123, "davi", 500, 2000);
        conta2 = new Conta(2, 153, "i", 900, 2000);
                
        imprimeConta1();
        imprimeConta2();
        //lblNome2.setText(conta2.getNome());
        //lblValor2.setText(Tools.formataValor(conta2.getSaldo()));        
    }
    
    public void imprimeConta1(){
        lblNome1.setText(conta1.getNome());
        if(conta1.getSaldo() >= 0){
            lblValor1.setForeground(new java.awt.Color(124, 179, 66));
        } else {
            lblValor1.setForeground(new java.awt.Color(255, 87, 34));
        }
        lblValor1.setText(Tools.formataValor(conta1.getSaldo(), true));
    }
    
    public void imprimeConta2(){
        lblNome2.setText(conta2.getNome());
        if(conta2.getSaldo() >= 0){
            lblValor2.setForeground(new java.awt.Color(124, 179, 66));
        } else {
            lblValor2.setForeground(new java.awt.Color(255, 87, 34));
        }
        lblValor2.setText(Tools.formataValor(conta2.getSaldo(), true));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnConta1 = new javax.swing.JPanel();
        lblConta1 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        lblSaldo1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        btnSaque1 = new javax.swing.JButton();
        btnDeposito1 = new javax.swing.JButton();
        btnTransfere1 = new javax.swing.JButton();
        jpnConta2 = new javax.swing.JPanel();
        lblConta2 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        lblSaldo2 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        btnSaque2 = new javax.swing.JButton();
        btnDeposito2 = new javax.swing.JButton();
        btnTransfere2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnConta1.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        lblConta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConta1.setText("Conta:");

        lblSaldo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSaldo1.setText("Saldo:");

        lblNome1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome1.setText("nome");

        lblValor1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValor1.setText("R$");

        btnSaque1.setText("Sacar");
        btnSaque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaque1ActionPerformed(evt);
            }
        });

        btnDeposito1.setText("Depositar");
        btnDeposito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposito1ActionPerformed(evt);
            }
        });

        btnTransfere1.setText("Transferir");
        btnTransfere1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfere1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnConta1Layout = new javax.swing.GroupLayout(jpnConta1);
        jpnConta1.setLayout(jpnConta1Layout);
        jpnConta1Layout.setHorizontalGroup(
            jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnConta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTransfere1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnConta1Layout.createSequentialGroup()
                        .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSaldo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConta1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblValor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnConta1Layout.createSequentialGroup()
                        .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSaque1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(txtValor1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(btnDeposito1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(103, 103, 103))
        );
        jpnConta1Layout.setVerticalGroup(
            jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConta1)
                    .addComponent(lblNome1))
                .addGap(18, 18, 18)
                .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo1)
                    .addComponent(lblValor1))
                .addGap(28, 28, 28)
                .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaque1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeposito1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTransfere1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnConta2.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        lblConta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConta2.setText("Conta:");

        lblSaldo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSaldo2.setText("Saldo:");

        lblNome2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome2.setText("nome");

        lblValor2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValor2.setText("R$");

        btnSaque2.setText("Sacar");
        btnSaque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaque2ActionPerformed(evt);
            }
        });

        btnDeposito2.setText("Depositar");
        btnDeposito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposito2ActionPerformed(evt);
            }
        });

        btnTransfere2.setText("Transferir");
        btnTransfere2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfere2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnConta2Layout = new javax.swing.GroupLayout(jpnConta2);
        jpnConta2.setLayout(jpnConta2Layout);
        jpnConta2Layout.setHorizontalGroup(
            jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnConta2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTransfere2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnConta2Layout.createSequentialGroup()
                        .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSaldo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConta2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblValor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnConta2Layout.createSequentialGroup()
                        .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSaque2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(txtValor2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(btnDeposito2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(103, 103, 103))
        );
        jpnConta2Layout.setVerticalGroup(
            jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConta2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConta2)
                    .addComponent(lblNome2))
                .addGap(18, 18, 18)
                .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo2)
                    .addComponent(lblValor2))
                .addGap(28, 28, 28)
                .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaque2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeposito2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTransfere2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpnConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jpnConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnConta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaque1ActionPerformed
        // TODO add your handling code here:
        try{
            double valor = Double.parseDouble(txtValor1.getText());
            boolean operacao = conta1.sacar(valor);
            if(operacao == true){
                //saque deu certo
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saque Realizado", 'i');
            }else{
                //saque não realizado
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saque Não Realizado", 'e');
            }
        
        imprimeConta1();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSaque1ActionPerformed

    private void btnDeposito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposito1ActionPerformed
        // TODO add your handling code here:
        double valor = Double.parseDouble(txtValor1.getText());
        conta1.depositar(valor);
        
        imprimeConta1();        
    }//GEN-LAST:event_btnDeposito1ActionPerformed

    private void btnSaque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaque2ActionPerformed
        // TODO add your handling code here:
        try{
            double valor = Double.parseDouble(txtValor2.getText());
            boolean operacao = conta2.sacar(valor);
            if(operacao == true){
                //saque deu certo
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saque Realizado", 'i');
            }else{
                //saque não realizado
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saque Não Realizado", 'e');
            }
        
        imprimeConta2();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSaque2ActionPerformed

    private void btnDeposito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposito2ActionPerformed
        // TODO add your handling code here:
        double valor = Double.parseDouble(txtValor2.getText());
        conta2.depositar(valor);
        
        imprimeConta2();
    }//GEN-LAST:event_btnDeposito2ActionPerformed

    private void btnTransfere1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfere1ActionPerformed
        // TODO add your handling code here:
        try{        
            double valor = Double.parseDouble(txtValor1.getText());
            if(conta1.sacar(valor)){
                conta2.depositar(valor);
                imprimeConta1();
                imprimeConta2();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Transferência realizada!", 'i');
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao realizar transferência.", 'e');
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnTransfere1ActionPerformed

    private void btnTransfere2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfere2ActionPerformed
        // TODO add your handling code here:
        try{
            
            double valor = Double.parseDouble(txtValor2.getText());
            if(conta2.sacar(valor)){
                conta1.depositar(valor);
                imprimeConta1();
                imprimeConta2();
                CaixaDeDialogo.obterinstancia().exibirMensagem("Transferência realizada!", 'i');
            } else {
                CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao realizar transferência.", 'e');
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnTransfere2ActionPerformed

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
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terminal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposito1;
    private javax.swing.JButton btnDeposito2;
    private javax.swing.JButton btnSaque1;
    private javax.swing.JButton btnSaque2;
    private javax.swing.JButton btnTransfere1;
    private javax.swing.JButton btnTransfere2;
    private javax.swing.JPanel jpnConta1;
    private javax.swing.JPanel jpnConta2;
    private javax.swing.JLabel lblConta1;
    private javax.swing.JLabel lblConta2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblSaldo1;
    private javax.swing.JLabel lblSaldo2;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
