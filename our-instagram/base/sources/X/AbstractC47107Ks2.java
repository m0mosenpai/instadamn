package X;

import java.io.IOException;

/* renamed from: X.Ks2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47107Ks2 {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Khv] */
    public static C46496Khv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                if ("response_id".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = str;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
