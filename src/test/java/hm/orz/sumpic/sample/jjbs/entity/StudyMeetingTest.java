package hm.orz.sumpic.sample.jjbs.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class StudyMeetingTest extends StudyMeeting {

    @Before
    public void setUp() throws Exception {
    }

    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction tx;

    @BeforeClass
    public static void initEntityManager() throws Exception {
        emf = Persistence.createEntityManagerFactory("tabok.kansai.samples.test");
        em = emf.createEntityManager();
    }

    @AfterClass
    public static void closeEntityManager() throws Exception {
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }
    }

    @Before
    public void initTransaction() {
        tx = em.getTransaction();
    }

    @Ignore
    @Test
    public void shouldCreateAStudyMeeting() throws Exception {

        StudyMeeting st = new StudyMeeting();
        st.setTitle("The Hitchhiker's Guide to the Galaxy.");
        st.setSubTitle("サブタイトル");
        st.setContext("内容");
        st.setExhibitionDate(new Date());
        st.setParticipantCount(10L);

        tx.begin();
        em.persist(st);
        tx.commit();
        assertNotNull("ID should not be null", st.getId());

        List<StudyMeeting> sts = em.createNamedQuery("findAllStudyMeeting").getResultList();
        assert 1 < sts.size();
    }
}