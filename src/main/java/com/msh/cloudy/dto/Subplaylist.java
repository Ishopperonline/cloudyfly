package com.msh.cloudy.dto;

import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"sub_playlist_name",
"sub_playlist_img_url",
"sub_playlist_id"
})
@Generated("jsonschema2pojo")
public class Subplaylist {

@JsonProperty("sub_playlist_name")
private String subPlaylistName;
@JsonProperty("sub_playlist_img_url")
private String subPlaylistImgUrl;
@JsonProperty("sub_playlist_id")
private Integer subPlaylistId;
@JsonProperty("video_details")
private List<VideoDetails> videoDetails;

@JsonProperty("sub_playlist_name")
public String getSubPlaylistName() {
return subPlaylistName;
}

@JsonProperty("sub_playlist_name")
public void setSubPlaylistName(String subPlaylistName) {
this.subPlaylistName = subPlaylistName;
}

@JsonProperty("sub_playlist_img_url")
public String getSubPlaylistImgUrl() {
return subPlaylistImgUrl;
}

@JsonProperty("sub_playlist_img_url")
public void setSubPlaylistImgUrl(String subPlaylistImgUrl) {
this.subPlaylistImgUrl = subPlaylistImgUrl;
}

@JsonProperty("sub_playlist_id")
public Integer getSubPlaylistId() {
return subPlaylistId;
}

@JsonProperty("sub_playlist_id")
public void setSubPlaylistId(Integer subPlaylistId) {
this.subPlaylistId = subPlaylistId;
}

public List<VideoDetails> getVideoDetails() {
	return videoDetails;
}

public void setVideoDetails(List<VideoDetails> videoDetails) {
	this.videoDetails = videoDetails;
}

}