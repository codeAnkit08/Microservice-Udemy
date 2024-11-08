package com.microservice.loans.service;

import com.microservice.loans.dto.LoansDto;

public interface ILoansService {

    /**
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     *
     * @param mobileNumber -Input Mobile Number
     * @return Loan details on given mobileNumber
     */
    LoansDto fetchLoan(String mobileNumber);

    /**
     *
     * @param loansDto - Input existing loan details
     * @return - Update status true or false
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     *
     * @param mobileNumber - mobileNumber of the customer
     * @return- boolean indicating if the delete of loan details is successful or not
     */
    boolean deleteLoan(String mobileNumber);
}
