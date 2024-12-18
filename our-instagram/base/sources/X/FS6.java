package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FS6 {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.EuZ] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.E9y, X.1um, X.1ul] */
    public static C32125E9y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                C55702hA.A01(c16l, c40791um, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            c40791um.A00 = new Object();
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
