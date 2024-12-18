package X;

import java.io.IOException;

/* renamed from: X.HzQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40606HzQ {
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.5z1] */
    public static C132785z1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38321qM c38321qM = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "media")) {
                    c38321qM = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            if (c38321qM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media", c16l, "IGTVMedia");
                throw C00O.createAndThrow();
            }
            C14360o3.A0B(c38321qM, 1);
            ?? obj = new Object();
            obj.A00 = c38321qM;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
