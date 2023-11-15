package calculadora;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

/**
 *
 * @author Jean Franco
 */
public class CalculadoraGUI extends javax.swing.JFrame {

    private static final int EQUIVALENCIA_KM_CM = 100000;
    private static final double EQUIVALENCIA_CM_KM = 1 / 100000.0;
    private static final double EQUIVALENCIA_KM_PULGADAS = 1 * 1000 * 100 / 2.54;
    private static final int EQUIVALENCIA_KM_METROS = 1000;
    private static final double EQUIVALENCIA_CM_PULGADAS = 1 / 2.54;
    private static final double EQUIVALENCIA_CM_METROS = 1 / 100.0;
    private static final double EQUIVALENCIA_PULGADAS_METROS = 1 * 0.0254;
    private static final int EQUIVALENCIA_METROS_CENTIMETROS = 1 * 100;
    private static final double EQUIVALENCIA_METROS_KILOMETROS = 1000.0;
    private static final double EQUIVALENCIA_METROS_PULGADAS = 39.37;
    private static final int EQUIVALENCIA_HORA_MINUTOS = 60;
    private static final int EQUIVALENCIA_HORA_SEGUNDOS = 3600;
    private static final double EQUIVALENCIA_MINUTOS_HORA = 1 / 60.0;
    private static final double EQUIVALENCIA_MINUTOS_SEGUNDOS = 60.0;
    private static final double EQUIVALENCIA_SEGUNDOS_MINUTOS = 1 / 60.0;
    private static final double EQUIVALENCIA_SEGUNDOS_HORA = 1 / 3600.0;

    public CalculadoraGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        comboTransformar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radioLongitud = new javax.swing.JRadioButton();
        radioTiempo = new javax.swing.JRadioButton();
        radioTemperatura = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        comboConvertir = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Conversor de Unidades de Medida");

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Unidades");

        txtUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadesActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado");

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        comboTransformar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros", "Metros", "Centimetros", "Pulgadas" }));

        jLabel4.setText("Transformar");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/flecha (1).png"))); // NOI18N

        jLabel6.setText("Unidad a convertir");

        radioLongitud.setText("Longitud");
        radioLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLongitudActionPerformed(evt);
            }
        });

        radioTiempo.setText("Tiempo");

        radioTemperatura.setText("Temperatura");

        jLabel7.setText("Configuraciones de medida");

        comboConvertir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometros", "Metros", "Centimentros", "Pulgadas" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtUnidades, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(txtResultado, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboTransformar, 0, 135, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioTemperatura)
                            .addComponent(radioTiempo)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConvertir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 35, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioTiempo))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTemperatura)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTransformar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioLongitudActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadesActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalculadoraGUI calculadora = new CalculadoraGUI();
                calculadora.setLocationRelativeTo(null);
                calculadora.setTitle("Conversor de Unidades");
                calculadora.setVisible(true);
                calculadora.setResizable(false);
                ButtonGroup button = new ButtonGroup();
                button.add(radioTiempo);
                button.add(radioLongitud);
                button.add(radioTemperatura);
                radioLongitud.setSelected(true);
                radioTiempo.addActionListener(e ->
                {
                    comboTransformar.removeAllItems();
                    comboConvertir.removeAllItems();
                    comboTransformar.addItem("Hora");
                    comboTransformar.addItem("Minutos");
                    comboTransformar.addItem("Segundos");
                    comboConvertir.addItem("Hora");
                    comboConvertir.addItem("Minutos");
                    comboConvertir.addItem("Segundos");
                });
                radioLongitud.addActionListener(e ->
                {
                    comboTransformar.removeAllItems();
                    comboConvertir.removeAllItems();
                    comboTransformar.addItem("Kilometros");
                    comboTransformar.addItem("Metros");
                    comboTransformar.addItem("Centimetros");
                    comboTransformar.addItem("Pulgadas");
                    comboConvertir.addItem("Kilometros");
                    comboConvertir.addItem("Metros");
                    comboConvertir.addItem("Centimetros");
                    comboConvertir.addItem("Pulgadas");
                });
                radioTemperatura.addActionListener(e ->
                {
                    comboTransformar.removeAllItems();
                    comboConvertir.removeAllItems();
                    comboTransformar.addItem("Kelvin");
                    comboTransformar.addItem("Fahrenheit");
                    comboTransformar.addItem("Celcius");
                    comboConvertir.addItem("Kelvin");
                    comboConvertir.addItem("Fahrenheit");
                    comboConvertir.addItem("Celcius");
                });
                btnConvertir.addActionListener(e ->
                {
                    if (radioLongitud.isSelected())
                    {
                        switch (comboTransformar.getSelectedItem().toString())
                        {
                            case "Kilometros" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Kilometros" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());
                                    }
                                    case "Centimetros" ->
                                    {
                                        txtResultado.setText("" + (Integer.parseInt(
                                                txtUnidades.getText()) * EQUIVALENCIA_KM_CM));
                                    }
                                    case "Pulgadas" ->
                                    {
                                        txtResultado.setText("" + (Integer.parseInt(txtUnidades.getText())
                                                * EQUIVALENCIA_KM_PULGADAS));
                                    }
                                    case "Metros" ->
                                    {
                                        txtResultado.setText("" + (Integer.parseInt(txtUnidades.getText())
                                                * EQUIVALENCIA_KM_METROS));
                                    }
                                }
                            }
                            case "Centimetros" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Kilometros" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) * EQUIVALENCIA_CM_KM));
                                    }
                                    case "Centimetros" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());
                                    }
                                    case "Pulgadas" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(txtUnidades.getText())
                                                * EQUIVALENCIA_CM_PULGADAS));
                                    }
                                    case "Metros" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(txtUnidades.getText())
                                                * EQUIVALENCIA_CM_METROS));
                                    }
                                }
                            }
                            case "Pulgadas" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Kilometros" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) / EQUIVALENCIA_KM_PULGADAS));
                                    }
                                    case "Centimetros" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) / EQUIVALENCIA_CM_PULGADAS));
                                    }
                                    case "Pulgadas" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());

                                    }
                                    case "Metros" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(txtUnidades.getText())
                                                * EQUIVALENCIA_PULGADAS_METROS));
                                    }
                                }
                            }
                            case "Metros" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Kilometros" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) / EQUIVALENCIA_METROS_KILOMETROS));
                                    }
                                    case "Centimetros" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) * EQUIVALENCIA_METROS_CENTIMETROS));
                                    }
                                    case "Pulgadas" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) * EQUIVALENCIA_METROS_PULGADAS));

                                    }
                                    case "Metros" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());
                                    }
                                }
                            }
                        }
                    }
                    if (radioTiempo.isSelected())
                    {
                        switch (comboTransformar.getSelectedItem().toString())
                        {
                            case "Hora" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Horas" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());
                                    }
                                    case "Minutos" ->
                                    {
                                        txtResultado.setText("" + (Integer.parseInt(
                                                txtUnidades.getText()) * EQUIVALENCIA_HORA_MINUTOS));
                                    }
                                    case "Segundos" ->
                                    {
                                        txtResultado.setText("" + (Integer.parseInt(txtUnidades.getText())
                                                * EQUIVALENCIA_HORA_SEGUNDOS));
                                    }

                                }
                            }
                            case "Minutos" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Hora" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) * EQUIVALENCIA_MINUTOS_HORA));
                                    }
                                    case "Minutos" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());
                                    }
                                    case "Segundos" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(txtUnidades.getText())
                                                * EQUIVALENCIA_MINUTOS_SEGUNDOS));
                                    }

                                }
                            }
                            case "Segundos" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Hora" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) * EQUIVALENCIA_SEGUNDOS_HORA));
                                    }
                                    case "Minutos" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) * EQUIVALENCIA_SEGUNDOS_MINUTOS));
                                    }
                                    case "Segundos" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());

                                    }

                                }
                            }
                        }
                    }
                    if (radioTemperatura.isSelected())
                    {
                        switch (comboTransformar.getSelectedItem().toString())
                        {
                            case "Kelvin" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Kelvin" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());
                                    }
                                    case "Fahrenheit" ->
                                    {
                                        txtResultado.setText("" + ((Integer.parseInt(
                                                txtUnidades.getText()) - 273.15) * 9 / 5 + 32));
                                    }
                                    case "Celcius" ->
                                    {
                                        txtResultado.setText("" + (Integer.parseInt(txtUnidades.getText())
                                                - 273.15));
                                    }

                                }
                            }
                            case "Fahrenheit" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Kelvin" ->
                                    {
                                        txtResultado.setText("" + ((Double.parseDouble(
                                                txtUnidades.getText()) + 459.67) * 5 / 9));
                                    }
                                    case "Fahrenheit" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());
                                    }
                                    case "Celcius" ->
                                    {
                                        txtResultado.setText("" + ((Double.parseDouble(txtUnidades.getText())
                                                - 32)) * 5 / 9);
                                    }

                                }
                            }
                            case "Celcius" ->
                            {
                                switch (comboConvertir.getSelectedItem().toString())
                                {
                                    case "Kelvin" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) + 273.15));
                                    }
                                    case "Fahrenheit" ->
                                    {
                                        txtResultado.setText("" + (Double.parseDouble(
                                                txtUnidades.getText()) * 9 / 5 + 32));
                                    }
                                    case "Celcius" ->
                                    {
                                        txtResultado.setText(txtUnidades.getText());

                                    }

                                }
                            }
                        }
                    }
                });

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnConvertir;
    private static javax.swing.JComboBox<String> comboConvertir;
    private static javax.swing.JComboBox<String> comboTransformar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private static javax.swing.JRadioButton radioLongitud;
    private static javax.swing.JRadioButton radioTemperatura;
    private static javax.swing.JRadioButton radioTiempo;
    private static javax.swing.JTextField txtResultado;
    private static javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
