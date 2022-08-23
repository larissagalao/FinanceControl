package larissagalao.com.github.financecontrol.repositories;

import larissagalao.com.github.financecontrol.entities.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillsRepository extends JpaRepository<Bills, Integer> {

    List<Bills> findByTipo(String type);

    @Query(value = "SELECT sum(valor) FROM Bills")
    Integer total();

    @Query(value = "SELECT sum(valor) FROM Bills where tipo=?1")
    Integer totalbyType(String string);

}
