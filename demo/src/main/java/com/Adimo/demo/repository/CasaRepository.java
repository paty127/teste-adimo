package com.Adimo.demo.repository;

import com.Adimo.demo.entity.Casa;

@Repository
public interface CasaRepository extends JpaRepository<Casa, Integer> {
	@Query(nativeQuery = true,value="select * "
			+ "from casa as cs "
			+ "inner join localidade as loc on cs.fk_loc_casa = cs.id_loc "
			+ "where b.nome = :nome")
	List<Casa> buscaCasaPorLocalidade(String zona);
	
	@Query(nativeQuery = true,value="select * "
			+ "from casa "
			+ "where id = :id")
	Casa buscaCasaPorId(Integer id);
}
