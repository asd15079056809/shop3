package com.bdqn.dmscq.service.impl;

import com.bdqn.dmscq.entity.Employee;
import com.bdqn.dmscq.mapper.EmployeeMapper;
import com.bdqn.dmscq.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-03-23
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
