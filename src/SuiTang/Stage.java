package SuiTang;

import static java.lang.Thread.*;

public class Stage extends  Thread{
    @Override
    public void run(){
        System.out.println("欢迎观看隋唐演义");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("大幕徐徐拉开");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("隋朝末年,官府贪污腐败，草菅人命，人民生活水生火热，反坑军聚集起来，开始大战");




        Army army = new Army();
        Army revolt = new Army();
        Thread armyThread = new Thread(army,"压迫军队");
        Thread revoltThread = new Thread(army,"陈胜吴广起义军");

        //启动线程,让军队开始作战
        armyThread.start();
        revoltThread.start();
       //舞台线程休眠,大家专心观看军队的战斗
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正当双方激战正酣,半路杀出个程咬金");

        Thread mrCheng = new KeyPerson();
        mrCheng.setName("程咬金");

        System.out.println("程咬金的理想就是结束战争,使百姓安居乐业!,男耕女织");

        //军队停止作战
        army.keepRunning = false;
        revolt.keepRunning = false;
       armyThread.stop();
       revoltThread.stop();

        try {
            Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
        }
        //历史大戏留给关键人物
        mrCheng.start();
        try {
            mrCheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("战争结束,人们安居乐业，实现了大同社会");
        System.out.println("谢谢观看隋唐演义，明天请收看唐玄宗,杨玉环马嵬坡之变");
    }
    public static void  main(String[] args){
        new Stage().start();
    }
}
