package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.AEb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23045AEb {
    public static C214469ek parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C214469ek c214469ek = new C214469ek();
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
                    c214469ek.A01 = arrayList;
                } else if ("surfaces".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C127165ou parseFromJson = AbstractC127155ot.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c214469ek.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c214469ek, A0s);
                }
                c16l.A0z();
            }
            return c214469ek;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
