package com.hgeima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameFrame extends JFrame implements KeyListener, ActionListener {
    //定义一个二维数组  成员变量
    int[][] data = new int[3][3];

    public GameFrame() {
        //图形初始化
        initJFrame();
        //菜单初始化
        initJMenuBar();
        //数据初始化
        initDate();
        //图形初始化
        initImage();

        //让界面显示出来 写在最后
        this.setVisible(true);

    }

    //记录空白方块（0）的位置
    int x = 0;
    int y = 0;

    //定义一个二维数组 存储正确的位置
    int[][] win = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
    };

    //数据初始化
    private void initDate() {
        //打乱数组
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Random r = new Random();
        //int temp=0;
        for (int i = 0; i < arr.length; i++) {
            //随机索引 通过随机到的索引找对应的元素 实行互换
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        //将打乱数组的数据加入到二维数组中

        //第一种方式
        // int num = 0;
       /* for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = arr[num];
                num++;
            }
        }*/

        //第二种方式
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 3;
                y = i % 3;
            }
                data[i / 3][i % 3] = arr[i];

        }

       /* //遍历二维数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }*/
    }

    //定义一个变量记录步数
    int step = 0;

    //图形初始化
    private void initImage() {
        //此方法只是按照对应的数组顺序 将照片添加进去
        //清空
        this.getContentPane().removeAll();

        JLabel datastep = new JLabel("步数" + step);
        datastep.setBounds(20, 10, 140, 140);
        this.getContentPane().add(datastep);

        if (vectory()) {
            JLabel v = new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\胜利.jpg"));
            v.setBounds(200, 200, 800, 800);
            this.getContentPane().add(v);
        }
        //细节：先加载的图片在上方  后加载的图片在下方
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //获取二维数组
                int number = data[i][j];
                JLabel JLabel = new JLabel(new ImageIcon("puzzgame\\拼图素材\\0" + number + ".png"));
                JLabel.setBounds(322 * j + 247, 322 * i + 10, 322, 322);
                //给图片添加边框
                //参数：0：凸起来  1：凹进去
                JLabel.setBorder(new BevelBorder(0));
                this.getContentPane().add(JLabel);
            }
        }

        //添加背景
        JLabel background = new JLabel(new ImageIcon("puzzgame\\拼图素材\\背景.png"));
        background.setBounds(240, 0, 1240, 970);
        this.getContentPane().add(background);

        //重新刷新
        this.getContentPane().repaint();

    }

    //创建JMenuItem对象
    JMenuItem jmi1 = new JMenuItem("重新游戏");
    JMenuItem jmi2 = new JMenuItem("重新登录");
    JMenuItem jmi3 = new JMenuItem("关闭游戏");
    JMenuItem jmi4 = new JMenuItem("公众号");

    //菜单初始化
    private void initJMenuBar() {
        //创建菜单
        JMenuBar jmb = new JMenuBar();
        //创建jmenu对象
        JMenu jm1 = new JMenu("功能");
        JMenu jm2 = new JMenu("关于我们");

        //将JMenuItem对象添加到JMenu里面
        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(jmi3);
        jm2.add(jmi4);
        //将JMenu添加到JMenuBar里面
        jmb.add(jm1);
        jmb.add(jm2);

        //设置事件监听
        jmi1.addActionListener(this);
        jmi2.addActionListener(this);
        jmi3.addActionListener(this);
        jmi4.addActionListener(this);
        //将JMenuBar添加到JFrame里面,给整个菜单对象设置JMenuBar
        this.setJMenuBar(jmb);
    }


    //界面初始化
    private void initJFrame() {
        //this.setSize(200,200);
        this.setBounds(0, 0, 1500, 1000);
        this.setTitle("游戏界面");
        this.setAlwaysOnTop(true);
        //页面居中
        //this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//WindowConstants.EXIT_ON_CLOSE=3
        //取消默认的居中放置 只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按住不松按键
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //清空所有图片
            this.getContentPane().removeAll();
            //加载完整的图片
            JLabel all = new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\拼图整张.jpg"));
            //设置位置大小
            all.setBounds(440, 240, 450, 450);
            this.getContentPane().add(all);
            //加载背景图片
            JLabel background = new JLabel(new ImageIcon("puzzgame\\拼图素材\\背景.png"));
            background.setBounds(240, 0, 1240, 970);
            this.getContentPane().add(background);
            //重新刷新
            this.getContentPane().repaint();


        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (vectory()) {
            //return的意义：1.返回结果  2.结束方法
            return;
        }
        //对上下左右进行判断
        //上:38 下:40 左:37 右:39
        int code = e.getKeyCode();
        if (code == 37) {
            //System.out.println("左");
            if (y == 2) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;  //date[][]表示索引（坐标） 是一直不变的 变得是索引里的内容
            y++;
            step++;
            //重新调用方法
            initImage();

        } else if (code == 38) {
            //System.out.println("上");
            if (x == 2) {
                return;
            }
            //逻辑：把空白下面的格子往上移
            // X Y 表示空白格子的位置
            //X+1 Y 表示空白下方的格子的位置
            //将二者互换
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;  //date[][]表示索引（坐标） 是一直不变的 变得是索引里的内容
            x++;
            step++;
            //重新调用方法
            initImage();

        } else if (code == 39) {
            //System.out.println("右");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;  //date[][]表示索引（坐标） 是一直不变的 变得是索引里的内容
            y--;
            step++;
            //重新调用方法
            initImage();

        } else if (code == 40) {
            //System.out.println("下");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;  //date[][]表示索引（坐标） 是一直不变的 变得是索引里的内容
            x--;
            step++;
            //重新调用方法
            initImage();

        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 0}
            };
            initImage();
        }

    }

    //比较data数组与win数组是否一致 一致返回true 游戏胜利
    //若不一致返回false 游戏结束
    public boolean vectory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj==jmi1){
            //System.out.println("重新游戏");
            step=0;
            initDate();
            initImage();
        }else if (obj==jmi2){
            //System.out.println("重新登录");
            //将游戏页面隐藏
            this.setVisible(false);
            new LoginFrame();
        }else if (obj==jmi3){
            //System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        }else if (obj==jmi4){
            //System.out.println("公众号");

            //创建一个弹框对象
            JDialog jd=new JDialog();
            JLabel er=new JLabel(new ImageIcon("C:\\Users\\Dell\\IdeaProjects\\斗地主\\puzzgame\\拼图素材\\二维码.jpg"));
            er.setBounds(0,0,150,150);
            jd.getContentPane().add(er);
            jd.setSize(170,170);
            jd.setLocationRelativeTo(null);
            jd.setAlwaysOnTop(true);
            jd.setModal(true);
            jd.setVisible(true);
        }
    }
}
