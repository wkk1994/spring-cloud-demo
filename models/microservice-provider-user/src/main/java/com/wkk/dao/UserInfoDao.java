package com.wkk.dao;

import com.wkk.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/8/26 0026.
 */
@Repository
public interface UserInfoDao extends JpaRepository<UserInfo,Long>{
}
