
package Business.Art;

import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import java.awt.FontMetrics;

import java.awt.Graphics;

import java.awt.Graphics2D;

import java.awt.RenderingHints;

import java.awt.Toolkit;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.geom.Arc2D;

import java.util.ArrayList;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author zzz
 */
public class Z32 extends javax.swing.JPanel {
    JPanel userProcessContainer;
    UserAccount account;  
    EcoSystem business;
    private double[] data; // show data in the pie chart

    private Color[] defaultColors; // intialize the color in pie charts firstly

    private Z2[] pies;


    private int shadowDepth = 8;

    private int shiftAngle = -30;

    private int selectedPieIndex = -1; // Mouse click is selected ARC, -1 is not selected

    
    public Z32(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        data = new double[3];
        double ad1 = 0;
        double ad2 = 0;
        double ad3 = 0;

        for (Order order : business.getOrderDirectory()) {

            if (order.getCompany().getName().equals("SF")) {
                ad1++;
            } else if (order.getCompany().getName().equals("EXPRESS")) {
                ad2++;
            } else if (order.getCompany().getName().equals("UPS")) {
                ad3++;
            }

        }
        

        double sum = ad1 + ad2 + ad3;
        
        ad1 = (double) Math.round(ad1/sum * 100);
        ad2 = (double) Math.round(ad2/sum * 100);
        ad3 = (double) Math.round(ad3/sum * 100);
        if(ad1!=0) data[0] = ad1;
        if(ad1!=0) data[1] = ad2;
        if(ad1!=0) data[2] = ad3;
        defaultColors = createColors();


        int x = 50;

        int y = 50;

        int w = 380;

        int h = (int) (w * 0.618); // the gold segmention

        pies = createPies(x, y, w, h, shadowDepth, shiftAngle, data, defaultColors);


        // Gets the subscript of the mouse selected pie chart

        addMouseListener(new MouseAdapter() {

            @Override

            public void mouseClicked(MouseEvent e) {

                selectedPieIndex = -1;

                for (int i = 0; i < pies.length; ++i) {

                    if (pies[i].getArc().contains(e.getX(), e.getY())) {

                        selectedPieIndex = i;

                        break;

                    }

                }

                repaint();

            }

        });

    }


    private Color[] createColors() {

        // Returns the color of a hexadecimal value

        List<Color> colors = new ArrayList<Color>();

        colors.add(Color.decode("#D0F15A"));

        colors.add(Color.decode("#AA6A2D"));

        colors.add(Color.decode("#00E500"));

        colors.add(Color.decode("#D0F15A"));

        colors.add(Color.decode("#AA6A2D"));

        colors.add(Color.decode("#BFDD89"));

        colors.add(Color.decode("#E2FF55"));

        colors.add(Color.decode("#D718A5"));

        colors.add(Color.decode("#00DBFF"));

        colors.add(Color.decode("#00FF00"));


        return colors.toArray(new Color[0]);

    }


    public static Z2[] createPies(int x,

                                   int y,

                                   int w,

                                   int h,

                                   int shadowDepth,

                                   double shiftAngle,

                                   double[] data,

                                   Color[] colors) {

        double sum = 0;

        for (double d : data) {

            sum += d;

        }


        // intialize the pies

        double arcAngle = 0;

        double startAngle = shiftAngle;

        Z2[] pies = new Z2[data.length];


        for (int i = 0; i < data.length; ++i) {

            arcAngle = data[i] * 360 / sum; // calculate the angles in percent

            if (i + 1 == data.length) {

                arcAngle = 360 + shiftAngle - startAngle; // Ensure that closed

                arcAngle = arcAngle > 0 ? arcAngle : 0;

            }


            Arc2D.Double arc = new Arc2D.Double(x, y, w, h, startAngle, arcAngle, Arc2D.PIE);

            pies[i] = new Z2(arc, colors[i % colors.length], data[i], shadowDepth, 30);

            startAngle += arcAngle;

        }


        return pies;

    }


    @Override

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        if (pies != null) {

            drawPies(g2d, pies, selectedPieIndex);

        }

    }


    private void drawPies(Graphics2D g2d, Z2[] pies, int selectedIndex) {

        int startIndex = 0; // Start with the number of pie charts

        int endIndex = pies.length; // the number of pie charts to draw

        boolean closed = (endIndex - startIndex == pies.length) ? true : false;

        boolean selected = (selectedIndex >= startIndex && selectedIndex < endIndex) ? true : false;

        FontMetrics metrics = g2d.getFontMetrics();


        // Paint the 3D effect once and then draw the pie at the same time

        for (int i = startIndex; i < endIndex; ++i) {

            if (i != selectedIndex) {

                Z2 p = pies[i];

                g2d.setColor(p.getColor().darker());

                g2d.fill(p.getFrontSite());

            }

        }


       /* If there is no closure, and the first block is not selected,
        then the first block is drawn to the left*/

        if (!closed && selectedIndex != startIndex) {

            g2d.setColor(pies[startIndex].getColor().darker());

            g2d.fill(pies[startIndex].getLeftSite());

        }


         /* If there is no closure, and the last piece is not selected, 
        then the last piece is drawn to the right*/


        if (!closed && selectedIndex + 1 != endIndex) {

            g2d.setColor(pies[endIndex - 1].getColor().darker());

            g2d.fill(pies[endIndex - 1].getRightSite());

        }


       //  if the pie chart be selected

        if (selected) {

            int prevIndex = selectedIndex > startIndex ? (selectedIndex - 1) : endIndex - 1;

            int nextIndex = (selectedIndex + 1) >= endIndex ? startIndex : (selectedIndex + 1);


            // the first one to draw the right

            g2d.setColor(pies[prevIndex].getColor().darker());

            g2d.fill(pies[prevIndex].getRightSite());

            // the later one to draw the left

            g2d.setColor(pies[nextIndex].getColor().darker());

            g2d.fill(pies[nextIndex].getLeftSite());

        }


       // Finally, draw the top part of the pie chart and hide the unnecessary parts

        for (int i = startIndex; i < endIndex; ++i) {

            if (i != selectedIndex) {

                Z2 p = pies[i];

                g2d.setColor(p.getColor());

                g2d.fill(p.getArc());


                int sw = metrics.stringWidth(p.getLabel()) / 2;

                int sh = (metrics.getAscent()) / 2;

                int x = (int) (p.getLabelPosition().getX() - sw);

                int y = (int) (p.getLabelPosition().getY() + sh);

                g2d.setColor(Color.BLACK);

                g2d.drawString(p.getLabel(), x, y);

            }

        }


        // draw the selceted pie chart

        if (selected) {

            Z2 p = pies[selectedIndex].getSelectedPie();

            g2d.setColor(p.getColor().darker());

            g2d.fill(p.getFrontSite());

            g2d.fill(p.getLeftSite());

            g2d.fill(p.getRightSite());

            g2d.setColor(p.getColor());

            g2d.fill(p.getArc());


            int sw = metrics.stringWidth(p.getLabel()) / 2;

            int sh = (metrics.getAscent()) / 2;

            int x = (int) (p.getLabelPosition().getX() - sw);

            int y = (int) (p.getLabelPosition().getY() + sh);

            g2d.setColor(Color.BLACK);

            g2d.drawString(p.getLabel(), x, y);

        }

    }


    private static void createGuiAndShow() {



        int sw = Toolkit.getDefaultToolkit().getScreenSize().width;

        int sh = Toolkit.getDefaultToolkit().getScreenSize().height;

        int w = 1400;

        int h = 1000;

        int x = (sw - w) / 2;

        int y = (sh - h) / 2 - 40;

        x = x > 0 ? x : 0;

        y = y > 0 ? y : 0;



    }


    public static void main(String[] args) {

        createGuiAndShow();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        jLabel1.setText("Brown: SF    Yellow: EXPRESS    Green: UPS");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backJButton)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addContainerGap(540, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        //        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
