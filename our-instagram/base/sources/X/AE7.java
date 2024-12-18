package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class AE7 {
    public static C214489em parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C214489em c214489em = new C214489em();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("text".equals(A0s)) {
                    c214489em.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("friends".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c214489em.A02 = arrayList;
                } else if ("online_friends_count".equals(A0s)) {
                    c214489em.A00 = AbstractC166997dE.A0h(c16l);
                } else {
                    C55702hA.A01(c16l, c214489em, A0s);
                }
                c16l.A0z();
            }
            return c214489em;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
