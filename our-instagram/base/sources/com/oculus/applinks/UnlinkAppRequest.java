package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class UnlinkAppRequest extends RYn implements InterfaceC65445TkH {
    public static final UnlinkAppRequest DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 2;
    public int nonce_;
    public AbstractC64538TIu serviceUUID_ = AbstractC64538TIu.A01;

    static {
        UnlinkAppRequest unlinkAppRequest = new UnlinkAppRequest();
        DEFAULT_INSTANCE = unlinkAppRequest;
        RYn.A0B(unlinkAppRequest, UnlinkAppRequest.class);
    }
}
