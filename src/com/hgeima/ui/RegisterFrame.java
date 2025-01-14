package com.hgeima.ui;

import javax.swing.*;

public class RegisterFrame extends JFrame {
    //程序注册界面
    public RegisterFrame(){
        this.setSize(488,500);
        this.setTitle("用户注册");
        this.setAlwaysOnTop(true);
        //页面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //让界面显示出来 写在最后
        this.setVisible(true);

    }
}
