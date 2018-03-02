package com.dzjt.carUser.mapper;

import com.dzjt.base.BaseMapper;
import com.dzjt.carUser.entity.CarInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/2/5 0005.
 */
public interface CarInfoMapper extends BaseMapper {
    List<CarInfo> getCarInfoListYesterday(Map<String, Object> params);
    List<CarInfo> getCarInfoListHistory(Map<String,Object> params);
}
