package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87783vm {
    public static C107104sG parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AdsRatingInfo adsRatingInfo = null;
            MoreInfoStickerCTAType moreInfoStickerCTAType = null;
            String str = null;
            C107084sB c107084sB = null;
            Boolean bool = null;
            Boolean bool2 = null;
            MoreInfoType moreInfoType = null;
            MoreInfoProductTagType moreInfoProductTagType = null;
            ArrayList arrayList = null;
            MoreInfoSUGPositionType moreInfoSUGPositionType = null;
            MoreInfoTextStyle moreInfoTextStyle = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ads_ratings_and_review_info".equals(A0q)) {
                    adsRatingInfo = C5QZ.parseFromJson(c16l);
                } else if ("cta_sticker_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P5 = null;
                    } else {
                        A1P5 = c16l.A1P();
                    }
                    moreInfoStickerCTAType = (MoreInfoStickerCTAType) MoreInfoStickerCTAType.A01.get(A1P5);
                    if (moreInfoStickerCTAType == null) {
                        moreInfoStickerCTAType = MoreInfoStickerCTAType.A09;
                    }
                } else if ("display_string".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("facepile".equals(A0q)) {
                    c107084sB = AbstractC107074s8.parseFromJson(c16l);
                } else if ("hide_sug".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_interactive".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("more_info_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    moreInfoType = (MoreInfoType) MoreInfoType.A01.get(A1P4);
                    if (moreInfoType == null) {
                        moreInfoType = MoreInfoType.A0F;
                    }
                } else if ("product_tag_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    moreInfoProductTagType = (MoreInfoProductTagType) MoreInfoProductTagType.A01.get(A1P3);
                    if (moreInfoProductTagType == null) {
                        moreInfoProductTagType = MoreInfoProductTagType.A0B;
                    }
                } else if ("subitems".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C26138BhP parseFromJson = AbstractC40092HqJ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sug_position".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    moreInfoSUGPositionType = (MoreInfoSUGPositionType) MoreInfoSUGPositionType.A01.get(A1P2);
                    if (moreInfoSUGPositionType == null) {
                        moreInfoSUGPositionType = MoreInfoSUGPositionType.A05;
                    }
                } else if ("text_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    moreInfoTextStyle = (MoreInfoTextStyle) MoreInfoTextStyle.A01.get(A1P);
                    if (moreInfoTextStyle == null) {
                        moreInfoTextStyle = MoreInfoTextStyle.A05;
                    }
                } else if (AbstractC43591JPw.A00(220).equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C107104sG(c107084sB, moreInfoProductTagType, moreInfoSUGPositionType, moreInfoStickerCTAType, moreInfoTextStyle, moreInfoType, adsRatingInfo, bool, bool2, num, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C107104sG c107104sG) {
        anonymousClass182.A0d();
        AdsRatingInfo adsRatingInfo = c107104sG.A06;
        if (adsRatingInfo != null) {
            anonymousClass182.A0r("ads_ratings_and_review_info");
            C5QZ.A00(anonymousClass182, adsRatingInfo);
        }
        MoreInfoStickerCTAType moreInfoStickerCTAType = c107104sG.A03;
        if (moreInfoStickerCTAType != null) {
            anonymousClass182.A0S("cta_sticker_style", moreInfoStickerCTAType.A00);
        }
        String str = c107104sG.A0A;
        if (str != null) {
            anonymousClass182.A0S("display_string", str);
        }
        InterfaceC107094sC interfaceC107094sC = c107104sG.A00;
        if (interfaceC107094sC != null) {
            anonymousClass182.A0r("facepile");
            C107084sB Ews = interfaceC107094sC.Ews();
            anonymousClass182.A0d();
            MoreInfoFacepilePositionType moreInfoFacepilePositionType = Ews.A00;
            if (moreInfoFacepilePositionType != null) {
                anonymousClass182.A0S("position", moreInfoFacepilePositionType.A00);
            }
            MoreInfoFacepileSizeType moreInfoFacepileSizeType = Ews.A01;
            if (moreInfoFacepileSizeType != null) {
                anonymousClass182.A0S("size", moreInfoFacepileSizeType.A00);
            }
            anonymousClass182.A0a();
        }
        Boolean bool = c107104sG.A07;
        if (bool != null) {
            anonymousClass182.A0T("hide_sug", bool.booleanValue());
        }
        Boolean bool2 = c107104sG.A08;
        if (bool2 != null) {
            anonymousClass182.A0T("is_interactive", bool2.booleanValue());
        }
        MoreInfoType moreInfoType = c107104sG.A05;
        if (moreInfoType != null) {
            anonymousClass182.A0S("more_info_type", moreInfoType.A00);
        }
        MoreInfoProductTagType moreInfoProductTagType = c107104sG.A01;
        if (moreInfoProductTagType != null) {
            anonymousClass182.A0S("product_tag_type", moreInfoProductTagType.A00);
        }
        List<InterfaceC31123Dm6> list = c107104sG.A0B;
        if (list != null) {
            C16V.A03(anonymousClass182, "subitems");
            for (InterfaceC31123Dm6 interfaceC31123Dm6 : list) {
                if (interfaceC31123Dm6 != null) {
                    C26138BhP Ewu = interfaceC31123Dm6.Ewu();
                    anonymousClass182.A0d();
                    String str2 = Ewu.A00;
                    if (str2 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str2);
                    }
                    String str3 = Ewu.A01;
                    if (str3 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(982), str3);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        MoreInfoSUGPositionType moreInfoSUGPositionType = c107104sG.A02;
        if (moreInfoSUGPositionType != null) {
            anonymousClass182.A0S("sug_position", moreInfoSUGPositionType.A00);
        }
        MoreInfoTextStyle moreInfoTextStyle = c107104sG.A04;
        if (moreInfoTextStyle != null) {
            anonymousClass182.A0S("text_style", moreInfoTextStyle.A00);
        }
        Integer num = c107104sG.A09;
        if (num != null) {
            anonymousClass182.A0Q(AbstractC43591JPw.A00(220), num.intValue());
        }
        anonymousClass182.A0a();
    }
}
