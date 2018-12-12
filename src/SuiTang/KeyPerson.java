package SuiTang;

public class KeyPerson extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"开始了战斗!");
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+"左突右杀,击败腐朽的隋朝...");
        }


        System.out.println(Thread.currentThread().getName()+"结束了战斗!");
    }
}
