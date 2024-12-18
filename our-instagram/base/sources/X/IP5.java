package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IP5 {
    public static C38760H5a parseFromJson(C16L c16l) {
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
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fb_tag_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("fb_tag_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("fb_tag_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("fb_tag_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38760H5a(str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38760H5a c38760H5a) {
        anonymousClass182.A0d();
        String str = c38760H5a.A00;
        if (str != null) {
            anonymousClass182.A0S("fb_tag_id", str);
        }
        String str2 = c38760H5a.A01;
        if (str2 != null) {
            anonymousClass182.A0S("fb_tag_name", str2);
        }
        String str3 = c38760H5a.A02;
        if (str3 != null) {
            anonymousClass182.A0S("fb_tag_type", str3);
        }
        String str4 = c38760H5a.A03;
        if (str4 != null) {
            anonymousClass182.A0S("fb_tag_url", str4);
        }
        String str5 = c38760H5a.A04;
        if (str5 != null) {
            anonymousClass182.A0S("pk", str5);
        }
        anonymousClass182.A0a();
    }
}
