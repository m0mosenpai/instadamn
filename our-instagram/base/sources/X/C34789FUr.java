package X;

import java.io.IOException;

/* renamed from: X.FUr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34789FUr {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1um, X.EBT, X.1ul] */
    public static EBT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thread".equals(A0s)) {
                    c40791um.A00 = JV4.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
