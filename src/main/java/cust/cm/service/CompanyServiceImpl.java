package cust.cm.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cust.cm.entity.Company;
import cust.cm.pojo.CompanyPojo;
import cust.cm.respository.*;

@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService
{

	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public CompanyPojo save(CompanyPojo companyPojo)
	{
		System.out.println("Service"+ companyPojo.getCname());
		//System.out.println("Service"+ companyPojo.getEmail());
		
		
		Company company=new Company();
		company.setCname(companyPojo.getCname());
		company.setCname1(companyPojo.getCname1());
		company.setNo(companyPojo.getNo());
		company.setCname2(companyPojo.getCname2());
		companyRepository.save(company);
		companyPojo.setId(company.getId());
		return companyPojo;
	}

	
	
	  @Override
	    public List<CompanyPojo> list()
	  {
	        List<CompanyPojo> companyPojoList = new ArrayList<CompanyPojo>();
	        List<Company> companyList = companyRepository.findAll();
	        for (Company company : companyList) 
	        {
	            CompanyPojo companyPojo = new CompanyPojo();
	            companyPojo.setCname(company.getCname());
	            companyPojo.setCname1(company.getCname1());
	            companyPojo.setId(company.getId());
	            companyPojo.setNo(company.getNo());
	            company.setCname2(company.getCname2());
	            companyPojoList.add(companyPojo);
	        }
	        return companyPojoList;
	    }
	  
	  @Override
		public CompanyPojo get(int companyId) 
	  {

			Company company = companyRepository.getOne(companyId);
			
			CompanyPojo companyPojo = new CompanyPojo();
			companyPojo.setId(company.getId());
			companyPojo.setCname(company.getCname());
			companyPojo.setCname1(company.getCname1());
			companyPojo.setNo(company.getNo());
			companyPojo.setCname2(company.getCname2());
			return companyPojo;
		}

		@Override
		public void update(CompanyPojo companyPojo) 
		{
			
			Company company = new Company();
			company.setId(companyPojo.getId());
			company.setCname(companyPojo.getCname());
			company.setCname1(companyPojo.getCname1());
			company.setNo(companyPojo.getNo());
			company.setCname2(companyPojo.getCname2());
			companyRepository.save(company);
			
		}

		@Override
		public void deleteCompany(int companyId)
		{
			companyRepository.deleteById(companyId);
			
		}
		@Override
		public List<CompanyPojo> findByCompName(String cname) {
			
			List<CompanyPojo> companyPojoList = new ArrayList<CompanyPojo>();

			List<Company> companyList = companyRepository.findByCnameLike(cname);

			
			for (Company company : companyList) {
				CompanyPojo companyPojo = new CompanyPojo();
				
				companyPojo.setId(company.getId());
				companyPojo.setCname(company.getCname());
				companyPojo.setCname1(company.getCname1());
				companyPojo.setNo(company.getNo());
				companyPojo.setCname2(company.getCname2());
				companyPojoList.add(companyPojo);
				System.out.println(company.getCname());
			}

			return companyPojoList;

		}

	}

