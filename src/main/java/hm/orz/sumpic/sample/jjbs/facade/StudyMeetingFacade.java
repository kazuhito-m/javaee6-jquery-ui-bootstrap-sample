/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hm.orz.sumpic.sample.jjbs.facade;

import hm.orz.sumpic.sample.jjbs.entity.StudyMeeting;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author M11131H
 */
@Stateless
public class StudyMeetingFacade extends AbstractFacade<StudyMeeting> {
    @PersistenceContext(unitName = "jjubs-sample")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudyMeetingFacade() {
        super(StudyMeeting.class);
    }
    
}
