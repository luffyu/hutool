package cn.hutool.luffyu.util.result;

/**
 * @author luffyu
 * Created on 2019-07-12
 */
public interface IResultHandle {

    /**
     * @return 返回code值
     */
    String getCode();

    /**
     * @return 返回msg信息
     */
    String getMsg();

    /**
     * @return 返回数据信息
     */
    Object getData();


}
