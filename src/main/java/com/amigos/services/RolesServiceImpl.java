package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.RolesDAO;
import com.amigos.entities.Roles;

@Service
public class RolesServiceImpl implements RolesService {
	
	@Autowired
	private RolesDAO roleDAO;

	@Override
	public List<Roles> getAllRoles() {
		
		return roleDAO.getAllRoles();
	}

	@Override
	public void addRole(Roles role) {
		
		roleDAO.addRole(role);
	}

	@Override
	public void updateRole(Roles role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRole(int roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Roles getRoleById(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}
}
