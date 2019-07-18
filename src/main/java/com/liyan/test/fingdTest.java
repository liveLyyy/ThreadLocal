package com.liyan.test;

import com.liyan.pojo.Log;
import com.liyan.service.Impl.LogServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

public class fingdTest {
    @Test
    public void FInd(){
        LogServiceImpl logService=new LogServiceImpl();
        List<Log> list=logService.findAll();
        for (Log log:list){
            System.out.println(log);
        }
        List<Log> list1=logService.findAll();
        for (Log log:list1){
            System.out.println(log);
        }
    }
}
