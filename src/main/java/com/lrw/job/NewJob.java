package com.lrw.job;

import java.util.Date;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
  
public class NewJob implements BaseJob {  
  
     
    public NewJob() {  
          
    }  
     
    public void execute(JobExecutionContext context)  
        throws JobExecutionException {  
    	System.out.println("New Job执行时间: " + new Date());
          
    }  
}  