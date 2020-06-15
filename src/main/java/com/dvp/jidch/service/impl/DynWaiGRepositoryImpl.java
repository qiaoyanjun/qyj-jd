package com.dvp.jidch.service.impl;

import com.dvp.jidch.mapper.DynWaiGMapper;
import com.dvp.jidch.model.DynWaiG;
import com.dvp.jidch.service.DynWaiGRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DynWaiGRepositoryImpl implements DynWaiGRepository {

    @Autowired
    private DynWaiGMapper dynWaiGMapper;

    @Override
    public List<DynWaiG> findALL() {
        return dynWaiGMapper.findALL();
    }



    @Override
    public List<DynWaiG> getListByName(String wjy, String startData, String stopData) {
        return dynWaiGMapper.getListByName(wjy,startData,stopData);
    }


}
