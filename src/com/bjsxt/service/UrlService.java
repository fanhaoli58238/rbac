package com.bjsxt.service;

import com.bjsxt.pojo.Url;

import java.util.List;

public interface UrlService {
    List<Url> selByRid(int rid);

    List<Url> showAll();
}
