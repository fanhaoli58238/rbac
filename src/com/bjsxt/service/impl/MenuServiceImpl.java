package com.bjsxt.service.impl;

import com.bjsxt.mapper.MenuMapper;
import com.bjsxt.pojo.Menu;
import com.bjsxt.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Resource

    private MenuMapper menuMapper;
    @Override
    public List<Menu> showMenu(int rid) {
        return menuMapper.selByRid(rid,0);
    }
}
