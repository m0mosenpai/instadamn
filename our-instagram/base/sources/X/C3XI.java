package X;

import java.io.IOException;

/* renamed from: X.3XI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XI {
    public static C3XJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fsr_quality".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("redeliver_reason".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("fsr_quality", "FeedDeliveryParametersImpl");
                throw C00O.createAndThrow();
            }
            return new C3XJ(num.intValue(), num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
