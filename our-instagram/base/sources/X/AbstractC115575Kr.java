package X;

import java.io.IOException;

/* renamed from: X.5Kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115575Kr {
    public static C115585Ks parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C115585Ks c115585Ks = new C115585Ks();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                C16V.A02(c16l);
                c16l.A0z();
            }
            return c115585Ks;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
