package ru.javamentor.preproject.task34server.service.serviceImpl;

import ru.javamentor.preproject.task34server.dao.RoleDao;
import ru.javamentor.preproject.task34server.model.Role;
import ru.javamentor.preproject.task34server.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role getRoleById(Long id) {
        return roleDao.getRoleById(id);
    }
}
