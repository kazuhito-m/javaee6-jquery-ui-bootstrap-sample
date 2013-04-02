package hm.orz.sumpic.sample.jjbs.timer;

import java.util.Date;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

/**
 * Ejb Timerサンプル。
 * @author kazuhito_m
 */
@Singleton
public class HeartBeatTimerSessionBean {

    private long beatCount;
    
    /**
     * 震えるほどのハートと燃え尽きるほどのヒートを伝える。 
     */
    @Schedule(minute = "*", second = "*/15", dayOfMonth = "*", month = "*", year = "*", hour = "9-17", dayOfWeek = "Mon-Fri")
    public void heartBeat() {
        beatCount++;
        System.out.println("Heart Beat ! Timer event: " + new Date() + ",beat count: "+ beatCount);
    }
    // TODO 本格的なバッチ的業務処理をココに記述。
}
