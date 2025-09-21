package org.example.report;

import org.example.datasource.ReportDataSource;

public interface Report {
    void generate(ReportDataSource data);
}