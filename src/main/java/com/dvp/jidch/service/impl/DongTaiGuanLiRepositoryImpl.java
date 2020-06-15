package com.dvp.jidch.service.impl;

import com.dvp.jidch.mapper.DongTaiGuanLiMapper;
import com.dvp.jidch.model.DongTaiGuanLi;
import com.dvp.jidch.service.DongTaiGuanLiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DongTaiGuanLiRepositoryImpl implements DongTaiGuanLiRepository {
    @Autowired
    private com.dvp.jidch.mapper.DongTaiGuanLiMapper dongTaiGuanLiMapper;

    @Override
    public List<DongTaiGuanLi> findALL() {
        return dongTaiGuanLiMapper.findALL();
    }

    @Override
    public DongTaiGuanLi findById(long id) {
        return dongTaiGuanLiMapper.findById(1);
    }

    @Override
    public List<DongTaiGuanLi> getListByName(String name) {
        return dongTaiGuanLiMapper.getListByName(name);
    }
}

