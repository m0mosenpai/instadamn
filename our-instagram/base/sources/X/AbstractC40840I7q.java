package X;

import java.io.IOException;

/* renamed from: X.I7q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40840I7q {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.I7p, java.lang.Object] */
    public static C40839I7p parseFromJson(C16L c16l) {
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
