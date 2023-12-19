package com.accolite.Assignment2Problem2;

import com.accolite.Assignment2Problem2.models.ChartGenerator;
import com.accolite.Assignment2Problem2.models.DataModel;
import com.accolite.Assignment2Problem2.models.DatabaseManager;
import com.accolite.Assignment2Problem2.models.PdfGenerator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.XMLReader;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.URL;
import org.jfree.chart.JFreeChart;

import java.util.List;

import org.jfree.chart.JFreeChart;

import java.util.List;

public class Assingment2Problem2Application {
	public static void main(String[] args) {
		try {
			// Step 1: Create table in the database
			DatabaseManager.createTable();

			// Step 2: Read Excel data
			List<DataModel> data = (List<DataModel>) new FileReader("C:/Users/sakshi.singh/Assignment/Assignment2Problem2/src/main/java/com/accolite/Assignment2Problem2/resources/Interview_Data.xlsx");

			// Step 3: Insert data into the database
			DatabaseManager.insertData(data);
			DatabaseManager.teamWithMaxInterviews();
			DatabaseManager.teamWithMinInterviews();
			DatabaseManager.top3Skills();
			DatabaseManager.top3Panels();
			DatabaseManager.skillsInPeakTime();

			// Step 4: Generate charts
			JFreeChart chart = ChartGenerator.createChart(data);

			// Step 5: Generate PDF and embed charts
			PdfGenerator.generatePdf(data, "C:/Users/sakshi.singh/Assignment/Assignment2Problem2/src/main/java/com/accolite/Assignment2Problem2/resources/output.pdf");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}