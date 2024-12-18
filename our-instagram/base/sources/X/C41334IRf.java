package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IRf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41334IRf {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.HB7, X.1um, X.1ul] */
    public static HB7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(1361).equals(A0s)) {
                    c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("users".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        c40791um.A01 = arrayList;
                    } else if (AbstractC37300Gc1.A1S(A0s)) {
                        c40791um.A00 = AbstractC167017dG.A0m(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
