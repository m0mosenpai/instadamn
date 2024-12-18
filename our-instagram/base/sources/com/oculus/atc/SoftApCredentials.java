package com.oculus.atc;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class SoftApCredentials extends RYn implements InterfaceC65445TkH {
    public static final SoftApCredentials DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public String ssid_ = "";
    public String password_ = "";

    static {
        SoftApCredentials softApCredentials = new SoftApCredentials();
        DEFAULT_INSTANCE = softApCredentials;
        RYn.A0B(softApCredentials, SoftApCredentials.class);
    }
}
