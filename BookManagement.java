package coulibrary.project;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BookManagement extends javax.swing.JFrame {

    Toolkit screen = Toolkit.getDefaultToolkit();
    Dimension d;
    DerbyConnection connect;
    String query = "SELECT * FROM book";
    Employee employee;
    Book book;
    int i = 0;
    String column_name[] = {"ISBN", "Title", "Author", "Department", "Copies"};
    Object data[][] = new Object[100][100];
    ResultSet books;
    TableModel table;
    ManageMent manage = new ManageMent();

    public BookManagement() {

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

        librarianMenu.setBorderPainted(true);
        jMenu1.setBorderPainted(true);
        jMenu3.setBorderPainted(true);
        jMenu4.setBorderPainted(true);
        jMenu5.setBorderPainted(true);
        jMenu6.setBorderPainted(true);
        jMenu7.setBorderPainted(true);
        aboutUsMenu.setBorderPainted(true);
        
        try {

            super.setTitle("Library Management System");

            d = screen.getScreenSize();
            super.setSize(d);
            connect = new DerbyConnection();

        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(BookManagement.this, ex.getMessage());
        }
        jTable1.setRowHeight(1, 20);
    }

    public void bookManageMethod() {
        try {
            addButton.setEnabled(true);
            DefaultTableModel tablemodel = new DefaultTableModel(column_name, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            connect.statement = connect.connection.createStatement();
            books = connect.statement.executeQuery(query);
            while (books.next()) {
                isbn = books.getString(1);
                title = books.getString(2);
                author = books.getString(3);
                dept = books.getString(4);
                copies = books.getInt(5);

                book = new Book(isbn, title, author, dept, copies);
                data[i][0] = book.getIsbn();
                data[i][1] = book.getTitle();
                data[i][2] = book.getAuthor();
                data[i][3] = book.getDept();
                data[i][4] = book.getCopies();
                tablemodel.addRow(new Object[]{data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]});
                i++;
                jTable1.setModel(tablemodel);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(BookManagement.this, "Communications link failure! Check your database connecttion.");
        }
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
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        librarianMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
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
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jInternalFrame1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4});

        jInternalFrame2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "         Admin Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
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
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(employeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(employeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton9)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel1.setText("Title:");

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel2.setText("Author:");

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Title", "Author", "Department", "Copies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFillsViewportHeight(true);
        jTable1.setFocusCycleRoot(true);
        jTable1.setIntercellSpacing(new java.awt.Dimension(10, 1));
        jTable1.setRowHeight(20);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

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

        jMenu6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu6.setMnemonic('a');
        jMenu6.setText("          Help          ");
        jMenu6.setToolTipText("");
        jMenu6.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu6.setIconTextGap(15);
        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu7.setMnemonic('h');
        jMenu7.setText("          Sign In         ");
        jMenu7.setToolTipText("");
        jMenu7.setAlignmentX(2.0F);
        jMenu7.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu7.setIconTextGap(15);
        jMenuBar1.add(jMenu7);

        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setMnemonic('s');
        jMenu1.setText("         Sign Up         ");
        jMenu1.setToolTipText("");
        jMenu1.setAlignmentX(2.0F);
        jMenu1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jMenu1.setIconTextGap(15);
        jMenuBar1.add(jMenu1);

        aboutUsMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aboutUsMenu.setText("          About Us          ");
        aboutUsMenu.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        aboutUsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUsMenuMouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, deleteButton, editButton, searchButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idField, nameField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, deleteButton, editButton, searchButton, viewButton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idField, nameField});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed

        this.dispose();
        manage.setVisible(rootPaneCheckingEnabled);
        manage.employMethod();
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AddBook add = new AddBook();
        add.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

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
            JOptionPane.showMessageDialog(BookManagement.this, "You must select a row.");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            int row = jTable1.getSelectedRow();
            data[row][0] = jTable1.getModel().getValueAt(row, 0);
            connect.statement.execute("DELETE FROM employee WHERE no=" + data[row][0]);

        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(BookManagement.this, "You must select a row");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

//        long employeeID = Integer.parseInt(idField.getText());
//        String employeeName = nameField.getText();
//
//        try {
//            DefaultTableModel tablemodel = new DefaultTableModel(column_name, 0);
//            connect.statement = connect.connection.createStatement();
//            books = connect.statement.executeQuery("(SELECT * FROM employee WHERE name like "
//                    + "'%" + employeeName + "%')" + "UNION" + "(SELECT * FROM employee WHERE no=" + employeeID + ")");
//            while (books.next()) {
//                id = books.getInt(1);
//                name = books.getString(2);
//                sex = books.getString(3);
//                address = books.getString(4);
//                phone = books.getString(5);
//                email = books.getString(6);
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
        addEmployee add = new addEmployee();
        add.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        bookManageMethod();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                
        BorrowManageMent borrow = new BorrowManageMent();
        this.dispose();
        borrow.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StudentManagement student=new StudentManagement();
        this.dispose();
        student.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void aboutUsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsMenuMouseClicked
        new aboutUs().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aboutUsMenuMouseClicked

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
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookManagement().setVisible(true);
            }
        });
    }

    String isbn, title, author, dept;
    int copies;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutUsMenu;
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
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu librarianMenu;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
