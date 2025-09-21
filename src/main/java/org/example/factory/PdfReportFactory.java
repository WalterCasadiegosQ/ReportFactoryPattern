package org.example.factory;

import org.example.report.PdfReport;
import org.example.report.Report;

public class PdfReportFactory extends ReportFactory {

    @Override
    public Report createReport() {
        return new PdfReport();
    }

}
