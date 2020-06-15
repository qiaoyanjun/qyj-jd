package com.dvp.jidch.web;

import com.dvp.jidch.model.DongTaiGuanLi;
import com.dvp.jidch.model.DynProject;
import com.dvp.jidch.model.DynWaiG;
import com.dvp.jidch.model.WaiGuanGuanLi;
import com.dvp.jidch.service.DongTaiGuanLiRepository;
import com.dvp.jidch.service.DynProjectRepository;
import com.dvp.jidch.service.DynWaiGRepository;
import com.dvp.jidch.service.WaiGuanGuanLiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebControllerRest {

    @Autowired
    DongTaiGuanLiRepository dongTaiGuanLiRepository;

    @Autowired
    WaiGuanGuanLiRepository waiGuanGuanLiRepository;

    @Autowired
    DynProjectRepository dynProjectRepository;

    @Autowired
    DynWaiGRepository dynWaiGRepository;

    @RequestMapping(value = "/getDongTList")
    public List<DongTaiGuanLi> getDTAll(){
        List<DongTaiGuanLi> listDT = dongTaiGuanLiRepository.findALL();
        return listDT;
    }

    @RequestMapping(value = "/getDongTListByName/{name}")
    public List<DongTaiGuanLi> getDongTListByName(@PathVariable String name){
        System.out.println(name);
        List<DongTaiGuanLi> listSearch = dongTaiGuanLiRepository.getListByName(name);
        return listSearch;
    }

    @RequestMapping(value = "/getWaiGList")
    public List<WaiGuanGuanLi> getWGAll(){
        List<WaiGuanGuanLi> listDT = waiGuanGuanLiRepository.findALL();
        return listDT;
    }

    @RequestMapping(value = "/getWaiGListByWjy/{wjy}")
    public List<WaiGuanGuanLi> getWaigListByWjy(@PathVariable String wjy){
        List<WaiGuanGuanLi> listSearch = waiGuanGuanLiRepository.getListByWjy(wjy);
        return listSearch;
    }

    @RequestMapping(value = "/getDynProject")
    public List<DynProject> getDynProjectListAll(){
        List<DynProject> listDT = dynProjectRepository.findALL();
        return listDT;
    }



    @RequestMapping(value = "/getDynProjectByName")
    public List<DynProject> getDynProjectListByName(String search, String startTime,String  stopTime){
        String startData="";
        String stopData="";
        if(startTime.trim()!=null&&startTime.trim().length()>0){
             startData = startTime.replaceAll("-","");
        }
        if(stopTime.trim()!=null&&stopTime.trim().length()>0) {
             stopData = stopTime.replaceAll("-", "");
        }
        List<DynProject> listSearch = dynProjectRepository.getListByName(search,startData,stopData);
        return listSearch;
    }


    @RequestMapping(value = "/getDynWaiG")
    public List<DynWaiG> getDynWaiGListAll(){
        List<DynWaiG> listDT = dynWaiGRepository.findALL();
        return listDT;
    }



    @RequestMapping(value = "/getDynWaiGByName")
    public List<DynWaiG> getDynWaiGListByName(String search, String startTime,String  stopTime){
        String startData="";
        String stopData="";
        if(startTime.trim()!=null&&startTime.trim().length()>0){
            startData = startTime.replaceAll("-","");
        }
        if(stopTime.trim()!=null&&stopTime.trim().length()>0) {
            stopData = stopTime.replaceAll("-", "");
        }
        List<DynWaiG> listSearch = dynWaiGRepository.getListByName(search,startData,stopData);
        return listSearch;
    }


}
