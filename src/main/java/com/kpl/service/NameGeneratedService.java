package com.kpl.service;



import com.kpl.vo.ResultObject;

import java.util.Map;

public interface NameGeneratedService {
    /**
     * 生成名称
     * @param  map
     * @return
     */
    ResultObject NameGenerated(Map<String,String> map) throws Exception;

//
}
