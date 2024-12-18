package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.InterfaceC65692TsE;
import X.RYz;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class EnumValue extends RaB implements InterfaceC65446TkI {
    public static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile InterfaceC65289ThM PARSER;
    public int number_;
    public String name_ = "";
    public InterfaceC65692TsE options_ = RYz.A02;

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        TEY.A03(EnumValue.class, enumValue);
    }
}
