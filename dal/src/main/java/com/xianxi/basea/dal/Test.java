package com.xianxi.basea.dal;

import com.ibatis.sqlmap.engine.cache.CacheController;
import com.ibatis.sqlmap.engine.cache.CacheModel;

import java.util.Properties;

/**
 * @author zengxianxi
 * @since 13-12-23 16:09
 */
public class Test implements CacheController {
    @Override
    public void flush(CacheModel cacheModel) {

    }

    @Override
    public Object getObject(CacheModel cacheModel, Object key) {
        return null;
    }

    @Override
    public Object removeObject(CacheModel cacheModel, Object key) {
        return null;
    }

    @Override
    public void putObject(CacheModel cacheModel, Object key, Object object) {

    }

    @Override
    public void setProperties(Properties props) {

    }
}
