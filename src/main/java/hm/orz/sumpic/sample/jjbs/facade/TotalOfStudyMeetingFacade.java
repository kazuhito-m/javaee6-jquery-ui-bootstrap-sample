package hm.orz.sumpic.sample.jjbs.facade;

import hm.orz.sumpic.sample.jjbs.entity.TotalOfStudyMeeting;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kazuhito
 */
@Stateless
public class TotalOfStudyMeetingFacade extends AbstractFacade<TotalOfStudyMeeting> {
    @PersistenceContext(unitName = "javaee6-sample")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TotalOfStudyMeetingFacade() {
        super(TotalOfStudyMeeting.class);
    }
    
}
