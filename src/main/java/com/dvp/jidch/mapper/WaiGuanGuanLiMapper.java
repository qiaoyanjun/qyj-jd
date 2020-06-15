package com.dvp.jidch.mapper;

import com.dvp.jidch.model.DongTaiGuanLi;
import com.dvp.jidch.model.WaiGuanGuanLi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("WaiGuanGuanLiMapper")
public interface WaiGuanGuanLiMapper {
    List<WaiGuanGuanLi> findALL();
    WaiGuanGuanLi findById(long id);

    List<WaiGuanGuanLi> getListByWjy(@Param("wjy")String wjy);

}
