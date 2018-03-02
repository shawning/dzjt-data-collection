package com.dzjt.base;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
public interface BaseMapper<T>{
    /**
     * 删除指定id
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);
    /**
     * 插入
     *
     * @param record
     * @return
     */
    int insert(T record);

    /**
     * 条件插入
     *
     * @param record
     * @return
     */
    int insertSelective(T record);

    /**
     * 查询指定id
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(Integer id);

    /**
     * 根据id条件更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 根据id更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);
}
