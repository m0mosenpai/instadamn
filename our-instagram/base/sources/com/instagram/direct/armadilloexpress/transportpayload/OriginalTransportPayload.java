package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.AbstractC64538TIu;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K6V;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class OriginalTransportPayload extends RYn implements InterfaceC65445TkH {
    public static final OriginalTransportPayload DEFAULT_INSTANCE;
    public static final int ORIGINAL_TRANSPORT_PAYLOAD_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER;
    public int bitField0_;
    public AbstractC64538TIu originalTransportPayload_ = AbstractC64538TIu.A01;

    static {
        OriginalTransportPayload originalTransportPayload = new OriginalTransportPayload();
        DEFAULT_INSTANCE = originalTransportPayload;
        RYn.A0B(originalTransportPayload, OriginalTransportPayload.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "originalTransportPayload_"});
            case 3:
                return new OriginalTransportPayload();
            case 4:
                return new K6V();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (OriginalTransportPayload.class) {
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
