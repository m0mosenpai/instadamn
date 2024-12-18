package X;

import java.io.IOException;

/* renamed from: X.VWm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68585VWm {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.6Ry] */
    public static C139176Ry parseFromJson(C16L c16l) {
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
            throw new IOException(e2);
        }
    }
}
