package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class INX {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.HB9, X.1um, X.1ul] */
    public static HB9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1W(A0s)) {
                    c40791um.A03 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("last_item_timestamp".equals(A0s)) {
                        c40791um.A00 = AbstractC167017dG.A0m(c16l);
                    } else if (MSV.A00(442).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                arrayList.add(C3XG.A00(c16l));
                            }
                        }
                        c40791um.A02 = arrayList;
                    } else if (AbstractC37300Gc1.A1S(A0s)) {
                        c40791um.A01 = AbstractC167017dG.A0m(c16l);
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
