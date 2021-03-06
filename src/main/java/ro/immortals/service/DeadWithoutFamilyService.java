package ro.immortals.service;

import java.util.List;

import ro.immortals.model.Dead;
import ro.immortals.model.DeadWithoutFamily;

public interface DeadWithoutFamilyService {

	public int add(DeadWithoutFamily deadWithoutFamily, String username);

	public int update(DeadWithoutFamily deadWithoutFamily, String username);

	public void delete(Integer id, String username);

	public List<DeadWithoutFamily> getAll();

	public DeadWithoutFamily getById(Integer id);

	public Integer getAllSearchBySize(String search);

	public List<DeadWithoutFamily> getAllByPageOrderBySearch(String order,
			String search, Integer offset, Integer nrOfRecords);

	boolean checkDuplicate(DeadWithoutFamily deadWithoutFamily);

}
