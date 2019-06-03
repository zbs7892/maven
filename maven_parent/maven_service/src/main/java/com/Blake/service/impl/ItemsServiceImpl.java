package com.Blake.service.impl;

import com.Blake.dao.ItemsDao;
import com.Blake.domain.Items;
import com.Blake.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsDao itemsDao;

	public Items findById(Integer id) {
		return itemsDao.findById(id);
	}
}
