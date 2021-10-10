package com.msh.cloudy.dto;

import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "playlist_id", "playlist_name", "playlist_img_url" })
@Generated("jsonschema2pojo")
public class MainPlaylist {

	@JsonProperty("playlist_id")
	private Integer playlistId;
	@JsonProperty("playlist_name")
	private String playlistName;
	@JsonProperty("playlist_img_url")
	private String playlistImgUrl;
	
	@JsonProperty("subplaylist")
	private List<Subplaylist> subplaylist;

	@JsonProperty("playlist_id")
	public Integer getPlaylistId() {
		return playlistId;
	}

	@JsonProperty("playlist_id")
	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	@JsonProperty("playlist_name")
	public String getPlaylistName() {
		return playlistName;
	}

	@JsonProperty("playlist_name")
	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	@JsonProperty("playlist_img_url")
	public String getPlaylistImgUrl() {
		return playlistImgUrl;
	}

	@JsonProperty("playlist_img_url")
	public void setPlaylistImgUrl(String playlistImgUrl) {
		this.playlistImgUrl = playlistImgUrl;
	}

	public List<Subplaylist> getSubplaylist() {
		return subplaylist;
	}

	public void setSubplaylist(List<Subplaylist> subplaylist) {
		this.subplaylist = subplaylist;
	}

}