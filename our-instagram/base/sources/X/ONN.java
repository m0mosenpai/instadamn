package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class ONN {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.N2Y, X.1um, X.1ul] */
    public static N2Y parseFromJson(C16L c16l) {
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
                if ("suggested_hidden_words".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("upsell_style".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("upsell_type".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("upsell_variant".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("users_to_block".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Long A0h = AbstractC31173DnH.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    }
                    c40791um.A05 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A04;
            String str = c40791um.A01;
            String str2 = c40791um.A02;
            C14360o3.A0A(str2);
            c40791um.A00 = new C51779Muj(str, str2, c40791um.A03, list, c40791um.A05);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
