/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author mateu
 */
public class telaCalc extends javax.swing.JFrame {

    /**
     * Creates new form telaCalc
     */
    public telaCalc() { //O NOME DESTE public telaCalc É CONSTRUTOR, o mesmo 
        // faz a TELA que está no PROJETO desaparecer durante a sua execução.
        initComponents();
        paineldaCalculadora.setVisible(false);
        // COM ESSE CÓDIGO ACIMA, temo que o painel irá 
        // DESAPARECER durante a EXECUÇÃO. Observe o FALSE
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        paineldaCalculadora = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRestoDivisao2 = new javax.swing.JLabel();
        lblElevadoCubo = new javax.swing.JLabel();
        lblRaizQuadrada = new javax.swing.JLabel();
        lblRaizCubica = new javax.swing.JLabel();
        lblValorAbsoluto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Informe um Valor");

        txtvalor.setModel(new javax.swing.SpinnerNumberModel());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemcalculadora.png"))); // NOI18N

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        paineldaCalculadora.setBackground(new java.awt.Color(0, 204, 0));
        paineldaCalculadora.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Resto divisão por 2");

        jLabel4.setText("Elevado ao Cubo");

        jLabel5.setText("Raiz Quadrada");

        jLabel6.setText("Raiz Cúbica");

        jLabel7.setText("Valor Absoluto");

        lblRestoDivisao2.setText("0");

        lblElevadoCubo.setText("0");

        lblRaizQuadrada.setText("0");

        lblRaizCubica.setText("0");

        lblValorAbsoluto.setText("0");

        javax.swing.GroupLayout paineldaCalculadoraLayout = new javax.swing.GroupLayout(paineldaCalculadora);
        paineldaCalculadora.setLayout(paineldaCalculadoraLayout);
        paineldaCalculadoraLayout.setHorizontalGroup(
            paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldaCalculadoraLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRestoDivisao2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(lblElevadoCubo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRaizQuadrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRaizCubica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblValorAbsoluto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paineldaCalculadoraLayout.setVerticalGroup(
            paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldaCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRestoDivisao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblElevadoCubo))
                .addGap(18, 18, 18)
                .addGroup(paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaizQuadrada)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblRaizCubica))
                .addGap(18, 18, 18)
                .addGroup(paineldaCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorAbsoluto))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(paineldaCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paineldaCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(313, 313, 313))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        paineldaCalculadora.setVisible(true);//COM ESTE setVisble(true), o painel irá aparecer assim que eu clicar no BOTÃO (localizado no PROJETO)
        
        int v = Integer.parseInt(txtvalor.getValue().toString());//já que estamos convertendo uma string em um integer VINDO DE UM CONTROLE GIRATÓRIO.
        
        //RESTO DA DIVISÃO POR 2:
        float res = v % 2;
        lblRestoDivisao2.setText(Float.toString(res));//como o res é float, então o mostramos como Float
         
        //RAIZ CÚBICA:
        double rc = Math.cbrt(v);
        lblRaizCubica.setText(String.format("%.2f",rc));//como o rc é double, então o mostramos como Double
        
        //VALOR ABSOLUTO:
        int abso = Math.abs(v);
        lblValorAbsoluto.setText(Integer.toString(abso));//como o abso é inteiro, então o mostramos como Integer
        
        //RAIZ QUADRADA:
        double rq = Math.sqrt(v);
        lblRaizQuadrada.setText(String.format("%.2f",rq));//como o rq é double, então o mostramos como Double
        
        //ELEVADO AO CUBO:
        double ec = Math.pow(v, 3);
        lblElevadoCubo.setText(Double.toString(ec));//como o ec é double, então o mostramos como Double
             
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(telaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblElevadoCubo;
    private javax.swing.JLabel lblRaizCubica;
    private javax.swing.JLabel lblRaizQuadrada;
    private javax.swing.JLabel lblRestoDivisao2;
    private javax.swing.JLabel lblValorAbsoluto;
    private javax.swing.JPanel paineldaCalculadora;
    private javax.swing.JSpinner txtvalor;
    // End of variables declaration//GEN-END:variables
}
