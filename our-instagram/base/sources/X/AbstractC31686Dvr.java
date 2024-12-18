package X;

import java.io.IOException;

/* renamed from: X.Dvr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31686Dvr {
    public static C66126U0j parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str = null;
            Integer num4 = null;
            Integer num5 = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("customization_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("max_concurrent_buffering".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("max_concurrent_videos".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("normative_maximum_buffering_ms".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("normative_minimum_buffering_ms".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("preview_duration_ms".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("which_videos".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("customization_id", c16l, "AutoplayConfigCustomizationBase");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("max_concurrent_videos", c16l, "AutoplayConfigCustomizationBase");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("normative_maximum_buffering_ms", c16l, "AutoplayConfigCustomizationBase");
                } else if (num4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("normative_minimum_buffering_ms", c16l, "AutoplayConfigCustomizationBase");
                } else if (num5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("preview_duration_ms", c16l, "AutoplayConfigCustomizationBase");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("which_videos", c16l, "AutoplayConfigCustomizationBase");
                } else {
                    return new C66126U0j(str, str2, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue());
                }
            } else {
                AbstractC166997dE.A1V("max_concurrent_buffering", c16l, "AutoplayConfigCustomizationBase");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
