package ua.courseAssignment.group3.automaticallytesting.service;

import ua.courseAssignment.group3.automaticallytesting.model.DataSet;

import java.util.List;

public interface DataSetService {

    DataSet getDataSetById(Integer id);

    void updateDataSet(DataSet editedDataset);

    long createDataSet(String name);

    List<DataSet> getAllDataSet();

    List<DataSet> getAll();

    int deleteDataSet(long id);
}
