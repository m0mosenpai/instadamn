package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F66 {
    public static C30961dz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30961dz c30961dz = new C30961dz();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("fbpay_referral".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1O(c16l, arrayList);
                        }
                    }
                    c30961dz.A01 = arrayList;
                } else if ("referral_id".equals(A0s)) {
                    c30961dz.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30961dz, A0s);
                }
                c16l.A0z();
            }
            return c30961dz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
