package X;

import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import java.io.IOException;

/* renamed from: X.HlY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39824HlY {
    public static C38701H2m parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ClipsSpinSwappableElementType clipsSpinSwappableElementType = null;
            C38702H2n c38702H2n = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("element_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("element_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsSpinSwappableElementType = (ClipsSpinSwappableElementType) ClipsSpinSwappableElementType.A01.get(A1P);
                    if (clipsSpinSwappableElementType == null) {
                        clipsSpinSwappableElementType = ClipsSpinSwappableElementType.A05;
                    }
                } else if ("swapped_text".equals(A0s)) {
                    c38702H2n = AbstractC39825HlZ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("element_id", c16l, "ClipsSpinSwappedElementImpl");
                throw C00O.createAndThrow();
            }
            return new C38701H2m(clipsSpinSwappableElementType, c38702H2n, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
