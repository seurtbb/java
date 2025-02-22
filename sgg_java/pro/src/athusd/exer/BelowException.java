package athusd.exer;

/**
 * @author zhouzhou
 * @version 1.0
 * @description: 自定义异常类
 * @date 2025/2/15 18:06
 */

public class BelowException extends Exception {
    static final long serialVersionUID = -3387516993124229949L;

    public BelowException() {
    }
    public BelowException(String message) {
        super(message);
    }
    public BelowException(String message, Throwable cause) {
        super(message, cause);
    }
    public BelowException(Throwable cause) {
        super(cause);
    }
    protected BelowException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
