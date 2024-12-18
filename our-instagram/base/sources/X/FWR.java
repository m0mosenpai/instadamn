package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FWR {
    public static C32165EBm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32165EBm c32165EBm = new C32165EBm();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ndx_ig_steps".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32165EBm.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32165EBm, A0s);
                }
                c16l.A0z();
            }
            return c32165EBm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
