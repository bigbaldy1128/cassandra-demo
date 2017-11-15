package com.wjz.domain;

import org.springframework.data.cassandra.repository.CassandraRepository;

/**
 * Created by wangjinzhao on 2017/11/15.
 */
public interface UserRepository extends CassandraRepository<User> {

}
