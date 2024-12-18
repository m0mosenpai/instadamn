package X;

import java.io.IOException;

/* renamed from: X.FSl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34746FSl {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.EAg, X.1um, X.1ul] */
    public static C32133EAg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("two_factor_info".equals(A0s)) {
                    c40791um.A01 = AbstractC33759Evl.parseFromJson(c16l);
                } else if ("two_factor_required".equals(A0s)) {
                    c40791um.A02 = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            E6Y e6y = c40791um.A01;
            C14360o3.A0A(e6y);
            c40791um.A00 = new E68(e6y, c40791um.A02);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
