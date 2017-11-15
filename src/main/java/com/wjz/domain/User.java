package com.wjz.domain;

import lombok.Data;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;
import org.springframework.data.cassandra.repository.MapId;

/**
 * Created by wangjinzhao on 2017/11/15.
 */
@Data
@Table("users")
public class User {
    @PrimaryKey
    private Long id;

    private String name;
}
