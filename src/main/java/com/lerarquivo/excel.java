import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

    public static void main(String[] args) throws IOException {
        // Caminho para o arquivo XLSX
        String filePath = "./teste.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Expressão regular para validar o número de telefone
        String phoneRegex = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);

        // String para armazenar os dados validados
        StringBuilder validatedData = new StringBuilder();

        // Adicionando cabeçalho da tabela HTML
        validatedData.append("<table>");
        validatedData.append("<tr>");
        validatedData.append("<th>Número de Telefone</th>");
        validatedData.append("<th>Link do WhatsApp</th>");
        validatedData.append("</tr>");

        for (Row row : sheet) {
            for (Cell cell : row) {
                String cellValue = cell.getStringCellValue();
                if (phonePattern.matcher(cellValue).matches()) {
                    // Adicionando dados validados à tabela HTML
                    validatedData.append("<tr>");
                    validatedData.append("<td>" + cellValue + "</td>");
                    validatedData.append("<td>https://wa.me/" + cellValue + "</td>");
                    validatedData.append("</tr>");
                }
            }
        }
        // Fechando tabela HTML
        validatedData.append("</table>");

        // Exibindo dados validados
        System.out.println(validatedData);
        workbook.close();
        inputStream.close();
    }
}   
