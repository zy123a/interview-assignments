/**
 * @(#)UrlDao.java, 12月 26, 2021.
 * <p>
 * Copyright 2021 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo.application;


public interface UrlDao {

    void save(String key, String longUrl);

    String queryLongUrl(String key);
}