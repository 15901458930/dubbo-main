package com.dubbo.demo.hbase;

import java.io.Serializable;

public interface  SolrOperationService<T> {

    void save(T t);

    void delete(Serializable id);


}
