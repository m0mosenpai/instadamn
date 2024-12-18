package X;

import java.io.IOException;

/* renamed from: X.Hmr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39904Hmr {
    public static UQr parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(3061);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("conversion".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("duration".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, A00);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("conversion", c16l, "DurationConversionPairImpl");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "DurationConversionPairImpl");
                } else {
                    return new UQr(num.intValue(), num2.intValue(), num3.intValue());
                }
            } else {
                AbstractC166997dE.A1V("duration", c16l, "DurationConversionPairImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
