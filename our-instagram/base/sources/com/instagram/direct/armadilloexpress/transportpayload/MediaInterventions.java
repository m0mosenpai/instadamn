package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K6T;
import X.LWY;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class MediaInterventions extends RYn implements InterfaceC65445TkH {
    public static final MediaInterventions DEFAULT_INSTANCE;
    public static final int INTERVENTION_TYPE_FIELD_NUMBER = 2;
    public static final int MEDIA_ID_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER;
    public int bitField0_;
    public int interventionType_;
    public String mediaId_ = "";

    static {
        MediaInterventions mediaInterventions = new MediaInterventions();
        DEFAULT_INSTANCE = mediaInterventions;
        RYn.A0B(mediaInterventions, MediaInterventions.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "mediaId_", "interventionType_", LWY.A00});
            case 3:
                return new MediaInterventions();
            case 4:
                return new K6T();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (MediaInterventions.class) {
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
