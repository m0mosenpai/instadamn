package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IRX {
    public static C38879HAb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38879HAb c38879HAb = new C38879HAb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("account_level_monetization_toggle".equals(A0s)) {
                    c38879HAb.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("product_type".equals(A0s)) {
                    c38879HAb.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("media_ids_changed".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38879HAb.A02 = arrayList;
                } else {
                    C55702hA.A01(c16l, c38879HAb, A0s);
                }
                c16l.A0z();
            }
            return c38879HAb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
