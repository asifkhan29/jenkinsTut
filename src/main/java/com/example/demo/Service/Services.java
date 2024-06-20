package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.DemoEntity;
import com.example.demo.Repo.Repo;

@Service
public class Services {
	
	@Autowired
	private Repo repo;
	
	public DemoEntity create(DemoEntity demo)
	{
		return repo.save(demo);
	}
	
	public DemoEntity getById(int id)
	{
		return repo.findById(id).get(); 
	}
	public List<DemoEntity> getAll()
	{
		return repo.findAll();
	}
	public DemoEntity update(DemoEntity demo)
	{
//		Optional<DemoEntity> findById = repo.findById(demo.getId());
//		findById.get().setPasswordString(demo.getPasswordString());
//		findById.get().setEmail(demo.getEmail());
		return repo.save(demo);
	}
    public boolean delete(int id)
    {
    	 repo.deleteById(id);
    	 return true;
    }

}
