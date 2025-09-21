package org.example.datasource;

public class HtmlDataSource extends ReportDataSource {

    private String htmlContent;

    public HtmlDataSource(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public Object getData() {
        return htmlContent;
    }

}
