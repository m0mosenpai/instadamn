package X;

import java.io.IOException;

/* renamed from: X.I6e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40802I6e {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.ICo, java.lang.Object] */
    public static C40967ICo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("logging_token".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A00 = A1P;
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
