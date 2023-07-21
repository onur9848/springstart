package com.senerunosoft.springstartproject.business.concretes;

import com.senerunosoft.springstartproject.business.abstracts.UserService;
import com.senerunosoft.springstartproject.core.dataAccess.UserDao;
import com.senerunosoft.springstartproject.core.entities.User;
import com.senerunosoft.springstartproject.core.utilities.results.DataResults;
import com.senerunosoft.springstartproject.core.utilities.results.Result;
import com.senerunosoft.springstartproject.core.utilities.results.SuccessDataResult;
import com.senerunosoft.springstartproject.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

    @Override
    public DataResults<User> findByEmail(String email) {

        return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Kullanıcı Getirildi");
    }
}
