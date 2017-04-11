package com.mongodb.repository;

import com.mongodb.pojo.UserMsg;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kerns on 2017/4/11.
 */
@Repository
public interface UserMsgRepository extends MongoRepository<UserMsg, String> {
    UserMsg findByName(String name);
}
