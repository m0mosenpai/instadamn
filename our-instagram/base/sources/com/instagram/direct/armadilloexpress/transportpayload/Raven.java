package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C48225LWa;
import X.C63271SgV;
import X.EnumC46313Kej;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K6Z;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class Raven extends RYn implements InterfaceC65445TkH {
    public static final int CONTENT_FIELD_NUMBER = 2;
    public static final Raven DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int VIEW_MODE_FIELD_NUMBER = 1;
    public int bitField0_;
    public RavenContent content_;
    public int viewMode_;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.direct.armadilloexpress.transportpayload.Raven, X.RYn] */
    static {
        ?? rYn = new RYn();
        DEFAULT_INSTANCE = rYn;
        RYn.A0B(rYn, Raven.class);
    }

    public final EnumC46313Kej A0L() {
        int i = this.viewMode_;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return EnumC46313Kej.RAVEN_VIEW_MODEL_PERMANENT;
                    }
                } else {
                    return EnumC46313Kej.RAVEN_VIEW_MODEL_REPLAYABLE;
                }
            } else {
                return EnumC46313Kej.RAVEN_VIEW_MODEL_ONCE;
            }
        }
        return EnumC46313Kej.RAVEN_VIEW_MODEL_UNSPECIFIED;
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "viewMode_", C48225LWa.A00, "content_"});
            case 3:
                return new RYn();
            case 4:
                return new K6Z();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (Raven.class) {
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
