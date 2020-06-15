package com.dvp.jidch.service;

import com.dvp.jidch.model.DongTaiGuanLi;
import com.dvp.jidch.model.WaiGuanGuanLi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WaiGuanGuanLiRepository {
    List<WaiGuanGuanLi> findALL();
    WaiGuanGuanLi findById(long id);

    List<WaiGuanGuanLi> getListByWjy(String wjy);
}
