package X;

import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class LC8 {
    public static L3X parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            L3X l3x = new L3X();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("comment_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    l3x.A00 = A0m;
                } else if ("text".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    l3x.A03 = A0m2;
                } else if ("media_owner".equals(A0s)) {
                    l3x.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("url".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    l3x.A04 = A0m3;
                } else if ("media_code".equals(A0s)) {
                    l3x.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return l3x;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, L3X l3x) {
        anonymousClass182.A0d();
        String str = l3x.A00;
        if (str != null) {
            anonymousClass182.A0S("comment_id", str);
        }
        AbstractC37301Gc2.A1E(anonymousClass182, l3x.A03);
        String str2 = l3x.A02;
        if (str2 != null) {
            anonymousClass182.A0S("media_owner", str2);
        }
        String str3 = l3x.A04;
        if (str3 != null) {
            anonymousClass182.A0S("url", str3);
        }
        String str4 = l3x.A01;
        if (str4 != null) {
            anonymousClass182.A0S("media_code", str4);
        }
        anonymousClass182.A0a();
    }
}
