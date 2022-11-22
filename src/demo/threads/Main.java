package demo.threads;

public class Main {
    public static void main(String[] args){

        Subthread s1 = new Subthread();
        s1.start();

        SubRun s2 = new SubRun();
        Thread t1 = new Thread(s2);

        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();

        for(int i=0;i<20;i++){
            System.out.println("Main i="+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread t2 = new Thread(r1);
        t2.start();

        Runnable r2 = ()->{
            // chinh la ham run
        };


        new Thread(()->{

        }).start();
    }
}
