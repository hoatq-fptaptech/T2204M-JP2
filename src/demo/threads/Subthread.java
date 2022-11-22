package demo.threads;

public class Subthread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Sub i="+i);
            try {
                Thread.sleep(1000); // 1000 miliseconds
            }catch (Exception e){
            }
        }
    }
}
