/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WareHouseDataRole;

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
public class warehouseDataHistogram {
    ChartPanel frame1;
    JPanel userProcessContainer;
    UserAccount account;  
    EcoSystem business;
    public warehouseDataHistogram(JPanel userProcessContainer, UserAccount account, EcoSystem business){
        this.business = business;
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        
        DefaultCategoryDataset data = (DefaultCategoryDataset) this.getDataSet();
        JFreeChart chart=ChartFactory.createBarChart3D(
        		  "Histogram about Company and Order Address",  //图表标题
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
        int com1WA = 0;
        int com1BOS = 0;
        int com1NY = 0;
        int com2WA = 0;
        int com2BOS = 0;
        int com2NY = 0;
        int com3WA = 0;
        int com3BOS = 0;
        int com3NY = 0; 
        
        if(this.account.getUsername().equals("wd1")){
            for(Order order : this.business.getOrderDirectory()){
                if(order.getWareHouse().getName().equals("wh1")){
                    if(order.getCompany().getName().equals("SF")){
                        if(order.getAddress().equals("Washington")){
                            com1WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com1BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com1NY ++;
                        }

                    }else if(order.getCompany().getName().equals("EXPRESS")){
                        if(order.getAddress().equals("Washington")){
                            com2WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com2BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com2NY ++;
                        }
                    }
                    else if(order.getCompany().getName().equals("UPS")){
                        if(order.getAddress().equals("Washington")){
                            com3WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com3BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com3NY ++;
                    }
                    }
                }
            }
            data.setValue(com1WA, "SF", "Washington");
            data.setValue(com1BOS, "SF", "Boston");
            data.setValue(com1NY, "SF", "New York");
            data.setValue(com2WA, "EXPRESS", "Washington");
            data.setValue(com2BOS, "EXPRESS", "Boston");
            data.setValue(com2NY, "EXPRESS", "New York");
            data.setValue(com3WA, "UPS", "Washington");
            data.setValue(com3BOS, "UPS", "Boston");
            data.setValue(com3NY, "UPS", "New York");
        }
        
        else if(this.account.getUsername().equals("wd2")){
            for(Order order : this.business.getOrderDirectory()){
                if(order.getWareHouse().getName().equals("wh2")){
                    if(order.getCompany().getName().equals("SF")){
                                                if(order.getAddress().equals("Washington")){
                            com1WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com1BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com1NY ++;
                        }

                    }else if(order.getCompany().getName().equals("EXPRESS")){
                        System.out.println("d2 " + order.getAddress());
                        if(order.getAddress().equals("Washington")){
                            com2WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com2BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com2NY ++;
                        }
                    }
                    else if(order.getCompany().getName().equals("UPS")){
                        if(order.getAddress().equals("Washington")){
                            com3WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com3BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com3NY ++;
                    }
                    }
                }
        }
            data.setValue(com1WA, "SF", "Washington");
            data.setValue(com1BOS, "SF", "Boston");
            data.setValue(com1NY, "SF", "New York");
            data.setValue(com2WA, "EXPRESS", "Washington");
            data.setValue(com2BOS, "EXPRESS", "Boston");
            data.setValue(com2NY, "EXPRESS", "New York");
            data.setValue(com3WA, "UPS", "Washington");
            data.setValue(com3BOS, "UPS", "Boston");
            data.setValue(com3NY, "UPS", "New York");
        }
        
        else if(this.account.getUsername().equals("wd3")){
            for(Order order : this.business.getOrderDirectory()){
                if(order.getWareHouse().getName().equals("wh1")){
                    if(order.getCompany().getName().equals("SF")){
                        if(order.getAddress().equals("Washington")){
                            com1WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com1BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com1NY ++;
                        }

                    }else if(order.getCompany().getName().equals("EXPRESS")){
                        if(order.getAddress().equals("Washington")){
                            com2WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com2BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com2NY ++;
                        }
                    }
                    else {
                        if(order.getAddress().equals("Washington")){
                            com3WA ++;
                        }
                        else if(order.getAddress().equals("Boston")){
                            com3BOS ++;
                        }
                        else if(order.getAddress().equals("New York")){
                            com3NY ++;
                    }
                    }
                }
        }
            data.setValue(com1WA, "SF", "Washington");
            data.setValue(com1BOS, "SF", "Boston");
            data.setValue(com1NY, "SF", "New York");
            data.setValue(com2WA, "EXPRESS", "Washington");
            data.setValue(com2BOS, "EXPRESS", "Boston");
            data.setValue(com2NY, "EXPRESS", "New York");
            data.setValue(com3WA, "UPS", "Washington");
            data.setValue(com3BOS, "UPS", "Boston");
            data.setValue(com3NY, "UPS", "New York");
        }
        return data;
    }
    
        public ChartPanel getPanel() {
		return frame1;
	}
        
    
            
}
