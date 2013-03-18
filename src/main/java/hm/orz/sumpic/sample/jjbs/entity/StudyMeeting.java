package hm.orz.sumpic.sample.jjbs.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

/**
 * 勉強会クラス。
 *
 * @author kazuhito
 */
@Entity
@NamedQuery(name = "findAllStudyMeeting", query = "select s from StudyMeeting s")
public class StudyMeeting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * 勉強会タイトル
     */
    @Column(nullable = false, length = 128)
    private String title;
    /**
     * サブタイトル
     */
    @Column(nullable = false, length = 128)
    private String subTitle;
    /**
     * 内容
     */
    @Column(nullable = false, length = 1024)
    private String context;
    /**
     * 開催日
     */
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date exhibitionDate;
    /**
     * 参加者数
     */
    @Column(nullable = false)
    private Long participantCount;

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
        if (!(object instanceof StudyMeeting)) {
            return false;
        }
        StudyMeeting other = (StudyMeeting) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tabok.kansai.samples.testing.entity.StudyMeeting[ id=" + id + " ]";
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
     * @return the subTitle
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * @param subTitle the subTitle to set
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * @return the exhibitionDate
     */
    public Date getExhibitionDate() {
        return exhibitionDate;
    }

    /**
     * @param exhibitionDate the exhibitionDate to set
     */
    public void setExhibitionDate(Date exhibitionDate) {
        this.exhibitionDate = exhibitionDate;
    }

    /**
     * @return the participantCount
     */
    public Long getParticipantCount() {
        return participantCount;
    }

    /**
     * @param participantCount the participantCount to set
     */
    public void setParticipantCount(Long participantCount) {
        this.participantCount = participantCount;
    }
}
