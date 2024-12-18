package X;

import java.io.IOException;

/* renamed from: X.I6m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40810I6m {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IFU] */
    public static IFU parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("payload".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A01 = A1P;
                } else if ("layout".equals(A0s)) {
                    obj.A00 = AbstractC102744kB.A00(c16l);
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
}
