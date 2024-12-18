package com.oculus.applinks;

import X.AbstractC43592JPx;
import X.AbstractC64538TIu;
import X.C45373K6g;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class EnableTrust extends RYn implements InterfaceC65445TkH {
    public static final EnableTrust DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SIGNATURE_FIELD_NUMBER = 2;
    public AbstractC64538TIu identifier_;
    public AbstractC64538TIu signature_;

    static {
        EnableTrust enableTrust = new EnableTrust();
        DEFAULT_INSTANCE = enableTrust;
        RYn.A0B(enableTrust, EnableTrust.class);
    }

    public EnableTrust() {
        AbstractC64538TIu abstractC64538TIu = AbstractC64538TIu.A01;
        this.identifier_ = abstractC64538TIu;
        this.signature_ = abstractC64538TIu;
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"identifier_", "signature_"});
            case 3:
                return new EnableTrust();
            case 4:
                return new C45373K6g();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (EnableTrust.class) {
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
