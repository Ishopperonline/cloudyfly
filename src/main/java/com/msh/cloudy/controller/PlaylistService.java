package com.msh.cloudy.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msh.cloudy.dao.Playlist;
import com.msh.cloudy.dao.SubPlaylistEntity;
import com.msh.cloudy.dao.VideolistEntity;
import com.msh.cloudy.dto.MainPlaylist;
import com.msh.cloudy.dto.Subplaylist;
import com.msh.cloudy.dto.VideoDetails;
import com.msh.cloudy.repo.CategoryRepo;
import com.msh.cloudy.repo.PlaylistRepo;
import com.msh.cloudy.repo.SubplaylistRepo;
import com.msh.cloudy.repo.VidelistRepo;

@Service
public class PlaylistService {

	@Autowired
	public CategoryRepo categoryRepo;
	
	@Autowired
	public PlaylistRepo playlistRepo;
	
	@Autowired
	public SubplaylistRepo subplaylistRepo;
	
	@Autowired
	public VidelistRepo  videolistRepo;
	
	public MainPlaylist createMainPlaylist(MainPlaylist mainPlaylist) {
		Playlist playlistDAO = mapPlaylistToDAO(mainPlaylist);
		playlistDAO = playlistRepo.save(playlistDAO);
		return mapMainPlalistDAOToDTO(playlistDAO);
	}

	public MainPlaylist retrievMainPlaylist(Integer id) {
		Optional<Playlist> playlistDAO = playlistRepo.findById(id);
		MainPlaylist mainPlaylist = mapMainPlalistDAOToDTO(playlistDAO.get());
		return mainPlaylist;
	}

	public List<MainPlaylist> retrievAllPlaylistDetails() {
		List<Playlist> playlistDAOs = playlistRepo.findAll();
		List<MainPlaylist> mainPlaylists = new ArrayList<>();
		for (Playlist cat : playlistDAOs) {
			mainPlaylists.add(mapMainPlalistDAOToDTO(cat));
		}
		return mainPlaylists;
	}

	public Subplaylist createSubPlaylist(Subplaylist subPlaylist, Integer mainPlaylistId) {
		SubPlaylistEntity subplaylistDAO = mapSubPlaylistToDAO(subPlaylist, mainPlaylistId);
		subplaylistDAO = subplaylistRepo.save(subplaylistDAO);
		return mapSubPlaylistDAOToDTO(subplaylistDAO);
	}

	public List<Subplaylist> getSubPlaylistForMainPlaylistId(Integer mainPlaylistId) {

		List<Subplaylist> subplayLists = new ArrayList<>();
		List<SubPlaylistEntity> subplaylistsDAO = subplaylistRepo.findByMainplaylistId(mainPlaylistId);
		for (SubPlaylistEntity subplaylistEntity : subplaylistsDAO) {
			subplayLists.add(mapSubPlaylistDAOToDTO(subplaylistEntity));
		}

		return subplayLists;
	}

	public VideoDetails createVideo(VideoDetails videoDetailsDTO, Integer subplaylistId) {
		VideolistEntity videolistEntity = mapVideolistToDAO(videoDetailsDTO, subplaylistId);
		videolistEntity = videolistRepo.save(videolistEntity);

		return mapVideoDetailDAOToDTO(videolistEntity);
	}

	public List<VideoDetails> retrieveVideoDetailsForSubPlaylist(Integer subplaylistId) {

		List<VideoDetails> videoDetailsList = new ArrayList<>();
		List<VideolistEntity> videolistDAOs = videolistRepo.findBySubplaylistId(subplaylistId);
		for (VideolistEntity videoEntity : videolistDAOs) {
			videoDetailsList.add(mapVideoDetailDAOToDTO(videoEntity));
		}

		return videoDetailsList;
	}
	
	private Playlist mapPlaylistToDAO(MainPlaylist mainPlaylist) {
		Playlist playlistDAO = new Playlist();
		playlistDAO.setPlaylistName(mainPlaylist.getPlaylistName());
		playlistDAO.setPlaylistUrl(mainPlaylist.getPlaylistImgUrl());
		playlistDAO.setCreateTs(new Date());
		return playlistDAO;
	}

	private MainPlaylist mapMainPlalistDAOToDTO(Playlist playlistDAO) {
		MainPlaylist mainPlaylist = new MainPlaylist();
		mainPlaylist.setPlaylistId(playlistDAO.getPlaylistId());
		mainPlaylist.setPlaylistName(playlistDAO.getPlaylistName());
		mainPlaylist.setPlaylistImgUrl(playlistDAO.getPlaylistUrl());
		return mainPlaylist;
	}

	private Subplaylist mapSubPlaylistDAOToDTO(SubPlaylistEntity subplaylistDAO) {
		Subplaylist subplaylistDTO = new Subplaylist();
		subplaylistDTO.setSubPlaylistImgUrl(subplaylistDAO.getSubplaylistUrl());
		subplaylistDTO.setSubPlaylistName(subplaylistDAO.getSubplaylistName());
		subplaylistDTO.setSubPlaylistId(subplaylistDAO.getSubplaylistId());
		return subplaylistDTO;
	}

	private SubPlaylistEntity mapSubPlaylistToDAO(Subplaylist subPlaylist, Integer mainPlaylistId) {

		SubPlaylistEntity subplaylistDAO = new SubPlaylistEntity();
		subplaylistDAO.setSubplaylistName(subPlaylist.getSubPlaylistName());
		subplaylistDAO.setSubplaylistUrl(subPlaylist.getSubPlaylistImgUrl());
		subplaylistDAO.setCreateTs(new Date());
		subplaylistDAO.setMainplaylistId(mainPlaylistId);
		return subplaylistDAO;
	}

	private VideoDetails mapVideoDetailDAOToDTO(VideolistEntity videolistEntity) {
		VideoDetails videoDetailsDTO = new VideoDetails();
		videoDetailsDTO.setVideoThumbnailUrl(videolistEntity.getVideoThumbnailUrl());
		videoDetailsDTO.setVideoTitle(videolistEntity.getVideoTitle());
		videoDetailsDTO.setVideoWebId(videolistEntity.getVideoWebId());
		videoDetailsDTO.setVideoId(videolistEntity.getVideolistId());
		return videoDetailsDTO;
	}

	private VideolistEntity mapVideolistToDAO(VideoDetails videoDetailsDTO, Integer subplaylistId) {
		VideolistEntity videolistEntity = new VideolistEntity();
		videolistEntity.setVideoTitle(videoDetailsDTO.getVideoTitle());
		videolistEntity.setVideoThumbnailUrl(videoDetailsDTO.getVideoThumbnailUrl());
		videolistEntity.setVideoWebId(videoDetailsDTO.getVideoWebId());
		videolistEntity.setCreateTs(new Date());
		videolistEntity.setSubplaylistId(subplaylistId);
		return videolistEntity;
	}
	
	
}
