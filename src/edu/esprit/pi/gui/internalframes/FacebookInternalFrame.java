/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package edu.esprit.pi.gui.internalframes;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import edu.esprit.pi.workshop.facebook.Facebook;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

/**
 *
 * @author Amine
 */
public class FacebookInternalFrame extends javax.swing.JInternalFrame {

    public static String API_KEY = "1452298744999266";
    public static String SECRET = "ce9488263f578135c16fe2d78d118640";
    public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
            + "client_id="
            + API_KEY
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";

    public  static String secondRequest = "https://graph.facebook.com/oauth/access_token?"
            + "client_id="
            + API_KEY
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "client_secret=" + SECRET + "&code=";

    public static String access_token = "";
    public static boolean firstRequestDone = false;
    public static boolean secondRequestDone = false;

    /**
     * Creates new form FacebookInernalFrame
     */
    public FacebookInternalFrame() {
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

        globaljPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        apiKeyTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        secretKeyjTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        getAccessTokenjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accessTokenjTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        getPermissionjButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        loginToFBjButton = new javax.swing.JButton();
        webBrowserPanel = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Facebook Sample App");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("1 st Step"));

        jLabel1.setText("1 - Connectez vous sur l'url : developers.facebook.com");

        jLabel2.setText("2 - Enregistrez-vous en tant que développeur sur cette page.");

        jLabel3.setText("3 - Allez sur Applications et créer une nouvelle application.");

        jLabel4.setText("4 - Suivez les instructions jusqu'à la création de l'application.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("2 nd Step"));

        jLabel5.setText("1 - Récupérer l'ID et la clé secrète de l'application :");

        jLabel6.setText("ID App : ");

        jLabel7.setText("Secret Key :");

        jLabel8.setText("3 - récupérer le jeton d'authentification avec votre application.");

        getAccessTokenjButton.setText("get token");
        getAccessTokenjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAccessTokenjButtonActionPerformed(evt);
            }
        });

        accessTokenjTextArea1.setEditable(false);
        accessTokenjTextArea1.setColumns(20);
        accessTokenjTextArea1.setRows(5);
        jScrollPane1.setViewportView(accessTokenjTextArea1);

        jLabel11.setText("4 - On peut procéder à récupérer quelques informations");

        jLabel12.setText("2 - Confirmer la permission sur l'application : ");

        getPermissionjButton.setText("get permission for app");
        getPermissionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPermissionjButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("0 - login to Facebook");

        loginToFBjButton.setText("login to Facebook");
        loginToFBjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginToFBjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(apiKeyTextField1)
                                    .addGap(43, 43, 43))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(50, 50, 50)
                                    .addComponent(loginToFBjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(getPermissionjButton))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(getAccessTokenjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secretKeyjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(loginToFBjButton))
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(apiKeyTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secretKeyjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(getPermissionjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(getAccessTokenjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(58, 58, 58))
        );

        webBrowserPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout webBrowserPanelLayout = new javax.swing.GroupLayout(webBrowserPanel);
        webBrowserPanel.setLayout(webBrowserPanelLayout);
        webBrowserPanelLayout.setHorizontalGroup(
            webBrowserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        webBrowserPanelLayout.setVerticalGroup(
            webBrowserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout globaljPanelLayout = new javax.swing.GroupLayout(globaljPanel);
        globaljPanel.setLayout(globaljPanelLayout);
        globaljPanelLayout.setHorizontalGroup(
            globaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(globaljPanelLayout.createSequentialGroup()
                .addGroup(globaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webBrowserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        globaljPanelLayout.setVerticalGroup(
            globaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(globaljPanelLayout.createSequentialGroup()
                .addGroup(globaljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(globaljPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(webBrowserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(globaljPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(globaljPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void firstFacebookConnection() {
        webBrowserPanel.removeAll();
        System.out.println("Running opening new Facebook web Browser window ...");
        System.out.println("http://www.facebook.com/");
        NativeInterface.open();
        NativeInterface.initialize();
        final JWebBrowser webBrowser = new JWebBrowser();
        webBrowser.setMenuBarVisible(false);
        webBrowser.setButtonBarVisible(false);
        webBrowser.setLocationBarVisible(false);
        webBrowser.navigate("http://www.facebook.com/");
        webBrowserPanel.setLayout(new java.awt.BorderLayout());
        webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
            @Override
            public void locationChanging(WebBrowserNavigationEvent e) {
                super.locationChanging(e);
                System.out.println(e.getNewResourceLocation());
                if (!e.getNewResourceLocation().equals("http://www.facebook.com/")) {
                    Timer timer = new Timer(2000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            //webBrowserPanel.setVisible(true);
                        }
                    });
                    timer.start();
                }
            }
        });
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        webBrowser.validate();
        webBrowser.setSize(400, 500);
        webBrowserPanel.setVisible(true);
    }

    private void secondFacebookConnection() {
        webBrowserPanel.removeAll();
        System.out.println("Running second Step Facebook web Browser window ...");
        NativeInterface.open();
        NativeInterface.initialize();
        final JWebBrowser webBrowser = new JWebBrowser();
        webBrowser.navigate(firstRequest);
        webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
            @Override
            public void locationChanged(WebBrowserNavigationEvent e) {
                super.locationChanged(e);
                // Check if first request was not done
                if (!firstRequestDone) {
                    // Check if you left the location and were redirected to the next 
                    // location
                    if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")) {
                        // If it successfully redirects you, get the verification code
                        // and go for a second request
                        String[] splits = e.getNewResourceLocation().split("=");
                        String stage2temp = secondRequest + splits[1];
                        System.out.println("First =" + splits[1]);
                        webBrowser.navigate(stage2temp);
                        firstRequestDone = true;
                    }
                } else {
                    // If secondRequest is not done yet, you perform this and get the 
                    // access_token
                    if (!secondRequestDone) {
                        System.out.println(webBrowser.getHTMLContent());
                        // Create reader with the html content
                        StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
                        // Create a callback for html parser
                        HTMLEditorKit.ParserCallback callback
                                = new HTMLEditorKit.ParserCallback() {
                                    @Override
                                    public void handleText(char[] data, int pos) {
                                        System.out.println(data);
                                        // because there is only one line with the access_token 
                                        // in the html content you can parse it.
                                        String string = new String(data);
                                        String[] temp1 = string.split("&");
                                        String[] temp2 = temp1[0].split("=");
                                        System.out.println("access tocken=" + temp2);
                                        access_token = temp2[1];

                                    }
                                };
                        try {
                            // Call the parse method 
                            new ParserDelegator().parse(readerSTR, callback, false);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        // After everything is done, you can dispose the jframe
                        //authFrame.dispose();     

                    }
                }
            }
        });
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        webBrowser.validate();
        webBrowser.setSize(600, 500);
        webBrowserPanel.setVisible(true);
    }
    private void getPermissionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPermissionjButtonActionPerformed
        secondFacebookConnection();
    }//GEN-LAST:event_getPermissionjButtonActionPerformed
    private void loginToFBjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginToFBjButtonActionPerformed
        firstFacebookConnection();
    }//GEN-LAST:event_loginToFBjButtonActionPerformed
    private void getAccessTokenjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAccessTokenjButtonActionPerformed
        accessTokenjTextArea1.setText(access_token);
    }//GEN-LAST:event_getAccessTokenjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea accessTokenjTextArea1;
    private javax.swing.JTextField apiKeyTextField1;
    private javax.swing.JButton getAccessTokenjButton;
    private javax.swing.JButton getPermissionjButton;
    private javax.swing.JPanel globaljPanel;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginToFBjButton;
    private javax.swing.JTextField secretKeyjTextField1;
    private javax.swing.JPanel webBrowserPanel;
    // End of variables declaration//GEN-END:variables
}
