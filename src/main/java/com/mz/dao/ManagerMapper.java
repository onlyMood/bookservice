package com.mz.dao;

import com.mchange.v1.cachedstore.CachedStore;
import com.mz.pojo.Managers;

import java.util.List;

public interface ManagerMapper {
    int addManager(Managers manager);
    int deleteManager(String id);

    List<Managers> queryAllManagers();
    Managers queryManagerById(String id);

}
