package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C45383K6q;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class TransportPayload extends RYn implements InterfaceC65445TkH {
    public static final int ADD_FIELD_NUMBER = 1;
    public static final TransportPayload DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    public static final int FRANKING_FIELD_NUMBER = 4;
    public static final int IS_E2EE_ATTRIBUTED_FIELD_NUMBER = 6;
    public static final int OPEN_EB_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int SUPPLEMENT_FIELD_NUMBER = 3;
    public int bitField0_;
    public Franking franking_;
    public boolean isE2EeAttributed_;
    public boolean openEb_;
    public int transportPayloadCase_ = 0;
    public Object transportPayload_;

    static {
        TransportPayload transportPayload = new TransportPayload();
        DEFAULT_INSTANCE = transportPayload;
        RYn.A0B(transportPayload, TransportPayload.class);
    }

    public final AddMessagePayload A0L() {
        if (this.transportPayloadCase_ == 1) {
            return (AddMessagePayload) this.transportPayload_;
        }
        return AddMessagePayload.DEFAULT_INSTANCE;
    }

    public final SupplementMessagePayload A0M() {
        if (this.transportPayloadCase_ == 3) {
            return (SupplementMessagePayload) this.transportPayload_;
        }
        return SupplementMessagePayload.DEFAULT_INSTANCE;
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"transportPayload_", "transportPayloadCase_", "bitField0_", AddMessagePayload.class, DeleteMessagePayload.class, SupplementMessagePayload.class, "franking_", "openEb_", "isE2EeAttributed_"});
            case 3:
                return new TransportPayload();
            case 4:
                return new C45383K6q();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (TransportPayload.class) {
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
