package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K6C;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class AdminMessage extends RYn implements InterfaceC65445TkH {
    public static final AdminMessage DEFAULT_INSTANCE;
    public static final int DEVICE_ADMIN_MESSAGE_FIELD_NUMBER = 1;
    public static volatile InterfaceC50386MMo PARSER;
    public int adminMessageSubtypeCase_ = 0;
    public Object adminMessageSubtype_;
    public int bitField0_;

    static {
        AdminMessage adminMessage = new AdminMessage();
        DEFAULT_INSTANCE = adminMessage;
        RYn.A0B(adminMessage, AdminMessage.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"adminMessageSubtype_", "adminMessageSubtypeCase_", "bitField0_", DeviceAdminMessage.class});
            case 3:
                return new AdminMessage();
            case 4:
                return new K6C();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (AdminMessage.class) {
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
