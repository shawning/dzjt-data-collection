package com.dzjt.timer.controller;

import com.dzjt.base.Util.DateUtils;
import com.dzjt.base.Util.FileUtils;
import com.dzjt.base.constant.FileConfig;
import com.dzjt.timer.service.DailyTaskService;
import com.dzjt.timer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by Administrator on 2018/2/5 0005.
 */
@Component
public class TaskTimer {
    @Autowired
    private TaskService taskService;
    @Autowired
    private FileConfig fileConfig;
    @Autowired
    private DailyTaskService dailyTaskService;

    /**
     * 2018年2月5日18点执行。初始化所有的数据，上传系统所有的数据
     */
//    @Scheduled(cron="0 45 14 5 2 2018")
//    public void initTask(){
//        taskService.initTask();
//    }

    /**
     * 每日07点定时执行，上传昨日的数据
     */
    @Scheduled(cron="0 30 0 * * ?")
    public  void initDailyTask(){
        String path = fileConfig.getBasepath();
        File file = new File(path);
        if(file.isDirectory()){
            if(file.listFiles().length>0){
                dailyTaskService.doDailyTask();
            }else{
                taskService.initTask();
            }
        }
    }
}
