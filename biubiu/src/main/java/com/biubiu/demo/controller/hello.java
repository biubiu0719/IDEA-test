package com.biubiu.demo.controller;


import com.biubiu.demo.dao.HhhMapper;
import com.biubiu.demo.model.Hhh;
import com.biubiu.demo.model.HhhExample;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/hhh")
public class hello {
    @Autowired
    private HhhMapper hhhMapper;

    @PostMapping(value = "/add")
    @ResponseBody
    @Transactional
    public String  add(@RequestBody Map<String, Object> in, HttpServletResponse response){
        JsonObject res = new JsonObject();
//        HhhExample example = new HhhExample();
//        String mes="666";
//        Hhh p = new Hhh();
//        Hhh record = new Hhh();
//        record.setDassad("5555");
//        hhhMapper.insertSelective(record);

        res.addProperty("result", "处理成功");
        res.addProperty("status",2000);
        return res.toString();
    }





}
