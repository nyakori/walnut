package com.kaos.walnut.core.api.data.cache;

import com.kaos.walnut.core.api.data.entity.KaosUserAccess;
import com.kaos.walnut.core.api.data.mapper.KaosUserAccessMapper;
import com.kaos.walnut.core.type.Cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class KaosUserAccessCache extends Cache<String, KaosUserAccess> {
    @Autowired
    public KaosUserAccessCache(KaosUserAccessMapper kaosUserAccessMapper) {
        super(new Converter<String, KaosUserAccess>() {
            @Override
            public KaosUserAccess convert(String userCode) {
                return kaosUserAccessMapper.selectById(userCode);
            }
        });
    }
}
