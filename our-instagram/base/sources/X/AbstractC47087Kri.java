package X;

import java.io.IOException;

/* renamed from: X.Kri, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47087Kri {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.L0K] */
    public static L0K parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!"android_notif_count".equals(A0s) && !"notif_count".equals(A0s)) {
                    if ("android_last_seen_timestamp".equals(A0s) || "last_seen_timestamp".equals(A0s)) {
                        obj.A00 = c16l.A1D();
                    }
                } else {
                    obj.A01 = c16l.A1D();
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
