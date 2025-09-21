package org.example.report;

import org.example.datasource.ReportDataSource;

public class PdfReport implements Report {

    @Override
    public void generate(ReportDataSource data) {
        System.out.println("Generando PDF con datos: " + data.getData());
    }

}