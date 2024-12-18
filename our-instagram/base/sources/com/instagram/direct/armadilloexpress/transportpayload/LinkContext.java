package com.instagram.direct.armadilloexpress.transportpayload;

import X.AbstractC43592JPx;
import X.C63271SgV;
import X.InterfaceC50386MMo;
import X.InterfaceC65445TkH;
import X.InterfaceC65691TsD;
import X.K6S;
import X.RWF;
import X.RYn;
import X.TES;

/* loaded from: classes8.dex */
public final class LinkContext extends RYn implements InterfaceC65445TkH {
    public static final LinkContext DEFAULT_INSTANCE;
    public static final int LINK_IMAGE_URL_FIELD_NUMBER = 1;
    public static final int LINK_MUSIC_PREVIEW_COUNTRIES_ALLOWED_FIELD_NUMBER = 6;
    public static final int LINK_MUSIC_PREVIEW_URL_FIELD_NUMBER = 5;
    public static final int LINK_PREVIEW_BODY_FIELD_NUMBER = 8;
    public static final int LINK_PREVIEW_THUMBNAIL_FIELD_NUMBER = 7;
    public static final int LINK_PREVIEW_TITLE_FIELD_NUMBER = 2;
    public static final int LINK_SUMMARY_FIELD_NUMBER = 4;
    public static final int LINK_URL_FIELD_NUMBER = 3;
    public static volatile InterfaceC50386MMo PARSER;
    public int bitField0_;
    public ImageUrl linkImageUrl_;
    public Thumbnail linkPreviewThumbnail_;
    public String linkPreviewTitle_ = "";
    public String linkUrl_ = "";
    public String linkSummary_ = "";
    public String linkMusicPreviewUrl_ = "";
    public InterfaceC65691TsD linkMusicPreviewCountriesAllowed_ = RWF.A02;
    public String linkPreviewBody_ = "";

    static {
        LinkContext linkContext = new LinkContext();
        DEFAULT_INSTANCE = linkContext;
        RYn.A0B(linkContext, LinkContext.class);
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
                return RYn.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001a\u0007ဉ\u0005\bဈ\u0006", new Object[]{"bitField0_", "linkImageUrl_", "linkPreviewTitle_", "linkUrl_", "linkSummary_", "linkMusicPreviewUrl_", "linkMusicPreviewCountriesAllowed_", "linkPreviewThumbnail_", "linkPreviewBody_"});
            case 3:
                return new LinkContext();
            case 4:
                return new K6S();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC50386MMo interfaceC50386MMo2 = PARSER;
                if (interfaceC50386MMo2 == null) {
                    synchronized (LinkContext.class) {
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
