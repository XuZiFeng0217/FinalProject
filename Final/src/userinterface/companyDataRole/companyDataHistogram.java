/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.companyDataRole;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.awt.Font;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Yuton
 */
public class companyDataHistogram {
    ChartPanel frame1;
    JPanel userProcessContainer;
    UserAccount account;  
    EcoSystem business;
    public companyDataHistogram(JPanel userProcessContainer, UserAccount account, EcoSystem business){
        this.business = business;
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        
        DefaultCategoryDataset data = (DefaultCategoryDataset) this.getDataSet();
          JFreeChart chart=ChartFactory.createBarChart3D(
        		  "Histogram about DeliveryMan and Order Address",  //图表标题
        		  "Address",//目录轴的显示标签 
        		  "OrderNumber",//数值轴的显示标签 
        		  data, 
        		  PlotOrientation.VERTICAL,  //图表方向 水平 垂直
        		  true,  //是否显示图例(对于简单的图表建议显示图例)
        		  false,//是否生成工具 
        		  false);  //是否生成网址链接
          CategoryPlot plot=chart.getCategoryPlot();
          CategoryAxis domain =plot.getDomainAxis();    
                     domain.setTickLabelFont(new Font("黑体", Font.BOLD, 16));
            //水平底部标题设置
            domain.setLabelFont(new Font("黑体", Font.BOLD, 20));
            //获取柱状体
            ValueAxis rangeAxis=plot.getRangeAxis();
            rangeAxis.setLabelFont(new Font("黑体", Font.BOLD, 16));
            //设置lengend字体
            chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 16));
            chart.getTitle().setFont(new Font("黑体", Font.BOLD, 16));
            frame1 = new ChartPanel(chart);
    }
    
    public CategoryDataset getDataSet() {
        DefaultCategoryDataset data=new DefaultCategoryDataset();
        int ad1WA = 0;
        int ad1BOS = 0;
        int ad1NY = 0;
        int ad2WA = 0;
        int ad2BOS = 0;
        int ad2NY = 0;
        int ad3WA = 0;
        int ad3BOS = 0;
        int ad3NY = 0;
        
        if(this.account.getUsername().equals("cd1")){
            for(Order order : this.business.getOrderDirectory()){
                if(order.getCompany().getName().equals("SF")){
                    if(order.getDeliveryMan().getFirstName().equals("d1")){
                        if(order.getAddress().equals("Washington")){
                            ad1WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad1BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad1NY ++;
                        }

                    }else if(order.getDeliveryMan().getFirstName().equals("d2")){
                        if(order.getAddress().equals("Washington")){
                            ad2WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad2BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad2NY ++;
                        }
                    }
                    else {
                        System.out.println("d3 " + order.getAddress());
                        if(order.getAddress().equals("Washington")){
                            ad3WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad3BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad3NY ++;
                    }
                    }
                }
            }
            data.setValue(ad1WA, "d1", "Washington");
            data.setValue(ad1BOS, "d1", "Boston");
            data.setValue(ad1NY, "d1", "New York");
            data.setValue(ad2WA, "d2", "Washington");
            data.setValue(ad2BOS, "d2", "Boston");
            data.setValue(ad2NY, "d2", "New York");
            data.setValue(ad3WA, "d3", "Washington");
            data.setValue(ad3BOS, "d3", "Boston");
            data.setValue(ad3NY, "d3", "New York");
        }
        
        else if(this.account.getUsername().equals("cd2")){
            for(Order order : this.business.getOrderDirectory()){
                if(order.getCompany().getName().equals("EXPRESS")){
                    if(order.getDeliveryMan().getFirstName().equals("d1")){
                                                if(order.getAddress().equals("Washington")){
                            ad1WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad1BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad1NY ++;
                        }

                    }else if(order.getDeliveryMan().getFirstName().equals("d2")){
                        if(order.getAddress().equals("Washington")){
                            ad2WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad2BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad2NY ++;
                        }
                    }
                    else {
                        if(order.getAddress().equals("Washington")){
                            ad3WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad3BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad3NY ++;
                    }
                    }
                }
        }
            data.setValue(ad1WA, "d1", "Washington");
            data.setValue(ad1BOS, "d1", "Boston");
            data.setValue(ad1NY, "d1", "New York");
            data.setValue(ad2WA, "d2", "Washington");
            data.setValue(ad2BOS, "d2", "Boston");
            data.setValue(ad2NY, "d2", "New York");
            data.setValue(ad3WA, "d3", "Washington");
            data.setValue(ad3BOS, "d3", "Boston");
            data.setValue(ad3NY, "d3", "New York");
        }
        
        else if(this.account.getUsername().equals("cd3")){
            for(Order order : this.business.getOrderDirectory()){
                if(order.getCompany().getName().equals("UPS")){
                    if(order.getDeliveryMan().getFirstName().equals("d1")){
                                                if(order.getAddress().equals("Washington")){
                            ad1WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad1BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad1NY ++;
                        }

                    }else if(order.getDeliveryMan().getFirstName().equals("d2")){
                        if(order.getAddress().equals("Washington")){
                            ad2WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad2BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad2NY ++;
                        }
                    }
                    else {
                        if(order.getAddress().equals("Washington")){
                            ad3WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            ad3BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            ad3NY ++;
                    }
                    }
                }
        }
            data.setValue(ad1WA, "d1", "Washington");
            data.setValue(ad1BOS, "d1", "Boston");
            data.setValue(ad1NY, "d1", "New York");
            data.setValue(ad2WA, "d2", "Washington");
            data.setValue(ad2BOS, "d2", "Boston");
            data.setValue(ad2NY, "d2", "New York");
            data.setValue(ad3WA, "d3", "Washington");
            data.setValue(ad3BOS, "d3", "Boston");
            data.setValue(ad3NY, "d3", "New York");
        }
        return data;
    }
    
    public ChartPanel getPanel() {
		return frame1;
	}
    
}
