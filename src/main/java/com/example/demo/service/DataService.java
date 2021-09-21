package com.example.demo.service;

import com.example.demo.Data;
import com.example.demo.dao.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public void saveToDB(List<Data> dataList) {
        dataRepository.saveAll(dataList);
    }
}
