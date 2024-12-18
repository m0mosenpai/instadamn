package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vy8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69937Vy8 {
    public static C67850UzV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C67850UzV c67850UzV = new C67850UzV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("user_search_results".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c67850UzV.A01 = arrayList;
                } else if ("thread_search_results".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C121375ed parseFromJson = AbstractC121365ec.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c67850UzV.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c67850UzV, A0s);
                }
                c16l.A0z();
            }
            return c67850UzV;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
