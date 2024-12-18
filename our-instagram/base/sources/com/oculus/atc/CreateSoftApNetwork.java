package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class CreateSoftApNetwork extends RYn implements InterfaceC65445TkH {
    public static final int BANDWIDTH_FIELD_NUMBER = 9;
    public static final int BAND_FIELD_NUMBER = 3;
    public static final int CHANNEL_FIELD_NUMBER = 4;
    public static final int COUNTRYCODE_FIELD_NUMBER = 6;
    public static final int CREDENTIALS_FIELD_NUMBER = 8;
    public static final CreateSoftApNetwork DEFAULT_INSTANCE;
    public static final int HIDDEN_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int UUID_FIELD_NUMBER = 7;
    public int band_;
    public int bandwidth_;
    public int channel_;
    public SoftApCredentials credentials_;
    public boolean hidden_;
    public String countryCode_ = "";
    public AbstractC64538TIu uuid_ = AbstractC64538TIu.A01;

    static {
        CreateSoftApNetwork createSoftApNetwork = new CreateSoftApNetwork();
        DEFAULT_INSTANCE = createSoftApNetwork;
        RYn.A0B(createSoftApNetwork, CreateSoftApNetwork.class);
    }
}
