package cn.edu.bupt.openproject.task.dao;

import java.util.List;

/**
 * <p>Title: DynamicQuery</p>
 * <p>Description: 扩展Spring Data Jpa, 支持动态jpql/nativesql查询，并支持分页查询 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-08 10:12</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface DynamicQuery {

    void save(Object entity);

    void update(Object entity);

    <T> void delete(Class<T> entityClass, Object entityid);

    <T> void delete(Class<T> entityClass, Object[] entityids);

    /**
     * 查询对象列表，返回List
     */
    <T> List<T> nativeQueryList(String nativeSql, Object... params);

    /**
     * 查询对象列表，返回List<Map<key,value>>
     */
    <T> List<T> nativeQueryListMap(String nativeSql, Object... params);

    /**
     * 查询对象列表，返回List<组合对象>
     */
    <T> List<T> nativeQueryListModel(Class<T> resultClass, String nativeSql, Object... params);

    /**
     * 执行nativeSql统计查询
     * @param params    占位符参数(例如?1)绑定的参数值
     * @return          统计条数
     */
    Long nativeQueryCount(String nativeSql, Object... params);

}
