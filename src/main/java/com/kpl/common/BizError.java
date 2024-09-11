package com.kpl.common;

/**
 * 异常码枚举
 */
public enum BizError {

    /**
     * 服务问题
     */
    SYSTEM_ERROR(0,"服务异常"),


    NOT_LOGIN_ERROR(101,"您未登录，请登录后操作"),
    NOT_PERMISSION_ERROR(102,"您没有操作权限，请联系管理员"),
    TOKEN_ERROR(103,"错误的令牌，拒绝访问"),
    TOKEN_FAILURE(104,"登录已失效，请重新登录"),
    LOGIN_VALIDATION_ERRO(106,"验证登录异常"),


    PARAMETER_NULL_ERROR(202,"空参异常"),


    RESULT_NULL_ERROR(303,"数据为空"),

    RESULT_NULL_SCHEME(302,"方案为空"),

    RESULT_NULL_MINUS(306,"生产单异常"),

    /**
     * 账户问题
     */
    USER_ALREADY_REG(401, "此用户名已注册"),
    USER_ALREADY_UPDATE(401, "此用户名已经存在"),
    USER_ALREADY_LOGIN(403, "帐号在另一处登录"),

    /**
     * 角色问题
     */
    ROLE_ALREADY_REG(501,"此角色已存在"),

    /*查询问题*/
    NO_RELEVANT_DOCUMENTS(-1,"查无相关单据,无法进行投产");


    private Integer errorCode;
    private String errorDesc;

    private BizError(Integer errorCode, String  errorDesc){
        this.errorCode=errorCode;
        this.errorDesc=errorDesc;
    }

    public Integer getErrorCode(){
        return this.errorCode;
    }

    public String getErrorDesc(){
        return this.errorDesc;
    }



}
