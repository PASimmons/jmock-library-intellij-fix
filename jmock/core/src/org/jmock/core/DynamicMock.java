/*  Copyright (c) 2000-2004 jMock.org
 */
package org.jmock.core;


public interface DynamicMock
    extends Verifiable
{
    Class getMockedType();

    Object proxy();

    void addInvokable( Invokable invokable );

    void reset();
}

