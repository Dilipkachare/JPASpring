package dilip.com.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dilip.com.entity.Employee;

public class ExcelHelper {

    public static List<Employee> excelToEmployees(InputStream is) {

        List<Employee> employeeList = new ArrayList<>();

        try {
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();

            int rowNumber = 0;

            while (rows.hasNext()) {
                Row row = rows.next();

                // Skip header row
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Employee employee = new Employee();

                employee.setName(row.getCell(0).getStringCellValue());
                employee.setEmail(row.getCell(1).getStringCellValue());
                employee.setSalary(row.getCell(2).getNumericCellValue());

                employeeList.add(employee);
            }

            workbook.close();

        } catch (Exception e) {
            throw new RuntimeException("Failed to parse Excel file: " + e.getMessage());
        }

        // ✅ MUST return List<Employee>
        return employeeList;
    }
}
