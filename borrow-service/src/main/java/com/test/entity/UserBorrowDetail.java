package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.List;

/**
 * @author John117
 * @date 2022/07/13  12:42
 * @description
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}

