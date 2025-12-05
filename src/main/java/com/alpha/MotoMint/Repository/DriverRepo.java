package com.alpha.MotoMint.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.MotoMint.Entity.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Integer>{
	
	public Driver findByMobileno(long mob);
}
