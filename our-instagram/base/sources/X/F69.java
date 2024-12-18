package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F69 {
    public static C30921dv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30921dv c30921dv = new C30921dv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (!"hscroll_share".equals(A0s) && !AbstractC111324zv.A00(2427).equals(A0s)) {
                    if ("product_ids".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c30921dv.A02 = arrayList;
                    } else if ("merchant_id".equals(A0s)) {
                        c30921dv.A00 = AbstractC167017dG.A0m(c16l);
                    } else {
                        AbstractC47856LCb.A01(c16l, c30921dv, A0s);
                    }
                } else {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1O(c16l, arrayList);
                        }
                    }
                    c30921dv.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c30921dv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
