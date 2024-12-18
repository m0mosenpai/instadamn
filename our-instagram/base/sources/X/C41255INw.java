package X;

import java.io.IOException;

/* renamed from: X.INw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41255INw {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1um, X.H8V, X.1ul] */
    public static H8V parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1F(A0s)) {
                    c40791um.A01 = C38321qM.A00(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            C38321qM c38321qM = c40791um.A01;
            C14360o3.A0A(c38321qM);
            c40791um.A00 = new H35(c38321qM);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
