package cn.hutool.luffyu.util.result.exception;


import cn.hutool.luffyu.util.result.IResultHandle;

/**
 * @author luffyu
 * Created on 2019-07-12
 *
 * 需要返回定义的数据类型的异常
 */
public interface IResultException {

    /**
     * @return  返回结果集合
     */
    IResultHandle getResult();
}
