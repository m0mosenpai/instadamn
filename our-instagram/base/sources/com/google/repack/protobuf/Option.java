package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Option extends RaB implements InterfaceC65446TkI {
    public static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    public String name_ = "";
    public Any value_;

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        TEY.A03(Option.class, option);
    }
}
