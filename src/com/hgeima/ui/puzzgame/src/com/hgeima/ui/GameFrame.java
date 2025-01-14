package com.hgeima.ui.puzzgame.src.com.hgeima.ui;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(){

        initJFrame();
        initJMenuBar();
        //initImage();

        //让界面显示出来 写在最后
        this.setVisible(true);

    }



    //界面初始化
    private void initJFrame() {
        //this.setSize(200,200);
        this.setBounds(500,500,1000,1000);
        this.setTitle("游戏界面");
        this.setAlwaysOnTop(true);
        //页面居中
        //this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);//WindowConstants.EXIT_ON_CLOSE=3
        //取消默认的居中放置 只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
    }


    //图形初始化
    private void initImage() {

        for (int i = 0; i < 4; i++) {
            JLabel JLabel2=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\05.png"));
            JLabel2.setBounds(322 * i,0,322,317);
            this.getContentPane().add(JLabel2);
        }
        //创建一个ImageIcon的对象
        //ImageIcon icon=new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\01.png");
        //创建一个JLabel对象（管理容器）
       /* JLabel JLabel1=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\01.png"));
        //设置位置
        JLabel1.setBounds(0,0,322,322);
        //管理容器添加到界面中
        //this.add(JLabel1);
        this.getContentPane().add(JLabel1);

        JLabel JLabel2=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\02.png"));
        JLabel2.setBounds(322,0,322,317);
        this.getContentPane().add(JLabel2);

        JLabel JLabel3=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\03.png"));
        JLabel3.setBounds(640,0,321,321);
        this.getContentPane().add(JLabel3);*/

        /*JLabel JLabel4=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\04.png"));
        JLabel1.setBounds(0,322,322,322);
        this.getContentPane().add(JLabel1);

        JLabel JLabel5=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\05.png"));
        JLabel1.setBounds(322,322,322,322);
        this.getContentPane().add(JLabel1);

        JLabel JLabel6=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\06.png"));
        JLabel1.setBounds(644,322,322,322);
        this.getContentPane().add(JLabel1);

        JLabel JLabel7=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\07.png"));
        JLabel1.setBounds(0,644,322,322);
        this.getContentPane().add(JLabel1);

        JLabel JLabel8=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\08.png"));
        JLabel1.setBounds(644,644,322,322);
        this.getContentPane().add(JLabel1);
*/

    }



    //菜单初始化
    private void initJMenuBar() {
        //创建菜单
        JMenuBar jmb=new JMenuBar();
        //创建jmenu对象
        JMenu jm1=new JMenu("功能");
        JMenu jm2=new JMenu("关于我们");
        //创建JMenuItem对象
        JMenuItem jmi1=new JMenuItem("重新游戏");
        JMenuItem jmi2=new JMenuItem("重新登录");
        JMenuItem jmi3=new JMenuItem("关闭游戏");
        JMenuItem jmi4=new JMenuItem("公众号");
        //将JMenuItem对象添加到JMenu里面
        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(jmi3);
        jm2.add(jmi4);
        //将JMenu添加到JMenuBar里面
        jmb.add(jm1);
        jmb.add(jm2);
        //将JMenuBar添加到JFrame里面,给整个菜单对象设置JMenuBar
        this.setJMenuBar(jmb);
    }


}
