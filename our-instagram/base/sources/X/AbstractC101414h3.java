package X;

import java.io.IOException;

/* renamed from: X.4h3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101414h3 {
    public static C101454h7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C101434h5 c101434h5 = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C101434h5 c101434h52 = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_possible_impersonator".equals(A0q)) {
                    c101434h5 = AbstractC101424h4.parseFromJson(c16l);
                } else if ("is_possible_impersonator_threads".equals(A0q)) {
                    c101434h52 = AbstractC101424h4.parseFromJson(c16l);
                } else if ("is_possible_scammer".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (c101434h5 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_possible_impersonator", "ProactiveWarningsEventInfoImpl");
            } else if (c101434h52 != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_possible_scammer", "ProactiveWarningsEventInfoImpl");
                } else {
                    return new C101454h7(c101434h5, c101434h52, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("is_possible_impersonator_threads", "ProactiveWarningsEventInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
