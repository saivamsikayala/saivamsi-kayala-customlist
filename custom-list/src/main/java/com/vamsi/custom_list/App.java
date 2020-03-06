package com.vamsi.custom_list;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void main(String[] args){
	        CustomList<Integer> list = new CustomList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        logger.info(list);
	        list.remove(2);
	        logger.info(list);
	        logger.info(list.get(0));
	        logger.info(list.get(1));
	        logger.info(list.size());
	}
}
