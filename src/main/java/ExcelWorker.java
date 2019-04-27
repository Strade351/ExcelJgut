import model.Inconsistency;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWorker {
    private FileInputStream fileInputStream;
    private Workbook workbook;
    private Sheet sheet;
    private DataFormatter dataFormatter;

    ExcelWorker(String fileName) throws IOException {
        fileInputStream = new FileInputStream(fileName);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheetAt(0);
    }

    public Inconsistency readIncosistency(int rowNumber) {
        Row row = sheet.getRow(rowNumber - 1);
        dataFormatter = new DataFormatter();
        Inconsistency inconsistency = new Inconsistency();
        inconsistency.setYear(dataFormatter.formatCellValue(row.getCell(0)));
        inconsistency.setClaim(dataFormatter.formatCellValue(row.getCell(1)));
        inconsistency.setReference(dataFormatter.formatCellValue(row.getCell(2)));
        inconsistency.setRec(dataFormatter.formatCellValue(row.getCell(3)));
        inconsistency.setSSD(dataFormatter.formatCellValue(row.getCell(5)));
        inconsistency.setCreationDate(dataFormatter.formatCellValue(row.getCell(6)));
        inconsistency.setMonth(dataFormatter.formatCellValue(row.getCell(7)));
        inconsistency.setCloseMonth(dataFormatter.formatCellValue(row.getCell(8)));
        inconsistency.setProject(dataFormatter.formatCellValue(row.getCell(9)));
        inconsistency.setGrav(dataFormatter.formatCellValue(row.getCell(10)));
        inconsistency.setCons(dataFormatter.formatCellValue(row.getCell(12)));
        inconsistency.setAmount(dataFormatter.formatCellValue(row.getCell(14)));
        inconsistency.setDefectExplain(dataFormatter.formatCellValue(row.getCell(17)));
        inconsistency.setCauseOfNonDetect(dataFormatter.formatCellValue(row.getCell(19)));
        inconsistency.setActionPlanCP(dataFormatter.formatCellValue(row.getCell(20)));
        inconsistency.setDateOfFirstOK(dataFormatter.formatCellValue(row.getCell(21)));
        inconsistency.setRootCause(dataFormatter.formatCellValue(row.getCell(22)));
        inconsistency.setASESitem(dataFormatter.formatCellValue(row.getCell(23)));
        inconsistency.setSourceofDetect(dataFormatter.formatCellValue(row.getCell(24)));
        inconsistency.setGetActionPlanKD(dataFormatter.formatCellValue(row.getCell(25)));
        inconsistency.setDate(dataFormatter.formatCellValue(row.getCell(26)));

        return inconsistency;
    }

    public void createBlank(Inconsistency inconsistency) throws IOException, InvalidFormatException {
        Row row;
        Cell cell;
        try {
            workbook = WorkbookFactory.create(new File("blank_template.xlsx"));
            sheet = workbook.getSheetAt(0);

            //write claim
            row = sheet.getRow(0);
            cell = row.getCell(8);
            cell.setCellValue(inconsistency.getClaim());
            CellStyle cellStyle = cell.getCellStyle();

            //write reference
            row = sheet.getRow(3);
            cell = row.getCell(1);
            cell.setCellValue(inconsistency.getReference());

            //write amount
            row = sheet.getRow(10);
            cell = row.getCell(1);
            cell.setCellType(CellType.BLANK);
            cell.setCellValue(inconsistency.getReference());

            //write rec
            row = sheet.getRow(11);
            cell = row.getCell(1);
            cell.setCellValue(inconsistency.getRec());

            //write defect exp
            row = sheet.getRow(14);
            cell = row.getCell(0);
            cell.setCellValue(inconsistency.getDefectExplain());

            //write cause of non detect
            row = sheet.getRow(27);
            cell = row.getCell(0);
            cell.setCellValue(inconsistency.getCauseOfNonDetect());

            //write date of first OK shipment
            row = sheet.getRow(29);
            cell = row.getCell(6);
            cell.setCellValue(inconsistency.getDateOfFirstOK());

            //next sheet
            sheet = workbook.getSheetAt(1);

            //write claim
            row = sheet.getRow(0);
            cell = row.getCell(9);
            cell.setCellValue(inconsistency.getClaim());

            //write rootcause
            row = sheet.getRow(5);
            cell = row.getCell(0);
            cell.setCellValue(inconsistency.getRootCause());

            //write actionplan
            row = sheet.getRow(11);
            cell = row.getCell(2);
            cell.setCellValue(inconsistency.getGetActionPlanKD());

            //write date
            row = sheet.getRow(11);
            cell = row.getCell(9);
            cell.setCellValue(inconsistency.getDate());     //DATE FORMAT!!!

            FileOutputStream fileOut = new FileOutputStream("new blank.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("Успех!");
        }
        catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

    }
}
