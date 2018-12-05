package com.yyl.ealtis.VO;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "shu",type = "zhi")
public class SHutdown {


    @Id
    private Integer id ;
    private  String name;

    @Override
    public String toString() {
        return "SHutdown{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
