package X;

import java.io.IOException;

/* renamed from: X.Knm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46853Knm {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.Knl] */
    public static C46852Knl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                c16l.A1J();
                c16l.A0z();
            }
            return new Object();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
