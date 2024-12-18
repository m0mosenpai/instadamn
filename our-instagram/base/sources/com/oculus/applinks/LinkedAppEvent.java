package com.oculus.applinks;

import X.AbstractC43592JPx;
import X.C45374K6h;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class LinkedAppEvent extends RYn implements InterfaceC65445TkH {
    public static final int CONNECTED_FIELD_NUMBER = 10;
    public static final LinkedAppEvent DEFAULT_INSTANCE;
    public static final int DISCONNECTED_FIELD_NUMBER = 11;
    public static volatile InterfaceC50386MMo PARSER;
    public int eventCase_ = 0;
    public Object event_;

    static {
        LinkedAppEvent linkedAppEvent = new LinkedAppEvent();
        DEFAULT_INSTANCE = linkedAppEvent;
        RYn.A0B(linkedAppEvent, LinkedAppEvent.class);
    }

    @Override // X.RYn
    public final Object A0K(Integer num, Object obj, Object obj2) {
        InterfaceC50386MMo interfaceC50386MMo;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return RYn.A08(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\n\u000b\u0002\u0000\u0000\u0000\n<\u0000\u000b<\u0000", new Object[]{"event_", "eventCase_", LinkedAppConnectedEvent.class, LinkedAppDisconnectedEvent.class});
            case 3:
                return new LinkedAppEvent();
            case 4:
                return new C45374K6h();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (LinkedAppEvent.class) {
                        interfaceC50386MMo = PARSER;
                        if (interfaceC50386MMo == null) {
                            C63271SgV c63271SgV = TES.A01;
                            interfaceC50386MMo = AbstractC43592JPx.A0J(DEFAULT_INSTANCE);
                            PARSER = interfaceC50386MMo;
                        }
                    }
                    return interfaceC50386MMo;
                }
                return interfaceC50386MMo2;
            default:
                throw AbstractC43592JPx.A11();
        }
    }
}
