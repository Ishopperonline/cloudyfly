package com.msh.cloudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msh.cloudy.dto.MainPlaylist;
import com.msh.cloudy.dto.Subplaylist;
import com.msh.cloudy.dto.VideoDetails;

@RestController
@RequestMapping("/api")
public class PlaylistController {

	@Autowired
	PlaylistService playlistService;
	
	@GetMapping("/test")
	public String testHello() {
		System.out.println("In Test Method");
		return "Welcome to Cloudify";
	}
	
	@RequestMapping(value = "/createplaylist", method = RequestMethod.POST)
	public ResponseEntity<MainPlaylist> createPlaylist(@RequestBody  MainPlaylist playlist) {
		playlist = playlistService.createMainPlaylist(playlist);
		return new ResponseEntity<MainPlaylist>(playlist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getallplaylist", method = RequestMethod.GET)
	public ResponseEntity<List<MainPlaylist>> retrievAllPlaylistDetails() {
		List<MainPlaylist> ct = playlistService.retrievAllPlaylistDetails();
		return new ResponseEntity<List<MainPlaylist>>(ct, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getplaylist/{playlistId}", method = RequestMethod.GET)
	public ResponseEntity<MainPlaylist> retrievPlaylistDetailsById(@PathVariable Integer playlistId) {
		MainPlaylist mp = playlistService.retrievMainPlaylist(playlistId);
		return new ResponseEntity<MainPlaylist>(mp, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/addsubplaylist/{playlistId}", method = RequestMethod.POST)
	public ResponseEntity<Subplaylist> addSubPlaylist(@RequestBody  Subplaylist subplaylist, @PathVariable Integer playlistId) {
		subplaylist = playlistService.createSubPlaylist(subplaylist, playlistId);
		return new ResponseEntity<Subplaylist>(subplaylist, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getsubplaylist/{playlistId}", method = RequestMethod.GET)
	public ResponseEntity<List<Subplaylist>> retrieveSubPlaylistByPlaylistId( @PathVariable Integer playlistId) {
		List<Subplaylist> subplaylists = playlistService.getSubPlaylistForMainPlaylistId(playlistId);
		return new ResponseEntity<List<Subplaylist>>(subplaylists, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/addvideo/{subplaylistId}", method = RequestMethod.POST)
	public ResponseEntity<VideoDetails> addSubPlaylist(@RequestBody  VideoDetails videoDetails, @PathVariable Integer subplaylistId) {
		videoDetails=	playlistService.createVideo(videoDetails, subplaylistId);
		return new ResponseEntity<VideoDetails>(videoDetails, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getvideos/{subplaylistId}", method = RequestMethod.GET)
	public ResponseEntity<List<VideoDetails>> retrieveVideoDetailsBySubPlaylistId( @PathVariable Integer subplaylistId) {
		List<VideoDetails> videoDetails = playlistService.retrieveVideoDetailsForSubPlaylist(subplaylistId);
		return new ResponseEntity<List<VideoDetails>>(videoDetails, HttpStatus.OK);
	}
	
}
