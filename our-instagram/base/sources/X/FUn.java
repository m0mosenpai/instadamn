package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FUn {
    public static C32193ECo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32193ECo c32193ECo = new C32193ECo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32193ECo.A01 = arrayList;
                } else if ("has_more".equals(A0s)) {
                    c32193ECo.A02 = c16l.A0d();
                } else if ("next_page_cursor".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c32193ECo.A00 = A0m;
                } else {
                    C55702hA.A01(c16l, c32193ECo, A0s);
                }
                c16l.A0z();
            }
            return c32193ECo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
