package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ADy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23042ADy {
    public static C214379eb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C214379eb c214379eb = new C214379eb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("keywords".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c214379eb.A00 = arrayList;
                } else if ("disabled".equals(A0s)) {
                    c16l.A1D();
                } else {
                    C55702hA.A01(c16l, c214379eb, A0s);
                }
                c16l.A0z();
            }
            return c214379eb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
