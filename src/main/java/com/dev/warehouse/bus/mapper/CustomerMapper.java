package com.dev.warehouse.bus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dev.warehouse.bus.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

}
