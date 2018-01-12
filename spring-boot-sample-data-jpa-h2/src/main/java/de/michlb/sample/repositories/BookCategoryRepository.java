/**
 * 
 */
package de.michlb.sample.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.michlb.sample.domain.BookCategory;

/**
 * @author mahes
 *
 */

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {

	public void deleteByIdIn(List<Integer> ids);
	
}
