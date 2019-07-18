package com.liyan.mapper;

import com.liyan.pojo.Log;

import java.util.List;

public interface LogMapper {
    int insert(Log log);

    List<Log> findAll();
}
