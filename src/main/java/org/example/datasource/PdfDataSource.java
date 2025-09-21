package org.example.datasource;

public class PdfDataSource extends ReportDataSource {

    private String contractText;

    public PdfDataSource(String contractText) {
        this.contractText = contractText;
    }

    @Override
    public Object getData() {
        return contractText;
    }

}
