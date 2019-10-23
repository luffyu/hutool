package cn.hutool.coocaa.util.result.exception;


import cn.hutool.core.util.StrUtil;
import cn.hutool.coocaa.util.exception.BaseRunTimeException;
import cn.hutool.coocaa.util.result.IResultHandle;
import cn.hutool.coocaa.util.result.ResultMsg;
import cn.hutool.coocaa.util.result.code.ICodeHandle;

/**
 * @author luffyu
 * Created on 2019-07-12
 */
public class BaseResultRunTimeException extends BaseRunTimeException implements IResultException {

    private IResultHandle handle;


    public BaseResultRunTimeException(String msg) {
        super(msg);
        this.handle = ResultMsg.error(msg);
    }

    public BaseResultRunTimeException(IResultHandle handle) {
        super(handle.getMsg());
        this.handle = handle;
    }

    public BaseResultRunTimeException(String code, String msg, Object data) {
        super(msg);
        this.handle = ResultMsg.create(code,msg,data);
    }


    public BaseResultRunTimeException(ICodeHandle handle, Object data) {
        super(handle.getCode() + ":" +handle.getMsg());
        this.handle = ResultMsg.create(handle,data);
    }


    public BaseResultRunTimeException(ICodeHandle handle) {
        super(handle.getCode() + ":" +handle.getMsg());
        this.handle = ResultMsg.create(handle);
    }


    public BaseResultRunTimeException(ICodeHandle handle, String msg, Object ... arguments) {
        super(handle.getCode() + ":" +handle.getMsg());
        String logMassage = handle.getMsg() + "," + StrUtil.format(msg,arguments);
        this.handle = ResultMsg.create(handle.getCode(),logMassage,null);
    }


    @Override
    public IResultHandle getResult() {
        return this.handle;
    }
}
