package X;

import java.io.IOException;

/* renamed from: X.Nuv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54045Nuv {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Nuu, java.lang.Object] */
    public static C54044Nuu parseFromJson(C16L c16l) {
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
