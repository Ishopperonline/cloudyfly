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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ps_playlist")
public class Playlist {

	@Id
	@Column(name = "playlist_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer playlistId;

	@Column(name = "playlist_url", nullable = false)
	String playlistUrl;
	
	@Column(name = "playlist_name", nullable = false)
	String playlistName;
	
	
	/*
	 * @Column(name = "category_id") Integer categoryId;
	 */
	
	@Column(name = "create_ts")
	private Date createTs;

	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "mainplaylist_id") private Set<VideolistEntity>
	 * subPlaylistDao;
	 */

	public Integer getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	public String getPlaylistUrl() {
		return playlistUrl;
	}

	public void setPlaylistUrl(String playlistUrl) {
		this.playlistUrl = playlistUrl;
	}

	/*
	 * public Integer getCategoryId() { return categoryId; }
	 * 
	 * public void setCategoryId(Integer categoryId) { this.categoryId = categoryId;
	 * }
	 */
	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}
	
}
