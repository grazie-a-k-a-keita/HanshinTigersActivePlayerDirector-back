package com.consallink.HanshinTigersActivePlayerDirector.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.consallink.HanshinTigersActivePlayerDirector.model.ActivePlayer;

public interface ActivePlayerRepository extends CrudRepository<ActivePlayer, Integer> {

	List<ActivePlayer> findAllByOrderById();

}
