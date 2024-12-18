package X;

import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class LC7 {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.L7F] */
    public static L7F parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("pack_name".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(272).equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("url".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
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

    public static void A00(AnonymousClass182 anonymousClass182, L7F l7f) {
        anonymousClass182.A0d();
        String str = l7f.A00;
        if (str != null) {
            anonymousClass182.A0S("pack_name", str);
        }
        String str2 = l7f.A01;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(272), str2);
        }
        String str3 = l7f.A02;
        if (str3 != null) {
            anonymousClass182.A0S("url", str3);
        }
        anonymousClass182.A0a();
    }
}
