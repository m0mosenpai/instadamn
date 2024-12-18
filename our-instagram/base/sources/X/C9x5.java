package X;

import java.io.IOException;

/* renamed from: X.9x5, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9x5 {
    public static C51775Muf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Float f2 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("downbeat_score".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("is_downbeat".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_phrase".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_strong".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_twobar".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("score".equals(A0s)) {
                    f2 = AbstractC167007dF.A0b(c16l);
                } else if ("time_in_ms".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            if (f == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("downbeat_score", c16l, "BeatDataImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_phrase", c16l, "BeatDataImpl");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_strong", c16l, "BeatDataImpl");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_twobar", c16l, "BeatDataImpl");
                } else if (f2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("score", c16l, "BeatDataImpl");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("time_in_ms", c16l, "BeatDataImpl");
                } else {
                    return new C51775Muf(f.floatValue(), f2.floatValue(), num.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_downbeat", c16l, "BeatDataImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
