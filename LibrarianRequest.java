package coulibrary.project;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class LibrarianRequest extends javax.swing.JFrame {

    Toolkit screen = Toolkit.getDefaultToolkit();
    Dimension d;
    DerbyConnection connect;
    String query = "SELECT * FROM requested";
    Employee employee;
    int i = 0;
    String column_name[] = {"Name", "Department", "Gender", "Address", "Phone", "E-mail", "Date of Birth", "User Name"};
    String student_column_name[] = {"Student ID", "Name", "Date Of Birth", "Gender",
        "Departmeent", "Address", "Phone", "E-mail"};
    Object data[][] = new Object[100][100];
    ResultSet employees;
    TableModel table;
    AdminFrame admin = new AdminFrame();
    ConfirmStudent confirm = new ConfirmStudent();

    public LibrarianRequest() {

        initComponents();

        ImageIcon icon = new ImageIcon(getClass().getResource("/coulibrary/project/images/Library-icon.png"));
        Image img = icon.getImage();
        super.setIconImage(img);
//        addButton.setEnabled(false);
//        editButton.setEnabled(false);
//        viewButton.setEnabled(false);
//        deleteButton.setEnabled(false);
//        searchButton.setEnabled(false);

        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.setShowGrid(true);

        jMenu1.setBorderPainted(true);
        jMenu3.setBorderPainted(true);
        jMenu4.setBorderPainted(true);
        jMenu5.setBorderPainted(true);
        jMenu7.setBorderPainted(true);
        jMenu8.setBorderPainted(true);
        librarianMenu.setBorderPainted(true);
        try {

            super.setTitle("Library Management System");

            d = screen.getScreenSize();
            super.setSize(d);
            connect = new DerbyConnection();
//        } catch (Exception ex) {
//            System.out.println(ex);
//            JOptionPane.showMessageDialog(LibrarianRequest.this, ex.getMessage());
//        }
            jTable1.setRowHeight(1, 20);
//        
//         try {
            addButton.setEnabled(true);
            editButton.setEnabled(true);
            deleteButton.setEnabled(true);
            searchButton.setEnabled(true);

            DefaultTableModel tablemodel = new DefaultTableModel(column_name, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            connect.statement = connect.connection.createStatement();
            employees = connect.statement.executeQuery("SELECT * FROM requested");
            while (employees.next()) {
                password = employees.getString(8);
                tablemodel.addRow(new Object[]{employees.getString(1), employees.getString(4),
                    employees.getString(3), employees.getString(5), employees.getString(6), employees.getString(7),
                    employees.getString(2), employees.getString(8)});
                jTable1.setModel(tablemodel);
                repaint();
            }

            jTable1.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent me) {
                    JTable table = (JTable) me.getSource();
                    if (me.getClickCount() == 2) {
                        Point p = me.getPoint();
                        int row = table.rowAtPoint(p);
                        name = (String) jTable1.getModel().getValueAt(row, 0);
                        dept = (String) jTable1.getModel().getValueAt(row, 1);
                        sex = (String) jTable1.getModel().getValueAt(row, 2);
                        address = (String) jTable1.getModel().getValueAt(row, 3);
                        phone = (String) jTable1.getModel().getValueAt(row, 4);
                        email = (String) jTable1.getModel().getValueAt(row, 5);
                        dob = (String) jTable1.getModel().getValueAt(row, 6);
                        user_name = (String) jTable1.getModel().getValueAt(row, 7);
                        confirm.setVisible(rootPaneCheckingEnabled);
                        confirm.setValue(name, dept, sex, address, phone, email, dob, user_name, password);
                    }
                }
            });

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(LibrarianRequest.this, "Communications link failure! Check your database connecttion.");
        }
    }

    public void employMethod() {

    }

//    public void studentMethod() {
//        
//        try {
//            addButton.setEnabled(true);
//            editButton.setEnabled(true);
//            deleteButton.setEnabled(true);
//            searchButton.setEnabled(true);
//            
//            DefaultTableModel tablemodel = new DefaultTableModel(student_column_name, 0) {
//                @Override
//                public boolean isCellEditable(int row, int column) {
//                    return false;
//                }
//            };
//            connect.statement = connect.connection.createStatement();
//            employees = connect.statement.executeQuery("SELECT * FROM student");
//            while (employees.next()) {
//                id = employees.getString(1);
//                name = employees.getString(2);
//                dob = employees.getString(3);
//                sex = employees.getString(4);
//                dept = employees.getString(5);
//                address = employees.getString(6);
//                phone = employees.getString(7);
//                email = employees.getString(8);
//                
//                employee = new Employee(id, name, sex, address, phone, email);
//                data[i][0] = employee.getId();
//                data[i][1] = employee.getName();
//                data[i][2] = dob;
//                data[i][3] = employee.getSex();
//                data[i][4] = dept;
//                data[i][5] = employee.getAddress();
//                data[i][6] = employee.getPhone();
//                data[i][7] = employee.getEmail();
//                tablemodel.addRow(new Object[]{employees.getString(1), data[i][1], data[i][2], data[i][3], data[i][4],
//                    data[i][5], data[i][6], data[i][7]});
//                i++;
//                jTable1.setModel(tablemodel);
//                repaint();
//            }
//            
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(ManageMent.this, "Communications link failure! Check your database connecttion.");
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jButton9 = new javax.swing.JButton();
        employeeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        onlineLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        librarianMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(102, 102, 102));
        jInternalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "         Student Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jInternalFrame1.setForeground(new java.awt.Color(153, 153, 153));
        jInternalFrame1.setVisible(true);

        jButton3.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/books-icon-512.png"))); // NOI18N
        jButton3.setText("Book");
        jButton3.setAlignmentY(0.0F);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setIconTextGap(20);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/student.png"))); // NOI18N
        jButton4.setText("Student");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jInternalFrame1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4});

        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(28, 28, 28))
        );

        jInternalFrame1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4});

        jInternalFrame2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "          Admin Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jInternalFrame2.setVisible(true);

        jButton9.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/borrow.png"))); // NOI18N
        jButton9.setText("Borrow");
        jButton9.setIconTextGap(15);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        employeeButton.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        employeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/employee.png"))); // NOI18N
        employeeButton.setText("Librarian");
        employeeButton.setAlignmentY(0.0F);
        employeeButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        employeeButton.setIconTextGap(15);
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(employeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton9)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jInternalFrame2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {employeeButton, jButton9});

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel1.setText("Employee ID:");

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel2.setText("Employee Name:");

        addButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/plus.png"))); // NOI18N
        addButton.setText("Add");
        addButton.setFocusable(false);
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/pencil.png"))); // NOI18N
        editButton.setText("Edit");
        editButton.setFocusable(false);
        editButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/Sign-Info-icon.png"))); // NOI18N
        viewButton.setText("View");
        viewButton.setFocusable(false);
        viewButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/Delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setFocusable(false);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Name", "Gender", "Address", "Phone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(0, 51, 255));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jTable1.setMinimumSize(new java.awt.Dimension(60, 64));
        jTable1.setPreferredSize(new java.awt.Dimension(300, 64));
        jTable1.setRowHeight(20);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        onlineLabel.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setAlignmentX(1.5F);
        jMenuBar1.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(400, 40));

        librarianMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        librarianMenu.setMnemonic('e');
        librarianMenu.setText("          Librarian          ");
        librarianMenu.setToolTipText("Manage Employee");
        librarianMenu.setAlignmentX(2.0F);
        librarianMenu.setFocusPainted(true);
        librarianMenu.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        librarianMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianMenuActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Add");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        librarianMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Edit");
        librarianMenu.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Delete");
        librarianMenu.add(jMenuItem3);

        jMenuBar1.add(librarianMenu);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setMnemonic('b');
        jMenu3.setText("          Book          ");
        jMenu3.setAlignmentX(2.0F);
        jMenu3.setFocusPainted(true);
        jMenu3.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu3.setIconTextGap(10);
        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setMnemonic('s');
        jMenu4.setText("          Subject          ");
        jMenu4.setAlignmentX(2.0F);
        jMenu4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu4.setIconTextGap(15);
        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setMnemonic('w');
        jMenu5.setText("          Borrow          ");
        jMenu5.setAlignmentX(2.0F);
        jMenu5.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu5.setIconTextGap(15);
        jMenuBar1.add(jMenu5);

        jMenu7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu7.setMnemonic('h');
        jMenu7.setText("          Help          ");
        jMenu7.setToolTipText("");
        jMenu7.setAlignmentX(2.0F);
        jMenu7.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu7.setIconTextGap(15);
        jMenuBar1.add(jMenu7);

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setMnemonic('s');
        jMenu1.setText("          Sign In          ");
        jMenu1.setToolTipText("");
        jMenu1.setAlignmentX(2.0F);
        jMenu1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu1.setIconTextGap(15);
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu8.setText("          About Us          ");
        jMenu8.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(idField)))
                    .addComponent(jScrollPane1))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addComponent(onlineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, deleteButton, editButton, searchButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idField, nameField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(183, 183, 183)
                .addComponent(onlineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, deleteButton, editButton, searchButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idField, nameField});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed

        addPerform = "librarian";
        employMethod();
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        if (admin.setValue == 1) {
            if (addPerform.equals("librarian")) {
                new addEmployee().setVisible(true);
            } else {
                new AddStudent().setVisible(true);

            }
        } else {
            JOptionPane.showMessageDialog(LibrarianRequest.this, "Please login first as an admin!");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        if (admin.setValue == 1) {
            try {
                int row = jTable1.getSelectedRow();
                data[row][0] = jTable1.getModel().getValueAt(row, 0);
                data[row][1] = jTable1.getModel().getValueAt(row, 1);
                data[row][2] = jTable1.getModel().getValueAt(row, 2);
                data[row][3] = jTable1.getModel().getValueAt(row, 3);
                data[row][4] = jTable1.getModel().getValueAt(row, 4);
                data[row][5] = jTable1.getModel().getValueAt(row, 5);
                editEmployee edit = new editEmployee();
                edit.setVisible(true);
                edit.employeeDetails(data[row][0], data[row][1].toString(), data[row][2].toString(),
                        data[row][3].toString(), data[row][4].toString(), data[row][5].toString());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(LibrarianRequest.this, "You must select a row.");
            }
        } else {
            JOptionPane.showMessageDialog(LibrarianRequest.this, "Please login first as an admin!");
        }

    }//GEN-LAST:event_editButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        if (admin.setValue == 1) {
            try {
                int row = jTable1.getSelectedRow();
                //String serial_id=jTable1.get
                data[row][0] = jTable1.getModel().getValueAt(row, 0);
                connect.statement.execute("DELETE FROM employee WHERE serial=" + data[row][0]);

            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(LibrarianRequest.this, "You must select a row");
            }
        } else {
            JOptionPane.showMessageDialog(LibrarianRequest.this, "Please login first as an admin!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        long employeeID = Integer.parseInt(idField.getText());
        String employeeName = nameField.getText();

        try {
            DefaultTableModel tablemodel = new DefaultTableModel(column_name, 0);
            connect.statement = connect.connection.createStatement();
            employees = connect.statement.executeQuery("(SELECT * FROM employee WHERE name like "
                    + "'%" + employeeName + "%')" + "UNION" + "(SELECT * FROM employee WHERE no=" + employeeID + ")");
            while (employees.next()) {
//                id = employees.getString(1);
//                name = employees.getString(2);
//                sex = employees.getString(3);
//                address = employees.getString(4);
//                phone = employees.getString(5);
//                email = employees.getString(6);

//                employee = new Employee(id, name, sex, address, phone, email);
//                data[i][0] = employee.getId();
//                data[i][1] = employee.getName();
//                data[i][2] = employee.getSex();
//                data[i][3] = employee.getAddress();
//                data[i][4] = employee.getPhone();
//                data[i][5] = employee.getEmail();
                tablemodel.addRow(new Object[]{employees.getString(1), employees.getString(2), employees.getString(3),
                    employees.getString(4), employees.getString(5), employees.getString(6)});
//                i++;
                jTable1.setModel(tablemodel);
                repaint();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void librarianMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianMenuActionPerformed


    }//GEN-LAST:event_librarianMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        addEmployee add = new addEmployee();
        add.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        BookManagement bookManage = new BookManagement();
        this.dispose();
        bookManage.setVisible(rootPaneCheckingEnabled);
        bookManage.bookManageMethod();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        BorrowManageMent borrow = new BorrowManageMent();
        this.dispose();
        borrow.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        StudentManagement student = new StudentManagement();
        this.dispose();
        student.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        new aboutUs().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(LibrarianRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibrarianRequest().setVisible(true);
            }
        });
    }

    String name, email, phone, address, sex, id, dob, dept, user_name;
    String addPerform;
    String password;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton employeeButton;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu librarianMenu;
    private javax.swing.JTextField nameField;
    private static javax.swing.JLabel onlineLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
