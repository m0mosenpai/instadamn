package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class JoinWifiDirectGroup extends RYn implements InterfaceC65445TkH {
    public static final int BANDWIDTH_FIELD_NUMBER = 8;
    public static final int CLIENT_ADDRESSES_FIELD_NUMBER = 4;
    public static final JoinWifiDirectGroup DEFAULT_INSTANCE;
    public static final int FREQUENCY_FIELD_NUMBER = 7;
    public static final int OWNER_ADDRESS_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PASSPHRASE_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public static final int TIMEOUT_FIELD_NUMBER = 3;
    public static final int UUID_FIELD_NUMBER = 6;
    public int bandwidth_;
    public int frequency_;
    public NetworkAddress ownerAddress_;
    public int timeout_;
    public String ssid_ = "";
    public String passphrase_ = "";
    public InterfaceC65691TsD clientAddresses_ = RWF.A02;
    public AbstractC64538TIu uuid_ = AbstractC64538TIu.A01;

    static {
        JoinWifiDirectGroup joinWifiDirectGroup = new JoinWifiDirectGroup();
        DEFAULT_INSTANCE = joinWifiDirectGroup;
        RYn.A0B(joinWifiDirectGroup, JoinWifiDirectGroup.class);
    }
}
