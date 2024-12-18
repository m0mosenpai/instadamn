package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OQM {
    public static N3B parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            N3B n3b = new N3B();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fetch_ts".equals(A0s)) {
                    n3b.A02 = c16l.A0y();
                } else if ("num_total_requests".equals(A0s)) {
                    n3b.A00 = c16l.A1D();
                } else if ("num_unseen_requests".equals(A0s)) {
                    n3b.A01 = c16l.A1D();
                } else if ("users".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    n3b.A03 = arrayList;
                } else {
                    C55702hA.A01(c16l, n3b, A0s);
                }
                c16l.A0z();
            }
            return n3b;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
