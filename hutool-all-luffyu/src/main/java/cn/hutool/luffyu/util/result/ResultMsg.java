package cn.hutool.luffyu.util.result;


import cn.hutool.luffyu.util.result.code.ICodeHandle;
import cn.hutool.luffyu.util.result.code.SysCode;

import java.io.Serializable;

/**
 * @author luffyu
 * Created on 2019-07-12
 */
public class ResultMsg implements IResultHandle, Serializable {

    /**
     * code信息
     */
    private String code;

    /**
     * msg信息
     */
    private String msg;

    /**
     * 数据信息
     */
    private Object data;


    public ResultMsg() {
    }

    public ResultMsg(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 返回成功
     * @return 返回成功
     */
    public static ResultMsg success(){
        return success(null);
    }
    public static ResultMsg success(Object data){
        return create(SysCode.SUCCESS,data);
    }


    /**
     * 返回失败
     * @return 返回失败
     */
    public static ResultMsg error(){
        return error(null);
    }


    public static ResultMsg error(Object data){
        return create(SysCode.SYSTEM_ERROR,data);
    }


    public static ResultMsg error(String msg){
        return create(SysCode.SYSTEM_ERROR.code,SysCode.SYSTEM_ERROR.msg + " "+ msg,null);
    }

    /**
     * 创建result信息
     * @param codeHandle code的信息
     * @return 返回创建的信息
     */

    public static ResultMsg create(ICodeHandle codeHandle){
        return create(codeHandle,null);
    }

    public static ResultMsg create(ICodeHandle codeHandle, Object data){
        return create(codeHandle.getCode(),codeHandle.getMsg(),data);
    }

    public static ResultMsg create(String code, String msg, Object data){
        return new ResultMsg(code,msg,data);
    }



    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    @Override
    public Object getData() {
        return this.data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
