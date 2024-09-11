package com.kpl.service.impl;

import com.kpl.service.NameGeneratedService;
import com.kpl.utils.MyStringUtils;
import com.kpl.vo.ResultObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class NameGeneratedServiceImpl implements NameGeneratedService {



    /**
     * 生成名称
     * @param map
     * @return
     */
    @Override
    public ResultObject NameGenerated(Map<String, String> map) throws Exception {
        String name = map.get("name");
        if (StringUtils.isEmpty(name)) {
            throw new Exception("请输入要修改的名称！");
        }
        if (!isValidName(name)) {
            throw new Exception("名称超过长度限制！");
        }
        String newName = MyStringUtils.CharacterSegmentation(name);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("newName", newName);
        log.info("旧名字:{}---新名字:{}", name, newName);
        //数据库修改count
        return ResultObject.success(dataMap);
    }

    /**
     * 有效名称判断
     * @param name
     * @return
     */
    public static boolean isValidName(String name) {
        int length = name.length();
        int chineseCharCount = 0;

        for (int i = 0; i < length; i++) {
            if (Character.toString(name.charAt(i)).matches("[\\u4e00-\\u9fa5]")) {
                chineseCharCount++;
            }
        }

        // 中文字符占用2个字符位，其他字符占1个字符位
        int totalCharCount = length + chineseCharCount;

        return totalCharCount <= 11;
    }

}
