package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C05F;
import X.C45380K6n;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class Media extends RYn implements InterfaceC65445TkH {
    public static final int AVATAR_STICKER_FIELD_NUMBER = 6;
    public static final Media DEFAULT_INSTANCE;
    public static final int GIF_FIELD_NUMBER = 5;
    public static volatile InterfaceC50386MMo PARSER = null;
    public static final int RAVEN_FIELD_NUMBER = 4;
    public static final int STATIC_PHOTO_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 3;
    public static final int VOICE_FIELD_NUMBER = 2;
    public int bitField0_;
    public int mediaCase_ = 0;
    public Object media_;

    static {
        Media media = new Media();
        DEFAULT_INSTANCE = media;
        RYn.A0B(media, Media.class);
    }

    public final AvatarSticker A0L() {
        if (this.mediaCase_ == 6) {
            return (AvatarSticker) this.media_;
        }
        return AvatarSticker.DEFAULT_INSTANCE;
    }

    public final Raven A0M() {
        if (this.mediaCase_ == 4) {
            return (Raven) this.media_;
        }
        return Raven.DEFAULT_INSTANCE;
    }

    public final StaticPhoto A0N() {
        if (this.mediaCase_ == 1) {
            return (StaticPhoto) this.media_;
        }
        return StaticPhoto.DEFAULT_INSTANCE;
    }

    public final Video A0O() {
        if (this.mediaCase_ == 3) {
            return (Video) this.media_;
        }
        return Video.DEFAULT_INSTANCE;
    }

    public final Integer A0P() {
        switch (this.mediaCase_) {
            case 0:
                return C05F.A0u;
            case 1:
                return C05F.A00;
            case 2:
                return C05F.A01;
            case 3:
                return C05F.A0C;
            case 4:
                return C05F.A0N;
            case 5:
                return C05F.A0Y;
            case 6:
                return C05F.A0j;
            default:
                return null;
        }
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"media_", "mediaCase_", "bitField0_", StaticPhoto.class, Voice.class, Video.class, Raven.class, Gif.class, AvatarSticker.class});
            case 3:
                return new Media();
            case 4:
                return new C45380K6n();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (Media.class) {
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
