package hm.orz.sumpic.sample.jjbs.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 * 勉強会集計クラス。
 * @author kazuhito
 */
@Entity
public class TotalOfStudyMeeting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

        /** 勉強会タイトル */
    @Column(nullable = false, length = 128)
    private String title;

    /** 集計開始日 */
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fromDate;

    /** 集計開始日 */
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date toDate;

    /** 開催回数 */
    @Column(nullable = false)
    private Long times;

    /** 総参加者数 */
    @Column(nullable = false)
    private Long totalParticipantCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TotalOfStudyMeeting)) {
            return false;
        }
        TotalOfStudyMeeting other = (TotalOfStudyMeeting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tabok.kansai.samples.testing.entity.TotalOfStudyMeeting[ id=" + id + " ]";
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the fromDate
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return the toDate
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * @param toDate the toDate to set
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    /**
     * @return the times
     */
    public Long getTimes() {
        return times;
    }

    /**
     * @param times the times to set
     */
    public void setTimes(Long times) {
        this.times = times;
    }

    /**
     * @return the totalParticipantCount
     */
    public Long getTotalParticipantCount() {
        return totalParticipantCount;
    }

    /**
     * @param totalParticipantCount the totalParticipantCount to set
     */
    public void setTotalParticipantCount(Long totalParticipantCount) {
        this.totalParticipantCount = totalParticipantCount;
    }
    
}
