package com.mz.service;

import com.mz.pojo.Managers;

import java.util.List;

public interface ManagerService {
        int addManager(Managers manager);
        int deleteManager(String id);

        List<Managers> queryAllManagers();
        Managers queryManagerById(String id);
}
