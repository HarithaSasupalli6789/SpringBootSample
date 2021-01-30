package com.tcswork.week2hw;

	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import com.tcswork.week2hw.EmployeeH;
	public interface RepositoryH extends JpaRepository<EmployeeH, Integer> {
	}
