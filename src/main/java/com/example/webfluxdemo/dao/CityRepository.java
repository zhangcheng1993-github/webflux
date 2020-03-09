package com.example.webfluxdemo.dao;

import com.example.webfluxdemo.domain.City;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: webfluxdemo
 * @description: 数据访问层
 * @author: zhangCheng
 * @create: 2020/03/04 15:07
 */
public class CityRepository {

    private ConcurrentMap<Long, City> repository = new ConcurrentHashMap<>();

    private static final AtomicLong idGenerator = new AtomicLong(0);


    public Long save(City city) {
        Long id = idGenerator.incrementAndGet();
        city.setId(id);
        repository.put(id, city);
        return id;
    }


}
