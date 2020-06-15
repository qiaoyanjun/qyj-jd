package com.dvp.jidch.service;

import com.dvp.jidch.model.DynProject;
import com.dvp.jidch.model.DynWaiG;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DynWaiGRepository {

    List<DynWaiG> findALL();




    List<DynWaiG> getListByName(String wjy, String startData,String stopData);

}
