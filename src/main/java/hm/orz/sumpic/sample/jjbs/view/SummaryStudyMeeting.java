package hm.orz.sumpic.sample.jjbs.view;

import hm.orz.sumpic.sample.jjbs.entity.StudyMeeting;
import hm.orz.sumpic.sample.jjbs.entity.TotalOfStudyMeeting;
import hm.orz.sumpic.sample.jjbs.facade.StudyMeetingFacade;
import hm.orz.sumpic.sample.jjbs.facade.TotalOfStudyMeetingFacade;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 勉強会の集計Beanクラス。
 *
 * @author kazuhito
 */
@ManagedBean(name = "ssm")
@RequestScoped
public class SummaryStudyMeeting {

    @EJB
    private StudyMeetingFacade studyMeetingFacade;
    @EJB
    private TotalOfStudyMeetingFacade totalOfStudyMeetingFacade;

    private TotalOfStudyMeeting total;

    public SummaryStudyMeeting() {
        this.total = new TotalOfStudyMeeting();
    }

    public TotalOfStudyMeeting getTotal() {
        return this.total;
    }

    public String summaryAndStore() {
        String title = this.total.getTitle();
        Date fromDate = this.total.getFromDate();
        Date toDate = this.total.getToDate();

        
        StudyMeeting st = new StudyMeeting();
        st.setTitle("The Hitchhiker's Guide to the Galaxy.");
        st.setSubTitle("サブタイトル");
        st.setContext("内容");
        st.setExhibitionDate(new Date());
        st.setParticipantCount(10);
        studyMeetingFacade.create(st);

        // 入力があれば、集計して足す。
        if (fromDate != null && toDate != null) {
            // 全件取得
            List<StudyMeeting> studyMeetings = studyMeetingFacade.findAll();
            // タイトルが一致、日付が範疇なら、集計。
            int i = 0;
            int totalPCount = 0;

            for (StudyMeeting sm : studyMeetings) {
                Date eDate = sm.getExhibitionDate();
                if (sm.getTitle().equals(title) && fromDate.getTime() <= eDate.getTime() && toDate.getTime() >= eDate.getTime()) {
                    i++;
                    totalPCount += sm.getParticipantCount();
                }
            }
            // 該当が一件でもあれば、集計としてDB追加。
            if (i > 0) {
                total.setTimes(i);
                total.setTotalParticipantCount(totalPCount);
                totalOfStudyMeetingFacade.create(total);
                // 使いまわすために初期化。
                total.setTimes(0);
                total.setTotalParticipantCount(0);
            }
        }
        // 戻り先は自分。
        return "summaryStudyMeeting";
    }

    public List<TotalOfStudyMeeting> getTotalOfStudyMeetings() {
        // 過去の集計を全件取得。
        return totalOfStudyMeetingFacade.findAll();
    }
}
