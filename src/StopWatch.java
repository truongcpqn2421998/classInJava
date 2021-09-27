import java.util.Arrays;

public class StopWatch {
    private long startTime, endTime;
    public String getter(){
        return "Start time: "+this.startTime+" End time: "+endTime;
    }
    public StopWatch(){
        this.startTime=System.currentTimeMillis();
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return (this.endTime-this.startTime);
    }

    public static void main(String[] args) {
        int[] array=new int[100000];
        for (int i = 100000,j=0; i >0 ; i--) {
            array[j]=i;
            j++;
        }
        StopWatch watch=new StopWatch();
        watch.start();
        Arrays.sort(array);
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}
