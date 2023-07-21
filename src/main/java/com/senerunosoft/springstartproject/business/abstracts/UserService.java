package com.senerunosoft.springstartproject.business.abstracts;

import com.senerunosoft.springstartproject.core.entities.User;
import com.senerunosoft.springstartproject.core.utilities.results.DataResults;
import com.senerunosoft.springstartproject.core.utilities.results.Result;

public interface UserService {
    Result add(User user);
    DataResults<User> findByEmail(String email);

}
