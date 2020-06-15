package com.dvp.jidch.mapper;

import com.dvp.jidch.model.DongTaiGuanLi;
import com.dvp.jidch.model.DynProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("DynProjectMapper")
public interface DynProjectMapper {

    List<DynProject> findALL();

    DynProject findById(long id);


    List<DynProject> getDynProjectByNamesss(@Param("dpdtjyy")String dpdtjyy);

    List<DynProject> getListByName(@Param("dpdtjyy")String dpdtjyy,String startData,String stopData);

}
