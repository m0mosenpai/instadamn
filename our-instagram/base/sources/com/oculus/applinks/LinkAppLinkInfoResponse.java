package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkAppLinkInfoResponse extends RYn implements InterfaceC65445TkH {
    public static final int ADDRESSES_FIELD_NUMBER = 3;
    public static final int BUILDFLAVOR_FIELD_NUMBER = 8;
    public static final LinkAppLinkInfoResponse DEFAULT_INSTANCE;
    public static final int DEVICEIMAGEASSETURI_FIELD_NUMBER = 6;
    public static final int DEVICEMODELNAME_FIELD_NUMBER = 7;
    public static final int DEVICENAME_FIELD_NUMBER = 9;
    public static final int DEVICESERIAL_FIELD_NUMBER = 5;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int FIRMWAREVERSION_FIELD_NUMBER = 4;
    public static final int HARDWARETYPE_FIELD_NUMBER = 10;
    public static final int MACADDRESS_FIELD_NUMBER = 11;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER;
    public InterfaceC65691TsD addresses_ = RWF.A02;
    public AbstractC64538TIu buildFlavor_;
    public AbstractC64538TIu deviceImageAssetURI_;
    public AbstractC64538TIu deviceModelName_;
    public AbstractC64538TIu deviceName_;
    public AbstractC64538TIu deviceSerial_;
    public int error_;
    public AbstractC64538TIu firmwareVersion_;
    public AbstractC64538TIu hardwareType_;
    public AbstractC64538TIu macAddress_;
    public int nonce_;

    static {
        LinkAppLinkInfoResponse linkAppLinkInfoResponse = new LinkAppLinkInfoResponse();
        DEFAULT_INSTANCE = linkAppLinkInfoResponse;
        RYn.A0B(linkAppLinkInfoResponse, LinkAppLinkInfoResponse.class);
    }

    public LinkAppLinkInfoResponse() {
        AbstractC64538TIu abstractC64538TIu = AbstractC64538TIu.A01;
        this.firmwareVersion_ = abstractC64538TIu;
        this.deviceSerial_ = abstractC64538TIu;
        this.deviceImageAssetURI_ = abstractC64538TIu;
        this.deviceModelName_ = abstractC64538TIu;
        this.buildFlavor_ = abstractC64538TIu;
        this.deviceName_ = abstractC64538TIu;
        this.hardwareType_ = abstractC64538TIu;
        this.macAddress_ = abstractC64538TIu;
    }
}
