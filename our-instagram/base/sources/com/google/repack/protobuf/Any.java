package com.google.repack.protobuf;

import X.AbstractC64535TIr;
import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Any extends RaB implements InterfaceC65446TkI {
    public static final Any DEFAULT_INSTANCE;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public String typeUrl_ = "";
    public AbstractC64535TIr value_ = AbstractC64535TIr.A01;

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        TEY.A03(Any.class, any);
    }
}
