package net.it_tim.dude_of_dude.database;

// Generated 20 квіт 2011 10:24:31 by Hibernate Tools 3.3.0.GA

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.criterion.Restrictions;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Hosts.
 * @see net.it_tim.dude_of_dude.database.Hosts
 * @author Hibernate Tools
 */
public class HostsHome extends DAO {

	private static final Log log = LogFactory.getLog(HostsHome.class);

	public void persist(Hosts transientInstance) {
		log.debug("persisting Hosts instance");
		try {
			getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Hosts instance) {
		log.debug("attaching dirty Hosts instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@SuppressWarnings("deprecation")
	public void attachClean(Hosts instance) {
		log.debug("attaching clean Hosts instance");
		try {
			getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Hosts persistentInstance) {
		log.debug("deleting Hosts instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Hosts merge(Hosts detachedInstance) {
		log.debug("merging Hosts instance");
		try {
			Hosts result = (Hosts) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Hosts findById(int id) {
		log.debug("getting Hosts instance with id: " + id);
		try {
			Hosts instance = (Hosts) getCurrentSession().get(
					"net.it_tim.dude_of_dude.database.Hosts", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Hosts> findByExample(Hosts instance) {
		log.debug("finding Hosts instance by example");
		try {
			List<Hosts> results = (List<Hosts>) 
					getCurrentSession().createCriteria(
							"net.it_tim.dude_of_dude.database.Hosts").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	
	public Hosts findByIp(String ipAddr) {
		log.debug("finding Hosts instance by IP: " + ipAddr);
		try {
			Hosts instance  = (Hosts) 
				getCurrentSession().createCriteria("net.it_tim.dude_of_dude.database.Hosts")
					.add(Restrictions.eq("ipAdres", ipAddr)).uniqueResult();
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List getAll() {
		List host_list = getCurrentSession().createQuery("from Hosts").list();
		return host_list;
	}
}
