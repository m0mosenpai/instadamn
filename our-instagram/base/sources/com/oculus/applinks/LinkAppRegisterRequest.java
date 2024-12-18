package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkAppRegisterRequest extends RYn implements InterfaceC65445TkH {
    public static final int APPPUBLICKEY_FIELD_NUMBER = 2;
    public static final LinkAppRegisterRequest DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER;
    public AbstractC64538TIu appPublicKey_ = AbstractC64538TIu.A01;
    public int nonce_;

    static {
        LinkAppRegisterRequest linkAppRegisterRequest = new LinkAppRegisterRequest();
        DEFAULT_INSTANCE = linkAppRegisterRequest;
        RYn.A0B(linkAppRegisterRequest, LinkAppRegisterRequest.class);
    }
}
