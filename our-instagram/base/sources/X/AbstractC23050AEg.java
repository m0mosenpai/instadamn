package X;

import java.io.IOException;

/* renamed from: X.AEg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23050AEg {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.AHE, java.lang.Object] */
    public static AHE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("short_name".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A01 = A0m;
                } else if ("picture_url".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("is_verified".equals(A0s)) {
                    obj.A02 = c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AHE ahe) {
        anonymousClass182.A0d();
        ahe.A01();
        anonymousClass182.A0S("short_name", ahe.A01());
        String str = ahe.A00;
        if (str != null) {
            anonymousClass182.A0S("picture_url", str);
        }
        anonymousClass182.A0T("is_verified", ahe.A02);
        anonymousClass182.A0a();
    }
}
