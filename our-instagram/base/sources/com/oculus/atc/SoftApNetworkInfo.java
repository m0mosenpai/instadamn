package com.oculus.atc;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class SoftApNetworkInfo extends RYn implements InterfaceC65445TkH {
    public static final int ADDRESSES_FIELD_NUMBER = 2;
    public static final int CHANNEL_FIELD_NUMBER = 5;
    public static final int CREDENTIALS_FIELD_NUMBER = 3;
    public static final SoftApNetworkInfo DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PORT_NUMBER_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 1;
    public InterfaceC65691TsD addresses_ = RWF.A02;
    public int channel_;
    public SoftApCredentials credentials_;
    public int portNumber_;
    public int status_;

    static {
        SoftApNetworkInfo softApNetworkInfo = new SoftApNetworkInfo();
        DEFAULT_INSTANCE = softApNetworkInfo;
        RYn.A0B(softApNetworkInfo, SoftApNetworkInfo.class);
    }
}
