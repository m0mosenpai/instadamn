package X;

import com.instagram.api.schemas.NonDiscInfo;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class HqY {
    public static NonDiscInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_accepted".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else {
                    bool2 = AbstractC37303Gc4.A0K(c16l, bool2, A0s, "is_blocking_create");
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_accepted", c16l, "NonDiscInfo");
            } else if (bool2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_blocking_create", c16l, "NonDiscInfo");
            } else {
                return new NonDiscInfo(bool.booleanValue(), bool2.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
