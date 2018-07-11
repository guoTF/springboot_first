package com.seda.springboot.service.user;

import com.seda.springboot.po.User;

/**
 * UserDao接口类
 * @author admin
 *
 */
public interface UserDao {

    public int insert(User user);
    
    public int deleteById(Integer id);
    
    public int update(User user);
    
    public User getById(Integer id);

}
