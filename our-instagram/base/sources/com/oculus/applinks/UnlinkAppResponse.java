package com.oculus.applinks;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class UnlinkAppResponse extends RYn implements InterfaceC65445TkH {
    public static final UnlinkAppResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER;
    public int error_;
    public int nonce_;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.oculus.applinks.UnlinkAppResponse, X.RYn] */
    static {
        ?? rYn = new RYn();
        DEFAULT_INSTANCE = rYn;
        RYn.A0B(rYn, UnlinkAppResponse.class);
    }
}
