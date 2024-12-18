package X;

import java.io.IOException;

/* renamed from: X.NuC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54000NuC {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Nu1] */
    public static C53990Nu1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC37301Gc2.A1V(c16l, c16l.A0q())) {
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
