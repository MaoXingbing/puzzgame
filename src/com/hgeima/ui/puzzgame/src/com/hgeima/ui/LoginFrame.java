package com.hgeima.ui.puzzgame.src.com.hgeima.ui;

import javax.swing.*;

public class LoginFrame extends JFrame {
    //程序登陆界面
    public LoginFrame(){
        this.setSize(200,200);
        this.setTitle("用户登录");
        this.setAlwaysOnTop(true);
        //页面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //让界面显示出来 写在最后
        this.setVisible(true);

    }
}
