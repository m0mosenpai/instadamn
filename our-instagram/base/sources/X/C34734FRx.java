package X;

import java.io.IOException;

/* renamed from: X.FRx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34734FRx {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1um, X.EA2, X.1ul] */
    public static EA2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("visibility_setting".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0h(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            Integer num = c40791um.A01;
            C14360o3.A0A(num);
            c40791um.A00 = new C32028E5g(num.intValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
