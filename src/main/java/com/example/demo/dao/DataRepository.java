package com.example.demo.dao;

import com.example.demo.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository  extends CrudRepository<Data, String> {
}
