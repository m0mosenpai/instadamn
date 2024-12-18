package X;

import com.instagram.api.schemas.ActionButtonPartnerType;
import java.io.IOException;

/* renamed from: X.4ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111174ze {
    public static C111184zg parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
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
            ActionButtonPartnerType actionButtonPartnerType = null;
            String str7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("app_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("app_logo_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("button_label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("category_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("display_category_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("partner_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("partner_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    actionButtonPartnerType = (ActionButtonPartnerType) ActionButtonPartnerType.A01.get(A1P);
                    if (actionButtonPartnerType == null) {
                        actionButtonPartnerType = ActionButtonPartnerType.A07;
                    }
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("app_id", "ActionButtonPartnerImpl");
            } else if (str6 != null || !(c16l instanceof C07950bF)) {
                if (actionButtonPartnerType == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("partner_type", "ActionButtonPartnerImpl");
                } else if (str7 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("url", "ActionButtonPartnerImpl");
                } else {
                    return new C111184zg(actionButtonPartnerType, str, str2, str3, str4, str5, str6, str7);
                }
            } else {
                ((C07950bF) c16l).A03.A00("partner_name", "ActionButtonPartnerImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C111184zg c111184zg) {
        anonymousClass182.A0d();
        String str = c111184zg.A01;
        if (str != null) {
            anonymousClass182.A0S("app_id", str);
        }
        String str2 = c111184zg.A02;
        if (str2 != null) {
            anonymousClass182.A0S("app_logo_url", str2);
        }
        String str3 = c111184zg.A03;
        if (str3 != null) {
            anonymousClass182.A0S("button_label", str3);
        }
        String str4 = c111184zg.A04;
        if (str4 != null) {
            anonymousClass182.A0S("category_type", str4);
        }
        String str5 = c111184zg.A05;
        if (str5 != null) {
            anonymousClass182.A0S("display_category_name", str5);
        }
        String str6 = c111184zg.A06;
        if (str6 != null) {
            anonymousClass182.A0S("partner_name", str6);
        }
        ActionButtonPartnerType actionButtonPartnerType = c111184zg.A00;
        if (actionButtonPartnerType != null) {
            anonymousClass182.A0S("partner_type", actionButtonPartnerType.A00);
        }
        String str7 = c111184zg.A07;
        if (str7 != null) {
            anonymousClass182.A0S("url", str7);
        }
        anonymousClass182.A0a();
    }
}
