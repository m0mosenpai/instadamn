package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K6W;
import X.LWZ;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class Placeholder extends RYn implements InterfaceC65445TkH {
    public static final Placeholder DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int PLACEHOLDER_TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public int placeholderType_;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.direct.armadilloexpress.transportpayload.Placeholder, X.RYn] */
    static {
        ?? rYn = new RYn();
        DEFAULT_INSTANCE = rYn;
        RYn.A0B(rYn, Placeholder.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "placeholderType_", LWZ.A00});
            case 3:
                return new RYn();
            case 4:
                return new K6W();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (Placeholder.class) {
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
