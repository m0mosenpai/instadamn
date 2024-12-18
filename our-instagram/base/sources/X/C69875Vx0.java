package X;

import java.io.IOException;

/* renamed from: X.Vx0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69875Vx0 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.UyQ, X.1um, X.1ul] */
    public static C67791UyQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(33).equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            Boolean bool = c40791um.A01;
            C14360o3.A0A(bool);
            c40791um.A00 = new URG(bool.booleanValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
