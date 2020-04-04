package com.bjsxt.service.impl;

import com.bjsxt.mapper.UrlMapper;
import com.bjsxt.pojo.Url;
import com.bjsxt.service.UrlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UrlServiceImpl implements UrlService {

    @Resource
    private UrlMapper urlMapper;


    @Override
    public List<Url> selByRid(int rid) {
        return urlMapper.selByRid(rid);
    }

    @Override
    public List<Url> showAll() {
        return urlMapper.selAll();
    }
}
