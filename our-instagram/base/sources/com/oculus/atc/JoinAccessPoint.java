package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class JoinAccessPoint extends RYn implements InterfaceC65445TkH {
    public static final int BANDWIDTH_FIELD_NUMBER = 4;
    public static final JoinAccessPoint DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PASSPHRASE_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 3;
    public int bandwidth_;
    public String ssid_ = "";
    public String passphrase_ = "";
    public AbstractC64538TIu uuid_ = AbstractC64538TIu.A01;

    static {
        JoinAccessPoint joinAccessPoint = new JoinAccessPoint();
        DEFAULT_INSTANCE = joinAccessPoint;
        RYn.A0B(joinAccessPoint, JoinAccessPoint.class);
    }
}
