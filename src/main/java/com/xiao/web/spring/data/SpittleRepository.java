package com.xiao.web.spring.data;

import com.xiao.web.spring.spittr.Spittle;

import java.util.List;

/**
 * SpittleRepository
 *
 * @author : Gang
 * @date : 2019/2/2
 */
public interface SpittleRepository {

    /**
     * Returns Spittle list
     * @param max max
     * @param count count
     * @return Spittle list
     */
    List<Spittle> findSpittles(long max, int count);
}
