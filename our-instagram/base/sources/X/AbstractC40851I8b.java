package X;

import java.io.IOException;

/* renamed from: X.I8b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40851I8b {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.I8a, java.lang.Object] */
    public static C40850I8a parseFromJson(C16L c16l) {
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
                if ("tab_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumC39573Hdj.A01.get(A1P);
                } else if ("selected".equals(A0s)) {
                    c16l.A0d();
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
