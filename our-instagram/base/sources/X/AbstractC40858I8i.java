package X;

import java.io.IOException;

/* renamed from: X.I8i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40858I8i {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.I8h] */
    public static C40857I8h parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                C16V.A02(c16l);
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
