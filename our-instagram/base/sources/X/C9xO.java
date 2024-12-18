package X;

import java.io.IOException;

/* renamed from: X.9xO, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9xO {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.AcG, java.lang.Object] */
    public static C23562AcG parseFromJson(C16L c16l) {
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
