package net.dgg.newdagger.data;

import net.dgg.newdagger.domain.DataRepository;

import javax.inject.Inject;

/**
 * Created by liyi on 2018/4/27.
 */

public class DataRepositoryImpl implements DataRepository {
    public DataRepositoryImpl() {
    }


    @Override
    public String append(String format) {
        return " DataRepositoryImpl - >" + format;
    }
}
