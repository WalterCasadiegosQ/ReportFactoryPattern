package org.example;

import org.example.datasource.ExcelDataSource;
import org.example.datasource.HtmlDataSource;
import org.example.datasource.PdfDataSource;
import org.example.factory.ExcelReportFactory;
import org.example.factory.HtmlReportFactory;
import org.example.factory.PdfReportFactory;
import org.example.factory.ReportFactory;
import org.example.report.Report;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistema de Generación de Reportes ===");
            System.out.println("1. Generar Reporte PDF");
            System.out.println("2. Generar Reporte Excel");
            System.out.println("3. Generar Reporte HTML");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            ReportFactory factory = null;
            Report report = null;

            switch (opcion) {
                case 1:
                    factory = new PdfReportFactory();
                    report = factory.createReport();

                    System.out.print("Ingrese el texto del contrato: ");
                    String contractText = scanner.nextLine();

                    PdfDataSource pdfData = new PdfDataSource(contractText);
                    report.generate(pdfData);
                    break;

                case 2:
                    factory = new ExcelReportFactory();
                    report = factory.createReport();

                    System.out.print("Ingrese números separados por coma: ");
                    String[] nums = scanner.nextLine().split(",");
                    ExcelDataSource excelData = new ExcelDataSource();

                    for (String n : nums) {
                        excelData.addNumber(Double.parseDouble(n.trim()));
                    }
                    report.generate(excelData);
                    break;

                case 3:
                    factory = new HtmlReportFactory();
                    report = factory.createReport();

                    System.out.print("Ingrese contenido HTML: ");
                    String htmlContent = scanner.nextLine();

                    HtmlDataSource htmlData = new HtmlDataSource(htmlContent);
                    report.generate(htmlData);
                    break;

                case 4:
                    running = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
        scanner.close();
    }
}