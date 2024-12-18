package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.InterfaceC65692TsE;
import X.RYz;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Field extends RaB implements InterfaceC65446TkI {
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
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    public int cardinality_;
    public int kind_;
    public int number_;
    public int oneofIndex_;
    public boolean packed_;
    public String name_ = "";
    public String typeUrl_ = "";
    public InterfaceC65692TsE options_ = RYz.A02;
    public String jsonName_ = "";
    public String defaultValue_ = "";

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        TEY.A03(Field.class, field);
    }
}
