package com.web.dao;

import com.web.entity.User;
import com.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl (JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    };

    @Override
    public void save(User user) {
        String sql="INSERT INTO user (email, last, first ) VALUES (?, ?, ?)";
            jdbcTemplate.update(sql,  user.getEmail(), user.getFirst(), user.getLast());
    }

    @Override
    public User getById(int id) {
        String sql= "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void update(User user) {
        String sql="UPDATE user SET  email=?, first=?, last=? WHERE id=?";
        jdbcTemplate.update(sql, user.getLast(), user.getFirst(), user.getEmail(), user.getId());
    }

    @Override
    public void delete(int id) {
        String sql= "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
