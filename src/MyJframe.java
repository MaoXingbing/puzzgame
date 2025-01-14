import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MyJframe extends JFrame implements ActionListener {
    //设置按钮
    JButton  jb1=new JButton("按钮1");
    JButton  jb2=new JButton("按钮2");
    public void myframe(){
        this.setSize(600,600);
        this.setTitle("用户登录");
        this.setAlwaysOnTop(true);
        //页面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认居中方式 按照XY轴的形式添加组件
        this.setLayout(null);

        //设置宽高
        jb1.setBounds(0,0,100,100);
        //给按钮添加事件监听
        //jb1.addActionListener(new MyActionListener());
        jb1.addActionListener(this);  //this表示本类的对象
        // 将按钮添加到组件中
        this.getContentPane().add(jb1);

        //设置宽高
        jb2.setBounds(200,0,100,100);
        //给按钮添加鼠标监听
        jb2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("单机");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println("按下不松");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println("松开");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.println("划入");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                System.out.println("划出");
            }
        });
        // 将按钮添加到组件中
        this.getContentPane().add(jb2);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("按键不送");

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("松开");

            }
        });




        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        //获取被操作的事件对象
        Object source = e.getSource();
        if (source == jb1){
            jb1.setBounds(0,0,50,50);
        }else if (source == jb1){
            Random r=new Random();
            jb1.setLocation(r.nextInt(500),r.nextInt(500));
        }

    }
}
