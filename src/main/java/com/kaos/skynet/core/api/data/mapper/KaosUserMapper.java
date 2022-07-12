package com.kaos.skynet.core.api.data.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaos.skynet.core.api.data.entity.KaosUser;

@DS("his")
public interface KaosUserMapper extends BaseMapper<KaosUser> {

}
