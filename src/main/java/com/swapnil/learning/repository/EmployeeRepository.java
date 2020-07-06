/**
 * 
 */
package com.swapnil.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swapnil.learning.model.Employee;

/**
 * @author dangoswa
 *
 */
@Repository
public interface EmployeeRepository extends  JpaRepository<Employee, Integer> {

}
