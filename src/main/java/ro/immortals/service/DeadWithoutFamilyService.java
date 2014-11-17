package ro.immortals.service;

import java.util.List;

import ro.immortals.model.DeadWithoutFamily;

public interface DeadWithoutFamilyService {

	public int add(DeadWithoutFamily deadWithoutFamily);

	public void update(DeadWithoutFamily deadWithoutFamily);

	public void delete(Integer id);

	public List<DeadWithoutFamily> getAll();

	public DeadWithoutFamily getById(Integer id);

}
