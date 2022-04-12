package com.mz.service;

import com.mz.dao.ManagerMapper;
import com.mz.pojo.Managers;

import java.util.List;

public class ManagerServiceImpl implements ManagerService{
    private ManagerMapper managerMapper;
    public void setManagerMapper(ManagerMapper managerMapper){
        this.managerMapper=managerMapper;
    }

    public int addManager(Managers manager) {
        return managerMapper.addManager(manager);
    }

    public int deleteManager(String id) {
        return managerMapper.deleteManager(id);
    }

    public List<Managers> queryAllManagers() {
        return managerMapper.queryAllManagers();
    }

    public Managers queryManagerById(String id) {
        return managerMapper.queryManagerById(id);
    }
}
