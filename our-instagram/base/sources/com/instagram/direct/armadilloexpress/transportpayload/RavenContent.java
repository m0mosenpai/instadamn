package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C45379K6m;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class RavenContent extends RYn implements InterfaceC65445TkH {
    public static final RavenContent DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int STATIC_PHOTO_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 2;
    public int bitField0_;
    public int ravenContentCase_ = 0;
    public Object ravenContent_;

    static {
        RavenContent ravenContent = new RavenContent();
        DEFAULT_INSTANCE = ravenContent;
        RYn.A0B(ravenContent, RavenContent.class);
    }

    public final StaticPhoto A0L() {
        if (this.ravenContentCase_ == 1) {
            return (StaticPhoto) this.ravenContent_;
        }
        return StaticPhoto.DEFAULT_INSTANCE;
    }

    public final Video A0M() {
        if (this.ravenContentCase_ == 2) {
            return (Video) this.ravenContent_;
        }
        return Video.DEFAULT_INSTANCE;
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"ravenContent_", "ravenContentCase_", "bitField0_", StaticPhoto.class, Video.class});
            case 3:
                return new RavenContent();
            case 4:
                return new C45379K6m();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (RavenContent.class) {
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
