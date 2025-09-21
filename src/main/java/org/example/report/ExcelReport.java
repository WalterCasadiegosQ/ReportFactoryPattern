package org.example.report;

import org.example.datasource.ReportDataSource;

public class ExcelReport implements Report {

    @Override
    public void generate(ReportDataSource data) {
        System.out.println("Generando Excel con datos: " + data.getData());
    }

}
