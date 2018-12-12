package SuiTang;

public class Army implements  Runnable{

    //volatile保证了线程可以正确的读取其他线程写入的值
    //可见性 ref  happens-reference
    volatile boolean keepRunning = true;
    @Override
    public void run() {
        while(keepRunning){
            //发动五连击
            for(int i = 0; i<5; i++){
                System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]"+"次");
            }
            //让出了处理器时间,下次该谁进攻还不一定呢!
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+"结束了战斗");
        }
    }
}
