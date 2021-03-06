package ro.immortals.service;

import java.util.List;

import ro.immortals.model.ConcessionContract;

public interface ConcessionContractService {

	public int add(ConcessionContract concessionContract, String username);

	public int update(ConcessionContract concessionContract, String username, String updateDate);

	public void delete(Integer id, String username);

	public List<ConcessionContract> getAll();

	public ConcessionContract getById(Integer id);

	public boolean checkDuplicate(ConcessionContract concessionContract);

	public Integer getAllSearchBySize(String search);

	public List<ConcessionContract> getAllByPageOrderBySearch(String order,
			String search, Integer offset, Integer nrOfRecords);

	public List<ConcessionContract> getAllGravesExpiredOnYears(String order,
			String search, Integer offset, Integer nrOfRecords);

	public Integer getAllGravesExpiredOnYearsSize(String search);


}
