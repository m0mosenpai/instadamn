package com.google.protobuf;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class Field extends RYn implements InterfaceC65445TkH {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    public static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    public int cardinality_;
    public int kind_;
    public int number_;
    public int oneofIndex_;
    public boolean packed_;
    public String name_ = "";
    public String typeUrl_ = "";
    public InterfaceC65691TsD options_ = RWF.A02;
    public String jsonName_ = "";
    public String defaultValue_ = "";

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        RYn.A0B(field, Field.class);
    }
}
