package com.example.demo.Cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.DemoEntity;
import com.example.demo.Service.Services;

@RestController
@RequestMapping("/demo")
public class Controller {

	@Autowired
	private Services services;
	
	@GetMapping("/create")
	public DemoEntity create(@RequestBody DemoEntity demo)
	{
		return services.create(demo);
	}
	@GetMapping("/{id}")
	public DemoEntity getById(@PathVariable int id)
	{
		return services.getById(id);
	}
	@GetMapping("/all")
	public  List<DemoEntity> getList()
	{
		return services.getAll();
	}
	@DeleteMapping("/")
	public boolean delete(@PathVariable int id)
	{
		return services.delete(id);
	}
	@PutMapping("/update")
	public DemoEntity update(@RequestBody DemoEntity demo)
	{
		return services.update(demo);
	}
	
}
