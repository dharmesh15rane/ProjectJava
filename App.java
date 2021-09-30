package com.yash.SpringORM;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.SpringORM.dao.StudentDao;
import com.yash.SpringORM.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");									
    		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
    		Student student=new Student(1,"Rane","Indore");
    		int r= studentDao.insert(student);
    		System.out.println("!! done !!"+r);
    }
}
