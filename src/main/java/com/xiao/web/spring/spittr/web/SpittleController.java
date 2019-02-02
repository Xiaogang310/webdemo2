package com.xiao.web.spring.spittr.web;

import com.xiao.web.spring.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpittleController
 *
 * @author : Gang
 * @date : 2019/2/2
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittleRepository respository;

    @Autowired
    public SpittleController(SpittleRepository repository){
        this.respository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        model.addAttribute(
                this.respository.findSpittles(
                        Long.MAX_VALUE, 20
                )
        );

        return "spittles";
    }

}
