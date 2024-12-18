package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ISp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41362ISp {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1um, X.HAo, X.1ul] */
    public static C38892HAo parseFromJson(C16L c16l) {
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
                if ("component_feed".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38619GyM parseFromJson = AbstractC40870I8u.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c40791um.A02 = arrayList;
                } else if ("meta".equals(A0s)) {
                    C38685GzQ parseFromJson2 = AbstractC40872I8w.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c40791um.A00 = parseFromJson2;
                } else if (AbstractC37300Gc1.A1W(A0s)) {
                    c40791um.A03 = c16l.A0d();
                } else if ("max_id".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
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
