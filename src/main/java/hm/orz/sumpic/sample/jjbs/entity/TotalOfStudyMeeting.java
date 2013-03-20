package hm.orz.sumpic.sample.jjbs.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author M11131H
 */
@Entity
@Table(name = "TOTAL_OF_STUDY_MEETING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TotalOfStudyMeeting.findAll", query = "SELECT t FROM TotalOfStudyMeeting t"),
    @NamedQuery(name = "TotalOfStudyMeeting.findById", query = "SELECT t FROM TotalOfStudyMeeting t WHERE t.id = :id"),
    @NamedQuery(name = "TotalOfStudyMeeting.findByTitle", query = "SELECT t FROM TotalOfStudyMeeting t WHERE t.title = :title"),
    @NamedQuery(name = "TotalOfStudyMeeting.findByFromDate", query = "SELECT t FROM TotalOfStudyMeeting t WHERE t.fromDate = :fromDate"),
    @NamedQuery(name = "TotalOfStudyMeeting.findByToDate", query = "SELECT t FROM TotalOfStudyMeeting t WHERE t.toDate = :toDate"),
    @NamedQuery(name = "TotalOfStudyMeeting.findByTimes", query = "SELECT t FROM TotalOfStudyMeeting t WHERE t.times = :times"),
    @NamedQuery(name = "TotalOfStudyMeeting.findByTotalParticipantCount", query = "SELECT t FROM TotalOfStudyMeeting t WHERE t.totalParticipantCount = :totalParticipantCount"),
    @NamedQuery(name = "TotalOfStudyMeeting.findBySummaryDate", query = "SELECT t FROM TotalOfStudyMeeting t WHERE t.summaryDate = :summaryDate")})
public class TotalOfStudyMeeting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIMES")
    private int times;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_PARTICIPANT_COUNT")
    private int totalParticipantCount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUMMARY_DATE")
    @Temporal(TemporalType.DATE)
    private Date summaryDate = new Date();

    public TotalOfStudyMeeting() {
    }

    public TotalOfStudyMeeting(Integer id) {
        this.id = id;
    }

    public TotalOfStudyMeeting(Integer id, String title, Date fromDate, Date toDate, int times, int totalParticipantCount, Date summaryDate) {
        this.id = id;
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.times = times;
        this.totalParticipantCount = totalParticipantCount;
        this.summaryDate = summaryDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getTotalParticipantCount() {
        return totalParticipantCount;
    }

    public void setTotalParticipantCount(int totalParticipantCount) {
        this.totalParticipantCount = totalParticipantCount;
    }

    public Date getSummaryDate() {
        return summaryDate;
    }

    public void setSummaryDate(Date summaryDate) {
        this.summaryDate = summaryDate;
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
        return "hm.orz.sumpic.sample.jjbs.entity.TotalOfStudyMeeting[ id=" + id + " ]";
    }
    
}
