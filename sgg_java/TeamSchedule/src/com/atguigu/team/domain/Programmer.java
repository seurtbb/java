package com.atguigu.team.domain;

/**
 * @author zhouzhou
 * @version 1.0
 * @description: TODO
 * @date 2025/2/15 21:50
 */

public class Programmer extends Employee implements Equipment{

    @Override
    public void PC() {
        System.out.println("Programmer PC");
    }

    @Override
    public void NoteBook() {
        System.out.println("Programmer NoteBook");
    }

    @Override
    public void Printer() {
        System.out.println("Programmer Printer");
    }
}
