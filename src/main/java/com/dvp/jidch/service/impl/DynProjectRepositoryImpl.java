package com.dvp.jidch.service.impl;

import com.dvp.jidch.mapper.DynProjectMapper;
import com.dvp.jidch.model.DynProject;
import com.dvp.jidch.service.DynProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DynProjectRepositoryImpl  implements DynProjectRepository {

    @Autowired
    private DynProjectMapper dynProjectMapper;

    @Override
    public List<DynProject> findALL() {
        return dynProjectMapper.findALL();
    }

    @Override
    public DynProject findById(long id) {
        return dynProjectMapper.findById(id);
    }

    @Override
    public List<DynProject> getDynProjectByNamesss(String dpdtjyy) {
        return dynProjectMapper.getDynProjectByNamesss(dpdtjyy);
    }

    @Override
    public List<DynProject> getListByName(String dpdtjyy, String startData, String stopData) {
        return dynProjectMapper.getListByName(dpdtjyy,startData,stopData);
    }


}
