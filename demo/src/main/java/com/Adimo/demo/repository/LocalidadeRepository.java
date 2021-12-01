package com.Adimo.demo.repository;

import java.util.List;

public interface LocalidadeRepository extends JpaRepositoryRepository<Localidade, Integer> {
	


		@Query(nativeQuery = true, value = "select * "
				+ "from localidade "
				+ "where lower(zona) like lower(concat(:termo, '%'))")
		List<Localidade> buscaLocalidadePorZona(@Param("termo") String termo);
	}

