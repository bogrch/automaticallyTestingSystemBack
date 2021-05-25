package ua.courseAssignment.group3.automaticallytesting.dao;

import ua.courseAssignment.group3.automaticallytesting.model.DataSet;

import java.util.List;

public interface DataSetDAO {
    DataSet getDataSetById(Integer dataSetId);

    List<DataSet> getAllDataSet();

    void updateDataSet(DataSet editedDataSet);

    long createDataSet(String name);

    List<DataSet> getAll();

    int deleteDataSet(long id);

}
