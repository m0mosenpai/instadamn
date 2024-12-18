package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class ONY {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.N2U, X.1um, X.1ul] */
    public static N2U parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("count_per_row".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("enable_scroll_animation".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("row_count".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("suggestions".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51794Muy parseFromJson = AbstractC53785Nqb.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            int A05 = MSX.A05(c40791um.A02);
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A01);
            int A052 = MSX.A05(c40791um.A03);
            List list = c40791um.A04;
            C14360o3.A0A(list);
            c40791um.A00 = new C51795Muz(list, A05, A052, A1b);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
