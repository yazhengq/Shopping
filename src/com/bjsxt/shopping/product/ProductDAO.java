package com.bjsxt.shopping.product;

import java.util.List;

public interface ProductDAO {
	public List<Product> getProducts();
	public int getProducts(List<Product> products, int pageNo, int pageSize, boolean lazy);
	public void add(Product p);
	public void delete(int id);
	public void update(Product p);
	public Product loadById(int id);
	public void delete(String conditionStr);
	public int find(List<Product> products, int pageNo, int pageSize, String queryStr);
}


//UserDAO
	//MySQL Oracle
//CategoryDAO
	//MySQL Oracle
//ProductDAO
	//MySQL Oracle
//业务逻辑类中会牵扯各种DAO，需要判断是什么 就new什么
//一系列对象的设计方法

/*
 * 简单工厂设计模式
 * 自己创建对象 改由这个DAO工厂，帮助创建这个对象
 * 通过这个factory读取配置文件 如果配置文件读取的是mysql 创建，或者池子pool
class DAOFactory {
	//产生对象
	UserDAO getUserDAO() {
		return mysqlDao
	}
	//产生对象
	CategoryDAO getCategoryDAO() {
		
	}
}
*/

/*
 * 
 * abstract factory
 * 抽象工厂
 * 面向接口的编程
interface DAOFactory {
	UserDAO getUserDAO() ;
	
	CategoryDAO getCategoryDAO() ;
}

//mysql的实现 一些列的mysql的方法通过这个接口实现
class MySQLDAOFactory implements DAOFactory {
	UserDAO getUserDAO() { return mysqlDao };
	
	CategoryDAO getCategoryDAO() ;
}
//oracle的实现 一些列的oracle的方法通过这个接口实现
class oracleDAOFactory implements DAOFactory {
	UserDAO getUserDAO() { return oracleDao };
	
	CategoryDAO getCategoryDAO() ;
}

interface SkinFactory {
	MenuBar getMenuBar();
}
*/
//factory method
//simple factory 
//abstract factory