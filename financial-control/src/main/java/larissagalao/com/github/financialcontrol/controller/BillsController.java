package larissagalao.com.github.financialcontrol.controller;

import larissagalao.com.github.financialcontrol.entities.Bills;
import larissagalao.com.github.financialcontrol.entities.Graph;
import larissagalao.com.github.financialcontrol.repositories.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/bills")
public class BillsController {

    private final BillsRepository repository;

    @Autowired
    public BillsController(BillsRepository repository){
        this.repository = repository;
    }

  /*

    `` Este método está comentado pois a inserção de dados está sendo feita pelo arquivo CSV ``

    @PostMapping
    @RequestMapping("/repository")
    @ResponseStatus(HttpStatus.CREATED)
    public Bills save(@RequestBody Bills bill){
        return repository.save(bill);
    }

   */

    /*

    `` Este método está comentado pois a remoção de dados poderá ser feita pelo arquivo CSV ``


    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }

    */


    @GetMapping("/list")
    public List<Bills> listAll(){
        return this.repository.findAll();
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

    @GetMapping("/graph")
    public void graph(){
        Graph g = new Graph();
        g.createGraph(returnHash());
    }

    @GetMapping("/types")
    public Set<String> returnTypes(){
        List<String> list = this.repository.types();
        Set<String> set = new HashSet<>();

        for(String s : list){
            set.add(s);
        }
        return set;
    }

    @GetMapping("hash")
    public HashMap<String, Integer> returnHash(){

        List<String> list1 = this.repository.types();
        Set<String> set = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<String,Integer>();

        for(String s : list1){
            set.add(s);
        }

        String[] s = set.toArray(new String[set.size()]);

        for(String string : s){
            hashMap.put(string, valueOf(string));
        }

        return hashMap;

    }

}


