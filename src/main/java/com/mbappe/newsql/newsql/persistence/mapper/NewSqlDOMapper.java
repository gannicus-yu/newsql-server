package com.mbappe.newsql.newsql.persistence.mapper;

import com.mbappe.newsql.newsql.persistence.ddl.NewSqlDO;
import com.mbappe.newsql.newsql.persistence.ddl.NewSqlDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NewSqlDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    long countByExample(NewSqlDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int insert(NewSqlDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int insertSelective(NewSqlDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    List<NewSqlDO> selectByExampleWithBLOBsWithRowbounds(NewSqlDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    List<NewSqlDO> selectByExampleWithBLOBs(NewSqlDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    List<NewSqlDO> selectByExampleWithRowbounds(NewSqlDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    List<NewSqlDO> selectByExample(NewSqlDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    NewSqlDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") NewSqlDO record, @Param("example") NewSqlDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") NewSqlDO record, @Param("example") NewSqlDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") NewSqlDO record, @Param("example") NewSqlDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(NewSqlDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(NewSqlDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table new_sql_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(NewSqlDO record);
}