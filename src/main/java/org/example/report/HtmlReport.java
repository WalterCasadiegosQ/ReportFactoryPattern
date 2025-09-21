package org.example.report;

import org.example.datasource.ReportDataSource;

public class HtmlReport implements Report {

    @Override
    public void generate(ReportDataSource data) {
        System.out.println("Generando HTML con datos: " + data.getData());
    }

}
