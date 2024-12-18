package X;

import java.io.IOException;

/* renamed from: X.IQn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41317IQn {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.H9A, X.1um, X.1ul] */
    public static H9A parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("error".equals(A0s)) {
                    c40791um.A02 = AbstractC40690I1w.parseFromJson(c16l);
                } else if ("lead_form".equals(A0s)) {
                    c40791um.A01 = AbstractC40689I1v.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A00 = new C45294K2w(c40791um.A01, c40791um.A02);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
