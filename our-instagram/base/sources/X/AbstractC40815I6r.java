package X;

import java.io.IOException;

/* renamed from: X.I6r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40815I6r {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.III] */
    public static III parseFromJson(C16L c16l) {
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
                if ("pending_content".equals(A0s)) {
                    obj.A02 = I8D.parseFromJson(c16l);
                } else if ("approved_content".equals(A0s)) {
                    obj.A00 = I8D.parseFromJson(c16l);
                } else if ("declined_content".equals(A0s)) {
                    obj.A01 = I8D.parseFromJson(c16l);
                } else if ("learn_more_link".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A03 = A1P;
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