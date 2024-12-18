package X;

import java.io.IOException;

/* renamed from: X.LCa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47855LCa {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Kzy] */
    public static C47588Kzy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("post_link".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("comment_id".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
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

    public static void A00(AnonymousClass182 anonymousClass182, C47588Kzy c47588Kzy) {
        anonymousClass182.A0d();
        String str = c47588Kzy.A01;
        if (str != null) {
            anonymousClass182.A0S("post_link", str);
        }
        String str2 = c47588Kzy.A00;
        if (str2 != null) {
            anonymousClass182.A0S("comment_id", str2);
        }
        anonymousClass182.A0a();
    }
}
