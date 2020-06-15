package com.dvp.jidch.mapper;

import com.dvp.jidch.model.DynProject;
import com.dvp.jidch.model.DynWaiG;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("DynWaiGMapper")
public interface DynWaiGMapper {

    List<DynWaiG> findALL();



    List<DynWaiG> getListByName(String wjy,String startData,String stopData);

}
