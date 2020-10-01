package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD Operations for specimens
 * @author imad_
 *
 */

public interface ISpecimenService {
	/**
	 * Get specimens from persistence layer
	 * @param id unit lookup 
	 * @return a specimen with a matching ID 
	 *
	 */

	SpecimenDTO fetchById(int id);
	
	/**
	 * Persist the given DTO
	 * @Param specimenDTO
	 *
	 */

	void save(SpecimenDTO specimenDTO);

}