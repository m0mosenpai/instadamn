package com.google.protobuf;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class Value extends RYn implements InterfaceC65445TkH {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    public static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    public int kindCase_ = 0;
    public Object kind_;

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        RYn.A0B(value, Value.class);
    }
}
