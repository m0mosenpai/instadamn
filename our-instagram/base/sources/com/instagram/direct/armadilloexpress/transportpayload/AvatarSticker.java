package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C45384K6r;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class AvatarSticker extends RYn implements InterfaceC65445TkH {
    public static final AvatarSticker DEFAULT_INSTANCE;
    public static final int IS_ANIMATED_FIELD_NUMBER = 2;
    public static final int MEDIA_TRANSPORT_FIELD_NUMBER = 1;
    public static final int NUX_TYPE_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int STICKER_ID_FIELD_NUMBER = 3;
    public static final int STICKER_TEMPLATE_FIELD_NUMBER = 4;
    public int bitField0_;
    public boolean isAnimated_;
    public CommonMediaTransport mediaTransport_;
    public int nuxType_;
    public String stickerId_ = "";
    public String stickerTemplate_ = "";

    static {
        AvatarSticker avatarSticker = new AvatarSticker();
        DEFAULT_INSTANCE = avatarSticker;
        RYn.A0B(avatarSticker, AvatarSticker.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"bitField0_", "mediaTransport_", "isAnimated_", "stickerId_", "stickerTemplate_", "nuxType_"});
            case 3:
                return new AvatarSticker();
            case 4:
                return new C45384K6r();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (AvatarSticker.class) {
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
