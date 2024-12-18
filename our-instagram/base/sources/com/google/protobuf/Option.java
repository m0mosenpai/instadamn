package com.google.protobuf;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class Option extends RYn implements InterfaceC65445TkH {
    public static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    public String name_ = "";
    public Any value_;

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        RYn.A0B(option, Option.class);
    }
}
