package com.adu.ms.controller;

import com.adu.ms.entity.Msmerchant;
import com.adu.ms.mapper.MsmerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BaoZhou
 * @since 2019-11-06
 */
@RestController
@RequestMapping("//msmerchant")
public class MsmerchantController {


    @Resource
    private MsmerchantMapper msmerchantMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("getMsmerchant")
    public List<Msmerchant> getMsmerchant(){

        List<Msmerchant> msmerchants = msmerchantMapper.selectList(null);
        return msmerchants;
    }

    @RequestMapping("addRedis")
    public void addRedis(){

        redisTemplate.opsForValue().set("1","123".toString());
    }
}

