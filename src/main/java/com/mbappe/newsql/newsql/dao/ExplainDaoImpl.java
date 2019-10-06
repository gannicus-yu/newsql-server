package com.mbappe.newsql.newsql.dao;

/*  Created by heyu on 2019-10-06. 
    usage:     
*/

import com.mbappe.newsql.newsql.persistence.ddl.ExplainDO;
import com.mbappe.newsql.newsql.persistence.ddl.ExplainDOExample;
import com.mbappe.newsql.newsql.persistence.mapper.ExplainDOMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExplainDaoImpl {

    @Autowired
    private ExplainDOMapper explainDOMapper;

    public boolean insert(ExplainDO explainDO) {
        return explainDOMapper.insert(explainDO) > 0;
    }

    public List<ExplainDO> getExplainsByIds(List<Long> ids) {
        ExplainDOExample explainResultEntityExample = new ExplainDOExample();
        explainResultEntityExample.createCriteria().andIdIn(ids);
        explainResultEntityExample.setOrderByClause("ctime asc");
        return explainDOMapper.selectByExample(explainResultEntityExample);
    }

    public List<ExplainDO> getExplainResultById(Long id) {
        ExplainDOExample explainDOExample = new ExplainDOExample();
        explainDOExample.createCriteria().andIdEqualTo(id);
        return explainDOMapper.selectByExample(explainDOExample);
    }
}
