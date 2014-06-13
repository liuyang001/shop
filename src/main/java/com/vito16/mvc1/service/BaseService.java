/**
 * 
 */
package com.vito16.mvc1.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.jmx.export.assembler.InterfaceBasedMBeanInfoAssembler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.vito16.mvc1.dao.UserDao;
import com.vito16.mvc1.model.User;

/**
 * @author Vito
 * @email zhouwentao16@gmail.com
 * @date 2013-7-9
 * 
 */
public abstract class BaseService<T, PK extends Serializable> implements
		IBaseService<T, Serializable> {

	protected JpaRepository<T, PK> dao;

	public void setDao(JpaRepository<T, PK> dao) {// 需要依赖注入
		this.dao = dao;
	}

	@Override
	public void save(T t) {
		dao.save(t);
	}

	

	@Override
	public T find(Serializable id) {
//			return dao.findOne(id);
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}