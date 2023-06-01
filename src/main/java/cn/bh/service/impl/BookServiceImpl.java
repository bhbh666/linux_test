package cn.bh.service.impl;

import cn.bh.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("service.....");
    }
}
