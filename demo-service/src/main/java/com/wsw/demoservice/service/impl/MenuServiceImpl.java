package com.wsw.demoservice.service.impl;

import com.wsw.demobase.entity.Menu;
import com.wsw.demodao.mapper.MenuMapper;
import com.wsw.demoservice.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 17:48 2020/8/24
 * @Description:
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getMenusByHrId(Integer id) {
        return menuMapper.getMenusByHrId(id);
    }
}
