package org.windwant.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
/**
 * Created by windwant on 2016/11/9.
 */
public class APListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("ApplicationEvent: " + applicationEvent.getClass().getName());
    }
}
