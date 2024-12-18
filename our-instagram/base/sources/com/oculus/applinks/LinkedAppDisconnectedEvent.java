package com.oculus.applinks;

import X.AbstractC64538TIu;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;

/* loaded from: classes10.dex */
public final class LinkedAppDisconnectedEvent extends RYn implements InterfaceC65445TkH {
    public static final LinkedAppDisconnectedEvent DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SERVICEUUID_FIELD_NUMBER = 1;
    public AbstractC64538TIu serviceUUID_ = AbstractC64538TIu.A01;

    static {
        LinkedAppDisconnectedEvent linkedAppDisconnectedEvent = new LinkedAppDisconnectedEvent();
        DEFAULT_INSTANCE = linkedAppDisconnectedEvent;
        RYn.A0B(linkedAppDisconnectedEvent, LinkedAppDisconnectedEvent.class);
    }
}
