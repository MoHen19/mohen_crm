package com.mohen.crm.exceptions;

/**
 * 使用运行期异常实现参数校验 当参数不合法时 程序抛出运行期异常
 * 定义异常抛出静态方法 当参数条件表达式为 true 时 程序抛出运行期异常
 * @author MH19
 */
public class ParamsException extends RuntimeException{
    /*
        定义运行期异常类 ParamsException
        自定义参数异常
     */
    private Integer code=300;
    private String msg="参数异常!";

    public ParamsException() {
        super("参数异常!");
    }

    public ParamsException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ParamsException(Integer code) {
        super("参数异常!");
        this.code = code;
    }

    public ParamsException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
