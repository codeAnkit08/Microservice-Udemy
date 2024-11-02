package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto-CustomerDto Object
     */

    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return Account Details based on mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return boolean indicating if the update of account details is successful
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return boolean indicating if the delete of account details is successful
     */
    boolean deleteAccount(String mobileNumber);

}
