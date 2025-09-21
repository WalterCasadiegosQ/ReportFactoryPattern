package org.example.datasource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcelDataSource extends ReportDataSource {

    private List<Double> numbers;

    public ExcelDataSource() {
        this.numbers = new ArrayList<>();
    }

    public ExcelDataSource(List<Double> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    public void addNumber(Double number) {
        this.numbers.add(number);
    }

    @Override
    public Object getData() {
        return numbers;
    }

}