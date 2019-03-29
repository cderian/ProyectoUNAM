package com.cocay.sicecd.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cocay.sicecd.model.Perfil_sys;
import com.cocay.sicecd.model.Test;

@Repository
public interface Perfil_sysRep extends PagingAndSortingRepository<Perfil_sys, Integer>{
	List<Test> findByName(String name);

}