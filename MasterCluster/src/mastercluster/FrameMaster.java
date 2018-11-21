package mastercluster;

import java.awt.Color;
import java.awt.Component;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author raahp
 */
public class FrameMaster extends javax.swing.JFrame {

    public FrameMaster() throws UnknownHostException, IOException {
        initComponents();
        PreencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotaoAdd = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        IPMaster = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Cluster");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        BotaoAdd.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAdd.setText("Adicionar");
        BotaoAdd.setBackground(Color.green);
        BotaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAddActionPerformed(evt);
            }
        });

        BotaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.setToolTipText("");
        BotaoExcluir.setBackground(Color.red);
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Dispositivos");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Novo IP:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atualizar Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoAdd)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        IPMaster.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        IPMaster.setText("IP Master: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("" + ip.getHostAddress());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IPMaster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IPMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BotaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAddActionPerformed
        try {
            String ip = jTextField1.getText();
            String[] blind = ip.split("\\.");
            int v = 0;

            System.out.println(blind.length);
            if (blind.length != 4) {
                JOptionPane.showMessageDialog(null, "IP invalido!");
            } else if (ip == null || ip.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Insira o IP no campo!");
            } else {
                for (int i = 0; i < com.size(); i++) {
                    if (ip.equals(com.get(i).getIP())) {
                        JOptionPane.showMessageDialog(null, "IP já existente!");
                        v++;
                    }
                }
                if (v == 0) {
                    Salvar(ip);
                    jTextField1.setText("");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameMaster.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAddActionPerformed


    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Deseja excluir esse componente?");
        if (op == 0) {
            int selecionados[] = jTable1.getSelectedRows();
            if (selecionados.length > 0) {
                ArrayList<Componentes> bean = new ArrayList<>();
                for (int i = 0; i < selecionados.length; i++) {
                    selecionados[i] = jTable1.convertRowIndexToModel(selecionados[i]);
                    bean.add(modeloTable.getComponentes(selecionados[i]));
                }
                for (Componentes p : bean) {
                    com = modeloTable.excluir(p);
                }
                try {
                    Update(com);
                } catch (IOException ex) {
                    Logger.getLogger(FrameMaster.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a linha a ser excluida.");
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            PreencherTabela();
        } catch (IOException ex) {
            Logger.getLogger(FrameMaster.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PreencherTabela() throws IOException {
        nº = 0;
        com = new ArrayList<Componentes>();
        if (save.exists() == false) {
            save.createNewFile();
        }

        FileReader reader = new FileReader(save);
        BufferedReader input = new BufferedReader(reader);

        String linha = input.readLine();

        while (linha != null) {
            c = new Componentes();
            nº++;
            c.setID(nº);
            c.setIP(linha);
            if (runPing(c.getIP())) {
                c.setEstado("Ativado");
            } else {
                c.setEstado("Desativado");
            }
            com.add(c);
            linha = input.readLine();
        }
        CriarTabela();
        CorNaLinha();
    }

    private void CriarTabela() {
        modeloTable = new ConfigTabela(com);
        modeloTable.ordenarPorStatus();
        jTable1.setModel(modeloTable);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(26);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(235);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(235);

        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void server() throws IOException {
        ServerSocket ss = new ServerSocket(port);
        String mensagem;
        Socket s = ss.accept();

        DataInputStream dos = new DataInputStream(s.getInputStream());

        while (true) {
            if (dos.available() > 0) {
                mensagem = dos.readUTF();
                System.out.println("Chegou: " + mensagem);

                ReceberString(mensagem + "\n");
                break;
            }
        }
        ler();
        mandarTexto();
    }

    public static boolean runPing(String ipstr) throws IOException {
        boolean retv = false;

        try {
            InputStream ins = Runtime.getRuntime().exec("ping -n 1 -w 500 " + ipstr).getInputStream();
            Thread.sleep(500);
            byte[] prsbuf = new byte[ins.available()];
            ins.read(prsbuf);
            String parsstr = new StringTokenizer(new String(prsbuf), "%").nextToken().trim();

            if (!parsstr.endsWith("100")) {
                retv = true;
            }

        } catch (Exception e) {
            retv = false;
        }

        return retv;

    }

    private static void ler() {
        String carrega = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("Temp.txt"))) {
            keyWord = reader.readLine();
            String linha = reader.readLine();

            while (linha != null) {
                carrega = linha + "\n";
                bandas.add(carrega);
                linha = reader.readLine();

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrameMaster.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(FrameMaster.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Salvar(String msg) throws IOException {
        try (FileWriter fw = new FileWriter(save, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {

            out.println(msg);
            out.close();

            PreencherTabela();
        }
    }

    private void Update(ArrayList<Componentes> x) throws IOException {
        try (FileWriter fw = new FileWriter(save, false);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {

            for (Componentes c : x) {
                out.println(c.getIP());
            }
            out.close();
            PreencherTabela();
        }
    }

    public static void mandarTexto() throws IOException {

        for (int x = 0; x < com.size(); x++) {
            if (com.get(x).getEstado().equals("Ativado")) {
                aux.add(com.get(x).getIP());
            }
        }

        System.out.println("Aux: " + aux.size() + "\tBanda: " + bandas.size());

        int cont3 = 0;

        int sobra = (bandas.size() % aux.size());
        if (sobra != 0) {
            for (int d = 0; d < sobra; d++) {
                bandas.add("0");
            }
        }

        int divisao = ((bandas.size() / aux.size()));

        for (int i = 0; i < aux.size(); i++) {
            String msg = "";
            String novo = "Novo" + i + ".txt";
            for (int x = 0; x < divisao; x++) {
                if (i == 0) {
                    msg = bandas.get(x);
                    novo = "Novo" + i + ".txt";
                    salvarTXT(msg, novo);
                } else {
                    msg = bandas.get(cont3);
                    novo = "Novo" + i + ".txt";
                    salvarTXT(msg, novo);
                }
                cont3 = cont3 + 1;
            }
        }

        for (int z = 0; z < aux.size(); z++) {
            String msg = keyWord;
            String novo = "Novo" + z + ".txt";
            salvarTXT(msg, novo);

            File f = new File("Novo" + z + ".txt");
            FileInputStream in = new FileInputStream(f);
            Socket socket = new Socket(aux.get(z), 7101);
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out);
            BufferedWriter writer = new BufferedWriter(osw);
            writer.flush();
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

            writer.close();
            osw.close();
            out.close();
            in.close();
            f.delete();
        }
    }

    public static void salvarTXT(String msg, String novo) throws IOException {
        try (FileWriter fw = new FileWriter(novo, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {

            out.println(msg);
            out.close();
        }
    }

    public static void ReceberString(String string) throws IOException {
        File file = new File("Temp.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        String[] stringSeparada;
        stringSeparada = string.split("\n");

        int c = stringSeparada.length;

        try {
            try (PrintWriter pW = new PrintWriter(file)) {
                for (int i = 0; i < c; i++) {
                    pW.println(stringSeparada[i] + "\n");

                }
            }
        } catch (Exception e) {
        }
    }

    private void CorNaLinha() {
        jTable1.setDefaultRenderer(Object.class,
                 new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                Color c = Color.WHITE;
                Object texto = jTable1.getValueAt(row, 2);
                if (texto != null && "Desativado".equals(texto.toString())) {
                    c = Color.RED;
                    setForeground(c);
                }
                if (texto != null && "Ativado".equals(texto.toString())) {
                    c = Color.GREEN;
                    setForeground(c);
                }
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });
    }

    private static void Concatenar(String valores) throws IOException {
        String tudo[] = valores.split("\\*");
        String[] chave = keyWord.split("\\+");
        int[] quantidade_chave = new int[chave.length];

        for (String tudo1 : tudo) {
            String[] d = tudo1.split("\\*");
            for (int ac = 0; ac < d.length; ac++) {
                d[ac] = d[ac].trim();
            }
            for (String d1 : d) {
                String[] aux = d1.split(" - ");
                for (int i3 = 0; i3 < chave.length; i3++) {
                    if ((aux[0].trim()).equals(chave[i3].trim())) {
                        quantidade_chave[i3] = quantidade_chave[i3] + Integer.parseInt(aux[1].trim());
                    }
                }
            }
        }

        String campo = "";
        System.out.println(chave.length);
        for (int i = 0; i < chave.length; i++) {
            campo = campo + chave[i] + " = " + quantidade_chave[i] + " * ";
        }

        System.out.println("olha ai: " + campo);
        mandarResultado(campo);

    }

    public static void mandarResultado(String Texto) throws IOException {
        String host = "127.0.0.1";
        Socket socket = new Socket(host, 5001);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF(Texto);
        output.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {

        final Thread t1 = new Thread("PRIMEIRA Thread") {
            public @Override
            void run() {
                ServerSocket ss = null;
                Socket s = null;
                try {
                    String valores = "";
                    ss = new ServerSocket(7001);

                    int x = 0;
                    while (true) {
                        s = ss.accept();
                        Scanner leitor = new Scanner(s.getInputStream());
                        while (leitor.hasNext()) {
                            valores += leitor.nextLine();
                            System.out.println(valores);
                        }
                        if (x == aux.size() - 1) {
                            Concatenar(valores);
                        }
                        x++;

                    }

                } catch (IOException ex) {
                    Logger.getLogger(FrameMaster.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        final Thread t2 = new Thread("SEGUNDA Thread") {
            public @Override
            void run() {
                try {
                    new FrameMaster().setVisible(true);
                    server();
                    mandarResultado(keyWord);

                } catch (IOException ex) {
                    Logger.getLogger(FrameMaster.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        t2.start();
        t1.start();
    }

    public static void waitOneSec(int count) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        System.out.println((count + 1) + " segundo passado na " + Thread.currentThread().getName());
    }

    // Variaveis globais
    static int port = 8081;
    static String keyWord = "";
    static int cont = 0;
    public static ArrayList<String> aux = new ArrayList<>();
    static ArrayList<String> bandas = new ArrayList<>();
    static int nº;
    Componentes c = new Componentes();
    InetAddress ip = InetAddress.getLocalHost();
    File save = new File("Componentes.txt");
    File temp = new File("Temp.txt");
    static ArrayList<Componentes> com;
    static ConfigTabela modeloTable;
    static Criptografia criptografia = new Criptografia("lv39eptlvuhaqqsr");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdd;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JLabel IPMaster;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
