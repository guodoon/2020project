package com.team.bank.service;

import com.team.bank.enums.AdminResultEnum;
import com.team.bank.model.Administrator;
import com.team.bank.model.ReturnObject;

public interface AdminRegistService {
    public AdminResultEnum RegisterAdminstrator(Administrator administrator, ReturnObject returnObject);
}
