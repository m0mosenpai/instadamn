package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkAppDeviceIdentityResponse extends RYn implements InterfaceC65445TkH {
    public static final LinkAppDeviceIdentityResponse DEFAULT_INSTANCE;
    public static final int DEVICEPUBLICKEY_FIELD_NUMBER = 4;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 3;
    public AbstractC64538TIu devicePublicKey_;
    public int error_;
    public int nonce_;
    public AbstractC64538TIu serviceUUID_;

    static {
        LinkAppDeviceIdentityResponse linkAppDeviceIdentityResponse = new LinkAppDeviceIdentityResponse();
        DEFAULT_INSTANCE = linkAppDeviceIdentityResponse;
        RYn.A0B(linkAppDeviceIdentityResponse, LinkAppDeviceIdentityResponse.class);
    }

    public LinkAppDeviceIdentityResponse() {
        AbstractC64538TIu abstractC64538TIu = AbstractC64538TIu.A01;
        this.serviceUUID_ = abstractC64538TIu;
        this.devicePublicKey_ = abstractC64538TIu;
    }
}
