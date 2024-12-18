package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F6N {
    public static C30401cv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30401cv c30401cv = new C30401cv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC43591JPw.A00(1274).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1O(c16l, arrayList);
                        }
                    }
                    c30401cv.A02 = arrayList;
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c30401cv.A00 = FUT.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(3969).equals(A0s)) {
                    c30401cv.A01 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30401cv, A0s);
                }
                c16l.A0z();
            }
            return c30401cv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
