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

import com.msh.cloudy.dto.MainPlaylist;

@Entity
@Table(name = "ps_videolist")
public class VideolistEntity {

	@Id
	@Column(name = "videolist_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer videolistId;

	@Column(name = "video_thumbnail_url", nullable = false)
	String videoThumbnailUrl;
	
	@Column(name = "video_mainurl", nullable = false)
	String videoMainurl;
	
	public String getVideoMainurl() {
		return videoMainurl;
	}

	public void setVideoMainurl(String videoMainurl) {
		this.videoMainurl = videoMainurl;
	}

	@Column(name = "video_title", nullable = false)
	String videoTitle;
	
	@Column(name = "video_web_id")
	String videoWebId;
	
	@Column(name = "create_ts")
	private Date createTs;
	
	@Column(name = "subplaylist_id")
	Integer subplaylistId;
	
	
	/*
	 * @ManyToOne private SubPlaylistEntity subplaylisteEntity;
	 */

	public Integer getVideolistId() {
		return videolistId;
	}

	public void setVideolistId(Integer videolistId) {
		this.videolistId = videolistId;
	}

	public String getVideoThumbnailUrl() {
		return videoThumbnailUrl;
	}

	public void setVideoThumbnailUrl(String videoThumbnailUrl) {
		this.videoThumbnailUrl = videoThumbnailUrl;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getVideoWebId() {
		return videoWebId;
	}

	public void setVideoWebId(String videoWebId) {
		this.videoWebId = videoWebId;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public Integer getSubplaylistId() {
		return subplaylistId;
	}

	public void setSubplaylistId(Integer subplaylistId) {
		this.subplaylistId = subplaylistId;
	}

	/*
	 * public SubPlaylistEntity getSubplaylisteEntity() { return subplaylisteEntity;
	 * }
	 * 
	 * public void setSubplaylisteEntity(SubPlaylistEntity subplaylisteEntity) {
	 * this.subplaylisteEntity = subplaylisteEntity; }
	 */
	
}
