package com.fd.fakerdata.rereg.model;

import com.fd.fakerdata.rereg.exception.RegexpIllegalException;
import com.fd.fakerdata.rereg.exception.TypeNotMatchException;
import com.fd.fakerdata.rereg.exception.UninitializedException;

public interface Node {

    String getExpression();

    String random() throws UninitializedException, RegexpIllegalException;

    boolean test();

    void init() throws RegexpIllegalException, TypeNotMatchException;

    boolean isInitialized();
}
