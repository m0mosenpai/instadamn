package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F54 {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.FKe, java.lang.Object] */
    public static C34544FKe parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("emoji".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    obj.A01 = A1P;
                } else if ("count".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("is_viewer_reacted".equals(A0s)) {
                    obj.A02 = c16l.A0d();
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
