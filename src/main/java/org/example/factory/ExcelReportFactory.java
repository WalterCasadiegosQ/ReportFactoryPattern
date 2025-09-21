package org.example.factory;

import org.example.report.ExcelReport;
import org.example.report.Report;

public class ExcelReportFactory extends ReportFactory {

    @Override
    public Report createReport() {
        return new ExcelReport();
    }

}
