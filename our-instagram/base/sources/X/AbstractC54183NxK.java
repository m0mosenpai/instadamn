package X;

import java.io.IOException;

/* renamed from: X.NxK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54183NxK {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.O5M] */
    public static O5M parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("keyword_recommendations".equals(A0s)) {
                    obj.A00 = AbstractC54057NvH.parseFromJson(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
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
