package com.noslowq.newsql.newsql.persistence.mapper;

import com.noslowq.newsql.newsql.persistence.ddl.DbInfoDO;
import com.noslowq.newsql.newsql.persistence.ddl.DbInfoDOExample;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface DbInfoDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    int insert(DbInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    int insertSelective(DbInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    List<DbInfoDO> selectByExampleWithRowbounds(DbInfoDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    List<DbInfoDO> selectByExample(DbInfoDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    DbInfoDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DbInfoDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbInfoDO record);
}