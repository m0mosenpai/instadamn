package com.google.repack.protobuf;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class StringValue extends RaB implements InterfaceC65446TkI {
    public static final StringValue DEFAULT_INSTANCE;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    public String value_ = "";

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        TEY.A03(StringValue.class, stringValue);
    }
}
