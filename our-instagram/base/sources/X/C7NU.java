package X;

import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import java.io.IOException;

/* renamed from: X.7NU, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7NU {
    /* JADX WARN: Type inference failed for: r0v5, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public static DirectShareTargetLoggingInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Double d = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("final_score".equals(A0q)) {
                    d = Double.valueOf(c16l.A0U());
                } else if ("is_from_server".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (d != null) {
                obj.A01 = d;
            }
            if (bool != null) {
                obj.A00 = bool;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
