package com.google.repack.protobuf;

import X.AbstractC64535TIr;
import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class BytesValue extends RaB implements InterfaceC65446TkI {
    public static final BytesValue DEFAULT_INSTANCE;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    public AbstractC64535TIr value_ = AbstractC64535TIr.A01;

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        TEY.A03(BytesValue.class, bytesValue);
    }
}
