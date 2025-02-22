package athusd.exer1;

import athusd.exer.BelowException;

/**
 * @author zhouzhou
 * @version 1.0
 * @description: TODO
 * @date 2025/2/15 21:08
 */

public class DivisionTest {
    public static void main(String[] args) throws BelowException {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            System.out.println(divide(m,n));
        } catch (BelowException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static int  divide(int m, int n) throws BelowException {
        if(m < 0 || n < 0) {
            throw new BelowException("输入负数了");
        }
        return m/n;
    }
}
