/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;
import conexion.conexion;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Promedios extends javax.swing.JFrame {

    conexion con=new conexion ();
    Connection conect;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idcodigo;
    
    public Promedios() {
        initComponents();
        this.setLocationRelativeTo(null);
        consulta();
    }

    public void consulta(){
        String sql = "select * from notas";
        try{
            conect = con.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] datos = new Object[10];
            modelo = (DefaultTableModel) Table.getModel();
            while (rs.next()) {
               datos[0] = rs.getInt("Id");
               datos[1] = rs.getDate("fecha");
               datos[2] = rs.getString("nombre");
               datos[3] = rs.getString("apellido");
               datos[4] = rs.getString("grado");
               datos[5] = rs.getString("nivel");
               datos[6] = rs.getDouble("primernota");
               datos[7] = rs.getDouble("segundanota");
               datos[8] = rs.getDouble("tercernota");
               datos[9] = rs.getDouble("notafinal");
               modelo.addRow(datos);
            }
            Table.setModel(modelo);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgrado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpromedio = new javax.swing.JTextField();
        txtnota3 = new javax.swing.JTextField();
        txtapellido1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid1 = new javax.swing.JTextField();
        txtnombre1 = new javax.swing.JTextField();
        txtnota2 = new javax.swing.JTextField();
        txtnota1 = new javax.swing.JTextField();
        txtnombrenotas = new javax.swing.JTextField();
        txtnotamenor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        cbonivel = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        rbescuela = new javax.swing.JRadioButton();
        rbcolegio = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtnotamayor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnconsulta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Promedio de Notas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Primer Nota");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        txtpromedio.setEditable(false);
        txtpromedio.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Segunda Nota");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText(" Promedio");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tercer Nota");

        txtid1.setEditable(false);
        txtid1.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Nombre Nota Mayor");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nota Mayor");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Fecha");

        date.setDateFormatString("yyyy/MM/dd");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Grado");

        cbonivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Nivel");

        bgrado.add(rbescuela);
        rbescuela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbescuela.setText("Escuela");
        rbescuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbescuelaActionPerformed(evt);
            }
        });

        bgrado.add(rbcolegio);
        rbcolegio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbcolegio.setText("Colegio");
        rbcolegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcolegioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Nota Menor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtnotamenor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                        .addComponent(txtnombrenotas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnota3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(50, 50, 50))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(49, 49, 49))
                                            .addComponent(txtnotamayor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbescuela, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbcolegio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbonivel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtapellido1))
                                .addGap(24, 24, 24)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnota3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbonivel)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbescuela)
                            .addComponent(rbcolegio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombrenotas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnotamayor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnotamenor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRUD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        btnagregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnagregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOSEP\\OneDrive\\Documentos\\NetBeansProjects\\PromedioNotas\\src\\main\\java\\Login\\imagenes\\agregar-contacto.png")); // NOI18N
        btnagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregarMouseClicked(evt);
            }
        });
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnlimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnconsulta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnconsulta.setText("Consulta");
        btnconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla De Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Nombre", "Apellido", "Grado", "Nivel", "Primer Nota", "Segunda Nota", "Tercer Nota", "Promedio"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbescuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbescuelaActionPerformed
        if (rbescuela.isSelected()) {
            cbonivel.removeAllItems();
            cbonivel.addItem("Seleccione:");
            cbonivel.addItem("Primero");
            cbonivel.addItem("Segundo");
            cbonivel.addItem("Tercero");
            cbonivel.addItem("Cuarto");
            cbonivel.addItem("Quinto");
            cbonivel.addItem("Sexto");
        }else{
            
        }
    }//GEN-LAST:event_rbescuelaActionPerformed

    private void rbcolegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcolegioActionPerformed
       if (rbcolegio.isSelected()) {
            cbonivel.removeAllItems();
            cbonivel.addItem("Seleccione:");
            cbonivel.addItem("Setimo");
            cbonivel.addItem("Octavo");
            cbonivel.addItem("Noveno");
            cbonivel.addItem("Decimo");
            cbonivel.addItem("Undecimo");
        }else{
            
        }  
    }//GEN-LAST:event_rbcolegioActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
     agregar();       
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarMouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
       int fila = Table.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila ");
        } else {
            idcodigo = Integer.parseInt(Table.getValueAt(fila, 0).toString());
            String fecha = Table.getValueAt(fila, 1).toString();
            String nombre = Table.getValueAt(fila, 2).toString();
            String apellido = Table.getValueAt(fila, 3).toString();
            String grado = Table.getValueAt(fila, 4).toString();
            String nivel = Table.getValueAt(fila, 5).toString();
            double nota1 = Double.parseDouble((String) Table.getValueAt(fila, 6).toString());
            double nota2 = Double.parseDouble((String) Table.getValueAt(fila, 7).toString());
            double nota3 = Double.parseDouble((String) Table.getValueAt(fila, 8).toString());
            double notafinal = Double.parseDouble((String) Table.getValueAt(fila, 9).toString());
            java.util.Date fecha2;
            try {
                fecha2 = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                date.setDate(fecha2);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Revisar error ");
            }
            txtnombre1.setText(nombre);
            txtapellido1.setText(apellido);
            if (nivel.equals("Escuela")) {
                rbescuela.setSelected(true);
                cbonivel.removeAllItems();
                cbonivel.addItem("Seleccione:");
                cbonivel.addItem("Primero");
                cbonivel.addItem("Segundo");
                cbonivel.addItem("Tercero");
                cbonivel.addItem("Cuarto");
                cbonivel.addItem("Quinto");
                cbonivel.addItem("Sexto");
                cbonivel.setSelectedItem(grado);
            } else if (nivel.equals("Colegio")) {
                rbcolegio.setSelected(true);
                cbonivel.removeAllItems();
                cbonivel.addItem("Seleccione:");
                cbonivel.addItem("Setimo");
                cbonivel.addItem("Octavo");
                cbonivel.addItem("Noveno");
                cbonivel.addItem("Decimo");
                cbonivel.addItem("Undecimo");
                cbonivel.addItem("Duodecimo");
                cbonivel.setSelectedItem(grado);
            }
            txtnota1.setText("" + nota1);
            txtnota2.setText("" + nota2);
            txtnota3.setText("" + nota3);
            txtpromedio.setText(" " + notafinal);
        }                                
 
    
    }//GEN-LAST:event_TableMouseClicked

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
       Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       System.exit(0);        
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        Modificar();
        consulta();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaActionPerformed

       String nombreEstudiante = txtnombrenotas.getText().trim();
    
    try {
        String sql = "SELECT nombre, MAX(GREATEST(primernota, segundanota, tercernota)) AS notaMayor, MIN(LEAST(primernota, segundanota, tercernota)) AS notaMenor FROM notas WHERE nombre = ? GROUP BY nombre";
        PreparedStatement ps = conect.prepareStatement(sql);
        ps.setString(1, nombreEstudiante);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            double notaMayor = rs.getDouble("notaMayor");
            double notaMenor = rs.getDouble("notaMenor");
            txtnotamayor.setText(String.valueOf(notaMayor));
            txtnotamenor.setText(String.valueOf(notaMenor));
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron notas para el estudiante " + nombreEstudiante);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar las notas: " + e.getMessage());
    }
    }//GEN-LAST:event_btnconsultaActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       Eliminar();
    }//GEN-LAST:event_btneliminarActionPerformed

    void agregar() {
    DecimalFormat df = new DecimalFormat("#.##");
    String nivel = "";
    String nombre = txtnombre1.getText();
    String apellido = txtapellido1.getText();
    String grado = cbonivel.getSelectedItem().toString();
    String fecha = ((JTextField) date.getDateEditor().getUiComponent()).getText();
    
    if (rbescuela.isSelected()) {
        nivel = "Escuela";
    } else if (rbcolegio.isSelected()) {
        nivel = "Colegio";
    }
    
    Double nota1 = Double.valueOf(txtnota1.getText());
    Double nota2 = Double.valueOf(txtnota2.getText());
    Double nota3 = Double.valueOf(txtnota3.getText());
    double promedio = (nota1 + nota2 + nota3) / 3;
    
    try {
        if (nombre.isEmpty() || apellido.isEmpty() || grado.equals("Seleccione:") || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        } else {
            String sql = "INSERT INTO notas(fecha, nombre, apellido, grado, nivel, primernota, segundanota, tercernota, notafinal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setString(1, fecha);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, grado);
            ps.setString(5, nivel);
            ps.setDouble(6, nota1);
            ps.setDouble(7, nota2);
            ps.setDouble(8, nota3);
            ps.setString(9, df.format(promedio));
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Los datos se registraron correctamente.");
                limpiarTabla();
                consulta(); // Actualizar la tabla después de agregar datos
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar los datos.");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
    
    void limpiarTabla() {
    int rowCount = modelo.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }
}
    
   void Limpiar(){
       date.setCalendar(null);
       txtnombre1.setText("");
       txtapellido1.setText("");
       txtnota1.setText("");
       txtnota2.setText("");
       txtnota3.setText("");
       txtpromedio.setText("");
       cbonivel.setSelectedIndex(0);
       bgrado.clearSelection();
       txtnombrenotas.setText("");
       txtnotamenor.setText("");
       txtnotamayor.setText("");
   }
   
   void Modificar(){
       int fila = Table.getSelectedRow();
       int id = Integer.parseInt(Table.getValueAt(fila, 0).toString());
       String nivel = "";
       String nombre = txtnombre1.getText();
       String apellido = txtapellido1.getText();
       String grado = cbonivel.getSelectedItem().toString();
       String fecha = ((JTextField)date.getDateEditor().getUiComponent()).getText();
       if(rbescuela.isSelected()) {
           nivel = "Escuela";
       }else {
           if(rbcolegio.isSelected()) {
               nivel = "Colegio";
           } 
       }
       Double nota1 = Double.parseDouble(txtnota1.getText());
       Double nota2 = Double.parseDouble(txtnota2.getText());
       Double nota3 = Double.parseDouble(txtnota3.getText());
       DecimalFormat df = new DecimalFormat("###.##");
       double promedio = (nota1 + nota2 + nota3) / 3;
       try{
           if (nombre.equals("") || apellido.equals("") || nota1.equals("") || nota2.equals("") || nota3.equals("") || cbonivel.equals("Seleccione:")) {
                JOptionPane.showMessageDialog(null, "Revisar los datos que ingreso");
            }else {
              String sql ="UPDATE notas SET Id='" + id + "',fecha='" + fecha + "',nombre='" + nombre + "',apellido='" + apellido + "',grado='" + grado + "',nivel='" + nivel + "',primernota='" + nota1 + "',segundanota='" + nota2 + "',tercernota='" + nota3 + "',notafinal='" + df.format(promedio) + "' WHERE Id='" + id + "'";
               conect = con.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Los datos se modificaron correctamente");
                txtpromedio.setText(""+df.format(promedio));
                limpiarTabla();
           }
       }catch(Exception e) {
           
       }
   }
   
   void Eliminar() {
    int fila = Table.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione una fila.");
        return;
    }
    
    int id = Integer.parseInt(Table.getValueAt(fila, 0).toString());
    
    try {
        String sql = "DELETE FROM notas WHERE id = ?";
        PreparedStatement ps = conect.prepareStatement(sql);
        ps.setInt(1, id);
        
        int rowsAffected = ps.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente.");
            limpiarTabla();
            consulta(); // Actualizar la tabla después de eliminar datos
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
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
            java.util.logging.Logger.getLogger(Promedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promedios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.ButtonGroup bgrado;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnconsulta;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbonivel;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbcolegio;
    private javax.swing.JRadioButton rbescuela;
    private javax.swing.JTextField txtapellido1;
    private javax.swing.JTextField txtid1;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnombrenotas;
    private javax.swing.JTextField txtnota1;
    private javax.swing.JTextField txtnota2;
    private javax.swing.JTextField txtnota3;
    private javax.swing.JTextField txtnotamayor;
    private javax.swing.JTextField txtnotamenor;
    private javax.swing.JTextField txtpromedio;
    // End of variables declaration//GEN-END:variables
}
