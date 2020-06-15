package com.dvp.jidch.service.impl;


import com.dvp.jidch.mapper.WaiGuanGuanLiMapper;
import com.dvp.jidch.model.WaiGuanGuanLi;
import com.dvp.jidch.service.WaiGuanGuanLiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WaiGuanGuanLiRepositoryImpl implements WaiGuanGuanLiRepository {
    @Autowired
    private WaiGuanGuanLiMapper waiGuanGuanLiMapper;

    @Override
    public List<WaiGuanGuanLi> findALL() {
        return waiGuanGuanLiMapper.findALL();
    }

    @Override
    public WaiGuanGuanLi findById(long id) {
        return  waiGuanGuanLiMapper.findById(1);
    }
    @Override
    public List<WaiGuanGuanLi> getListByWjy(String wjy) {
        return waiGuanGuanLiMapper.getListByWjy(wjy);
    }
}

