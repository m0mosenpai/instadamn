package X;

import com.instagram.business.promote.model.PromotionMetric;
import java.io.IOException;

/* renamed from: X.VRh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68451VRh {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.instagram.business.promote.model.PromotionMetric] */
    public static PromotionMetric parseFromJson(C16L c16l) {
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
                if ("metric_display_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    obj.A01 = A1P;
                } else if (AbstractC111324zv.A00(1112).equals(A0s)) {
                    obj.A00 = AbstractC166997dE.A0h(c16l);
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
