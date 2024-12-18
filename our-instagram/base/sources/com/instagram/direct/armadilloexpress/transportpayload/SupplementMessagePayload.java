package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C45385K6s;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class SupplementMessagePayload extends RYn implements InterfaceC65445TkH {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final SupplementMessagePayload DEFAULT_INSTANCE;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int TARGET_MESSAGE_OTID_FIELD_NUMBER = 1;
    public static final int TARGET_MESSAGE_WA_SERVER_TIME_SEC_FIELD_NUMBER = 4;
    public static final int TARGET_WA_THREAD_ID_FIELD_NUMBER = 5;
    public static final int UNIQUING_KEY_FOR_SUPPLEMENTAL_DATA_FIELD_NUMBER = 2;
    public int bitField0_;
    public SupplementMessageContent content_;
    public String targetMessageOtid_ = "";
    public String uniquingKeyForSupplementalData_ = "";
    public String targetMessageWaServerTimeSec_ = "";
    public String targetWaThreadId_ = "";

    static {
        SupplementMessagePayload supplementMessagePayload = new SupplementMessagePayload();
        DEFAULT_INSTANCE = supplementMessagePayload;
        RYn.A0B(supplementMessagePayload, SupplementMessagePayload.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "targetMessageOtid_", "uniquingKeyForSupplementalData_", "content_", "targetMessageWaServerTimeSec_", "targetWaThreadId_"});
            case 3:
                return new SupplementMessagePayload();
            case 4:
                return new C45385K6s();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (SupplementMessagePayload.class) {
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
