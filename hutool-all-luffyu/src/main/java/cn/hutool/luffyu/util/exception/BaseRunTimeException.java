package cn.hutool.luffyu.util.exception;

/**
 * @author luffyu
 * Created on 2019-09-10
 */
public class BaseRunTimeException extends RuntimeException {

    public BaseRunTimeException() {
    }

    public BaseRunTimeException(String message) {
        super(message);
    }

    public BaseRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseRunTimeException(Throwable cause) {
        super(cause);
    }

    public BaseRunTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
