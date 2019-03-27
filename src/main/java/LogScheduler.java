package main.java;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LogScheduler {

    public static Runnable runable = new Runnable() {
        @Override
        public void run() {
            System.out.println(String.format("[%s] hello world ! ", Thread.currentThread()));
        }
    };

    public static void main(String[] args) {
        System.out.println(String.format("[%s] hello world !", Thread.currentThread())); /* main thread */
        runScheduledExecutoerService(runable);
    }

    /**
     * 서버 상태에 의존 & Thread 차지
     *
     * */
    public static void runScheduledExecutoerService(Runnable runable) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        /*scheduler.scheduleAtFixedRate(runable, 8, 8, TimeUnit.HOURS);
        scheduler.scheduleAtFixedRate(runable, 8, 8, TimeUnit.DAYS);
        scheduler.scheduleAtFixedRate(runable, 8, 8, TimeUnit.MINUTES);
        scheduler.scheduleAtFixedRate(runable, 8, 8, TimeUnit.MICROSECONDS);
        scheduler.scheduleAtFixedRate(runable, 8, 8, TimeUnit.SECONDS);*/

        scheduler.scheduleAtFixedRate(runable, 2, 10, TimeUnit.MILLISECONDS);
    }

}
