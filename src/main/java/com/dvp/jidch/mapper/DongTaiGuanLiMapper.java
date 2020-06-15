package com.dvp.jidch.mapper;

import com.dvp.jidch.model.DongTaiGuanLi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("DongTaiGuanLiMapper")
public interface DongTaiGuanLiMapper {
    List<DongTaiGuanLi> findALL();
    DongTaiGuanLi findById(long id);

    List<DongTaiGuanLi> getListByName(@Param("name")String name);

}
