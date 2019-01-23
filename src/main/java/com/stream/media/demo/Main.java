package com.stream.media.demo;

import com.commonlib.common.MLog;
import org.apache.log4j.BasicConfigurator;


public class Main {
    public static void main(String[] args){
        BasicConfigurator.configure();
        System.out.print("hello world\n");
        System.out.print("hello world\n");
        MLog.logger.error("tredstestsetwt");
        MLog.logger.info("tredstestsetwt");
    }
}
