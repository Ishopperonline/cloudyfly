package com.msh.cloudy.dao;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ps_subplaylist")
public class SubPlaylistEntity {

	@Id
	@Column(name = "subplaylist_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer subplaylistId;

	@Column(name = "subplaylist_url", nullable = false)
	String subplaylistUrl;
	
	@Column(name = "subplaylist_name", nullable = false)
	String subplaylistName;
	
	@Column(name = "mainplaylist_id")
	Integer mainplaylistId;
	
	@Column(name = "create_ts")
	private Date createTs;
	
	/*
	 * @ManyToOne private Playlist mainPlaylist;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "subplaylist_id") private Set<VideolistEntity>
	 * videolistEntity;
	 */

	public Integer getSubplaylistId() {
		return subplaylistId;
	}

	public void setSubplaylistId(Integer subplaylistId) {
		this.subplaylistId = subplaylistId;
	}

	public String getSubplaylistUrl() {
		return subplaylistUrl;
	}

	public void setSubplaylistUrl(String subplaylistUrl) {
		this.subplaylistUrl = subplaylistUrl;
	}

	public String getSubplaylistName() {
		return subplaylistName;
	}

	public void setSubplaylistName(String subplaylistName) {
		this.subplaylistName = subplaylistName;
	}

	public Integer getMainplaylistId() {
		return mainplaylistId;
	}

	public void setMainplaylistId(Integer mainplaylistId) {
		this.mainplaylistId = mainplaylistId;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	/*
	 * public Playlist getMainPlaylist() { return mainPlaylist; }
	 * 
	 * public void setMainPlaylist(Playlist mainPlaylist) { this.mainPlaylist =
	 * mainPlaylist; }
	 * 
	 * public Set<VideolistEntity> getVideolistEntity() { return videolistEntity; }
	 * 
	 * public void setVideolistEntity(Set<VideolistEntity> videolistEntity) {
	 * this.videolistEntity = videolistEntity; }
	 */
}
