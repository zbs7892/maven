package com.Blake.dao;

import com.Blake.domain.Items;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {
	Items findById(Integer id);
}
