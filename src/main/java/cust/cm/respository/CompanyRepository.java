package cust.cm.respository;


import cust.cm.entity.Company;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer>

{

	@Query("SELECT c FROM Company c WHERE c.cname LIKE %:cname%")
	List<Company> findByCnameLike(@Param("cname") String cname);
}
