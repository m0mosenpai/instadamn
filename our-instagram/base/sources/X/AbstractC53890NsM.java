package X;

import java.io.IOException;

/* renamed from: X.NsM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53890NsM {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1tj] */
    public static C40151tj parseFromJson(C16L c16l) {
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
