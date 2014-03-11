package com.xianxi.basea.dal.dao;

import com.alibaba.citrus.test.context.SpringextContextLoader;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/resources.xml", "/classpath/basea/dal/data-source.xml",
        "/classpath/basea/dal/dao.xml"}, loader = SpringextContextLoader.class)
public abstract class AbstractDataAccessTests extends AbstractTransactionalJUnit4SpringContextTests {
}
