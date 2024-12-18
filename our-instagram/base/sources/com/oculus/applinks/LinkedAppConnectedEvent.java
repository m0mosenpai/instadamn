package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkedAppConnectedEvent extends RYn implements InterfaceC65445TkH {
    public static final LinkedAppConnectedEvent DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 1;
    public AbstractC64538TIu serviceUUID_ = AbstractC64538TIu.A01;

    static {
        LinkedAppConnectedEvent linkedAppConnectedEvent = new LinkedAppConnectedEvent();
        DEFAULT_INSTANCE = linkedAppConnectedEvent;
        RYn.A0B(linkedAppConnectedEvent, LinkedAppConnectedEvent.class);
    }
}
