package X;

import java.io.IOException;

/* renamed from: X.4ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108664ur {
    public static C108674us parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("enabled", "IGLiveViewerToViewerWavesImpl");
                throw C00O.createAndThrow();
            }
            return new C108674us(bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}