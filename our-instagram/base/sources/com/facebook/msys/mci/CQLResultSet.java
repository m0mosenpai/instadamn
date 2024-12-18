package com.facebook.msys.mci;

/* loaded from: classes3.dex */
public interface CQLResultSet {
    byte[] getBlob(int i, int i2);

    boolean getBoolean(int i, int i2);

    CQLResultSet getChildResultSet(int i, int i2);

    int getCount();

    int getInteger(int i, int i2);

    long getLong(int i, int i2);

    Boolean getNullableBoolean(int i, int i2);

    Double getNullableDouble(int i, int i2);

    Integer getNullableInteger(int i, int i2);

    Long getNullableLong(int i, int i2);

    String getString(int i, int i2);
}
