package com.google.protobuf;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class EnumValue extends RYn implements InterfaceC65445TkH {
    public static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile InterfaceC50386MMo PARSER;
    public int number_;
    public String name_ = "";
    public InterfaceC65691TsD options_ = RWF.A02;

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        RYn.A0B(enumValue, EnumValue.class);
    }
}
