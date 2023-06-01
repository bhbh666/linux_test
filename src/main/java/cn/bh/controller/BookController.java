package cn.bh.controller;

import cn.bh.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private Enterprise enterprise;
    @GetMapping("/{id}")
    public String save(@PathVariable Integer id){
        System.out.println("id:"+id);
        System.out.println(enterprise);
        return "hello spring boot";
    }
}
