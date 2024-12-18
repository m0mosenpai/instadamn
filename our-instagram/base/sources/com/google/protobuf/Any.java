package com.google.protobuf;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class Any extends RYn implements InterfaceC65445TkH {
    public static final Any DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public String typeUrl_ = "";
    public AbstractC64538TIu value_ = AbstractC64538TIu.A01;

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        RYn.A0B(any, Any.class);
    }
}
