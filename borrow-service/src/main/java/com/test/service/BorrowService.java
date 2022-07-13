package com.test.service;

import com.test.entity.UserBorrowDetail;

/**
 * @author John117
 * @date 2022/07/13  12:50
 * @description
 */
public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}

