package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkAppRegisterResponse extends RYn implements InterfaceC65445TkH {
    public static final LinkAppRegisterResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 3;
    public int error_;
    public int nonce_;
    public AbstractC64538TIu serviceUUID_ = AbstractC64538TIu.A01;

    static {
        LinkAppRegisterResponse linkAppRegisterResponse = new LinkAppRegisterResponse();
        DEFAULT_INSTANCE = linkAppRegisterResponse;
        RYn.A0B(linkAppRegisterResponse, LinkAppRegisterResponse.class);
    }
}
