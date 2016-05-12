package com.citou.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

/**
 * 在web启动时执行的代码
 * @author citou
 *
 */

@Service
public class StartAddDataListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		if(event.getApplicationContext().getParent()==null)
		{
			
		}
	}
}
