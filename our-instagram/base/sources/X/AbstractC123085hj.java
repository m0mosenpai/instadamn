package X;

import java.io.IOException;

/* renamed from: X.5hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123085hj {
    public static C206369Bt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("badge_use_case_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("badge_use_case_id", "BadgeCountBreakdown");
            } else if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("count", "BadgeCountBreakdown");
            } else {
                return new C206369Bt(str, num.intValue(), 0);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
