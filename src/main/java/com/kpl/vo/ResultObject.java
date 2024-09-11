package com.kpl.vo;

import com.kpl.common.BizError;
import lombok.Data;

/**
 * 统一响应格式
 *
 * @author panjiabao
 * @date 2019-09-29 13:10
*/
@Data
public class ResultObject {
    public static final Integer SUCCESS_CODE = 200;
    public static final Integer ERROR_CODE = 500;

    private Integer code;
    private String message;
    private Object data;

    //返回成功
    public static ResultObject success(){
        ResultObject resultObject = new ResultObject();
        resultObject.setCode(SUCCESS_CODE);
        resultObject.setMessage("success");
        return resultObject;
    }

    //返回成功
    public static ResultObject error(String message){
        ResultObject resultObject = new ResultObject();
        resultObject.setCode(ERROR_CODE);
        resultObject.setMessage(message);
        return resultObject;
    }

    //返回成功
    public static ResultObject error(Integer code,String message){
        ResultObject resultObject = new ResultObject();
        resultObject.setCode(code);
        resultObject.setMessage(message);
        return resultObject;
    }

    //返回成功
    public static ResultObject success(Object data){
        ResultObject resultObject = new ResultObject();
        resultObject.setCode(SUCCESS_CODE);
        resultObject.setMessage("success");
        resultObject.setData(data);
        return resultObject;
    }


    public ResultObject(){}

    public ResultObject(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public ResultObject(Integer code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultObject(BizError bizError){
        this.code = bizError.getErrorCode();
        this.message = bizError.getErrorDesc();
    }

}
