package com.oculus.atc;

import X.AbstractC43592JPx;
import X.AbstractC64538TIu;
import X.C45375K6i;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class LinkHealthUpdate extends RYn implements InterfaceC65445TkH {
    public static final LinkHealthUpdate DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 3;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int RSSI_FIELD_NUMBER = 2;
    public static final int UUID_FIELD_NUMBER = 1;
    public int event_;
    public int rssi_;
    public AbstractC64538TIu uuid_ = AbstractC64538TIu.A01;

    static {
        LinkHealthUpdate linkHealthUpdate = new LinkHealthUpdate();
        DEFAULT_INSTANCE = linkHealthUpdate;
        RYn.A0B(linkHealthUpdate, LinkHealthUpdate.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\f", new Object[]{"uuid_", "rssi_", "event_"});
            case 3:
                return new LinkHealthUpdate();
            case 4:
                return new C45375K6i();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (LinkHealthUpdate.class) {
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
