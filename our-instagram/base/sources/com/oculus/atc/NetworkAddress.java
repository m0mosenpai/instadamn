package com.oculus.atc;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class NetworkAddress extends RYn implements InterfaceC65445TkH {
    public static final int ADDRESS_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    public static final NetworkAddress DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PREFIX_LENGTH_FIELD_NUMBER = 2;
    public int addressType_;
    public AbstractC64538TIu data_ = AbstractC64538TIu.A01;
    public int prefixLength_;

    static {
        NetworkAddress networkAddress = new NetworkAddress();
        DEFAULT_INSTANCE = networkAddress;
        RYn.A0B(networkAddress, NetworkAddress.class);
    }
}
