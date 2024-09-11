package com.kpl.controller;

import com.kpl.service.NameGeneratedService;
import com.kpl.vo.ResultObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/game")
public class NameGeneratedController {

    @Resource
    private NameGeneratedService nameGeneratedService;

    /**
     * 生成名
     * @param map
     * @return
     */
    @PostMapping("/NameGenerated")
    public ResultObject NameGenerated(@RequestBody Map<String, String> map) throws Exception {
        return nameGeneratedService.NameGenerated(map);
    }
}