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
@Table(name = "STUDY_MEETING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudyMeeting.findAll", query = "SELECT s FROM StudyMeeting s"),
    @NamedQuery(name = "StudyMeeting.findById", query = "SELECT s FROM StudyMeeting s WHERE s.id = :id"),
    @NamedQuery(name = "StudyMeeting.findByTitle", query = "SELECT s FROM StudyMeeting s WHERE s.title = :title"),
    @NamedQuery(name = "StudyMeeting.findBySubTitle", query = "SELECT s FROM StudyMeeting s WHERE s.subTitle = :subTitle"),
    @NamedQuery(name = "StudyMeeting.findByContext", query = "SELECT s FROM StudyMeeting s WHERE s.context = :context"),
    @NamedQuery(name = "StudyMeeting.findByExhibitionDate", query = "SELECT s FROM StudyMeeting s WHERE s.exhibitionDate = :exhibitionDate"),
    @NamedQuery(name = "StudyMeeting.findByParticipantCount", query = "SELECT s FROM StudyMeeting s WHERE s.participantCount = :participantCount")})
public class StudyMeeting implements Serializable {
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
    @Size(min = 1, max = 128)
    @Column(name = "SUB_TITLE", nullable = false, length = 128)
    private String subTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1024)
    @Column(nullable = false, length = 1024)
    private String context;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXHIBITION_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date exhibitionDate;
    @Column(name = "PARTICIPANT_COUNT")
    private Integer participantCount;

    public StudyMeeting() {
    }

    public StudyMeeting(Integer id) {
        this.id = id;
    }

    public StudyMeeting(Integer id, String title, String subTitle, String context, Date exhibitionDate) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.context = context;
        this.exhibitionDate = exhibitionDate;
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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getExhibitionDate() {
        return exhibitionDate;
    }

    public void setExhibitionDate(Date exhibitionDate) {
        this.exhibitionDate = exhibitionDate;
    }

    public Integer getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
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
        return "hm.orz.sumpic.sample.jjbs.entity.StudyMeeting[ id=" + id + " ]";
    }
    
}
