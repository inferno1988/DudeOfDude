package net.it_tim.dude_of_dude.database;

// Generated 20 квіт 2011 10:24:30 by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Hosts generated by hbm2java
 */
public class Hosts implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hostId;
	private String ipAdres;
	private String description;
	private Long timeoutMs;
	private Long intervalMs;
	private Boolean toPing;
	private Set<NotificatioinsHistory> notificatioinsHistories = new HashSet<NotificatioinsHistory>(0);
	private Set<Groups> groupses = new HashSet<Groups>(0);
	private Set<PingHistory> pingHistories = new HashSet<PingHistory>(0);

	public Hosts() {
	}

	public Hosts(int hostId) {
		this.hostId = hostId;
	}

	public Hosts(int hostId, String ipAdres, String description,
			Long timeoutMs, Long intervalMs, Boolean toPing,
			Set<NotificatioinsHistory> notificatioinsHistories,
			Set<Groups> groupses, Set<PingHistory> pingHistories) {
		this.hostId = hostId;
		this.ipAdres = ipAdres;
		this.description = description;
		this.timeoutMs = timeoutMs;
		this.intervalMs = intervalMs;
		this.toPing = toPing;
		this.notificatioinsHistories = notificatioinsHistories;
		this.groupses = groupses;
		this.pingHistories = pingHistories;
	}

	public int getHostId() {
		return this.hostId;
	}

	public void setHostId(int hostId) {
		this.hostId = hostId;
	}

	public String getIpAdres() {
		return this.ipAdres;
	}

	public void setIpAdres(String ipAdres) {
		this.ipAdres = ipAdres;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTimeoutMs() {
		return this.timeoutMs;
	}

	public void setTimeoutMs(Long timeoutMs) {
		this.timeoutMs = timeoutMs;
	}

	public Long getIntervalMs() {
		return this.intervalMs;
	}

	public void setIntervalMs(Long intervalMs) {
		this.intervalMs = intervalMs;
	}

	public Boolean getToPing() {
		return this.toPing;
	}

	public void setToPing(Boolean toPing) {
		this.toPing = toPing;
	}

	public Set<NotificatioinsHistory> getNotificatioinsHistories() {
		return this.notificatioinsHistories;
	}

	public void setNotificatioinsHistories(
			Set<NotificatioinsHistory> notificatioinsHistories) {
		this.notificatioinsHistories = notificatioinsHistories;
	}

	public Set<Groups> getGroupses() {
		return this.groupses;
	}

	public void setGroupses(Set<Groups> groupses) {
		this.groupses = groupses;
	}

	public Set<PingHistory> getPingHistories() {
		return this.pingHistories;
	}

	public void setPingHistories(Set<PingHistory> pingHistories) {
		this.pingHistories = pingHistories;
	}

}
