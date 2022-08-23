package larissagalao.com.github.financialcontrol.controller;

import larissagalao.com.github.financialcontrol.entities.Bills;
import larissagalao.com.github.financialcontrol.repositories.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillsController {

    private final BillsRepository repository;

    @Autowired
    public BillsController(BillsRepository repository){
        this.repository = repository;
    }

    @PostMapping
    @RequestMapping("/repository")
    @ResponseStatus(HttpStatus.CREATED)
    public Bills save(@RequestBody Bills bill){
        return repository.save(bill);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @GetMapping("/list/{tipo}")
    public List<Bills> listType(@PathVariable String tipo){
        return this.repository.findByTipo(tipo);
    }

    @GetMapping("/valueof/{s}")
    public Integer valueOf(@PathVariable String s){
        return this.repository.totalbyType(s);
    }

    @GetMapping("/total")
    public Integer total(){
        return this.repository.total();
    }

}
