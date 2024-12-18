package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WorldLocationPagesInfoImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hwi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40453Hwi {
    public static H75 parseFromJson(C16L c16l) {
        String A00;
        String A002;
        String A003;
        String A004;
        String A005;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            WearablesAppAttributionType wearablesAppAttributionType = null;
            Integer num = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            User user = null;
            String str14 = null;
            WorldLocationPagesInfoImpl worldLocationPagesInfoImpl = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2645);
                A002 = AbstractC111324zv.A00(1950);
                A003 = AbstractC111324zv.A00(1949);
                A004 = AbstractC111324zv.A00(1948);
                A005 = AbstractC111324zv.A00(1947);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A005.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (A004.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("attribution_icon_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (A003.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("attribution_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (A002.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("attribution_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    wearablesAppAttributionType = (WearablesAppAttributionType) WearablesAppAttributionType.A01.get(A1P);
                    if (wearablesAppAttributionType == null) {
                        wearablesAppAttributionType = WearablesAppAttributionType.A0B;
                    }
                } else if (AbstractC111324zv.A00(2472).equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(2473).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(2474).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(2475).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("pivot_page_cta_label".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("pivot_page_cta_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("pivot_page_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("pivot_page_image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("pivot_page_micro_user_dict".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("pivot_page_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(3317).equals(A0s)) {
                    worldLocationPagesInfoImpl = AbstractC40458Hwn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A005, c16l, "WearablesAppAttribution");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("attribution_icon_url", c16l, "WearablesAppAttribution");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A003, c16l, "WearablesAppAttribution");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("attribution_title", c16l, "WearablesAppAttribution");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A002, c16l, "WearablesAppAttribution");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "WearablesAppAttribution");
                } else {
                    return new H75(wearablesAppAttributionType, worldLocationPagesInfoImpl, user, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(A004, c16l, "WearablesAppAttribution");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
