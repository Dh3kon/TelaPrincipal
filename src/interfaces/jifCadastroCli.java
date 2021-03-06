package interfaces;

import dao.Cadastro;
import java.util.Date;


public class jifCadastroCli extends javax.swing.JInternalFrame {

    private Cadastro cad = new Cadastro();
    int acao;
    int status;
    /**
     * Creates new form jifCadastroCli
     */
    public jifCadastroCli() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        btPesq = new javax.swing.JButton();
        jtData = new com.toedter.calendar.JDateChooser();
        jtRg = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEnd = new javax.swing.JTextArea();
        jrAtivo = new javax.swing.JRadioButton();
        jrInativo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Clientes");
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 305, 802, 10);
        getContentPane().add(jtCodigo);
        jtCodigo.setBounds(20, 30, 50, 20);

        jtNome.setEnabled(false);
        getContentPane().add(jtNome);
        jtNome.setBounds(110, 30, 310, 20);

        btPesq.setText("...");
        getContentPane().add(btPesq);
        btPesq.setBounds(440, 30, 45, 23);

        jtData.setEnabled(false);
        getContentPane().add(jtData);
        jtData.setBounds(540, 30, 200, 20);

        jtRg.setEnabled(false);
        getContentPane().add(jtRg);
        jtRg.setBounds(20, 90, 210, 20);

        jtCpf.setEnabled(false);
        getContentPane().add(jtCpf);
        jtCpf.setBounds(290, 90, 160, 20);

        jtTelefone.setEnabled(false);
        getContentPane().add(jtTelefone);
        jtTelefone.setBounds(530, 90, 210, 20);

        jtEnd.setColumns(20);
        jtEnd.setRows(5);
        jtEnd.setEnabled(false);
        jScrollPane1.setViewportView(jtEnd);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 620, 96);

        buttonGroup1.add(jrAtivo);
        jrAtivo.setText("Ativo");
        jrAtivo.setEnabled(false);
        getContentPane().add(jrAtivo);
        jrAtivo.setBounds(670, 170, 51, 23);

        buttonGroup1.add(jrInativo);
        jrInativo.setText("Inativo");
        jrInativo.setEnabled(false);
        getContentPane().add(jrInativo);
        jrInativo.setBounds(670, 200, 59, 23);

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 33, 14);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 27, 14);

        jLabel3.setText("Data do Cadastro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 10, 100, 14);

        jLabel4.setText("RG");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 70, 70, 14);

        jLabel5.setText("CPF");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 70, 70, 14);

        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 70, 60, 14);

        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 120, 60, 14);

        jLabel8.setText("Status");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(690, 150, 31, 14);

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo);
        jbNovo.setBounds(20, 270, 57, 23);

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        getContentPane().add(jbEditar);
        jbEditar.setBounds(230, 270, 61, 23);

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar);
        jbSalvar.setBounds(320, 270, 63, 23);

        jButton4.setText("Sair");
        getContentPane().add(jButton4);
        jButton4.setBounds(710, 340, 73, 23);

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        getContentPane().add(jbExcluir);
        jbExcluir.setBounds(400, 270, 63, 23);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(100, 270, 90, 23);

        setBounds(0, 0, 838, 414);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed

        novo();
        Date dataSistema = new Date();
        jtData.setDate(dataSistema);
        
        
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        salvar();
        cad.salvarPessoa(pes);
    }//GEN-LAST:event_jbSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesq;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JRadioButton jrAtivo;
    private javax.swing.JRadioButton jrInativo;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtCpf;
    private com.toedter.calendar.JDateChooser jtData;
    private javax.swing.JTextArea jtEnd;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtRg;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables

    public void novo() {
        
        jtNome.setEnabled(true);
        jtEnd.setEnabled(true);
        jtCpf.setEnabled(true);
        jtRg.setEnabled(true);
        jtTelefone.setEnabled(true);
        jbEditar.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbExcluir.setEnabled(true);
        jtCodigo.setEnabled(false);
        jrAtivo.setEnabled(true);
        jrInativo.setEnabled(true);
        jrAtivo.setSelected(true);
    }
    
    public void salvar() {
       
        jtNome.setEnabled(false);
        jtEnd.setEnabled(false);
        jtCpf.setEnabled(false);
        jtRg.setEnabled(false);
        jtTelefone.setEnabled(false);
        jbEditar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtCodigo.setEnabled(true);
        jrAtivo.setEnabled(false);
        jrInativo.setEnabled(false);
        jrAtivo.setSelected(false);
        
        jtNome.setText("");
        jtEnd.setText("");
        jtCpf.setText("");
        jtRg.setText("");
        jtTelefone.setText("");
        jtCodigo.setText("");
    }
}
