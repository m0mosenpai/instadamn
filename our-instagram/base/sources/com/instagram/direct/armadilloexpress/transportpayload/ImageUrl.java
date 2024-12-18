package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.K6P;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class ImageUrl extends RYn implements InterfaceC65445TkH {
    public static final ImageUrl DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;
    public int bitField0_;
    public int height_;
    public String url_ = "";
    public int width_;

    static {
        ImageUrl imageUrl = new ImageUrl();
        DEFAULT_INSTANCE = imageUrl;
        RYn.A0B(imageUrl, ImageUrl.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "url_", "width_", "height_"});
            case 3:
                return new ImageUrl();
            case 4:
                return new K6P();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (ImageUrl.class) {
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
