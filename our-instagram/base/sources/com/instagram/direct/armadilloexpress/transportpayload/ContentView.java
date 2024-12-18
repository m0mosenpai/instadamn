package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K6G;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class ContentView extends RYn implements InterfaceC65445TkH {
    public static final ContentView DEFAULT_INSTANCE;
    public static final int MIMETYPE_FIELD_NUMBER = 4;
    public static final int OBJECT_ID_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int REPLAYED_FIELD_NUMBER = 3;
    public static final int SCREENSHOTTED_FIELD_NUMBER = 2;
    public static final int SEEN_FIELD_NUMBER = 1;
    public int bitField0_;
    public String mimetype_ = "";
    public String objectId_ = "";
    public boolean replayed_;
    public boolean screenshotted_;
    public boolean seen_;

    static {
        ContentView contentView = new ContentView();
        DEFAULT_INSTANCE = contentView;
        RYn.A0B(contentView, ContentView.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "seen_", "screenshotted_", "replayed_", "mimetype_", "objectId_"});
            case 3:
                return new ContentView();
            case 4:
                return new K6G();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (ContentView.class) {
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
