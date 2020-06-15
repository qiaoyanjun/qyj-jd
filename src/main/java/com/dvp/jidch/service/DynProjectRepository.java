package com.dvp.jidch.service;

import com.dvp.jidch.model.DongTaiGuanLi;
import com.dvp.jidch.model.DynProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DynProjectRepository {

    List<DynProject> findALL();

    DynProject findById(long id);

    List<DynProject> getDynProjectByNamesss(@Param("dpdtjyy")String dpdtjyy);

    List<DynProject> getListByName(String dpdtjyy, String startData,String stopData);

}
