package larissagalao.com.github.financialcontrol.entities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


import javax.swing.*;
import java.util.HashMap;


public class Graph extends JFrame {

    public void createGraph(HashMap<String, Integer> hashMap){

        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setName("Graph 1");
        setSize(700, 400);

        DefaultCategoryDataset bar = new DefaultCategoryDataset();

        for (String key : hashMap.keySet()) {
            bar.setValue(hashMap.get(key), key, "");
        }

        JFreeChart graph = ChartFactory.createBarChart("Bills in function of Type", "Type", "amount spent", bar, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel = new ChartPanel(graph);
        add(panel);

        setVisible(true);

    }

}
