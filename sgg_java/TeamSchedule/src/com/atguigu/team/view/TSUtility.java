package com.atguigu.team.view;

import java.util.Scanner;

/**
 * @author zhouzhou
 * @version 1.0
 * @description: TODO
 * @date 2025/2/15 21:47
 */

public class TSUtility {
    /**
     * 该方法读取键盘，如果用户键入'1'-'4'中的任意字符，则方法返回。返回值为用户键入字符
     * @return
     */
    public static char readMenuSelection() {
        char c;
        while (true) {
            // 读取一行输入
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            
            // 检查输入是否只有一个字符
            if (str.length() != 1) {
                System.out.print("选择错误，请重新输入：");
                continue;
            }
            
            // 获取输入的字符
            c = str.charAt(0);
            
            // 检查是否是1-4之间的字符
            if (c >= '1' && c <= '4') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }

}
