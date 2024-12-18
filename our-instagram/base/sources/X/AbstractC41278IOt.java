package X;

import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.BusinessProfileDictImpl;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;

/* renamed from: X.IOt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41278IOt {
    public static SMBSupportStickerDict parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            BusinessProfileDictImpl businessProfileDictImpl = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Float f = null;
            String str7 = null;
            String str8 = null;
            SMBPartnerType sMBPartnerType = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("business_profile".equals(A0s)) {
                    businessProfileDictImpl = AbstractC39787Hkx.parseFromJson(c16l);
                } else if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("button_text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("cta_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("cta_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("disclaimer".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("end_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(130).equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("partner_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("service_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    sMBPartnerType = AbstractC81793ku.A00(A1P);
                } else if ("start_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("subtitle_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("title_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new SMBSupportStickerDict(businessProfileDictImpl, sMBPartnerType, f, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, SMBSupportStickerDict sMBSupportStickerDict, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        BusinessProfileDict businessProfileDict = sMBSupportStickerDict.A00;
        if (businessProfileDict != null) {
            anonymousClass182.A0r("business_profile");
            BusinessProfileDictImpl ErS = businessProfileDict.ErS();
            anonymousClass182.A0d();
            AbstractC37301Gc2.A1D(anonymousClass182, ErS.A01);
            ImageUrl imageUrl = ErS.A00;
            if (imageUrl != null) {
                anonymousClass182.A0r("profile_pic_url");
                AbstractC222616c.A01(anonymousClass182, imageUrl);
            }
            String str = ErS.A02;
            if (str != null) {
                anonymousClass182.A0S(AbstractC50531MSk.A00(), str);
            }
            anonymousClass182.A0a();
        }
        String str2 = sMBSupportStickerDict.A03;
        if (str2 != null) {
            anonymousClass182.A0S("button_text", str2);
        }
        String str3 = sMBSupportStickerDict.A04;
        if (str3 != null) {
            anonymousClass182.A0S("button_text_color", str3);
        }
        String str4 = sMBSupportStickerDict.A05;
        if (str4 != null) {
            anonymousClass182.A0S("cta_title", str4);
        }
        String str5 = sMBSupportStickerDict.A06;
        if (str5 != null) {
            anonymousClass182.A0S("cta_url", str5);
        }
        String str6 = sMBSupportStickerDict.A07;
        if (str6 != null) {
            anonymousClass182.A0S("disclaimer", str6);
        }
        String str7 = sMBSupportStickerDict.A08;
        if (str7 != null) {
            anonymousClass182.A0S("end_background_color", str7);
        }
        Float f = sMBSupportStickerDict.A02;
        if (f != null) {
            anonymousClass182.A0P(AbstractC111324zv.A00(130), f.floatValue());
        }
        String str8 = sMBSupportStickerDict.A09;
        if (str8 != null) {
            anonymousClass182.A0S("partner_name", str8);
        }
        String str9 = sMBSupportStickerDict.A0A;
        if (str9 != null) {
            anonymousClass182.A0S("pk", str9);
        }
        SMBPartnerType sMBPartnerType = sMBSupportStickerDict.A01;
        if (sMBPartnerType != null) {
            anonymousClass182.A0S("service_type", sMBPartnerType.A00);
        }
        String str10 = sMBSupportStickerDict.A0B;
        if (str10 != null) {
            anonymousClass182.A0S("start_background_color", str10);
        }
        String str11 = sMBSupportStickerDict.A0C;
        if (str11 != null) {
            anonymousClass182.A0S("subtitle_color", str11);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, sMBSupportStickerDict.A0D);
        String str12 = sMBSupportStickerDict.A0E;
        if (str12 != null) {
            anonymousClass182.A0S("title_color", str12);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
