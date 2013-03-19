/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.orz.sumpic.sample.jjbs.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    @NamedQuery(name = "TotalOfStudyMeeting.findByTotalParticipantCount", query = "SELECT t FROM TotalOfStudyMeeting t WHERE t.totalParticipantCount = :totalParticipantCount")})
public class TotalOfStudyMeeting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(nullable = false, length = 128)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FROM_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TO_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int times;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_PARTICIPANT_COUNT", nullable = false)
    private int totalParticipantCount;

    public TotalOfStudyMeeting() {
    }

    public TotalOfStudyMeeting(Integer id) {
        this.id = id;
    }

    public TotalOfStudyMeeting(Integer id, String title, Date fromDate, Date toDate, int times, int totalParticipantCount) {
        this.id = id;
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.times = times;
        this.totalParticipantCount = totalParticipantCount;
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
