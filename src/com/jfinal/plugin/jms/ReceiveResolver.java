package com.jfinal.plugin.jms;

import java.io.Serializable;

public interface ReceiveResolver {
	void resolve(Serializable objectMessage) throws Exception;
}
