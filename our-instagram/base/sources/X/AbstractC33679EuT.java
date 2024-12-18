package X;

import java.io.IOException;

/* renamed from: X.EuT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33679EuT {
    public static E7d parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sent_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "target_number");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("sent_count", c16l, "ContentAppreciationGiftProgressionInfoImpl");
            } else if (num2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("target_number", c16l, "ContentAppreciationGiftProgressionInfoImpl");
            } else {
                return new E7d(num.intValue(), num2.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
