package cn.edu.bupt.openproject.task.domain.pojo;

/**
 * <p>Title: QuartzEntity</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-08 10:08</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class QuartzEntity {

    // 任务名称
    private String jobName;
    // 任务分组
    private String jobGroup;
    // 任务描述
    private String description;
    // 执行类
    private String jobClassName;
    // 执行时间
    private String cronExpression;
    // 触发器名称
    private String triggerName;
    // 触发器状态
    private String triggerState;
    // 任务名称，用于修改
    private String oldJobName;
    // 任务分组，用于修改
    private String oldJobGroup;

    public QuartzEntity() {
        super();
    }
    public QuartzEntity(String jobName, String jobGroup, String description, String jobClassName, String cronExpression, String triggerName) {
        super();
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.description = description;
        this.jobClassName = jobClassName;
        this.cronExpression = cronExpression;
        this.triggerName = triggerName;
    }

    public String getJobName() {
        return jobName;
    }
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    public String getJobGroup() {
        return jobGroup;
    }
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getJobClassName() {
        return jobClassName;
    }
    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }
    public String getCronExpression() {
        return cronExpression;
    }
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }
    public String getTriggerName() {
        return triggerName;
    }
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }
    public String getTriggerState() {
        return triggerState;
    }
    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }
    public String getOldJobName() {
        return oldJobName;
    }
    public void setOldJobName(String oldJobName) {
        this.oldJobName = oldJobName;
    }
    public String getOldJobGroup() {
        return oldJobGroup;
    }
    public void setOldJobGroup(String oldJobGroup) {
        this.oldJobGroup = oldJobGroup;
    }
}