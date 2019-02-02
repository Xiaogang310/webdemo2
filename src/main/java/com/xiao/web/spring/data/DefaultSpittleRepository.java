package com.xiao.web.spring.data;

import com.xiao.web.spring.spittr.Spittle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * DefaultSpittleRepository
 *
 * @author : Gang
 * @date : 2019/2/2
 */
@Component
public class DefaultSpittleRepository implements SpittleRepository {

    private final List<Spittle> list = new ArrayList<>(5);

    DefaultSpittleRepository(){
        list.add(new Spittle("hello", new Date()));
        list.add(new Spittle("world", new Date()));
        list.add(new Spittle("hi", new Date()));
        list.add(new Spittle("earth", new Date()));
        list.add(new Spittle("!", new Date()));
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return this.list;
    }
}
