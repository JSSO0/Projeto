import java.io.File;
import jxl.Sheet;
import jxl.Workbook;

public class lerExcel {

    public static void readExcel(String filePath) {
        try {
            // Cria um objeto Workbook a partir do arquivo excel
            Workbook workbook = Workbook.getWorkbook(new File(filePath));

            // Obtém a primeira planilha do arquivo
            Sheet sheet = workbook.getSheet(0);

            // Itera através das linhas da planilha
            for (int i = 0; i < sheet.getRows(); i++) {
                // Itera através das colunas da linha atual
                for (int j = 0; j < sheet.getColumns(); j++) {
                    // Obtém o valor da célula atual
                    String cellValue = sheet.getCell(j, i).getContents();
                    System.out.print(cellValue + " ");
                }
                System.out.println();
            }

            // Fecha o arquivo excel
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
