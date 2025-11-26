
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author jacqu
 */
public class FenetreQuizz extends javax.swing.JFrame {

    private int indexQuestionCourante = 0;
    private int scoreValue = 0;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreQuizz.class.getName());
    private ArrayList<Questions> ListeQuestions = new ArrayList<>();

    /**
     * Creates new form FenetreQuizz
     */
    public FenetreQuizz() {
        initComponents();

        ListeQuestions.add(new Questions(
                "Quelle est la capitale de la France ?",
                "Lyon",
                "Paris",
                "Marseille",
                "Bordeaux",
                2));
        ListeQuestions.add(new Questions(
                "Quelle est la capitale de l'Italie ?",
                "Rome",
                "Milan",
                "Naples",
                "Turin",
                1
        ));

        ListeQuestions.add(new Questions(
                "Quel est le symbole chimique de l’eau ?",
                "O2",
                "H2O",
                "CO2",
                "HO",
                2
        ));

        ListeQuestions.add(new Questions(
                "En quelle année a eu lieu la Révolution française ?",
                "1515",
                "1789",
                "1914",
                "1848",
                2
        ));

        ListeQuestions.add(new Questions(
                "Combien font 7 × 8 ?",
                "48",
                "54",
                "56",
                "64",
                3
        ));

        ListeQuestions.add(new Questions(
                "Quel est l’océan le plus vaste ?",
                "Atlantique",
                "Indien",
                "Pacifique",
                "Arctique",
                3
        ));

        ListeQuestions.add(new Questions(
                "Quel pays a remporté la Coupe du monde de football 2018 ?",
                "Allemagne",
                "France",
                "Brésil",
                "Argentine",
                2
        ));

        ListeQuestions.add(new Questions(
                "Quel est l’élément le plus léger du tableau périodique ?",
                "Hydrogène",
                "Hélium",
                "Lithium",
                "Carbone",
                1
        ));

        ListeQuestions.add(new Questions(
                "Qui a peint la Joconde ?",
                "Picasso",
                "Van Gogh",
                "Monet",
                "Leonard de Vinci",
                4
        ));

        ListeQuestions.add(new Questions(
                "Quelle est la planète la plus proche du Soleil ?",
                "Vénus",
                "Mercure",
                "Terre",
                "Mars",
                2
        ));
java.util.Collections.shuffle(ListeQuestions);

        afficherQuestionCourante();

    }

    private void afficherQuestionCourante() {
        Questions q = ListeQuestions.get(indexQuestionCourante);
q.melangerReponses();

        // Construire un énoncé complet
        String texte
                = "<html>"
                + q.getIntitule() + "<br><br>"
                + "A) " + q.getProposition1() + "<br>"
                + "B) " + q.getProposition2() + "<br>"
                + "C) " + q.getProposition3() + "<br>"
                + "D) " + q.getProposition4()
                + "</html>";

        enonce.setText(texte);

        // Les boutons restent A, B, C, D → aucun changement
        // Réactiver les boutons
        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
        D.setEnabled(true);

        // Effacer l’ancienne réponse affichée
        reponsecorrecte.setText("");
    }

    private void verifierReponse(int choixUtilisateur) {
 
        Questions q = ListeQuestions.get(indexQuestionCourante);

        // Vérifier si le choix correspond à la bonne réponse
        if (choixUtilisateur == q.getIndexBonneReponse()) {
            scoreValue++;  // On incrémente
            score.setText(String.valueOf(scoreValue)); // Met à jour l’affichage du score
            reponsecorrecte.setText("Bonne réponse !");


        } else {
            reponsecorrecte.setText(
    "Mauvaise réponse ! La bonne réponse était : "
    + getLettreBonneReponse(q.getIndexBonneReponse())
);
  
        }

        
        // Désactiver les boutons après la réponse
        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        D.setEnabled(false);
       
    
    }
    private String getLettreBonneReponse(int index) {
    switch (index) {
        case 1: return "A";
        case 2: return "B";
        case 3: return "C";
        case 4: return "D";
        default: return "?";
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Questions = new javax.swing.JLabel();
        enonce = new javax.swing.JLabel();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        textescore = new javax.swing.JLabel();
        reponsecorrecte = new javax.swing.JLabel();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Questions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Questions.setText("Question :");

        enonce.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enonce.setText("enonce des questions");

        A.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A.setText("A");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AMouseEntered(evt);
            }
        });
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        B.setText("D");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        D.setText("B");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        score.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        score.setText("0");

        textescore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textescore.setText("Score :");

        reponsecorrecte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reponsecorrecte.setText("A,B,C ou D");

        next.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        next.setText("Question Suivante");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Questions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next))
                    .addComponent(enonce, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(reponsecorrecte, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(textescore)
                        .addGap(47, 47, 47)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(Questions))
                .addGap(14, 14, 14)
                .addComponent(enonce, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textescore)
                    .addComponent(reponsecorrecte))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AMouseEntered

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        verifierReponse(1);  // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        verifierReponse(2); // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        verifierReponse(3);// TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        verifierReponse(4); // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // Passer à la question suivante
        indexQuestionCourante++;

        // Vérifier si on est encore dans les limites de la liste
        if (indexQuestionCourante < ListeQuestions.size()) {
            afficherQuestionCourante();
        } else {
            // PLUS AUCUNE QUESTION → fin du quiz
            enonce.setText("<html><h3>Quiz terminé !</h3><br>Score final : "
                    + scoreValue + " / " + ListeQuestions.size() + "</html>");

            // Désactiver les boutons
            A.setEnabled(false);
            B.setEnabled(false);
            C.setEnabled(false);
            D.setEnabled(false);

            // Désactiver le bouton Question suivante
            next.setEnabled(false);

            // Facultatif : Effacer réponse correcte
            reponsecorrecte.setText("");
        } // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FenetreQuizz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JLabel Questions;
    private javax.swing.JLabel enonce;
    private javax.swing.JButton next;
    private javax.swing.JLabel reponsecorrecte;
    private javax.swing.JLabel score;
    private javax.swing.JLabel textescore;
    // End of variables declaration//GEN-END:variables
}
