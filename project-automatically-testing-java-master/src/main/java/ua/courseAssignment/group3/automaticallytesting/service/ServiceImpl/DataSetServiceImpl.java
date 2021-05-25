package ua.courseAssignment.group3.automaticallytesting.service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.courseAssignment.group3.automaticallytesting.dao.DataSetDAO;
import ua.courseAssignment.group3.automaticallytesting.model.DataSet;
import ua.courseAssignment.group3.automaticallytesting.service.DataSetService;

import java.util.List;

@Service
public class DataSetServiceImpl implements DataSetService {

    private final DataSetDAO dataSetDAO;

    @Autowired
    public DataSetServiceImpl(DataSetDAO dataSetDAO){
        this.dataSetDAO = dataSetDAO;
    }

    /**
     * Returns DataSet by dataSet dataSetId
     * @param dataSetId needed for getting value from DB
     * @return DataSet
     */
    @Override
    public DataSet getDataSetById(Integer dataSetId) {
        return dataSetDAO.getDataSetById(dataSetId);
    }

    /**
     * Void method for updating DataSet
     * @param editedDataSet needed for updating DataSet
     */
    @Transactional
    @Override
    public void updateDataSet(DataSet editedDataSet) {
        dataSetDAO.updateDataSet(editedDataSet);
    }

    @Override
    public long createDataSet(String name) {
        return dataSetDAO.createDataSet(name);
    }

    @Override
    public int deleteDataSet(long id) {
        return dataSetDAO.deleteDataSet(id);
    }

    @Override
    public List<DataSet> getAllDataSet() {
        return dataSetDAO.getAllDataSet();
    }

    @Override
    public List<DataSet> getAll(){
        return dataSetDAO.getAll();
    }
}
