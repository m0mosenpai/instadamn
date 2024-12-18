package com.facebook.graphservice.interfaces;

/* loaded from: classes3.dex */
public interface Tree {

    /* loaded from: classes10.dex */
    public enum DeepEqualGuess {
        TRUE,
        FALSE,
        UNKNOWN
    }

    /* loaded from: classes10.dex */
    public enum FieldType {
        NONE,
        BOOL,
        DOUBLE,
        INT,
        TIME,
        STRING,
        DYNAMIC,
        BOOL_LIST,
        DOUBLE_LIST,
        INT_LIST,
        TIME_LIST,
        STRING_LIST,
        TREE,
        TREE_LIST
    }

    int getTypeTag();

    boolean isValidGraphServicesJNIModel();

    boolean isValidGraphServicesJNIModelWithLogging();
}
