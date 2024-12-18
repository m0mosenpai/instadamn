package com.oculus.atc;

import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.RWF;
import X.RYn;

/* loaded from: classes10.dex */
public final class SoftApClientAddressUpdatedEvent extends RYn implements InterfaceC65445TkH {
    public static final int ADDRESSES_FIELD_NUMBER = 1;
    public static final SoftApClientAddressUpdatedEvent DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER;
    public InterfaceC65691TsD addresses_ = RWF.A02;

    static {
        SoftApClientAddressUpdatedEvent softApClientAddressUpdatedEvent = new SoftApClientAddressUpdatedEvent();
        DEFAULT_INSTANCE = softApClientAddressUpdatedEvent;
        RYn.A0B(softApClientAddressUpdatedEvent, SoftApClientAddressUpdatedEvent.class);
    }
}
