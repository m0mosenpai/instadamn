package X;

import com.instagram.business.promote.model.RejectionReasonRanges;
import java.io.IOException;

/* renamed from: X.VRj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68453VRj {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.business.promote.model.RejectionReasonRanges, java.lang.Object] */
    public static RejectionReasonRanges parseFromJson(C16L c16l) {
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
                if ("offset".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("length".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("entity_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    obj.A02 = A1P;
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
