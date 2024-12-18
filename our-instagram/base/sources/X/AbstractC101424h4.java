package X;

import java.io.IOException;

/* renamed from: X.4h4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101424h4 {
    public static C101434h5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("connected_similar_user_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_unconnected_impersonator".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_unconnected_impersonator", "ProactiveWarningsImpersonatorInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C101434h5(str, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
