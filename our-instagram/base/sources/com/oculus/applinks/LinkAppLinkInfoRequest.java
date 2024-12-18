package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkAppLinkInfoRequest extends RYn implements InterfaceC65445TkH {
    public static final LinkAppLinkInfoRequest DEFAULT_INSTANCE;
    public static final int LINKTYPE_FIELD_NUMBER = 3;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int REQUESTTYPE_FIELD_NUMBER = 4;
    public static final int SERVICEUUID_FIELD_NUMBER = 2;
    public int linkType_;
    public int nonce_;
    public int requestType_;
    public AbstractC64538TIu serviceUUID_ = AbstractC64538TIu.A01;

    static {
        LinkAppLinkInfoRequest linkAppLinkInfoRequest = new LinkAppLinkInfoRequest();
        DEFAULT_INSTANCE = linkAppLinkInfoRequest;
        RYn.A0B(linkAppLinkInfoRequest, LinkAppLinkInfoRequest.class);
    }
}
