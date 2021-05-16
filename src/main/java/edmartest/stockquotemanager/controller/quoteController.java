package edmartest.stockquotemanager.controller;

import edmartest.stockquotemanager.model.quoteModel;
import edmartest.stockquotemanager.repository.quoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class quoteController {

    @Autowired
    private quoteRepository repository;

    @GetMapping (path = "/api/quote/{id}")
    public ResponseEntity queryQuote (@PathVariable("id") Integer id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping(path = "/api/quote/save")
    public quoteModel save(@RequestBody quoteModel quote){
        return repository.save(quote);
    }
}
