package com.dvp.jidch.service;

import com.dvp.jidch.model.DongTaiGuanLi;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DongTaiGuanLiRepository {
    List<DongTaiGuanLi> findALL();
    DongTaiGuanLi findById(long id);

    List<DongTaiGuanLi> getListByName(String name);
}
