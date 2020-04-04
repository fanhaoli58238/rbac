package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Url;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.ElementService;
import com.bjsxt.service.MenuService;
import com.bjsxt.service.UrlService;
import com.bjsxt.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;
    @Resource
    private MenuService menuServiceImpl;
    @Resource
    private ElementService elementServiceImpl;

    @Resource
    private UrlService urlServiceImpl;


    @Override
    public Map<String, Object> login(Users users) {
        Map<String, Object> map = new HashMap<>();
        Users user = usersMapper.selByUser(users);
        if (user != null) {
            user.setMenus(menuServiceImpl.showMenu(user.getRid()));
            user.setElements(elementServiceImpl.selByRid(user.getRid()));
            user.setUrls(urlServiceImpl.selByRid(user.getRid()));
            map.put("allurl",urlServiceImpl.showAll());
        }
        map.put("user",user);
        return map;
    }
}
