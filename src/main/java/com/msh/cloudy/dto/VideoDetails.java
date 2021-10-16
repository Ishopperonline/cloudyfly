package com.msh.cloudy.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "video_title", "video_thumbnail_url", "video_id" })
@Generated("jsonschema2pojo")
public class VideoDetails {

	@JsonProperty("video_title")
	private String videoTitle;
	@JsonProperty("video_thumbnail_url")
	private String videoThumbnailUrl;
	@JsonProperty("video_mainurl")
	private String videoMainurl;
	public String getVideoMainurl() {
		return videoMainurl;
	}

	public void setVideoMainurl(String videoMainurl) {
		this.videoMainurl = videoMainurl;
	}

	@JsonProperty("video_id")
	private Integer videoId;
	
	@JsonProperty("video_web_id")
	private String videoWebId;

	@JsonProperty("video_title")
	public String getVideoTitle() {
		return videoTitle;
	}

	@JsonProperty("video_title")
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	@JsonProperty("video_thumbnail_url")
	public String getVideoThumbnailUrl() {
		return videoThumbnailUrl;
	}

	@JsonProperty("video_thumbnail_url")
	public void setVideoThumbnailUrl(String videoThumbnailUrl) {
		this.videoThumbnailUrl = videoThumbnailUrl;
	}

	@JsonProperty("video_id")
	public Integer getVideoId() {
		return videoId;
	}

	@JsonProperty("video_id")
	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}

	public String getVideoWebId() {
		return videoWebId;
	}

	public void setVideoWebId(String videoWebId) {
		this.videoWebId = videoWebId;
	}

}