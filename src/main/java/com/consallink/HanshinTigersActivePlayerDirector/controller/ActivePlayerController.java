package com.consallink.HanshinTigersActivePlayerDirector.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.consallink.HanshinTigersActivePlayerDirector.model.ActivePlayer;
import com.consallink.HanshinTigersActivePlayerDirector.service.ActivePlayerService;

@RestController
public class ActivePlayerController {

	@Autowired
	ActivePlayerService activePlayerService;

	@CrossOrigin(origins = "*", methods = { RequestMethod.GET }, allowedHeaders = "*")
	@GetMapping("/all-player")
	public List<ActivePlayer> getAllPlayer() {
		return activePlayerService.getAllPlayer();
	}

	// 更新コントローラー
	@CrossOrigin(origins = "*", methods = { RequestMethod.POST }, allowedHeaders = "*")
	@PostMapping("/update")
	ActivePlayer update(@RequestBody() ActivePlayer activePlayer) {
		activePlayerService.update(activePlayer);
		return activePlayer;
	}

	// 追加コントローラー
	@CrossOrigin(origins = "*", methods = { RequestMethod.POST }, allowedHeaders = "*")
	@PostMapping("/save")
	ActivePlayer save(@RequestBody() ActivePlayer activePlayer) {
		activePlayerService.insert(activePlayer);
		return activePlayer;
	}

	// 削除コントローラー
	@CrossOrigin(origins = "*", methods = { RequestMethod.POST }, allowedHeaders = "*")
	@PostMapping("/delete")
	ActivePlayer delete(@RequestBody() ActivePlayer activePlayer) {
		activePlayerService.delete(activePlayer);
		return activePlayer;
	}

	@GetMapping("/")
	String helthCheck() {
		return "";
	}

}
