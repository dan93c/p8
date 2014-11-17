package ro.immortals.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ro.immortals.dao.DeadDAO;
import ro.immortals.model.Dead;
import ro.immortals.service.DeadService;

@Service
public class DeadServiceImpl implements DeadService {

	@Autowired
	private DeadDAO deadDAO;

	@Override
	@Transactional
	public int add(Dead dead) {
		deadDAO.add(dead);
		return 1;
	}

	@Override
	@Transactional
	public void update(Dead dead) {
		deadDAO.update(dead);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		Dead dead = deadDAO.getById(id);
		if (dead != null) {
			deadDAO.delete(dead);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<Dead> getAll() {
		return deadDAO.getAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Dead getById(Integer id) {
		return deadDAO.getById(id);
	}


}