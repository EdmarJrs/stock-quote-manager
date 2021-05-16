package edmartest.stockquotemanager.repository;

import org.springframework.data.repository.CrudRepository;
import edmartest.stockquotemanager.model.quoteModel;

public interface quoteRepository extends CrudRepository <quoteModel, Integer> {
}
