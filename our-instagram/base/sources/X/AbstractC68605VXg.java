package X;

import java.io.IOException;

/* renamed from: X.VXg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68605VXg {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.VkL] */
    public static C69252VkL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("screen_time_daily_limit_seconds".equals(A0s)) {
                    obj.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("daily_limit_without_extensions_seconds".equals(A0s)) {
                    obj.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("latest_valid_time_limit_extension_request".equals(A0s)) {
                    obj.A00 = AbstractC128115qf.parseFromJson(c16l);
                } else if ("is_daily_limit_non_blocking".equals(A0s)) {
                    obj.A01 = AbstractC166997dE.A0d(c16l);
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
