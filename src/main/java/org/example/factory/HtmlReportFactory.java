package org.example.factory;

import org.example.report.HtmlReport;
import org.example.report.Report;

public class HtmlReportFactory extends ReportFactory {

    @Override
    public Report createReport() {
        return new HtmlReport();
    }

}
