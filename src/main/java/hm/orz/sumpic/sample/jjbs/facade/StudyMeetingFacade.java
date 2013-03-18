package hm.orz.sumpic.sample.jjbs.facade;

import hm.orz.sumpic.sample.jjbs.entity.StudyMeeting;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kazuhito
 */
@Stateless
public class StudyMeetingFacade extends AbstractFacade<StudyMeeting> {
    @PersistenceContext(unitName = "javaee6-sample")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudyMeetingFacade() {
        super(StudyMeeting.class);
    }
    
}
