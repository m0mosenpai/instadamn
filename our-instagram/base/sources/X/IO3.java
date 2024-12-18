package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IO3 {
    public static C5F5 parseFromJson(C16L c16l) {
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
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("contact_bar".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("setting_toggle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("setting_toggle_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("stories_config_cta_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "stories_config_cta_title_type");
                }
                c16l.A0z();
            }
            return new C5F5(num, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5F5 c5f5) {
        anonymousClass182.A0d();
        String str = c5f5.A01;
        if (str != null) {
            anonymousClass182.A0S("contact_bar", str);
        }
        String str2 = c5f5.A02;
        if (str2 != null) {
            anonymousClass182.A0S("setting_toggle", str2);
        }
        String str3 = c5f5.A03;
        if (str3 != null) {
            anonymousClass182.A0S("setting_toggle_description", str3);
        }
        String str4 = c5f5.A04;
        if (str4 != null) {
            anonymousClass182.A0S("stories_config_cta_title", str4);
        }
        Integer num = c5f5.A00;
        if (num != null) {
            anonymousClass182.A0Q("stories_config_cta_title_type", num.intValue());
        }
        anonymousClass182.A0a();
    }
}
