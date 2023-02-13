package com.lerarquivo;
import java.io.File;
import java.io.IOException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class App 
{
    public static void main( String[] args ) throws BiffException, IOException
    {
        // Cria um objeto Workbook a partir do arquivo excel
        Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\Joely\\OneDrive\\Área de Trabalho\\Projeto\\demo\\src\\main\\java\\com\\lerarquivo\\teste.xls"));


        // Obtém a primeira planilha do arquivo
        Sheet sheet = workbook.getSheet(0);


//
     //    for (int i = 0; i < sheet.getRows(); i++) {
            // Itera através das colunas da linha atual
        //    for (int j = 0; j < sheet.getColumns(); j++) {
                // Obtém o valor da célula atual
           //     String cellValue = sheet.getCell(j, i).getContents();

                // Padrão para validação do número
         //       String pattern = "^\\d+$";
//Pattern r = Pattern.compile(pattern);
         //       Matcher m = r.matcher(cellValue);

            //    if (m.find() && cellValue.length() == 11) {
             //       System.out.println("https://wa.me/55" + cellValue);
          //      } else {
          //          if (cellValue.length()==13) {
            //            System.out.println("https://wa.me/" + cellValue);
              //      } else {
               //         System.out.println("Formato invalido");
                //    }
          //      }
         //   }
     //   }//
         // Itera através das linhas da planilha
        for (int i = 0; i < sheet.getRows(); i++) {
                // Itera através das colunas da linha atual
            for (int j = 0; j < sheet.getColumns(); j++) {
                    // Obtém o valor da célula atual
                String cellValue = sheet.getCell(j, i).getContents();
                System.out.print("O valor na coluna " + (j + 1) + " é: " + cellValue + " ");
            }
            System.out.println();
         }


            // Fecha o arquivo excel
        workbook.close();
    }
}
