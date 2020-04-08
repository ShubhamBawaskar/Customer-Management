package cust.cm.service;

import java.util.List;
import cust.cm.pojo.CompanyPojo;

public interface CompanyService 
{
    CompanyPojo save(CompanyPojo companyPojo);

	List<CompanyPojo> list();
    
	CompanyPojo get(int companyId);
	
	void update(CompanyPojo companyPojo);

	void deleteCompany(int companyId);

	List<CompanyPojo> findByCompName(String cname);
    
}
