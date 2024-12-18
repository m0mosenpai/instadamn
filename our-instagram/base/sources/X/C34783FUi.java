package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FUi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34783FUi {
    public static C32215EDo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32215EDo c32215EDo = new C32215EDo();
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
                    c32215EDo.A01 = arrayList;
                } else if ("next_page_cursor".equals(A0s)) {
                    c32215EDo.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("has_more".equals(A0s)) {
                    c32215EDo.A02 = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c32215EDo, A0s);
                }
                c16l.A0z();
            }
            return c32215EDo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
