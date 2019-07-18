package com.liyan.service;

import com.liyan.pojo.Log;

import java.util.List;

public interface LogService {
    int insert(Log log);
    List<Log> findAll();
}
