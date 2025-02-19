import org.springframework.Data.jpa.respository.JpaRepository;
import org.spingbootframwork.stereotype.Repository;
import java.util.List;

@Repository

public interface ItemRepository extends  JpaRepository<Item,Long>{
    List<Item>findByNameContainingIgnoreCase (String name);


}
