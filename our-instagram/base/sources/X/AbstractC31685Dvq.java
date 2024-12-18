package X;

import java.io.IOException;

/* renamed from: X.Dvq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31685Dvq {
    public static C66125U0i parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("buffering_latency_normative_maximum_threshold_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("buffering_latency_normative_minimum_threshold_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("buffering_recency_threshold_ms".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("green_memory_maximum_conccurent".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("minimum_time_on_screen".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("orange_memory_maximum_conccurent".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("red_memory_level".equals(A0q)) {
                    num7 = Integer.valueOf(c16l.A1D());
                } else if ("red_memory_maximum_conccurent".equals(A0q)) {
                    num8 = Integer.valueOf(c16l.A1D());
                } else if ("respect_native_autoplay_limitation".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("buffering_latency_normative_maximum_threshold_ms", c16l, "AutoplayConfigGlobalConfig");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("buffering_recency_threshold_ms", c16l, "AutoplayConfigGlobalConfig");
                } else if (num4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("green_memory_maximum_conccurent", c16l, "AutoplayConfigGlobalConfig");
                } else if (num5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("minimum_time_on_screen", c16l, "AutoplayConfigGlobalConfig");
                } else if (num6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("orange_memory_maximum_conccurent", c16l, "AutoplayConfigGlobalConfig");
                } else if (num7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("red_memory_level", c16l, "AutoplayConfigGlobalConfig");
                } else if (num8 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("red_memory_maximum_conccurent", c16l, "AutoplayConfigGlobalConfig");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("respect_native_autoplay_limitation", c16l, "AutoplayConfigGlobalConfig");
                } else {
                    return new C66125U0i(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue(), num7.intValue(), num8.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("buffering_latency_normative_minimum_threshold_ms", c16l, "AutoplayConfigGlobalConfig");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
