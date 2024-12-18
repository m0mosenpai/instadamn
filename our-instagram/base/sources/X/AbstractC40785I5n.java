package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;

/* renamed from: X.I5n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40785I5n {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.IF8] */
    public static IF8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("delay_time_sec".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (l != null) {
                obj.A00 = l.longValue();
            }
            if (str != null) {
                obj.A01 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
