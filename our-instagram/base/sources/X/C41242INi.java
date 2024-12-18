package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.INi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41242INi {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.H9E, X.1um, X.1ul] */
    public static H9E parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("access_token".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("sponsor".equals(A0s)) {
                    c40791um.A01 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("sponsors".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c40791um.A03 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A02;
            C14360o3.A0A(str);
            c40791um.A00 = new H2N(c40791um.A01, str, c40791um.A03);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
