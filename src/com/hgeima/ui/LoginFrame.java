package com.hgeima.ui;
import javax.swing.*;

public class LoginFrame extends JFrame  {

    //程序登陆界面
    public LoginFrame(){
        this.setSize(600,600);
        this.setTitle("用户登录");
        this.setAlwaysOnTop(true);
        //页面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认居中方式 按照XY轴的形式添加组件
        this.setLayout(null);



        //让界面显示出来 写在最后
        this.setVisible(true);

    }


}
