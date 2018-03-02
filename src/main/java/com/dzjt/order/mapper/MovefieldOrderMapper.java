package com.dzjt.order.mapper;

import com.dzjt.base.BaseMapper;
import com.dzjt.order.entity.MovefieldOrder;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/2/5 0005.
 */
public interface MovefieldOrderMapper  extends BaseMapper {
    List<MovefieldOrder> getMovefieldOrderListYesterday(Map<String, Object> params);
    List<MovefieldOrder> getMovefieldOrderListHistory(Map<String,Object> params);
}
