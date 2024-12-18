package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class CreateWifiDirectNetwork extends RYn implements InterfaceC65445TkH {
    public static final int BAND_FIELD_NUMBER = 1;
    public static final CreateWifiDirectNetwork DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int UUID_FIELD_NUMBER = 2;
    public int band_;
    public AbstractC64538TIu uuid_ = AbstractC64538TIu.A01;

    static {
        CreateWifiDirectNetwork createWifiDirectNetwork = new CreateWifiDirectNetwork();
        DEFAULT_INSTANCE = createWifiDirectNetwork;
        RYn.A0B(createWifiDirectNetwork, CreateWifiDirectNetwork.class);
    }
}
