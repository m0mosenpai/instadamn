package X;

import java.io.IOException;

/* renamed from: X.I9g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40882I9g {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IDY, java.lang.Object] */
    public static IDY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("view_progress_s".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = c16l.A1D();
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
