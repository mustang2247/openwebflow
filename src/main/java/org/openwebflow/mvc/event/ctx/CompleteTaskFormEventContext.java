package org.openwebflow.mvc.event.ctx;

import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

public interface CompleteTaskFormEventContext extends EventContext
{
	public abstract ProcessInstance getProcessInstance();

	public abstract Task getTask();

	public abstract String getTaskId();

}