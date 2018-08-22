package org.cn.kkl.demo;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class DemoJFreeChart {

	public static void main(String[] args) {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("home appliance", 10086);
		dataset.setValue("food", 9527);
		dataset.setValue("department store", 110110);
		
		//title: chart title
		//dataset: data set
		//legend: if display legend
		//toolTips:mouse hover prompt
		//url: is it a hyperLink
		JFreeChart pieChart = ChartFactory.createPieChart("sales profit", dataset,true,true,true);
		
		//first parameter:file name
		//second parameter: chart
		//third parameter:chart width
		//fourth parameter: chart htight
		try {
			ChartUtils.saveChartAsJPEG(new File("D:\\temp1\\pie.jpeg"), pieChart, 500, 500);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
