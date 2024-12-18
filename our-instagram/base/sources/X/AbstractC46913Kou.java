package X;

import java.io.IOException;

/* renamed from: X.Kou, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46913Kou {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Kwu] */
    public static C47405Kwu parseFromJson(C16L c16l) {
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
                if ("ig_thread_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                } else if ("latest_timestamp_ms".equals(A0s)) {
                    c16l.A0y();
                } else if ("thread".equals(A0s)) {
                    obj.A00 = JV4.parseFromJson(c16l);
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
