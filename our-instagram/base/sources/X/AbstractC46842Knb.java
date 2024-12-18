package X;

import java.io.IOException;

/* renamed from: X.Knb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46842Knb {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.L1X, java.lang.Object] */
    public static L1X parseFromJson(C16L c16l) {
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
                if ("option_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A02 = A1P;
                } else if ("option_percentage".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("option_vote_count".equals(A0s)) {
                    obj.A01 = c16l.A1D();
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
