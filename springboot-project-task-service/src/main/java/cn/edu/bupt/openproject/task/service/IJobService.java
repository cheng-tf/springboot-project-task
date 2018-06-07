package cn.edu.bupt.openproject.task.service;



import cn.edu.bupt.openproject.task.domain.pojo.QuartzEntity;

import java.util.List;

public interface IJobService {
	
    List<QuartzEntity> listQuartzEntity(QuartzEntity quartz, Integer pageNo, Integer pageSize);
    
    Long listQuartzEntity(QuartzEntity quartz);	
}
