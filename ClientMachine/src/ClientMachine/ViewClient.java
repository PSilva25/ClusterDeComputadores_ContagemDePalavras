package ClientMachine;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ViewClient extends javax.swing.JFrame {

    int cont = 0;
    String filename;
    File envia = new File("Envia.txt");
    public static ArrayList<String> aux = new ArrayList<>();
    ArrayList<String> bandas = new ArrayList<>();

    public ViewClient() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        textArquivo = new javax.swing.JTextField();
        bProcurar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textPalavraChave = new javax.swing.JTextField();
        bIniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        ColarTexto = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollBar3 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaResultado = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client Machine");
        setName("ClientMachine"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contador de palavras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        textArquivo.setEditable(false);
        textArquivo.setForeground(new java.awt.Color(0, 0, 0));
        textArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textArquivoActionPerformed(evt);
            }
        });

        bProcurar.setBackground(new java.awt.Color(0, 51, 51));
        bProcurar.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        bProcurar.setForeground(new java.awt.Color(255, 255, 255));
        bProcurar.setText("Procurar");
        bProcurar.setBorder(new javax.swing.border.MatteBorder(null));
        bProcurar.setFocusPainted(false);
        bProcurar.setFocusable(false);
        bProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProcurarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel4.setText("Palavras-chave:");

        textPalavraChave.setForeground(new java.awt.Color(0, 0, 0));

        bIniciar.setBackground(new java.awt.Color(0, 153, 0));
        bIniciar.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        bIniciar.setForeground(new java.awt.Color(255, 255, 255));
        bIniciar.setText("Iniciar");
        bIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bIniciarMouseClicked(evt);
            }
        });
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });

        ColarTexto.setEditable(false);
        ColarTexto.setColumns(20);
        ColarTexto.setForeground(new java.awt.Color(0, 0, 0));
        ColarTexto.setRows(5);
        ColarTexto.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(ColarTexto);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Colar Texto");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Arquivo");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(28, 28, 28)
                                .addComponent(textArquivo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jRadioButton1)
                    .addComponent(jScrollBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        AreaResultado.setEditable(false);
        AreaResultado.setColumns(20);
        AreaResultado.setForeground(new java.awt.Color(0, 0, 0));
        AreaResultado.setRows(5);
        AreaResultado.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(AreaResultado);
        AreaResultado.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProcurarActionPerformed
        if (jRadioButton2.isSelected()) {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);

            File f = chooser.getSelectedFile();
            filename = f.getAbsolutePath();

            textArquivo.setText(filename);
            ler(filename);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a opção de envio!");
        }
    }//GEN-LAST:event_bProcurarActionPerformed

    private void textArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textArquivoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void bIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bIniciarMouseClicked
        start = System.currentTimeMillis();
        String palavras = textPalavraChave.getText();
        if (palavras == null || palavras.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira as palavras chaves!");
        } else {
            if (jRadioButton1.isSelected()) {
                String campo = ColarTexto.getText();
                String[] linhas = campo.split("\n");

                if (campo == null || campo.trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Insira as palavras no campo de texto!");
                } else {
                    if (envia.isFile()) {
                        envia.delete();
                    }
                    for (int x = 0; x < linhas.length; x++) {
                        try {
                            Salvar(linhas[x]);
                            envia.delete();
                        } catch (IOException ex) {
                            Logger.getLogger(ViewClient.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        String palChave = ler("Enviar.txt");
                        try {
                            mandarTexto(palChave);
                        } catch (IOException ex) {
                            Logger.getLogger(ViewClient.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

            } else if (jRadioButton2.isSelected()) {
                String palChave = ler(filename);
                try {
                    mandarTexto(palChave);
                } catch (IOException ex) {
                    Logger.getLogger(ViewClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma opção!");
            }
        }
    }//GEN-LAST:event_bIniciarMouseClicked

//    public static void receberResultado() throws IOException {
//        System.out.println("Receber Resultado");
//        String valores = "";
//        ServerSocket ss = new ServerSocket(5001);
//        Socket s = ss.accept();
//        while (true) {
//            s = ss.accept();
//            Scanner leitor = new Scanner(s.getInputStream());
//            while (leitor.hasNext()) {
//                valores = leitor.nextLine();
//                System.out.println(valores);
//                
//            }
//            AreaResultado.append(valores + "\n");
//           
//        }
//    }
    public void mandarTexto(String Texto) throws IOException {
        Socket socket = null;
        String host = "127.0.0.1";
        socket = new Socket(host, 8081);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF(textPalavraChave.getText().replaceAll(",", "+") + "+\n" + Texto);

        System.out.println("client: waiting...");

        output.close();
        socket.close();
    }

    private String ler(String filename) {
        String carrega = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String linha = reader.readLine();

            while (linha != null) {
                bandas.add(linha);
                carrega += linha + "\n";
                linha = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carrega;
    }

    private void Salvar(String msg) throws IOException {
        try (FileWriter fw = new FileWriter(envia, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {

            out.println(msg);
            out.close();
        }
    }

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        ColarTexto.setEditable(true);
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        ColarTexto.setEditable(false);
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {

        final Thread t1 = new Thread("SEGUNDA Thread") {
            public @Override
            void run() {
                new ViewClient().setVisible(true);
            }
        };

        final Thread t2 = new Thread("SEGUNDA Thread") {
            public @Override
            void run() {
                try {
                    System.out.println("Receber Resultado");
                    String valores = "";
                    ServerSocket ss = new ServerSocket(5001);
                    Socket s = ss.accept();
                    while (true) {
                        s = ss.accept();
                        Scanner leitor = new Scanner(s.getInputStream());
                        while (leitor.hasNext()) {
                            valores = leitor.nextLine();
                            System.out.println(valores);
                        }

                        String[] d = valores.split("\\*");

                        for (int i = 0; i < d.length; i++) {
                            AreaResultado.append(d[i].trim() + "\n");
                        }
                        finish = System.currentTimeMillis();
                        total = finish - start;
                        AreaResultado.append("\nTempo de execução (ms): " + total);
                    }

                } catch (IOException ex) {
                    Logger.getLogger(ViewClient.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        t1.start();
        t2.start();
    }
    
    static long seg;
    static long start;
    static long finish;
    static long total;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea AreaResultado;
    private javax.swing.JTextArea ColarTexto;
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bProcurar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField textArquivo;
    private static javax.swing.JTextField textPalavraChave;
    // End of variables declaration//GEN-END:variables
}
