package com.consallink.HanshinTigersActivePlayerDirector.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consallink.HanshinTigersActivePlayerDirector.model.ActivePlayer;
import com.consallink.HanshinTigersActivePlayerDirector.repository.ActivePlayerRepository;

@Service
@Transactional
public class ActivePlayerService {

	@Autowired
	ActivePlayerRepository activeplayerRepository;

	/**
	 * すべてのレコードを取得する
	 * 
	 * @param
	 * @return
	 */
	public List<ActivePlayer> getAllPlayer() {
		var source = activeplayerRepository.findAllByOrderById();
		List<ActivePlayer> activePlayer = new ArrayList<ActivePlayer>();
		source.forEach(activePlayer::add);
		return activePlayer;
	}

	// 更新メソッド
	public void update(ActivePlayer activePlayer) {
		activeplayerRepository.save(activePlayer);
	}

	// 追加メソッド
	public void insert(ActivePlayer activePlayer) {
		activeplayerRepository.save(activePlayer);
	}

	// 削除メソッド
	public void delete(ActivePlayer activePlayer) {
		activeplayerRepository.delete(activePlayer);
	}

}
