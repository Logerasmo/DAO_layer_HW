package com.example.DAO_layer_HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository

public class Repository {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private NamedParameterJdbcTemplate template;

    private final String script = read("select.sql");

    public String getProductName(String name){
        var RowSet = template.queryForRowSet(script, Map.of("name", name));
        return RowSet.getString("product_name");
    }


    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
