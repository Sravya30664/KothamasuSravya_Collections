package com.epam.Collections;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CreateList {
 private static final Logger logger=LogManager.getLogger(CreateList.class);
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	CustomCollection<Integer> list=new CustomCollection<Integer>();
	logger.info("List before creation");
	logger.info(list);
	logger.info("Enter number of elements");
	int num=sc.nextInt();
	logger.info("Enter Elements:");
    for (int i=0;i<num;i++)
    {
    	int ele=sc.nextInt();
    	list.add(ele);
    	
    }
    logger.info("New list after adding elements:");
    logger.info(list);
    logger.info("Enter element index to be removed");
    int removeele;
    removeele=sc.nextInt();
    list.remove(removeele);
    logger.info("Modified list after removing elements:"+list);
    logger.info("Element at index 2 is "+ list.retrieve(2));
    int len=list.size();
    logger.info("value at last index is: "+list.retrieve(len-1));
    logger.info("Total size of the list "+list.size());
 }
}
