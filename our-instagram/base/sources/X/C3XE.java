package X;

import java.io.IOException;

/* renamed from: X.3XE, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XE {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.3XF, java.lang.Object] */
    public static C3XF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_peak_hour_throttling".equals(A0q)) {
                    obj.A00 = Boolean.valueOf(c16l.A0d());
                } else if ("time_to_peak_hour_throttling_start_in_sec".equals(A0q)) {
                    obj.A02 = Integer.valueOf(c16l.A1D());
                } else if ("time_to_peak_hour_throttling_end_in_sec".equals(A0q)) {
                    obj.A01 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
