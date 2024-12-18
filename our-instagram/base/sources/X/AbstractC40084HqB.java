package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;
import java.io.IOException;

/* renamed from: X.HqB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40084HqB {
    public static C26136BhN parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str = null;
            C26133BhK c26133BhK = null;
            String str2 = null;
            MidCardLayoutType midCardLayoutType = null;
            C26137BhO c26137BhO = null;
            ClipsMidCardSubtype clipsMidCardSubtype = null;
            ClipsMidCardType clipsMidCardType = null;
            String str3 = null;
            InstagramMidcardType instagramMidcardType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("blending_unit_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("brand_safety_severity".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("data".equals(A0s)) {
                    c26133BhK = AbstractC40082Hq9.parseFromJson(c16l);
                } else if ("impression_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("layout_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    midCardLayoutType = (MidCardLayoutType) MidCardLayoutType.A01.get(A1P4);
                    if (midCardLayoutType == null) {
                        midCardLayoutType = MidCardLayoutType.A07;
                    }
                } else if ("metadata".equals(A0s)) {
                    c26137BhO = AbstractC40086HqD.parseFromJson(c16l);
                } else if ("mid_card_subtype".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    clipsMidCardSubtype = AbstractC39817HlR.A00(A1P3);
                } else if ("mid_card_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    clipsMidCardType = (ClipsMidCardType) ClipsMidCardType.A01.get(A1P2);
                    if (clipsMidCardType == null) {
                        clipsMidCardType = ClipsMidCardType.A0Y;
                    }
                } else if ("subtype_v2".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("target_insertion_position".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("type_v2".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    instagramMidcardType = (InstagramMidcardType) InstagramMidcardType.A01.get(A1P);
                    if (instagramMidcardType == null) {
                        instagramMidcardType = InstagramMidcardType.A0k;
                    }
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "view_state_item_type");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("brand_safety_severity", c16l, "MidCardInfoV2");
            } else if (c26133BhK != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("impression_token", c16l, "MidCardInfoV2");
                } else if (midCardLayoutType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("layout_type", c16l, "MidCardInfoV2");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("target_insertion_position", c16l, "MidCardInfoV2");
                } else if (instagramMidcardType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("type_v2", c16l, "MidCardInfoV2");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("view_state_item_type", c16l, "MidCardInfoV2");
                } else {
                    return new C26136BhN(clipsMidCardSubtype, clipsMidCardType, instagramMidcardType, c26133BhK, midCardLayoutType, c26137BhO, str, str2, str3, num.intValue(), num2.intValue(), num3.intValue());
                }
            } else {
                AbstractC166997dE.A1V("data", c16l, "MidCardInfoV2");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
