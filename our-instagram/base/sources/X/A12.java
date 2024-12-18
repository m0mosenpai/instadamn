package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A12 {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.A91] */
    public static A91 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            A8O a8o = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            A8O a8o2 = null;
            A8O a8o3 = null;
            A8O a8o4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("360p".equals(A0s)) {
                    a8o = AE0.parseFromJson(c16l);
                } else if ("480p".equals(A0s)) {
                    a8o2 = AE0.parseFromJson(c16l);
                } else if ("720p".equals(A0s)) {
                    a8o3 = AE0.parseFromJson(c16l);
                } else if ("1080p".equals(A0s)) {
                    a8o4 = AE0.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (a8o != null) {
                obj.A01 = a8o;
            }
            if (a8o2 != null) {
                obj.A02 = a8o2;
            }
            if (a8o3 != null) {
                obj.A03 = a8o3;
            }
            if (a8o4 != null) {
                obj.A00 = a8o4;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
