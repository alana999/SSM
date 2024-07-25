package com.alana.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTempletTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testSelcetObject(){
        String sql = "select * from t_emp  where id =?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }

    @Test
    public void testSelectList(){
        String sql = "select * from t_emp ";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }
    @Test
    public void testSelectValue(){
        String sql = "select count(*) from t_emp";
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));

    }

    @Test
    public void testUpdate(){
//        1添加操作
//            String sql ="insert into t_emp values(null,?,?,?)";
//        int rows = jdbcTemplate.update(sql, "百象", 17, "f");
//        System.out.println(rows);


//        2修改操作
//        String sql = "update t_emp set sex= ? where id =?";
//        int rows = jdbcTemplate.update(sql, "m", 3);
//        System.out.println(rows);

        //        3删除操作


    }
}
