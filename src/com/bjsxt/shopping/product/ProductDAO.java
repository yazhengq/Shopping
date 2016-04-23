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
//ҵ���߼����л�ǣ������DAO����Ҫ�ж���ʲô ��newʲô
//һϵ�ж������Ʒ���

/*
 * �򵥹������ģʽ
 * �Լ��������� �������DAO���������������������
 * ͨ�����factory��ȡ�����ļ� ��������ļ���ȡ����mysql ���������߳���pool
class DAOFactory {
	//��������
	UserDAO getUserDAO() {
		return mysqlDao
	}
	//��������
	CategoryDAO getCategoryDAO() {
		
	}
}
*/

/*
 * 
 * abstract factory
 * ���󹤳�
 * ����ӿڵı��
interface DAOFactory {
	UserDAO getUserDAO() ;
	
	CategoryDAO getCategoryDAO() ;
}

//mysql��ʵ�� һЩ�е�mysql�ķ���ͨ������ӿ�ʵ��
class MySQLDAOFactory implements DAOFactory {
	UserDAO getUserDAO() { return mysqlDao };
	
	CategoryDAO getCategoryDAO() ;
}
//oracle��ʵ�� һЩ�е�oracle�ķ���ͨ������ӿ�ʵ��
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