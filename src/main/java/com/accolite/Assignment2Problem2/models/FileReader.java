package com.accolite.Assignment2Problem2.models;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FileReader {


    public static List<DataModel> readExcel(String filePath) throws IOException {
        List<DataModel> data = new ArrayList<>();

        try (FileInputStream input = new FileInputStream("Interview_Data");
             HSSFWorkbook workbook = (HSSFWorkbook) WorkbookFactory.create(input);) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            Iterator<Row> rowIterator = sheet.iterator();

            // Assuming the first row contains headers, skip it
            if (rowIterator.hasNext()) {
                rowIterator.next();
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                DataModel dataModel = new DataModel();

                dataModel.setDate(getCellValue(row.getCell(0)));
                dataModel.setMonth(getMonthCellValue(row.getCell(1)));
                dataModel.setTeam(getCellValue(row.getCell(2)));
                dataModel.setPanelName(getCellValue(row.getCell(3)));
                dataModel.setRound(getCellValue(row.getCell(4)));
                dataModel.setSkill(getCellValue(row.getCell(5)));
                dataModel.setTime(getTimeCellValue(row.getCell(6)));
                dataModel.setCandidateCurrentLocation(getCellValue(row.getCell(7)));
                dataModel.setCandidatePreferedLocation(getCellValue(row.getCell(8)));
                dataModel.setCandidateName(getCellValue(row.getCell(9)));

                data.add(dataModel);
            }
        }

        return data;
    }

    private static String getCellValue(Cell cell) {
        return cell != null ? cell.toString() : "";
    }

    private static String getMonthCellValue(Cell cell) {
        if (cell != null) {
            switch (cell.getCellType()) {
                case STRING:
                    return cell.getStringCellValue();
                case NUMERIC:
                    // Assuming the numeric value represents a date
                    // Format the date as "MMM-yy" using SimpleDateFormat
                    SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-yy");
                    return dateFormat.format(cell.getDateCellValue());
                default:
                    return "Oct-23";
            }
        } else {
            return "Nov-23";
        }
    }

    private static String getTimeCellValue(Cell cell) {
        if (cell != null) {
            switch (cell.getCellType()) {
                case STRING:
                    return cell.getStringCellValue();
                case NUMERIC:
                    // Assuming the numeric value represents a date
                    // Format the date as "hh:mm a" using SimpleDateFormat
                    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
                    return dateFormat.format(cell.getDateCellValue());
                default:
                    return "";
            }
        } else {
            return "";
        }
    }
}