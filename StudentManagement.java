package coulibrary.project;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class StudentManagement extends javax.swing.JFrame {

    Toolkit screen = Toolkit.getDefaultToolkit();
    Dimension d;
    DerbyConnection connect;
    String query = "SELECT * FROM employee";
    Employee employee;
    int i = 0;
    String column_name[] = {"Borrow No", "Librarian ID", "ISBN", "Title", "Issue Date", "Return date", "Fine"};
    Object data[][] = new Object[100][100];
    ResultSet employees;
    TableModel table;
    AdminFrame admin = new AdminFrame();
    ManageMent manage = new ManageMent();
    Object personType[] = {"Student", "Librarian", "Admin"};
    String person;
    static int adminLoginStatus = 0, librarianLoginStatus = 0, studentLoginStatus = 0;

    public StudentManagement() {

        initComponents();

        ImageIcon icon = new ImageIcon(getClass().getResource("/coulibrary/project/images/Library-icon.png"));
        Image img = icon.getImage();
        super.setIconImage(img);
        jComboBox1.setModel(new DefaultComboBoxModel(personType));
        try {

            super.setTitle("Library Management System");
            d = screen.getScreenSize();
            super.setSize(d);
            connect = new DerbyConnection();
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(StudentManagement.this, ex.getMessage());
        }

        jMenu2.setBorderPainted(true);
        jMenu1.setBorderPainted(true);
        jMenu3.setBorderPainted(true);
        jMenu4.setBorderPainted(true);
        jMenu5.setBorderPainted(true);
        jMenu7.setBorderPainted(true);
        librarianMenu.setBorderPainted(true);
        aboutUsMenu.setBorderPainted(true);
    }

    public void onlineShow() {
        aboutUsMenu.setText("You are in online.");
    }

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
        checkOutButton = new javax.swing.JButton();
        checkInButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        feeButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
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
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        aboutUsMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(102, 102, 102));
        jInternalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "          Student Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
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

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
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
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jInternalFrame1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4});

        jInternalFrame2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "          Admin Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
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
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(employeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton9)
                .addGap(29, 29, 29))
        );

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel1.setText("Employee ID:");

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel2.setText("Employee Name:");

        checkOutButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        checkOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/checkout.png"))); // NOI18N
        checkOutButton.setText("Check-Out");
        checkOutButton.setFocusable(false);
        checkOutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkOutButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        checkInButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        checkInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/checkin.png"))); // NOI18N
        checkInButton.setText("Check-In");
        checkInButton.setFocusable(false);
        checkInButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkInButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
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

        feeButton.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        feeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/feerate.png"))); // NOI18N
        feeButton.setText("Fee Rate");
        feeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        feeButton.setMaximumSize(new java.awt.Dimension(64, 66));
        feeButton.setMinimumSize(new java.awt.Dimension(64, 66));
        feeButton.setPreferredSize(new java.awt.Dimension(64, 66));
        feeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        feeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coulibrary/project/images/book.jpg"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " LogIn Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel4.setText("User Name: ");

        jLabel5.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        jButton2.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jButton2.setText("Log In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("You:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(usernameField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox1, passwordField, usernameField});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(49, 49, 49)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, passwordField, usernameField});

        jButton1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton1.setText("Create New Account ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton5.setText("Forgot Password?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jButton5)
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setAlignmentX(1.0F);
        jMenuBar1.setMargin(new java.awt.Insets(0, 10, 0, 10));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(400, 40));

        librarianMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        librarianMenu.setMnemonic('e');
        librarianMenu.setText("           Librarian          ");
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
        jMenu4.setText("          Department          ");
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

        jMenuItem4.setText("Librarian");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Student");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Admin");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 204), new java.awt.Color(51, 255, 255), null, null));
        jMenu2.setText("          Sign Up          ");
        jMenu2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N

        jMenuItem7.setText("Librarian");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Student");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Admin");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        aboutUsMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aboutUsMenu.setText("          About Us         ");
        aboutUsMenu.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        aboutUsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUsMenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutUsMenuMousePressed(evt);
            }
        });
        jMenuBar1.add(aboutUsMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jInternalFrame1)
                    .addComponent(jInternalFrame2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(idField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idField, nameField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkInButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(feeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 92, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {checkInButton, checkOutButton, deleteButton, feeButton, searchButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idField, nameField});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed

//        this.dispose();
//        manage.setVisible(rootPaneCheckingEnabled);
//        manage.employMethod();
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed

//        CheckOutFrame check_out = new CheckOutFrame();
//        check_out.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed

//        if (admin.setValue == 1) {
//            try {
//                int row = jTable1.getSelectedRow();
//                data[row][0] = jTable1.getModel().getValueAt(row, 0);
//                data[row][1] = jTable1.getModel().getValueAt(row, 1);
//                data[row][2] = jTable1.getModel().getValueAt(row, 2);
//                data[row][3] = jTable1.getModel().getValueAt(row, 3);
//                data[row][4] = jTable1.getModel().getValueAt(row, 4);
//                data[row][5] = jTable1.getModel().getValueAt(row, 5);
//                editEmployee edit = new editEmployee();
//                edit.setVisible(true);
//                edit.employeeDetails(data[row][0], data[row][1].toString(), data[row][2].toString(),
//                        data[row][3].toString(), data[row][4].toString(), data[row][5].toString());
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(StudentManagement.this, "You must select a row.");
//            }
//        } else {
//            JOptionPane.showMessageDialog(StudentManagement.this, "Please login first as an admin!");
//        }

    }//GEN-LAST:event_checkInButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

//        if (admin.setValue == 1) {
//            try {
//                int row = jTable1.getSelectedRow();
//                //String serial_id=jTable1.get
//                data[row][0] = jTable1.getModel().getValueAt(row, 0);
//                connect.statement.execute("DELETE FROM employee WHERE serial=" + data[row][0]);
//
//            } catch (Exception ex) {
//                System.out.println(ex);
//                JOptionPane.showMessageDialog(StudentManagement.this, "You must select a row");
//            }
//        } else {
//            JOptionPane.showMessageDialog(StudentManagement.this, "Please login first as an admin!");
//        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

//        long employeeID = Integer.parseInt(idField.getText());
//        String employeeName = nameField.getText();
//
//        try {
//            DefaultTableModel tablemodel = new DefaultTableModel(column_name, 0);
//            connect.statement = connect.connection.createStatement();
//            employees = connect.statement.executeQuery("(SELECT * FROM employee WHERE name like "
//                    + "'%" + employeeName + "%')" + "UNION" + "(SELECT * FROM employee WHERE no=" + employeeID + ")");
//            while (employees.next()) {
//                id = employees.getString(1);
//                name = employees.getString(2);
//                sex = employees.getString(3);
//                address = employees.getString(4);
//                phone = employees.getString(5);
//                email = employees.getString(6);
//
//                employee = new Employee(id, name, sex, address, phone, email);
//                data[i][0] = employee.getId();
//                data[i][1] = employee.getName();
//                data[i][2] = employee.getSex();
//                data[i][3] = employee.getAddress();
//                data[i][4] = employee.getPhone();
//                data[i][5] = employee.getEmail();
//                tablemodel.addRow(new Object[]{data[i][0], data[i][1], data[i][2], data[i][3], data[i][4], data[i][5]});
//                i++;
//                jTable1.setModel(tablemodel);
//                repaint();
//            }
//
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void librarianMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianMenuActionPerformed


    }//GEN-LAST:event_librarianMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        addEmployee add = new addEmployee();
//        add.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

////        BookManagement bookManage = new BookManagement();
////        this.dispose();
////        bookManage.setVisible(rootPaneCheckingEnabled);
////        bookManage.bookManageMethod();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
//        BorrowManageMent borrow = new BorrowManageMent();
//        this.dispose();
//        borrow.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        //new AddStudent().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // new loginFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        switch (person) {
            case "Student":

                try {
                    studentLoginStatus = 1;
                    user_name = usernameField.getText();
                    user_password = passwordField.getText();
                    connect.statement = connect.connection.createStatement();
                    employees = connect.statement.executeQuery("SELECT * FROM student where user_name = "
                            + "'" + user_name + "'" + "AND password = " + "'" + user_password + "'");
//                    if (!employees.getString(1).equals("")) {
                        while (employees.next()) {
                            id2 = employees.getString(1);
                            name2 = employees.getString(2);
                            dob = employees.getString(3);
                            sex2 = employees.getString(4);
                            dept = employees.getString(5);
                            address2 = employees.getString(6);
                            phone2 = employees.getString(7);
                            email2 = employees.getString(8);
//                        }

                        this.dispose();
                        profile.setVisible(rootPaneCheckingEnabled);
                        profile.setValue();
                        }
//                     else {
//                        JOptionPane.showMessageDialog(StudentManagement.this, "No matches found!");
//                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                }

                break;
            case "Librarian":

                try {
                    librarianLoginStatus = 1;
                    user_name = usernameField.getText();
                    user_password = passwordField.getText();
                    connect.statement = connect.connection.createStatement();
                    employees = connect.statement.executeQuery("SELECT * FROM employee where user_name = "
                            + "'" + user_name + "'" + "AND password = " + "'" + user_password + "'");
                    while (employees.next()) {
                        id2 = employees.getString(1);
                        name2 = employees.getString(2);
                        sex2 = employees.getString(3);
                        address2 = employees.getString(4);
                        phone2 = employees.getString(5);
                        email2 = employees.getString(6);
                        dob = employees.getString(7);
                    }
                    this.dispose();
                    library.setVisible(rootPaneCheckingEnabled);
                } catch (Exception ex) {
                    System.out.println(ex);
                }

                break;
            default:

                try {
                    adminLoginStatus = 1;
                    user_name = usernameField.getText();
                    user_password = passwordField.getText();
                    connect.statement = connect.connection.createStatement();
                    employees = connect.statement.executeQuery("SELECT * FROM employee where user_name = "
                            + "'" + user_name + "'" + "AND password = " + "'" + user_password + "'");
                    while (employees.next()) {
                        id2 = employees.getString(1);
                        name2 = employees.getString(2);
                        sex2 = employees.getString(3);
                        address2 = employees.getString(4);
                        phone2 = employees.getString(5);
                        email2 = employees.getString(6);
                        dob = employees.getString(7);
                    }
                    this.dispose();
                    profile.setVisible(rootPaneCheckingEnabled);
                } catch (Exception ex) {
                    System.out.println(ex);
                }

                break;
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void aboutUsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsMenuMouseClicked
        // new aboutUs().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aboutUsMenuMouseClicked

    private void feeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeButtonActionPerformed
        // new FineRate().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_feeButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            person = (String) jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void aboutUsMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsMenuMousePressed
        new aboutUs().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aboutUsMenuMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AddStudent().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentManagement().setVisible(true);
            }
        });
    }

    String name, email, phone, address, sex, id;
    static String user_name, userName, password, name2, user_password, id2, sex2, email2, address2, phone2, dob, dept;
    ProfileManagement profile = new ProfileManagement();
    LibrarianProfileManagement library = new LibrarianProfileManagement();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutUsMenu;
    private javax.swing.JButton checkInButton;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton employeeButton;
    private javax.swing.JButton feeButton;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu librarianMenu;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
