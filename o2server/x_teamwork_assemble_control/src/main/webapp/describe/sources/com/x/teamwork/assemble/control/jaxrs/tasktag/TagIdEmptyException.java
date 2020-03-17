package com.x.teamwork.assemble.control.jaxrs.tasktag;

import com.x.base.core.project.exception.PromptException;

class TagIdEmptyException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	TagIdEmptyException() {
		super("工作任务标签信息ID不允许为空。" );
	}
}
