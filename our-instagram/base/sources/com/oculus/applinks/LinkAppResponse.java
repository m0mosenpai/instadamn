package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkAppResponse extends RYn implements InterfaceC65445TkH {
    public static final LinkAppResponse DEFAULT_INSTANCE;
    public static final int DEVICEPUBLICKEY_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER;
    public AbstractC64538TIu devicePublicKey_ = AbstractC64538TIu.A01;
    public int error_;
    public int nonce_;

    static {
        LinkAppResponse linkAppResponse = new LinkAppResponse();
        DEFAULT_INSTANCE = linkAppResponse;
        RYn.A0B(linkAppResponse, LinkAppResponse.class);
    }
}
