package cn.hutool.luffyu.util.result.exception;


import cn.hutool.luffyu.util.exception.BaseException;
import cn.hutool.luffyu.util.result.IResultHandle;
import cn.hutool.luffyu.util.result.ResultMsg;
import cn.hutool.luffyu.util.result.code.ICodeHandle;
import cn.hutool.core.util.StrUtil;

/**
 * @author luffyu
 * Created on 2019-07-12
 */
public class BaseResultException extends BaseException implements IResultException {

    private IResultHandle handle;


    public BaseResultException(String msg) {
        super(msg);
        this.handle = ResultMsg.error(msg);
    }

    public BaseResultException(IResultHandle handle) {
        super(handle.getMsg());
        this.handle = handle;
    }

    public BaseResultException(String code, String msg, Object data) {
        super(msg);
        this.handle = ResultMsg.create(code,msg,data);
    }


    public BaseResultException(ICodeHandle handle, Object data) {
        super(handle.getCode() + ":" +handle.getMsg());
        this.handle = ResultMsg.create(handle,data);
    }


    public BaseResultException(ICodeHandle handle) {
        super(handle.getCode() + ":" +handle.getMsg());
        this.handle = ResultMsg.create(handle);
    }


    public BaseResultException(ICodeHandle handle, String msg, Object ... arguments) {
        super(handle.getCode() + ":" +handle.getMsg());
        String logMassage = handle.getMsg() + "," + StrUtil.format(msg,arguments);
        this.handle = ResultMsg.create(handle.getCode(),logMassage,null);
    }


    @Override
    public IResultHandle getResult() {
        return this.handle;
    }
}
