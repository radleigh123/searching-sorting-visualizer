package antjava;

import java.awt.Graphics;

public class MainFrame extends javax.swing.JFrame {
    
    private Visualizer visualizer;

    public MainFrame() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        bubbleRadio.setSelected(true);
        linearRadio.setSelected(true);
        
        visualizer = new Visualizer(drawingPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sortButtonGroup = new javax.swing.ButtonGroup();
        searchButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bubbleRadio = new javax.swing.JRadioButton();
        mergeRadio = new javax.swing.JRadioButton();
        quickRadio = new javax.swing.JRadioButton();
        linearRadio = new javax.swing.JRadioButton();
        binaryRadio = new javax.swing.JRadioButton();
        sortButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        iteratLabel = Data.ITERATE_LABEL;
        jLabel6 = new javax.swing.JLabel();
        swapLabel = Data.SWAP_LABEL;
        resetButton = new javax.swing.JButton();
        drawingPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                visualizer.paint(g);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 700));

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(188, 252, 239));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sortButtonGroup.add(bubbleRadio);
        bubbleRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bubbleRadio.setText("Bubble Sort");

        sortButtonGroup.add(mergeRadio);
        mergeRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mergeRadio.setText("Merge Sort");

        sortButtonGroup.add(quickRadio);
        quickRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quickRadio.setText("Quick Sort");

        searchButtonGroup.add(linearRadio);
        linearRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        linearRadio.setText("Linear Search");

        searchButtonGroup.add(binaryRadio);
        binaryRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        binaryRadio.setText("Binary Search:");

        sortButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Searching/Sorting");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Visualizer");

        searchField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bubbleRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mergeRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quickRadio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(linearRadio)
                        .addGap(18, 18, 18)
                        .addComponent(binaryRadio)
                        .addGap(18, 18, 18)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bubbleRadio)
                            .addComponent(quickRadio)
                            .addComponent(mergeRadio)
                            .addComponent(sortButton))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchButton)
                            .addComponent(linearRadio)
                            .addComponent(binaryRadio)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Iterations:");

        iteratLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        iteratLabel.setForeground(new java.awt.Color(255, 0, 51));
        iteratLabel.setText("0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Swaps:");

        swapLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        swapLabel.setForeground(new java.awt.Color(255, 0, 51));
        swapLabel.setText("0");

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 0, 0));
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iteratLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(swapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(iteratLabel)
                    .addComponent(jLabel6)
                    .addComponent(swapLabel)
                    .addComponent(resetButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        drawingPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        if (visualizer.isRunning()) {
            return;
        }
        
        String sort = "";
        
        if (bubbleRadio.isSelected()) {
            sort = "bubble";
        } else if (mergeRadio.isSelected()) {
            sort = "merge";
        } else if (quickRadio.isSelected()) {
            sort = "quick";
        }

        System.out.println(sort);

        Data.swap = 0;
        Data.iterate = 0;
        Data.B_swap = 0;
        Data.B_iterate = 0;

        switch (sort) {
            case "bubble" -> {
                new Thread(() -> visualizer.bubbleSort()).start();
            }
            case "merge" -> new Thread(() -> visualizer.mergeSort()).start();
            case "quick" -> new Thread(() -> visualizer.quickSort()).start();
        }

    }//GEN-LAST:event_sortButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        Thread.interrupted();
        
        visualizer = new Visualizer(drawingPanel);
        drawingPanel.repaint();

        Data.ITERATE_LABEL.setText("0");
        Data.SWAP_LABEL.setText("0");

    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (visualizer.isRunning()) {
            return;
        }

        String search = "";
        int target = searchField.getText().matches("^[0-9]+$") ? Integer.parseInt(searchField.getText()) : 0;

        if (target <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a number greater than Zero.");
            return;
        }

        if (linearRadio.isSelected()) {
            search = "linear";
        } else if (binaryRadio.isSelected()) {
            if (!visualizer.isSorted()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Please sort the array first.");
                return;
            }

            search = "binary";
        }

        System.out.println(search);

        Data.swap = 0;
        Data.iterate = 0;
        Data.B_swap = 0;
        Data.B_iterate = 0;
        
        switch (search) {
            case "linear" -> new Thread(() -> visualizer.linearSearch(target)).start();
            case "binary" -> new Thread(() -> visualizer.binarySearch(target)).start();
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton binaryRadio;
    private javax.swing.JRadioButton bubbleRadio;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JLabel iteratLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton linearRadio;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton mergeRadio;
    private javax.swing.JRadioButton quickRadio;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.ButtonGroup searchButtonGroup;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton sortButton;
    private javax.swing.ButtonGroup sortButtonGroup;
    private javax.swing.JLabel swapLabel;
    // End of variables declaration//GEN-END:variables
}
