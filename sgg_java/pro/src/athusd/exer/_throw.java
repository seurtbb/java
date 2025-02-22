package athusd.exer;

/**
 * @author zhouzhou
 * @version 1.0
 * @description: TODO
 * @date 2025/2/15 16:28
 */

public class _throw {
    public static void main(String[] args) {
        Student  s1=new Student();
        try {
            s1.register();
            System.out.println(s1);
        } catch (Exception e) {
             e.printStackTrace();
           // System.out.println(e.getMessage());
        }
    }
}
class Student {
    int id;
    public void register() throws Exception {
        if(id>10){
            this.id=id;
        }else {
            // 手动抛出异常
//            throw  new RuntimeException("NONONONO");
//            throw  new Exception("NONON");
            throw new BelowException("异常");
        }
    }
}
