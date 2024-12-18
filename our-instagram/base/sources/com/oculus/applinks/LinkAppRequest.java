package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkAppRequest extends RYn implements InterfaceC65445TkH {
    public static final int APPPUBLICKEY_FIELD_NUMBER = 3;
    public static final int BUNDLEIDENTIFIER_FIELD_NUMBER = 4;
    public static final LinkAppRequest DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 2;
    public AbstractC64538TIu appPublicKey_;
    public String bundleIdentifier_;
    public int nonce_;
    public AbstractC64538TIu serviceUUID_;

    static {
        LinkAppRequest linkAppRequest = new LinkAppRequest();
        DEFAULT_INSTANCE = linkAppRequest;
        RYn.A0B(linkAppRequest, LinkAppRequest.class);
    }

    public LinkAppRequest() {
        AbstractC64538TIu abstractC64538TIu = AbstractC64538TIu.A01;
        this.serviceUUID_ = abstractC64538TIu;
        this.appPublicKey_ = abstractC64538TIu;
        this.bundleIdentifier_ = "";
    }
}
