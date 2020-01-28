package cn.hutool.luffyu.util.result.code;

/**
 * @author luffyu
 * Created on 2019-07-12
 */
public enum SysCode implements ICodeHandle{


    /**
     * 系统的code 从 1-**-**开始
     */

    /**
     * 1-1*-** 表示系统成功的提示
     */
    SUCCESS("10100","成功"),

    /**
     * 1-2*-** 表示系统异常的提示
     */
    SYSTEM_ERROR("10200","系统错误"),
    PARAM_ERROR("10201","参数错误");

    ;
    public String code;

    public String msg;


    SysCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }}
