package X;

import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import java.io.IOException;

/* renamed from: X.Hzd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40619Hzd {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.instagram.discovery.refinement.model.Refinement] */
    public static Refinement parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            RefinementAttributes refinementAttributes = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("display_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("attributes".equals(A0s)) {
                    refinementAttributes = AbstractC40618Hzc.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (str != null) {
                obj.A01 = str;
            }
            if (refinementAttributes != null) {
                obj.A00 = refinementAttributes;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
