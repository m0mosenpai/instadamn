package X;

import java.io.IOException;

/* renamed from: X.I6k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40808I6k {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.I6f] */
    public static C40803I6f parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("enabled".equals(AbstractC166997dE.A0s(c16l))) {
                    c16l.A0d();
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
