
package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay(String title) {
        super(title);
        this.setContentPane(createPanel());
        this.pack();
        
    }
    
    public void execute(){
        this.setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histogram",
                                                        "Dominios emails",
                                                        "Nº emails",
                                                        dataset,
                                                        PlotOrientation.VERTICAL,
                                                        false, 
                                                        false,
                                                        rootPaneCheckingEnabled);
        return chart;
    
    }
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(6, "", "ulpgc.es");
        dataSet.addValue(2, "", "dis.ulpgc.es");
        dataSet.addValue(9, "", "eii.ulpgc.es");
        dataSet.addValue(1, "", "gmail.es");
        dataSet.addValue(5, "", "hotmail.es");

        return dataSet;
    }
}
